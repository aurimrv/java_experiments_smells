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
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Class<?> wildcardClass1 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        fila0.enfileira(obj1);
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Class<?> wildcardClass11 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        boolean boolean17 = fila15.vazia();
        java.lang.Class<?> wildcardClass18 = fila15.getClass();
        fila6.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        boolean boolean17 = fila15.vazia();
        java.lang.Class<?> wildcardClass18 = fila15.getClass();
        fila6.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass20 = fila15.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        java.lang.Class<?> wildcardClass16 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        java.lang.Class<?> wildcardClass12 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        fila0.enfileira(obj1);
        fila0.imprime();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass11 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj23 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj27 = fila15.desenfileira();
        java.lang.Class<?> wildcardClass28 = fila15.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = fila11.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila11.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj11 = fila5.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        boolean boolean17 = fila15.vazia();
        java.lang.Class<?> wildcardClass18 = fila15.getClass();
        fila6.enfileira((java.lang.Object) fila15);
        boolean boolean20 = fila15.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        boolean boolean17 = fila15.vazia();
        java.lang.Class<?> wildcardClass18 = fila15.getClass();
        fila6.enfileira((java.lang.Object) fila15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj17 = fila6.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        boolean boolean22 = fila18.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0.0d);
        fila23.imprime();
        boolean boolean27 = fila23.vazia();
        fila18.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass29 = fila18.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean17 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj24 = fila21.desenfileira();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj26 = fila18.desenfileira();
        fila0.enfileira(obj26);
        java.lang.Object obj28 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1) + "'", obj17, (-1));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila4.desenfileira();
        boolean boolean13 = fila4.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj24 = fila21.desenfileira();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj26 = fila18.desenfileira();
        fila18.imprime();
        fila14.enfileira((java.lang.Object) fila18);
        java.lang.Class<?> wildcardClass29 = fila18.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        boolean boolean13 = fila9.vazia();
        java.lang.Object obj14 = fila9.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        fila15.enfileira((java.lang.Object) 10.0d);
        boolean boolean20 = fila15.vazia();
        boolean boolean21 = fila15.vazia();
        fila15.imprime();
        fila9.enfileira((java.lang.Object) fila15);
        boolean boolean24 = fila15.vazia();
        fila0.enfileira((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (-1));
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila9.enfileira((java.lang.Object) fila17);
        java.lang.Object obj26 = fila9.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj33 = fila30.desenfileira();
        fila27.enfileira((java.lang.Object) fila30);
        java.lang.Object obj35 = fila27.desenfileira();
        fila9.enfileira(obj35);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass38 = fila9.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1) + "'", obj26, (-1));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
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
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        fila17.imprime();
        boolean boolean23 = fila17.vazia();
        fila14.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 10);
        fila17.imprime();
        fila3.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass30 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        fila3.imprime();
        java.lang.Class<?> wildcardClass13 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = fila11.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila11.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0.0d);
        fila32.imprime();
        boolean boolean36 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila29);
        boolean boolean41 = fila0.vazia();
        java.lang.Object obj42 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = fila11.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila11.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj31 = fila28.desenfileira();
        fila25.enfileira((java.lang.Object) fila28);
        java.lang.Object obj33 = fila25.desenfileira();
        fila25.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        boolean boolean39 = fila35.vazia();
        fila35.imprime();
        boolean boolean41 = fila35.vazia();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.imprime();
        boolean boolean46 = fila42.vazia();
        boolean boolean47 = fila42.vazia();
        boolean boolean48 = fila42.vazia();
        fila35.enfileira((java.lang.Object) fila42);
        boolean boolean50 = fila42.vazia();
        fila42.imprime();
        java.lang.Object obj52 = fila42.desenfileira();
        fila42.imprime();
        fila25.enfileira((java.lang.Object) fila42);
        fila42.imprime();
        fila0.enfileira((java.lang.Object) fila42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = fila42.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0.0d + "'", obj52, 0.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = fila11.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila11.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0.0d);
        fila32.imprime();
        boolean boolean36 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        fila29.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass41 = fila29.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        fila0.enfileira(obj1);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        java.lang.Class<?> wildcardClass18 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.enfileira((java.lang.Object) 10.0d);
        fila12.imprime();
        fila12.imprime();
        java.lang.Class<?> wildcardClass19 = fila12.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass19);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj23 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = fila11.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila11.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        java.lang.Object obj29 = fila17.desenfileira();
        java.lang.Class<?> wildcardClass30 = fila17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        fila0.enfileira(obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.enfileira((java.lang.Object) '4');
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1L) + "'", obj12, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass14 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        java.lang.Object obj11 = fila4.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.enfileira((java.lang.Object) 10.0d);
        boolean boolean17 = fila12.vazia();
        boolean boolean18 = fila12.vazia();
        fila12.imprime();
        fila4.enfileira((java.lang.Object) fila12);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj22 = fila4.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj8 = fila5.desenfileira();
        boolean boolean9 = fila5.vazia();
        fila5.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 100);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj16 = fila5.desenfileira();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
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
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean15 = fila6.vazia();
        java.lang.Class<?> wildcardClass16 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj24 = fila21.desenfileira();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj26 = fila18.desenfileira();
        fila0.enfileira(obj26);
        java.lang.Object obj28 = fila0.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        java.lang.Object obj34 = fila29.desenfileira();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.enfileira((java.lang.Object) 10.0d);
        boolean boolean40 = fila35.vazia();
        boolean boolean41 = fila35.vazia();
        fila35.imprime();
        fila29.enfileira((java.lang.Object) fila35);
        fila35.imprime();
        fila35.imprime();
        fila0.enfileira((java.lang.Object) fila35);
        java.lang.Class<?> wildcardClass47 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1) + "'", obj17, (-1));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.enfileira((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila17.vazia();
        java.lang.Object obj23 = fila17.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 1);
        boolean boolean30 = fila24.vazia();
        java.lang.Object obj31 = fila24.desenfileira();
        java.lang.Object obj32 = fila24.desenfileira();
        boolean boolean33 = fila24.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj37 = fila34.desenfileira();
        fila24.enfileira((java.lang.Object) fila34);
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila12.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass42 = fila17.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean15 = fila6.vazia();
        java.lang.Object obj16 = null;
        fila6.enfileira(obj16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila10.enfileira((java.lang.Object) fila17);
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj27 = fila17.desenfileira();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1) + "'", obj10, (-1));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        fila4.imprime();
        fila4.imprime();
        java.lang.Object obj13 = fila4.desenfileira();
        fila0.enfileira(obj13);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        java.lang.Object obj20 = fila15.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.enfileira((java.lang.Object) 10.0d);
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila21.imprime();
        fila15.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila21.imprime();
        java.lang.Object obj32 = fila21.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj36 = fila33.desenfileira();
        boolean boolean37 = fila33.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0.0d);
        fila38.imprime();
        boolean boolean42 = fila38.vazia();
        fila33.enfileira((java.lang.Object) fila38);
        java.lang.Class<?> wildcardClass44 = fila33.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass44);
        fila0.enfileira((java.lang.Object) fila21);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj8 = fila5.desenfileira();
        boolean boolean9 = fila5.vazia();
        fila5.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 100);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        boolean boolean23 = fila19.vazia();
        fila19.imprime();
        boolean boolean25 = fila19.vazia();
        fila16.enfileira((java.lang.Object) fila19);
        boolean boolean27 = fila16.vazia();
        java.lang.Object obj28 = fila16.desenfileira();
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 1 + "'", obj28, (byte) 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (-1));
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila9.enfileira((java.lang.Object) fila17);
        java.lang.Object obj26 = fila9.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj33 = fila30.desenfileira();
        fila27.enfileira((java.lang.Object) fila30);
        java.lang.Object obj35 = fila27.desenfileira();
        fila9.enfileira(obj35);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass38 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1) + "'", obj26, (-1));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        fila10.imprime();
        java.lang.Object obj14 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila17.vazia();
        java.lang.Object obj23 = fila17.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 1);
        boolean boolean30 = fila24.vazia();
        java.lang.Object obj31 = fila24.desenfileira();
        java.lang.Object obj32 = fila24.desenfileira();
        boolean boolean33 = fila24.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj37 = fila34.desenfileira();
        fila24.enfileira((java.lang.Object) fila34);
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila12.enfileira((java.lang.Object) fila17);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.enfileira((java.lang.Object) 10.0d);
        fila42.imprime();
        java.lang.Object obj48 = fila42.desenfileira();
        boolean boolean49 = fila42.vazia();
        fila42.imprime();
        java.lang.Object obj51 = fila42.desenfileira();
        fila12.enfileira(obj51);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 0.0d);
        fila53.imprime();
        boolean boolean57 = fila53.vazia();
        boolean boolean58 = fila53.vazia();
        java.lang.Object obj59 = fila53.desenfileira();
        fila53.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 0.0d);
        fila62.imprime();
        fila53.enfileira((java.lang.Object) fila62);
        fila12.enfileira((java.lang.Object) fila53);
        boolean boolean68 = fila12.vazia();
        java.lang.Class<?> wildcardClass69 = fila12.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0d + "'", obj48, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 10.0d + "'", obj51, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0.0d + "'", obj59, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        fila10.imprime();
        java.lang.Object obj14 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.enfileira((java.lang.Object) 10.0d);
        fila12.imprime();
        fila12.imprime();
        java.lang.Class<?> wildcardClass19 = fila12.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 10);
        fila3.imprime();
        java.lang.Object obj15 = fila3.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        boolean boolean24 = fila18.vazia();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj26 = fila18.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass33 = fila27.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass33);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        boolean boolean37 = fila18.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj17 = fila6.desenfileira();
        boolean boolean18 = fila6.vazia();
        fila6.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila10.enfileira((java.lang.Object) fila17);
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj27 = fila17.desenfileira();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        boolean boolean39 = fila35.vazia();
        fila30.enfileira((java.lang.Object) fila35);
        fila0.enfileira((java.lang.Object) fila35);
        java.lang.Class<?> wildcardClass42 = fila35.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Class<?> wildcardClass16 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean14 = fila0.vazia();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 1);
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        java.lang.Object obj20 = fila12.desenfileira();
        java.lang.Class<?> wildcardClass21 = fila12.getClass();
        fila3.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass17 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        boolean boolean24 = fila18.vazia();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj26 = fila18.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass33 = fila27.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass33);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean15 = fila7.vazia();
        fila7.imprime();
        java.lang.Object obj17 = fila7.desenfileira();
        boolean boolean18 = fila7.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila7.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj25 = fila17.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj32 = fila29.desenfileira();
        fila26.enfileira((java.lang.Object) fila29);
        java.lang.Object obj34 = fila26.desenfileira();
        fila26.imprime();
        fila17.enfileira((java.lang.Object) fila26);
        fila7.enfileira((java.lang.Object) fila26);
        java.lang.Class<?> wildcardClass38 = fila26.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        fila0.imprime();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila4.desenfileira();
        boolean boolean13 = fila4.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila14.enfileira((java.lang.Object) 10.0d);
        fila14.imprime();
        fila14.imprime();
        java.lang.Class<?> wildcardClass21 = fila14.getClass();
        fila4.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 10);
        fila3.imprime();
        fila3.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (-1));
        boolean boolean22 = fila16.vazia();
        java.lang.Object obj23 = fila16.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.enfileira((java.lang.Object) 10.0d);
        boolean boolean29 = fila24.vazia();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila16.enfileira((java.lang.Object) fila24);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.imprime();
        boolean boolean37 = fila33.vazia();
        boolean boolean38 = fila33.vazia();
        java.lang.Object obj39 = fila33.desenfileira();
        boolean boolean40 = fila33.vazia();
        fila33.enfileira((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass43 = fila33.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass43);
        fila3.enfileira((java.lang.Object) fila16);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0.0d);
        fila46.imprime();
        boolean boolean50 = fila46.vazia();
        java.lang.Object obj51 = fila46.desenfileira();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0.0d);
        fila52.enfileira((java.lang.Object) 10.0d);
        boolean boolean57 = fila52.vazia();
        boolean boolean58 = fila52.vazia();
        fila52.imprime();
        fila46.enfileira((java.lang.Object) fila52);
        fila52.imprime();
        fila52.imprime();
        java.lang.Object obj63 = fila52.desenfileira();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj67 = fila64.desenfileira();
        boolean boolean68 = fila64.vazia();
        ds.Fila fila69 = new ds.Fila();
        fila69.enfileira((java.lang.Object) 0.0d);
        fila69.imprime();
        boolean boolean73 = fila69.vazia();
        fila64.enfileira((java.lang.Object) fila69);
        java.lang.Class<?> wildcardClass75 = fila64.getClass();
        fila52.enfileira((java.lang.Object) wildcardClass75);
        java.lang.Object obj77 = fila52.desenfileira();
        fila16.enfileira(obj77);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0d + "'", obj39, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0.0d + "'", obj51, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0.0d + "'", obj63, 0.0d);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 10.0d + "'", obj77, 10.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj24 = fila21.desenfileira();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj26 = fila18.desenfileira();
        fila0.enfileira(obj26);
        java.lang.Object obj28 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1) + "'", obj17, (-1));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj23 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 1);
        boolean boolean13 = fila7.vazia();
        java.lang.Object obj14 = fila7.desenfileira();
        java.lang.Object obj15 = fila7.desenfileira();
        boolean boolean16 = fila7.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj20 = fila17.desenfileira();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean25 = fila0.vazia();
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 1 + "'", obj15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        fila3.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila13.enfileira((java.lang.Object) fila18);
        fila3.enfileira((java.lang.Object) fila13);
        java.lang.Object obj25 = fila3.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        fila0.imprime();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (-1));
        boolean boolean22 = fila16.vazia();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        fila26.imprime();
        boolean boolean30 = fila26.vazia();
        boolean boolean31 = fila26.vazia();
        java.lang.Object obj32 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        fila26.enfileira((java.lang.Object) fila35);
        fila16.enfileira((java.lang.Object) fila35);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila41.enfileira((java.lang.Object) fila44);
        java.lang.Object obj49 = fila41.desenfileira();
        fila41.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0.0d);
        fila51.imprime();
        boolean boolean55 = fila51.vazia();
        fila51.imprime();
        boolean boolean57 = fila51.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0.0d);
        fila58.imprime();
        boolean boolean62 = fila58.vazia();
        boolean boolean63 = fila58.vazia();
        boolean boolean64 = fila58.vazia();
        fila51.enfileira((java.lang.Object) fila58);
        boolean boolean66 = fila58.vazia();
        fila58.imprime();
        java.lang.Object obj68 = fila58.desenfileira();
        fila58.imprime();
        fila41.enfileira((java.lang.Object) fila58);
        fila58.imprime();
        fila16.enfileira((java.lang.Object) fila58);
        fila7.enfileira((java.lang.Object) fila58);
        java.lang.Class<?> wildcardClass74 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 0.0d + "'", obj68, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1L));
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 1);
        boolean boolean14 = fila8.vazia();
        java.lang.Object obj15 = fila8.desenfileira();
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.imprime();
        fila3.enfileira((java.lang.Object) fila8);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila19.enfileira((java.lang.Object) (byte) 1);
        boolean boolean25 = fila19.vazia();
        java.lang.Object obj26 = fila19.desenfileira();
        java.lang.Object obj27 = fila19.desenfileira();
        boolean boolean28 = fila19.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj32 = fila29.desenfileira();
        fila19.enfileira((java.lang.Object) fila29);
        fila3.enfileira((java.lang.Object) fila29);
        fila29.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 1 + "'", obj27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        fila17.imprime();
        java.lang.Object obj23 = fila17.desenfileira();
        java.lang.Object obj24 = fila17.desenfileira();
        fila8.enfileira(obj24);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        fila26.imprime();
        fila26.enfileira((java.lang.Object) (-1));
        boolean boolean32 = fila26.vazia();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0.0d);
        fila36.imprime();
        boolean boolean40 = fila36.vazia();
        boolean boolean41 = fila36.vazia();
        java.lang.Object obj42 = fila36.desenfileira();
        fila36.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 0.0d);
        fila45.imprime();
        fila36.enfileira((java.lang.Object) fila45);
        fila26.enfileira((java.lang.Object) fila45);
        java.lang.Class<?> wildcardClass51 = fila26.getClass();
        fila8.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0d + "'", obj24, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila11.enfileira((java.lang.Object) fila18);
        fila3.enfileira((java.lang.Object) fila18);
        java.lang.Class<?> wildcardClass28 = fila18.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        boolean boolean17 = fila0.vazia();
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 1);
        boolean boolean14 = fila8.vazia();
        java.lang.Object obj15 = fila8.desenfileira();
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.imprime();
        fila3.enfileira((java.lang.Object) fila8);
        boolean boolean19 = fila8.vazia();
        java.lang.Class<?> wildcardClass20 = fila8.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Object obj25 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        boolean boolean19 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        java.lang.Object obj21 = fila10.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila10.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.imprime();
        boolean boolean35 = fila31.vazia();
        fila31.imprime();
        boolean boolean37 = fila31.vazia();
        fila28.enfileira((java.lang.Object) fila31);
        java.lang.Object obj39 = fila28.desenfileira();
        java.lang.Object obj40 = fila28.desenfileira();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0.0d);
        fila41.imprime();
        fila41.enfileira((java.lang.Object) (-1));
        boolean boolean47 = fila41.vazia();
        fila41.imprime();
        fila41.imprime();
        fila28.enfileira((java.lang.Object) fila41);
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj57 = fila54.desenfileira();
        fila51.enfileira((java.lang.Object) fila54);
        java.lang.Object obj59 = fila51.desenfileira();
        fila51.imprime();
        fila28.enfileira((java.lang.Object) fila51);
        fila0.enfileira((java.lang.Object) fila28);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 1 + "'", obj39, (byte) 1);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 0.0d + "'", obj57, 0.0d);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0.0d + "'", obj59, 0.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        java.lang.Object obj3 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        fila0.imprime();
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        fila19.imprime();
        java.lang.Class<?> wildcardClass26 = fila19.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.enfileira((java.lang.Object) 10.0d);
        fila9.imprime();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila0.enfileira((java.lang.Object) boolean16);
        java.lang.Object obj18 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (-1));
        boolean boolean17 = fila11.vazia();
        java.lang.Object obj18 = fila11.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.enfileira((java.lang.Object) 10.0d);
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Object obj28 = fila11.desenfileira();
        java.lang.Object obj29 = fila11.desenfileira();
        fila0.enfileira(obj29);
        java.lang.Object obj31 = fila0.desenfileira();
        java.lang.Object obj32 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        java.lang.Object obj11 = fila4.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.enfileira((java.lang.Object) 10.0d);
        boolean boolean17 = fila12.vazia();
        boolean boolean18 = fila12.vazia();
        fila12.imprime();
        fila4.enfileira((java.lang.Object) fila12);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        fila4.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 1);
        boolean boolean14 = fila8.vazia();
        java.lang.Object obj15 = fila8.desenfileira();
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.imprime();
        fila3.enfileira((java.lang.Object) fila8);
        java.lang.Object obj19 = fila3.desenfileira();
        boolean boolean20 = fila3.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        fila3.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj19 = fila16.desenfileira();
        fila13.enfileira((java.lang.Object) fila16);
        java.lang.Object obj21 = fila13.desenfileira();
        boolean boolean22 = fila13.vazia();
        boolean boolean23 = fila13.vazia();
        fila3.enfileira((java.lang.Object) boolean23);
        fila3.imprime();
        java.lang.Object obj26 = fila3.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj24 = fila21.desenfileira();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj26 = fila18.desenfileira();
        fila0.enfileira(obj26);
        java.lang.Object obj28 = fila0.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        java.lang.Object obj34 = fila29.desenfileira();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.enfileira((java.lang.Object) 10.0d);
        boolean boolean40 = fila35.vazia();
        boolean boolean41 = fila35.vazia();
        fila35.imprime();
        fila29.enfileira((java.lang.Object) fila35);
        fila35.imprime();
        fila35.imprime();
        fila0.enfileira((java.lang.Object) fila35);
        boolean boolean47 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1) + "'", obj17, (-1));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        boolean boolean22 = fila17.vazia();
        java.lang.Object obj23 = fila17.desenfileira();
        boolean boolean24 = fila17.vazia();
        fila17.enfileira((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass27 = fila17.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass27);
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        fila6.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        java.lang.Object obj17 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        fila11.enfileira((java.lang.Object) fila20);
        fila6.enfileira((java.lang.Object) fila11);
        boolean boolean26 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        java.lang.Object obj10 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        fila18.enfileira((java.lang.Object) (byte) 1);
        fila18.imprime();
        boolean boolean25 = fila18.vazia();
        java.lang.Object obj26 = fila18.desenfileira();
        boolean boolean27 = fila18.vazia();
        fila18.imprime();
        fila8.enfileira((java.lang.Object) fila18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        boolean boolean17 = fila6.vazia();
        fila6.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean8 = fila3.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0d);
        fila7.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) (-1L));
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0.0d);
        fila22.enfileira((java.lang.Object) 10.0d);
        boolean boolean27 = fila22.vazia();
        boolean boolean28 = fila22.vazia();
        fila18.enfileira((java.lang.Object) fila22);
        boolean boolean30 = fila22.vazia();
        fila7.enfileira((java.lang.Object) boolean30);
        java.lang.Class<?> wildcardClass32 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        fila3.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila13.enfileira((java.lang.Object) fila18);
        fila3.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass25 = fila13.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        fila15.imprime();
        boolean boolean21 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila15.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        fila29.imprime();
        boolean boolean35 = fila29.vazia();
        fila26.enfileira((java.lang.Object) fila29);
        fila29.imprime();
        fila29.enfileira((java.lang.Object) (byte) 10);
        fila29.imprime();
        fila15.enfileira((java.lang.Object) fila29);
        fila15.enfileira((java.lang.Object) "hi!");
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj45 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1L) + "'", obj45, (-1L));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.enfileira((java.lang.Object) 10.0d);
        fila9.imprime();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        java.lang.Class<?> wildcardClass17 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        boolean boolean19 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        java.lang.Object obj21 = fila10.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila10.enfileira((java.lang.Object) fila22);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        boolean boolean29 = fila27.vazia();
        fila27.enfileira((java.lang.Object) (byte) -1);
        boolean boolean32 = fila27.vazia();
        java.lang.Object obj33 = fila27.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        fila34.imprime();
        fila34.enfileira((java.lang.Object) (byte) 1);
        boolean boolean40 = fila34.vazia();
        java.lang.Object obj41 = fila34.desenfileira();
        java.lang.Object obj42 = fila34.desenfileira();
        boolean boolean43 = fila34.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila34.enfileira((java.lang.Object) fila44);
        fila34.imprime();
        fila27.enfileira((java.lang.Object) fila34);
        fila22.enfileira((java.lang.Object) fila27);
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0.0d);
        fila52.enfileira((java.lang.Object) 10.0d);
        fila52.imprime();
        java.lang.Object obj58 = fila52.desenfileira();
        boolean boolean59 = fila52.vazia();
        fila52.imprime();
        java.lang.Object obj61 = fila52.desenfileira();
        fila22.enfileira(obj61);
        fila0.enfileira(obj61);
        fila0.imprime();
        java.lang.Object obj65 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0.0d + "'", obj58, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 10.0d + "'", obj61, 10.0d);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        fila7.enfileira((java.lang.Object) fila10);
        java.lang.Object obj18 = fila7.desenfileira();
        java.lang.Object obj19 = fila7.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (-1));
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        fila20.imprime();
        fila7.enfileira((java.lang.Object) fila20);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj36 = fila33.desenfileira();
        fila30.enfileira((java.lang.Object) fila33);
        java.lang.Object obj38 = fila30.desenfileira();
        fila30.imprime();
        fila7.enfileira((java.lang.Object) fila30);
        fila0.enfileira((java.lang.Object) fila30);
        java.lang.Object obj42 = fila30.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0.0d);
        fila46.imprime();
        boolean boolean50 = fila46.vazia();
        fila46.imprime();
        boolean boolean52 = fila46.vazia();
        fila43.enfileira((java.lang.Object) fila46);
        java.lang.Object obj54 = fila43.desenfileira();
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        boolean boolean57 = fila55.vazia();
        fila55.imprime();
        fila43.enfileira((java.lang.Object) fila55);
        boolean boolean60 = fila43.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 0.0d);
        fila64.imprime();
        boolean boolean68 = fila64.vazia();
        fila64.imprime();
        boolean boolean70 = fila64.vazia();
        fila61.enfileira((java.lang.Object) fila64);
        java.lang.Object obj72 = fila64.desenfileira();
        fila43.enfileira((java.lang.Object) fila64);
        fila30.enfileira((java.lang.Object) fila43);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0d + "'", obj38, 0.0d);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) 1 + "'", obj54, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0.0d + "'", obj72, 0.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila4.desenfileira();
        boolean boolean13 = fila4.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) fila14);
        fila4.enfileira((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.imprime();
        boolean boolean10 = fila6.vazia();
        java.lang.Class<?> wildcardClass11 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) (-1));
        boolean boolean19 = fila13.vazia();
        java.lang.Object obj20 = fila13.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.enfileira((java.lang.Object) 10.0d);
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila21.imprime();
        fila13.enfileira((java.lang.Object) fila21);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        fila30.enfileira((java.lang.Object) 10.0d);
        fila30.imprime();
        java.lang.Object obj36 = fila30.desenfileira();
        java.lang.Object obj37 = fila30.desenfileira();
        fila21.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 0.0d);
        fila39.imprime();
        fila39.enfileira((java.lang.Object) (-1));
        boolean boolean45 = fila39.vazia();
        fila39.imprime();
        fila39.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 0.0d);
        fila49.imprime();
        boolean boolean53 = fila49.vazia();
        boolean boolean54 = fila49.vazia();
        java.lang.Object obj55 = fila49.desenfileira();
        fila49.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0.0d);
        fila58.imprime();
        fila49.enfileira((java.lang.Object) fila58);
        fila39.enfileira((java.lang.Object) fila58);
        java.lang.Class<?> wildcardClass64 = fila39.getClass();
        fila21.enfileira((java.lang.Object) fila39);
        fila0.enfileira((java.lang.Object) fila39);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 10.0d + "'", obj37, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 1);
        boolean boolean14 = fila8.vazia();
        java.lang.Object obj15 = fila8.desenfileira();
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.imprime();
        fila3.enfileira((java.lang.Object) fila8);
        java.lang.Object obj19 = fila3.desenfileira();
        java.lang.Class<?> wildcardClass20 = fila3.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1) + "'", obj18, (-1));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        fila15.imprime();
        boolean boolean21 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila15.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        fila29.imprime();
        boolean boolean35 = fila29.vazia();
        fila26.enfileira((java.lang.Object) fila29);
        fila29.imprime();
        fila29.enfileira((java.lang.Object) (byte) 10);
        fila29.imprime();
        fila15.enfileira((java.lang.Object) fila29);
        fila15.enfileira((java.lang.Object) "hi!");
        fila0.enfileira((java.lang.Object) fila15);
        boolean boolean45 = fila0.vazia();
        boolean boolean46 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (-1));
        boolean boolean17 = fila11.vazia();
        java.lang.Object obj18 = fila11.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.enfileira((java.lang.Object) 10.0d);
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Object obj28 = fila11.desenfileira();
        java.lang.Object obj29 = fila11.desenfileira();
        fila0.enfileira(obj29);
        boolean boolean31 = fila0.vazia();
        java.lang.Object obj32 = fila0.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.imprime();
        boolean boolean37 = fila33.vazia();
        fila33.imprime();
        boolean boolean39 = fila33.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0.0d);
        fila40.imprime();
        boolean boolean44 = fila40.vazia();
        boolean boolean45 = fila40.vazia();
        boolean boolean46 = fila40.vazia();
        fila33.enfileira((java.lang.Object) fila40);
        boolean boolean48 = fila40.vazia();
        fila40.imprime();
        java.lang.Object obj50 = fila40.desenfileira();
        fila40.imprime();
        java.lang.Class<?> wildcardClass52 = fila40.getClass();
        fila0.enfileira((java.lang.Object) fila40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = fila40.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '4' + "'", obj10, '4');
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        fila3.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj19 = fila16.desenfileira();
        fila13.enfileira((java.lang.Object) fila16);
        java.lang.Object obj21 = fila13.desenfileira();
        boolean boolean22 = fila13.vazia();
        boolean boolean23 = fila13.vazia();
        fila3.enfileira((java.lang.Object) boolean23);
        fila3.imprime();
        fila3.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.imprime();
        boolean boolean16 = fila12.vazia();
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        fila9.enfileira((java.lang.Object) fila12);
        java.lang.Object obj20 = fila9.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        boolean boolean23 = fila21.vazia();
        fila21.imprime();
        fila9.enfileira((java.lang.Object) fila21);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.imprime();
        boolean boolean35 = fila31.vazia();
        fila26.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0.0d);
        fila37.imprime();
        boolean boolean41 = fila37.vazia();
        java.lang.Object obj42 = fila37.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0.0d);
        fila43.enfileira((java.lang.Object) 10.0d);
        boolean boolean48 = fila43.vazia();
        boolean boolean49 = fila43.vazia();
        fila43.imprime();
        fila37.enfileira((java.lang.Object) fila43);
        fila43.imprime();
        fila43.imprime();
        fila26.enfileira((java.lang.Object) fila43);
        ds.Fila fila55 = new ds.Fila();
        boolean boolean56 = fila55.vazia();
        fila55.imprime();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0.0d);
        fila58.imprime();
        boolean boolean62 = fila58.vazia();
        fila58.imprime();
        fila58.imprime();
        fila55.enfileira((java.lang.Object) fila58);
        fila26.enfileira((java.lang.Object) fila55);
        fila9.enfileira((java.lang.Object) fila55);
        fila0.enfileira((java.lang.Object) fila55);
        java.lang.Class<?> wildcardClass69 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean15 = fila6.vazia();
        java.lang.Object obj16 = fila6.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        java.lang.Object obj15 = fila10.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.enfileira((java.lang.Object) 10.0d);
        boolean boolean21 = fila16.vazia();
        boolean boolean22 = fila16.vazia();
        fila16.imprime();
        fila10.enfileira((java.lang.Object) fila16);
        boolean boolean25 = fila16.vazia();
        fila16.enfileira((java.lang.Object) "");
        fila0.enfileira((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj23 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj27 = fila15.desenfileira();
        java.lang.Object obj28 = fila15.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        fila29.enfileira((java.lang.Object) (-1));
        boolean boolean35 = fila29.vazia();
        java.lang.Object obj36 = fila29.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0.0d);
        fila37.enfileira((java.lang.Object) 10.0d);
        boolean boolean42 = fila37.vazia();
        boolean boolean43 = fila37.vazia();
        fila37.imprime();
        fila29.enfileira((java.lang.Object) fila37);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0.0d);
        fila46.enfileira((java.lang.Object) 10.0d);
        fila46.imprime();
        java.lang.Object obj52 = fila46.desenfileira();
        java.lang.Object obj53 = fila46.desenfileira();
        fila37.enfileira(obj53);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 0.0d);
        fila55.imprime();
        fila55.enfileira((java.lang.Object) (-1));
        boolean boolean61 = fila55.vazia();
        fila55.imprime();
        fila55.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila65 = new ds.Fila();
        fila65.enfileira((java.lang.Object) 0.0d);
        fila65.imprime();
        boolean boolean69 = fila65.vazia();
        boolean boolean70 = fila65.vazia();
        java.lang.Object obj71 = fila65.desenfileira();
        fila65.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila74 = new ds.Fila();
        fila74.enfileira((java.lang.Object) 0.0d);
        fila74.imprime();
        fila65.enfileira((java.lang.Object) fila74);
        fila55.enfileira((java.lang.Object) fila74);
        java.lang.Class<?> wildcardClass80 = fila55.getClass();
        fila37.enfileira((java.lang.Object) fila55);
        fila15.enfileira((java.lang.Object) fila37);
        java.lang.Class<?> wildcardClass83 = fila37.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100 + "'", obj28, 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0.0d + "'", obj52, 0.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 10.0d + "'", obj53, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 0.0d + "'", obj71, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        boolean boolean17 = fila0.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        fila21.imprime();
        boolean boolean27 = fila21.vazia();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj29 = fila21.desenfileira();
        fila0.enfileira((java.lang.Object) fila21);
        boolean boolean31 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (-1));
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila9.enfileira((java.lang.Object) fila17);
        java.lang.Object obj26 = fila9.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj33 = fila30.desenfileira();
        fila27.enfileira((java.lang.Object) fila30);
        java.lang.Object obj35 = fila27.desenfileira();
        fila9.enfileira(obj35);
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean38 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1) + "'", obj26, (-1));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        boolean boolean24 = fila18.vazia();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj26 = fila18.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass33 = fila27.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass33);
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Object obj36 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) "");
        java.lang.Class<?> wildcardClass39 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila17.vazia();
        java.lang.Object obj23 = fila17.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 1);
        boolean boolean30 = fila24.vazia();
        java.lang.Object obj31 = fila24.desenfileira();
        java.lang.Object obj32 = fila24.desenfileira();
        boolean boolean33 = fila24.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj37 = fila34.desenfileira();
        fila24.enfileira((java.lang.Object) fila34);
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila12.enfileira((java.lang.Object) fila17);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.enfileira((java.lang.Object) 10.0d);
        fila42.imprime();
        java.lang.Object obj48 = fila42.desenfileira();
        boolean boolean49 = fila42.vazia();
        fila42.imprime();
        java.lang.Object obj51 = fila42.desenfileira();
        fila12.enfileira(obj51);
        java.lang.Object obj53 = fila12.desenfileira();
        java.lang.Class<?> wildcardClass54 = fila12.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0d + "'", obj48, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 10.0d + "'", obj51, 10.0d);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1L));
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila4.enfileira((java.lang.Object) fila8);
        java.lang.Object obj16 = fila8.desenfileira();
        boolean boolean17 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj19 = fila0.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        boolean boolean24 = fila20.vazia();
        fila20.imprime();
        boolean boolean26 = fila20.vazia();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        boolean boolean31 = fila27.vazia();
        boolean boolean32 = fila27.vazia();
        boolean boolean33 = fila27.vazia();
        fila20.enfileira((java.lang.Object) fila27);
        boolean boolean35 = fila27.vazia();
        fila27.imprime();
        java.lang.Object obj37 = fila27.desenfileira();
        fila27.imprime();
        fila0.enfileira((java.lang.Object) fila27);
        fila27.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        boolean boolean24 = fila18.vazia();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj26 = fila18.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass33 = fila27.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass33);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        java.lang.Class<?> wildcardClass37 = fila18.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.enfileira((java.lang.Object) '4');
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Class<?> wildcardClass11 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        fila19.imprime();
        fila19.imprime();
        java.lang.Object obj27 = fila19.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (-1));
        boolean boolean14 = fila8.vazia();
        java.lang.Object obj15 = fila8.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.enfileira((java.lang.Object) 10.0d);
        boolean boolean21 = fila16.vazia();
        boolean boolean22 = fila16.vazia();
        fila16.imprime();
        fila8.enfileira((java.lang.Object) fila16);
        java.lang.Object obj25 = fila8.desenfileira();
        java.lang.Object obj26 = fila8.desenfileira();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1) + "'", obj25, (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 1);
        boolean boolean13 = fila7.vazia();
        java.lang.Object obj14 = fila7.desenfileira();
        java.lang.Object obj15 = fila7.desenfileira();
        boolean boolean16 = fila7.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj20 = fila17.desenfileira();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 1 + "'", obj15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj23 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj27 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        boolean boolean17 = fila0.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        fila21.imprime();
        boolean boolean27 = fila21.vazia();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj29 = fila21.desenfileira();
        fila0.enfileira((java.lang.Object) fila21);
        fila0.imprime();
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        fila0.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0.0d);
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        boolean boolean30 = fila25.vazia();
        java.lang.Object obj31 = fila25.desenfileira();
        boolean boolean32 = fila25.vazia();
        fila18.enfileira((java.lang.Object) fila25);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        fila34.imprime();
        fila34.enfileira((java.lang.Object) (-1));
        boolean boolean40 = fila34.vazia();
        fila34.imprime();
        fila34.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        fila44.imprime();
        boolean boolean48 = fila44.vazia();
        boolean boolean49 = fila44.vazia();
        java.lang.Object obj50 = fila44.desenfileira();
        fila44.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 0.0d);
        fila53.imprime();
        fila44.enfileira((java.lang.Object) fila53);
        fila34.enfileira((java.lang.Object) fila53);
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj65 = fila62.desenfileira();
        fila59.enfileira((java.lang.Object) fila62);
        java.lang.Object obj67 = fila59.desenfileira();
        fila59.imprime();
        ds.Fila fila69 = new ds.Fila();
        fila69.enfileira((java.lang.Object) 0.0d);
        fila69.imprime();
        boolean boolean73 = fila69.vazia();
        fila69.imprime();
        boolean boolean75 = fila69.vazia();
        ds.Fila fila76 = new ds.Fila();
        fila76.enfileira((java.lang.Object) 0.0d);
        fila76.imprime();
        boolean boolean80 = fila76.vazia();
        boolean boolean81 = fila76.vazia();
        boolean boolean82 = fila76.vazia();
        fila69.enfileira((java.lang.Object) fila76);
        boolean boolean84 = fila76.vazia();
        fila76.imprime();
        java.lang.Object obj86 = fila76.desenfileira();
        fila76.imprime();
        fila59.enfileira((java.lang.Object) fila76);
        fila76.imprime();
        fila34.enfileira((java.lang.Object) fila76);
        fila25.enfileira((java.lang.Object) fila76);
        fila0.enfileira((java.lang.Object) fila76);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0d + "'", obj65, 0.0d);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + 0.0d + "'", obj86, 0.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj15 = null;
        fila0.enfileira(obj15);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) 1);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila18.enfileira((java.lang.Object) fila28);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        boolean boolean36 = fila0.vazia();
        java.lang.Object obj37 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        java.lang.Object obj27 = fila21.desenfileira();
        boolean boolean28 = fila21.vazia();
        boolean boolean29 = fila21.vazia();
        fila0.enfileira((java.lang.Object) boolean29);
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila4.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        java.lang.Object obj27 = fila21.desenfileira();
        boolean boolean28 = fila21.vazia();
        boolean boolean29 = fila21.vazia();
        fila0.enfileira((java.lang.Object) boolean29);
        boolean boolean31 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean11 = fila3.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj18 = fila15.desenfileira();
        fila12.enfileira((java.lang.Object) fila15);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass23 = fila20.getClass();
        fila12.enfileira((java.lang.Object) fila20);
        fila3.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 1);
        boolean boolean14 = fila8.vazia();
        java.lang.Object obj15 = fila8.desenfileira();
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.imprime();
        fila3.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        java.lang.Class<?> wildcardClass20 = fila8.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        boolean boolean17 = fila6.vazia();
        java.lang.Object obj18 = fila6.desenfileira();
        java.lang.Object obj19 = fila6.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0d + "'", obj19, 10.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj15 = null;
        fila0.enfileira(obj15);
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila4.desenfileira();
        boolean boolean13 = fila4.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass18 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass17 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        fila15.imprime();
        boolean boolean21 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        java.lang.Object obj23 = fila12.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        boolean boolean26 = fila24.vazia();
        fila24.imprime();
        fila12.enfileira((java.lang.Object) fila24);
        boolean boolean29 = fila12.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.imprime();
        boolean boolean37 = fila33.vazia();
        fila33.imprime();
        boolean boolean39 = fila33.vazia();
        fila30.enfileira((java.lang.Object) fila33);
        java.lang.Object obj41 = fila33.desenfileira();
        fila12.enfileira((java.lang.Object) fila33);
        fila0.enfileira((java.lang.Object) fila33);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 1 + "'", obj23, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass25 = fila19.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean15 = fila7.vazia();
        java.lang.Object obj16 = fila7.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        boolean boolean23 = fila19.vazia();
        fila19.imprime();
        boolean boolean25 = fila19.vazia();
        fila16.enfileira((java.lang.Object) fila19);
        java.lang.Object obj27 = fila16.desenfileira();
        java.lang.Object obj28 = fila16.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        fila29.enfileira((java.lang.Object) (-1));
        boolean boolean35 = fila29.vazia();
        fila29.imprime();
        fila29.imprime();
        fila16.enfileira((java.lang.Object) fila29);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj45 = fila42.desenfileira();
        fila39.enfileira((java.lang.Object) fila42);
        java.lang.Object obj47 = fila39.desenfileira();
        fila39.imprime();
        fila16.enfileira((java.lang.Object) fila39);
        fila9.enfileira((java.lang.Object) fila39);
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 1 + "'", obj27, (byte) 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj9 = fila6.desenfileira();
        fila3.enfileira((java.lang.Object) fila6);
        java.lang.Object obj11 = fila3.desenfileira();
        boolean boolean12 = fila3.vazia();
        java.lang.Class<?> wildcardClass13 = fila3.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila17.vazia();
        java.lang.Object obj23 = fila17.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 1);
        boolean boolean30 = fila24.vazia();
        java.lang.Object obj31 = fila24.desenfileira();
        java.lang.Object obj32 = fila24.desenfileira();
        boolean boolean33 = fila24.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj37 = fila34.desenfileira();
        fila24.enfileira((java.lang.Object) fila34);
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila12.enfileira((java.lang.Object) fila17);
        boolean boolean42 = fila12.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila11.enfileira((java.lang.Object) fila18);
        fila3.enfileira((java.lang.Object) fila18);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.imprime();
        boolean boolean35 = fila31.vazia();
        fila31.imprime();
        boolean boolean37 = fila31.vazia();
        fila28.enfileira((java.lang.Object) fila31);
        fila31.imprime();
        java.lang.Object obj40 = null;
        fila31.enfileira(obj40);
        fila3.enfileira((java.lang.Object) fila31);
        java.lang.Class<?> wildcardClass43 = fila31.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        java.lang.Object obj13 = fila8.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila14.enfileira((java.lang.Object) 10.0d);
        boolean boolean19 = fila14.vazia();
        boolean boolean20 = fila14.vazia();
        fila14.imprime();
        fila8.enfileira((java.lang.Object) fila14);
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        boolean boolean25 = fila23.vazia();
        java.lang.Class<?> wildcardClass26 = fila23.getClass();
        fila14.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Object obj29 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        boolean boolean24 = fila18.vazia();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj26 = fila18.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass33 = fila27.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass33);
        fila0.enfileira((java.lang.Object) fila18);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj42 = fila39.desenfileira();
        fila36.enfileira((java.lang.Object) fila39);
        boolean boolean44 = fila39.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj48 = fila45.desenfileira();
        boolean boolean49 = fila45.vazia();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 0.0d);
        fila50.imprime();
        boolean boolean54 = fila50.vazia();
        fila45.enfileira((java.lang.Object) fila50);
        java.lang.Class<?> wildcardClass56 = fila45.getClass();
        fila39.enfileira((java.lang.Object) wildcardClass56);
        fila18.enfileira((java.lang.Object) wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0d + "'", obj48, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1L));
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila4.enfileira((java.lang.Object) fila8);
        java.lang.Object obj16 = fila8.desenfileira();
        boolean boolean17 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj19 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        boolean boolean21 = fila0.vazia();
        boolean boolean22 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        boolean boolean19 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        java.lang.Object obj21 = fila10.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila10.enfileira((java.lang.Object) fila22);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        boolean boolean29 = fila27.vazia();
        fila27.enfileira((java.lang.Object) (byte) -1);
        boolean boolean32 = fila27.vazia();
        java.lang.Object obj33 = fila27.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        fila34.imprime();
        fila34.enfileira((java.lang.Object) (byte) 1);
        boolean boolean40 = fila34.vazia();
        java.lang.Object obj41 = fila34.desenfileira();
        java.lang.Object obj42 = fila34.desenfileira();
        boolean boolean43 = fila34.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila34.enfileira((java.lang.Object) fila44);
        fila34.imprime();
        fila27.enfileira((java.lang.Object) fila34);
        fila22.enfileira((java.lang.Object) fila27);
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0.0d);
        fila52.enfileira((java.lang.Object) 10.0d);
        fila52.imprime();
        java.lang.Object obj58 = fila52.desenfileira();
        boolean boolean59 = fila52.vazia();
        fila52.imprime();
        java.lang.Object obj61 = fila52.desenfileira();
        fila22.enfileira(obj61);
        fila0.enfileira(obj61);
        java.lang.Object obj64 = fila0.desenfileira();
        java.lang.Object obj65 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0.0d + "'", obj58, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 10.0d + "'", obj61, 10.0d);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0.0d + "'", obj64, 0.0d);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (-1) + "'", obj65, (-1));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean15 = fila6.vazia();
        fila6.enfileira((java.lang.Object) "");
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) (-1L));
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0.0d);
        fila22.enfileira((java.lang.Object) 10.0d);
        boolean boolean27 = fila22.vazia();
        boolean boolean28 = fila22.vazia();
        fila18.enfileira((java.lang.Object) fila22);
        java.lang.Object obj30 = fila18.desenfileira();
        fila6.enfileira(obj30);
        boolean boolean32 = fila6.vazia();
        java.lang.Class<?> wildcardClass33 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        boolean boolean24 = fila18.vazia();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj26 = fila18.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass33 = fila27.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass33);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.imprime();
        java.lang.Object obj38 = fila18.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class ds.Fila");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (-1));
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila9.enfileira((java.lang.Object) fila17);
        java.lang.Object obj26 = fila9.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj33 = fila30.desenfileira();
        fila27.enfileira((java.lang.Object) fila30);
        java.lang.Object obj35 = fila27.desenfileira();
        fila9.enfileira(obj35);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj38 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1) + "'", obj26, (-1));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean8 = fila3.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila9.desenfileira();
        boolean boolean13 = fila9.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila14.imprime();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass20 = fila9.getClass();
        fila3.enfileira((java.lang.Object) wildcardClass20);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0.0d);
        fila22.imprime();
        boolean boolean26 = fila22.vazia();
        fila22.imprime();
        fila3.enfileira((java.lang.Object) fila22);
        java.lang.Object obj29 = fila22.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        boolean boolean39 = fila35.vazia();
        fila30.enfileira((java.lang.Object) fila35);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0.0d);
        fila41.imprime();
        boolean boolean45 = fila41.vazia();
        java.lang.Object obj46 = fila41.desenfileira();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0.0d);
        fila47.enfileira((java.lang.Object) 10.0d);
        boolean boolean52 = fila47.vazia();
        boolean boolean53 = fila47.vazia();
        fila47.imprime();
        fila41.enfileira((java.lang.Object) fila47);
        fila47.imprime();
        fila47.imprime();
        fila30.enfileira((java.lang.Object) fila47);
        fila22.enfileira((java.lang.Object) fila30);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0.0d + "'", obj46, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0d);
        fila7.imprime();
        java.lang.Object obj18 = fila7.desenfileira();
        boolean boolean19 = fila7.vazia();
        java.lang.Class<?> wildcardClass20 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        boolean boolean25 = fila19.vazia();
        java.lang.Class<?> wildcardClass26 = fila19.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.enfileira((java.lang.Object) 10.0d);
        fila9.imprime();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila0.enfileira((java.lang.Object) boolean16);
        java.lang.Object obj18 = fila0.desenfileira();
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1L) + "'", obj12, (-1L));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        boolean boolean17 = fila0.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        fila21.imprime();
        boolean boolean27 = fila21.vazia();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj29 = fila21.desenfileira();
        fila0.enfileira((java.lang.Object) fila21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = fila21.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila11.enfileira((java.lang.Object) fila18);
        fila3.enfileira((java.lang.Object) fila18);
        boolean boolean28 = fila3.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        java.lang.Object obj18 = fila8.desenfileira();
        boolean boolean19 = fila8.vazia();
        java.lang.Object obj20 = fila8.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        fila0.imprime();
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj25 = fila17.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj32 = fila29.desenfileira();
        fila26.enfileira((java.lang.Object) fila29);
        java.lang.Object obj34 = fila26.desenfileira();
        fila26.imprime();
        fila17.enfileira((java.lang.Object) fila26);
        fila7.enfileira((java.lang.Object) fila26);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0.0d);
        fila38.imprime();
        fila38.enfileira((java.lang.Object) (-1));
        boolean boolean44 = fila38.vazia();
        fila26.enfileira((java.lang.Object) fila38);
        java.lang.Object obj46 = fila26.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila17.vazia();
        java.lang.Object obj23 = fila17.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 1);
        boolean boolean30 = fila24.vazia();
        java.lang.Object obj31 = fila24.desenfileira();
        java.lang.Object obj32 = fila24.desenfileira();
        boolean boolean33 = fila24.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj37 = fila34.desenfileira();
        fila24.enfileira((java.lang.Object) fila34);
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila12.enfileira((java.lang.Object) fila17);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.enfileira((java.lang.Object) 10.0d);
        fila42.imprime();
        java.lang.Object obj48 = fila42.desenfileira();
        boolean boolean49 = fila42.vazia();
        fila42.imprime();
        java.lang.Object obj51 = fila42.desenfileira();
        fila12.enfileira(obj51);
        java.lang.Object obj53 = fila12.desenfileira();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0d + "'", obj48, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 10.0d + "'", obj51, 10.0d);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.imprime();
        boolean boolean16 = fila12.vazia();
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        fila9.enfileira((java.lang.Object) fila12);
        java.lang.Object obj20 = fila9.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        boolean boolean23 = fila21.vazia();
        fila21.imprime();
        fila9.enfileira((java.lang.Object) fila21);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.imprime();
        boolean boolean35 = fila31.vazia();
        fila26.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0.0d);
        fila37.imprime();
        boolean boolean41 = fila37.vazia();
        java.lang.Object obj42 = fila37.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0.0d);
        fila43.enfileira((java.lang.Object) 10.0d);
        boolean boolean48 = fila43.vazia();
        boolean boolean49 = fila43.vazia();
        fila43.imprime();
        fila37.enfileira((java.lang.Object) fila43);
        fila43.imprime();
        fila43.imprime();
        fila26.enfileira((java.lang.Object) fila43);
        ds.Fila fila55 = new ds.Fila();
        boolean boolean56 = fila55.vazia();
        fila55.imprime();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0.0d);
        fila58.imprime();
        boolean boolean62 = fila58.vazia();
        fila58.imprime();
        fila58.imprime();
        fila55.enfileira((java.lang.Object) fila58);
        fila26.enfileira((java.lang.Object) fila55);
        fila9.enfileira((java.lang.Object) fila55);
        fila0.enfileira((java.lang.Object) fila55);
        java.lang.Object obj69 = null;
        fila0.enfileira(obj69);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila17.vazia();
        java.lang.Object obj23 = fila17.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 1);
        boolean boolean30 = fila24.vazia();
        java.lang.Object obj31 = fila24.desenfileira();
        java.lang.Object obj32 = fila24.desenfileira();
        boolean boolean33 = fila24.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj37 = fila34.desenfileira();
        fila24.enfileira((java.lang.Object) fila34);
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila12.enfileira((java.lang.Object) fila17);
        fila12.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        fila15.enfileira((java.lang.Object) fila18);
        boolean boolean23 = fila18.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj27 = fila24.desenfileira();
        boolean boolean28 = fila24.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        fila24.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass35 = fila24.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass35);
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0.0d);
        fila37.imprime();
        boolean boolean41 = fila37.vazia();
        fila37.imprime();
        fila18.enfileira((java.lang.Object) fila37);
        java.lang.Object obj44 = fila37.desenfileira();
        fila0.enfileira(obj44);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 1);
        boolean boolean13 = fila7.vazia();
        java.lang.Object obj14 = fila7.desenfileira();
        java.lang.Object obj15 = fila7.desenfileira();
        boolean boolean16 = fila7.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj20 = fila17.desenfileira();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        boolean boolean25 = fila0.vazia();
        java.lang.Object obj26 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 1 + "'", obj15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila14.imprime();
        boolean boolean18 = fila14.vazia();
        boolean boolean19 = fila14.vazia();
        java.lang.Object obj20 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0.0d);
        fila23.imprime();
        fila14.enfileira((java.lang.Object) fila23);
        fila4.enfileira((java.lang.Object) fila23);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj35 = fila32.desenfileira();
        fila29.enfileira((java.lang.Object) fila32);
        java.lang.Object obj37 = fila29.desenfileira();
        fila29.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 0.0d);
        fila39.imprime();
        boolean boolean43 = fila39.vazia();
        fila39.imprime();
        boolean boolean45 = fila39.vazia();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0.0d);
        fila46.imprime();
        boolean boolean50 = fila46.vazia();
        boolean boolean51 = fila46.vazia();
        boolean boolean52 = fila46.vazia();
        fila39.enfileira((java.lang.Object) fila46);
        boolean boolean54 = fila46.vazia();
        fila46.imprime();
        java.lang.Object obj56 = fila46.desenfileira();
        fila46.imprime();
        fila29.enfileira((java.lang.Object) fila46);
        fila46.imprime();
        fila4.enfileira((java.lang.Object) fila46);
        fila0.enfileira((java.lang.Object) fila46);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0.0d + "'", obj56, 0.0d);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 1);
        boolean boolean13 = fila7.vazia();
        java.lang.Object obj14 = fila7.desenfileira();
        java.lang.Object obj15 = fila7.desenfileira();
        boolean boolean16 = fila7.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj20 = fila17.desenfileira();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 1 + "'", obj15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 10);
        fila3.imprime();
        boolean boolean15 = fila3.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        fila10.imprime();
        java.lang.Object obj14 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        boolean boolean21 = fila16.vazia();
        java.lang.Object obj22 = fila16.desenfileira();
        boolean boolean23 = fila16.vazia();
        fila16.enfileira((java.lang.Object) '4');
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 1);
        fila26.imprime();
        java.lang.Object obj30 = fila26.desenfileira();
        fila16.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean33 = fila16.vazia();
        java.lang.Class<?> wildcardClass34 = fila16.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 1 + "'", obj30, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        java.lang.Object obj13 = fila8.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila14.enfileira((java.lang.Object) 10.0d);
        boolean boolean19 = fila14.vazia();
        boolean boolean20 = fila14.vazia();
        fila14.imprime();
        fila8.enfileira((java.lang.Object) fila14);
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        boolean boolean25 = fila23.vazia();
        java.lang.Class<?> wildcardClass26 = fila23.getClass();
        fila14.enfileira((java.lang.Object) fila23);
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        fila30.enfileira((java.lang.Object) 10.0d);
        fila30.imprime();
        java.lang.Object obj36 = fila30.desenfileira();
        boolean boolean37 = fila30.vazia();
        fila30.imprime();
        fila30.imprime();
        fila0.enfileira((java.lang.Object) fila30);
        java.lang.Object obj41 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj24 = fila21.desenfileira();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj26 = fila18.desenfileira();
        fila0.enfileira(obj26);
        java.lang.Object obj28 = fila0.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        java.lang.Object obj34 = fila29.desenfileira();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.enfileira((java.lang.Object) 10.0d);
        boolean boolean40 = fila35.vazia();
        boolean boolean41 = fila35.vazia();
        fila35.imprime();
        fila29.enfileira((java.lang.Object) fila35);
        fila35.imprime();
        fila35.imprime();
        fila0.enfileira((java.lang.Object) fila35);
        java.lang.Object obj47 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1) + "'", obj17, (-1));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila12.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        boolean boolean17 = fila10.vazia();
        fila3.enfileira((java.lang.Object) fila10);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila19.enfileira((java.lang.Object) (-1));
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        boolean boolean34 = fila29.vazia();
        java.lang.Object obj35 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0.0d);
        fila38.imprime();
        fila29.enfileira((java.lang.Object) fila38);
        fila19.enfileira((java.lang.Object) fila38);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj50 = fila47.desenfileira();
        fila44.enfileira((java.lang.Object) fila47);
        java.lang.Object obj52 = fila44.desenfileira();
        fila44.imprime();
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) 0.0d);
        fila54.imprime();
        boolean boolean58 = fila54.vazia();
        fila54.imprime();
        boolean boolean60 = fila54.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 0.0d);
        fila61.imprime();
        boolean boolean65 = fila61.vazia();
        boolean boolean66 = fila61.vazia();
        boolean boolean67 = fila61.vazia();
        fila54.enfileira((java.lang.Object) fila61);
        boolean boolean69 = fila61.vazia();
        fila61.imprime();
        java.lang.Object obj71 = fila61.desenfileira();
        fila61.imprime();
        fila44.enfileira((java.lang.Object) fila61);
        fila61.imprime();
        fila19.enfileira((java.lang.Object) fila61);
        fila10.enfileira((java.lang.Object) fila61);
        java.lang.Object obj77 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0.0d + "'", obj52, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 0.0d + "'", obj71, 0.0d);
        org.junit.Assert.assertNotNull(obj77);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        boolean boolean13 = fila9.vazia();
        boolean boolean14 = fila9.vazia();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila9.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 1);
        fila19.imprime();
        java.lang.Object obj23 = fila19.desenfileira();
        fila9.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean26 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 1 + "'", obj23, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj8 = fila5.desenfileira();
        boolean boolean9 = fila5.vazia();
        fila5.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 100);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila5.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass25 = fila16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 1);
        boolean boolean14 = fila8.vazia();
        java.lang.Object obj15 = fila8.desenfileira();
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.imprime();
        fila3.enfileira((java.lang.Object) fila8);
        java.lang.Object obj19 = fila3.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = fila20.desenfileira();
        boolean boolean26 = fila20.vazia();
        java.lang.Object obj27 = fila20.desenfileira();
        boolean boolean28 = fila20.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        boolean boolean34 = fila29.vazia();
        java.lang.Object obj35 = fila29.desenfileira();
        boolean boolean36 = fila29.vazia();
        fila29.enfileira((java.lang.Object) '4');
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) 1);
        fila39.imprime();
        java.lang.Object obj43 = fila39.desenfileira();
        fila29.enfileira((java.lang.Object) fila39);
        fila20.enfileira((java.lang.Object) fila29);
        fila3.enfileira((java.lang.Object) fila20);
        boolean boolean47 = fila20.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 10.0d + "'", obj27, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 1 + "'", obj43, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
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
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        boolean boolean24 = fila18.vazia();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj26 = fila18.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass33 = fila27.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass33);
        fila0.enfileira((java.lang.Object) fila18);
        boolean boolean36 = fila18.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean15 = fila6.vazia();
        fila6.enfileira((java.lang.Object) "");
        boolean boolean18 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass18 = fila12.getClass();
        fila3.enfileira((java.lang.Object) wildcardClass18);
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.imprime();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila6.enfileira((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass16 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (-1));
        boolean boolean22 = fila16.vazia();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        fila26.imprime();
        boolean boolean30 = fila26.vazia();
        boolean boolean31 = fila26.vazia();
        java.lang.Object obj32 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        fila26.enfileira((java.lang.Object) fila35);
        fila16.enfileira((java.lang.Object) fila35);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila41.enfileira((java.lang.Object) fila44);
        java.lang.Object obj49 = fila41.desenfileira();
        fila41.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0.0d);
        fila51.imprime();
        boolean boolean55 = fila51.vazia();
        fila51.imprime();
        boolean boolean57 = fila51.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0.0d);
        fila58.imprime();
        boolean boolean62 = fila58.vazia();
        boolean boolean63 = fila58.vazia();
        boolean boolean64 = fila58.vazia();
        fila51.enfileira((java.lang.Object) fila58);
        boolean boolean66 = fila58.vazia();
        fila58.imprime();
        java.lang.Object obj68 = fila58.desenfileira();
        fila58.imprime();
        fila41.enfileira((java.lang.Object) fila58);
        fila58.imprime();
        fila16.enfileira((java.lang.Object) fila58);
        fila7.enfileira((java.lang.Object) fila58);
        fila7.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 0.0d + "'", obj68, 0.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        boolean boolean21 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj15 = fila12.desenfileira();
        fila9.enfileira((java.lang.Object) fila12);
        java.lang.Object obj17 = fila9.desenfileira();
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (-1));
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        java.lang.Object obj28 = fila20.desenfileira();
        fila9.enfileira((java.lang.Object) fila20);
        java.lang.Class<?> wildcardClass30 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0.0d + "'", obj28, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (byte) 1);
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        java.lang.Object obj17 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj15 = fila10.desenfileira();
        boolean boolean16 = fila10.vazia();
        java.lang.Object obj17 = fila10.desenfileira();
        boolean boolean18 = fila10.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        boolean boolean23 = fila19.vazia();
        boolean boolean24 = fila19.vazia();
        java.lang.Object obj25 = fila19.desenfileira();
        boolean boolean26 = fila19.vazia();
        fila19.enfileira((java.lang.Object) '4');
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) 1);
        fila29.imprime();
        java.lang.Object obj33 = fila29.desenfileira();
        fila19.enfileira((java.lang.Object) fila29);
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean37 = fila10.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0d + "'", obj17, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 1 + "'", obj33, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj15 = fila10.desenfileira();
        boolean boolean16 = fila10.vazia();
        java.lang.Object obj17 = fila10.desenfileira();
        boolean boolean18 = fila10.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        boolean boolean23 = fila19.vazia();
        boolean boolean24 = fila19.vazia();
        java.lang.Object obj25 = fila19.desenfileira();
        boolean boolean26 = fila19.vazia();
        fila19.enfileira((java.lang.Object) '4');
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) 1);
        fila29.imprime();
        java.lang.Object obj33 = fila29.desenfileira();
        fila19.enfileira((java.lang.Object) fila29);
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean37 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0d + "'", obj17, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 1 + "'", obj33, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (-1));
        boolean boolean22 = fila16.vazia();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        fila26.imprime();
        boolean boolean30 = fila26.vazia();
        boolean boolean31 = fila26.vazia();
        java.lang.Object obj32 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        fila26.enfileira((java.lang.Object) fila35);
        fila16.enfileira((java.lang.Object) fila35);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila41.enfileira((java.lang.Object) fila44);
        java.lang.Object obj49 = fila41.desenfileira();
        fila41.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0.0d);
        fila51.imprime();
        boolean boolean55 = fila51.vazia();
        fila51.imprime();
        boolean boolean57 = fila51.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0.0d);
        fila58.imprime();
        boolean boolean62 = fila58.vazia();
        boolean boolean63 = fila58.vazia();
        boolean boolean64 = fila58.vazia();
        fila51.enfileira((java.lang.Object) fila58);
        boolean boolean66 = fila58.vazia();
        fila58.imprime();
        java.lang.Object obj68 = fila58.desenfileira();
        fila58.imprime();
        fila41.enfileira((java.lang.Object) fila58);
        fila58.imprime();
        fila16.enfileira((java.lang.Object) fila58);
        fila7.enfileira((java.lang.Object) fila58);
        ds.Fila fila74 = new ds.Fila();
        fila74.imprime();
        fila74.enfileira((java.lang.Object) (-1L));
        fila58.enfileira((java.lang.Object) fila74);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 0.0d + "'", obj68, 0.0d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        boolean boolean10 = fila8.vazia();
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj25 = fila17.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj32 = fila29.desenfileira();
        fila26.enfileira((java.lang.Object) fila29);
        java.lang.Object obj34 = fila26.desenfileira();
        fila26.imprime();
        fila17.enfileira((java.lang.Object) fila26);
        fila7.enfileira((java.lang.Object) fila26);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0.0d);
        fila38.imprime();
        fila38.enfileira((java.lang.Object) (-1));
        boolean boolean44 = fila38.vazia();
        java.lang.Object obj45 = fila38.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0.0d);
        fila46.enfileira((java.lang.Object) 10.0d);
        boolean boolean51 = fila46.vazia();
        boolean boolean52 = fila46.vazia();
        fila46.imprime();
        fila38.enfileira((java.lang.Object) fila46);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 0.0d);
        fila55.enfileira((java.lang.Object) 10.0d);
        fila55.imprime();
        java.lang.Object obj61 = fila55.desenfileira();
        java.lang.Object obj62 = fila55.desenfileira();
        fila46.enfileira(obj62);
        java.lang.Class<?> wildcardClass64 = fila46.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0.0d + "'", obj61, 0.0d);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 10.0d + "'", obj62, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        fila10.imprime();
        java.lang.Object obj14 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        boolean boolean21 = fila16.vazia();
        java.lang.Object obj22 = fila16.desenfileira();
        boolean boolean23 = fila16.vazia();
        fila16.enfileira((java.lang.Object) '4');
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 1);
        fila26.imprime();
        java.lang.Object obj30 = fila26.desenfileira();
        fila16.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass33 = fila16.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 1 + "'", obj30, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        fila3.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj19 = fila16.desenfileira();
        fila13.enfileira((java.lang.Object) fila16);
        java.lang.Object obj21 = fila13.desenfileira();
        boolean boolean22 = fila13.vazia();
        boolean boolean23 = fila13.vazia();
        fila3.enfileira((java.lang.Object) boolean23);
        boolean boolean25 = fila3.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        boolean boolean28 = fila26.vazia();
        boolean boolean29 = fila26.vazia();
        fila3.enfileira((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        java.lang.Object obj12 = null;
        fila3.enfileira(obj12);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        boolean boolean23 = fila19.vazia();
        fila14.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0.0d);
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        java.lang.Object obj30 = fila25.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.enfileira((java.lang.Object) 10.0d);
        boolean boolean36 = fila31.vazia();
        boolean boolean37 = fila31.vazia();
        fila31.imprime();
        fila25.enfileira((java.lang.Object) fila31);
        fila31.imprime();
        fila31.imprime();
        fila14.enfileira((java.lang.Object) fila31);
        java.lang.Object obj43 = fila31.desenfileira();
        fila31.imprime();
        fila3.enfileira((java.lang.Object) fila31);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila17.vazia();
        java.lang.Object obj23 = fila17.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 1);
        boolean boolean30 = fila24.vazia();
        java.lang.Object obj31 = fila24.desenfileira();
        java.lang.Object obj32 = fila24.desenfileira();
        boolean boolean33 = fila24.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj37 = fila34.desenfileira();
        fila24.enfileira((java.lang.Object) fila34);
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila12.enfileira((java.lang.Object) fila17);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.enfileira((java.lang.Object) 10.0d);
        fila42.imprime();
        java.lang.Object obj48 = fila42.desenfileira();
        boolean boolean49 = fila42.vazia();
        fila42.imprime();
        java.lang.Object obj51 = fila42.desenfileira();
        fila12.enfileira(obj51);
        boolean boolean53 = fila12.vazia();
        java.lang.Object obj54 = fila12.desenfileira();
        java.lang.Object obj55 = fila12.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0d + "'", obj48, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 10.0d + "'", obj51, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 10.0d + "'", obj55, 10.0d);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (-1));
        boolean boolean22 = fila16.vazia();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        fila26.imprime();
        boolean boolean30 = fila26.vazia();
        boolean boolean31 = fila26.vazia();
        java.lang.Object obj32 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        fila26.enfileira((java.lang.Object) fila35);
        fila16.enfileira((java.lang.Object) fila35);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila41.enfileira((java.lang.Object) fila44);
        java.lang.Object obj49 = fila41.desenfileira();
        fila41.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0.0d);
        fila51.imprime();
        boolean boolean55 = fila51.vazia();
        fila51.imprime();
        boolean boolean57 = fila51.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0.0d);
        fila58.imprime();
        boolean boolean62 = fila58.vazia();
        boolean boolean63 = fila58.vazia();
        boolean boolean64 = fila58.vazia();
        fila51.enfileira((java.lang.Object) fila58);
        boolean boolean66 = fila58.vazia();
        fila58.imprime();
        java.lang.Object obj68 = fila58.desenfileira();
        fila58.imprime();
        fila41.enfileira((java.lang.Object) fila58);
        fila58.imprime();
        fila16.enfileira((java.lang.Object) fila58);
        fila7.enfileira((java.lang.Object) fila58);
        boolean boolean74 = fila7.vazia();
        java.lang.Object obj75 = fila7.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 0.0d + "'", obj68, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0d);
        fila7.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) (-1L));
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0.0d);
        fila22.enfileira((java.lang.Object) 10.0d);
        boolean boolean27 = fila22.vazia();
        boolean boolean28 = fila22.vazia();
        fila18.enfileira((java.lang.Object) fila22);
        boolean boolean30 = fila22.vazia();
        fila7.enfileira((java.lang.Object) boolean30);
        boolean boolean32 = fila7.vazia();
        fila7.imprime();
        boolean boolean34 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (-1));
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila9.enfileira((java.lang.Object) fila17);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        fila26.enfileira((java.lang.Object) 10.0d);
        fila26.imprime();
        java.lang.Object obj32 = fila26.desenfileira();
        java.lang.Object obj33 = fila26.desenfileira();
        fila17.enfileira(obj33);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        fila35.enfileira((java.lang.Object) (-1));
        boolean boolean41 = fila35.vazia();
        fila35.imprime();
        fila35.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 0.0d);
        fila45.imprime();
        boolean boolean49 = fila45.vazia();
        boolean boolean50 = fila45.vazia();
        java.lang.Object obj51 = fila45.desenfileira();
        fila45.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) 0.0d);
        fila54.imprime();
        fila45.enfileira((java.lang.Object) fila54);
        fila35.enfileira((java.lang.Object) fila54);
        java.lang.Class<?> wildcardClass60 = fila35.getClass();
        fila17.enfileira((java.lang.Object) fila35);
        fila0.enfileira((java.lang.Object) fila35);
        java.lang.Class<?> wildcardClass63 = fila35.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10.0d + "'", obj33, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0.0d + "'", obj51, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean8 = fila3.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila9.desenfileira();
        boolean boolean13 = fila9.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila14.imprime();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass20 = fila9.getClass();
        fila3.enfileira((java.lang.Object) wildcardClass20);
        boolean boolean22 = fila3.vazia();
        java.lang.Object obj23 = fila3.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class ds.Fila");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 10);
        fila3.imprime();
        fila3.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (-1));
        boolean boolean22 = fila16.vazia();
        java.lang.Object obj23 = fila16.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.enfileira((java.lang.Object) 10.0d);
        boolean boolean29 = fila24.vazia();
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        fila16.enfileira((java.lang.Object) fila24);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.imprime();
        boolean boolean37 = fila33.vazia();
        boolean boolean38 = fila33.vazia();
        java.lang.Object obj39 = fila33.desenfileira();
        boolean boolean40 = fila33.vazia();
        fila33.enfileira((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass43 = fila33.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass43);
        fila3.enfileira((java.lang.Object) fila16);
        java.lang.Object obj46 = fila3.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0d + "'", obj39, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0.0d + "'", obj46, 0.0d);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.enfileira((java.lang.Object) '4');
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0.0d);
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        boolean boolean30 = fila25.vazia();
        java.lang.Object obj31 = fila25.desenfileira();
        boolean boolean32 = fila25.vazia();
        fila18.enfileira((java.lang.Object) fila25);
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object obj35 = new java.lang.Object();
        fila34.enfileira(obj35);
        java.lang.Object obj37 = fila34.desenfileira();
        fila25.enfileira((java.lang.Object) fila34);
        fila0.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean8 = fila3.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila9.desenfileira();
        boolean boolean13 = fila9.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila14.imprime();
        boolean boolean18 = fila14.vazia();
        fila9.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass20 = fila9.getClass();
        fila3.enfileira((java.lang.Object) wildcardClass20);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0.0d);
        fila22.imprime();
        boolean boolean26 = fila22.vazia();
        fila22.imprime();
        fila3.enfileira((java.lang.Object) fila22);
        java.lang.Object obj29 = fila22.desenfileira();
        java.lang.Class<?> wildcardClass30 = fila22.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        java.lang.Object obj16 = fila11.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        fila11.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        boolean boolean29 = fila17.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj17 = fila6.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        boolean boolean22 = fila18.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0.0d);
        fila23.imprime();
        boolean boolean27 = fila23.vazia();
        fila18.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass29 = fila18.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = fila6.desenfileira();
        fila6.imprime();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.imprime();
        fila33.enfileira((java.lang.Object) (byte) 1);
        fila33.imprime();
        boolean boolean40 = fila33.vazia();
        java.lang.Object obj41 = fila33.desenfileira();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.imprime();
        fila42.enfileira((java.lang.Object) (byte) 1);
        boolean boolean48 = fila42.vazia();
        java.lang.Object obj49 = fila42.desenfileira();
        java.lang.Object obj50 = fila42.desenfileira();
        fila33.enfileira((java.lang.Object) fila42);
        java.lang.Class<?> wildcardClass52 = fila42.getClass();
        fila6.enfileira((java.lang.Object) fila42);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10.0d + "'", obj31, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (byte) 1 + "'", obj50, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (byte) 1);
        fila11.imprime();
        boolean boolean18 = fila11.vazia();
        java.lang.Object obj19 = fila11.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (byte) 1);
        boolean boolean26 = fila20.vazia();
        java.lang.Object obj27 = fila20.desenfileira();
        java.lang.Object obj28 = fila20.desenfileira();
        fila11.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean31 = fila11.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        boolean boolean39 = fila35.vazia();
        fila35.imprime();
        boolean boolean41 = fila35.vazia();
        fila32.enfileira((java.lang.Object) fila35);
        java.lang.Object obj43 = fila32.desenfileira();
        java.lang.Object obj44 = fila32.desenfileira();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 0.0d);
        fila45.imprime();
        fila45.enfileira((java.lang.Object) (-1));
        boolean boolean51 = fila45.vazia();
        fila45.imprime();
        fila45.imprime();
        fila32.enfileira((java.lang.Object) fila45);
        fila11.enfileira((java.lang.Object) fila32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 1 + "'", obj28, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 1 + "'", obj43, (byte) 1);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila10.enfileira((java.lang.Object) fila17);
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj27 = fila17.desenfileira();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
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
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.enfileira((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        fila16.imprime();
        boolean boolean22 = fila16.vazia();
        fila13.enfileira((java.lang.Object) fila16);
        java.lang.Object obj24 = fila13.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        boolean boolean27 = fila25.vazia();
        fila25.imprime();
        fila13.enfileira((java.lang.Object) fila25);
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        boolean boolean32 = fila30.vazia();
        fila30.enfileira((java.lang.Object) (byte) -1);
        boolean boolean35 = fila30.vazia();
        java.lang.Object obj36 = fila30.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0.0d);
        fila37.imprime();
        fila37.enfileira((java.lang.Object) (byte) 1);
        boolean boolean43 = fila37.vazia();
        java.lang.Object obj44 = fila37.desenfileira();
        java.lang.Object obj45 = fila37.desenfileira();
        boolean boolean46 = fila37.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj50 = fila47.desenfileira();
        fila37.enfileira((java.lang.Object) fila47);
        fila37.imprime();
        fila30.enfileira((java.lang.Object) fila37);
        fila25.enfileira((java.lang.Object) fila30);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 0.0d);
        fila55.enfileira((java.lang.Object) 10.0d);
        fila55.imprime();
        java.lang.Object obj61 = fila55.desenfileira();
        boolean boolean62 = fila55.vazia();
        fila55.imprime();
        java.lang.Object obj64 = fila55.desenfileira();
        fila25.enfileira(obj64);
        ds.Fila fila66 = new ds.Fila();
        fila66.enfileira((java.lang.Object) 0.0d);
        fila66.imprime();
        boolean boolean70 = fila66.vazia();
        boolean boolean71 = fila66.vazia();
        java.lang.Object obj72 = fila66.desenfileira();
        fila66.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila75 = new ds.Fila();
        fila75.enfileira((java.lang.Object) 0.0d);
        fila75.imprime();
        fila66.enfileira((java.lang.Object) fila75);
        fila25.enfileira((java.lang.Object) fila66);
        ds.Fila fila81 = new ds.Fila();
        fila81.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila84 = new ds.Fila();
        fila84.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj87 = fila84.desenfileira();
        fila81.enfileira((java.lang.Object) fila84);
        java.lang.Object obj89 = fila81.desenfileira();
        fila81.imprime();
        fila81.imprime();
        fila66.enfileira((java.lang.Object) fila81);
        java.lang.Class<?> wildcardClass93 = fila66.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass93);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 1 + "'", obj45, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0.0d + "'", obj61, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 10.0d + "'", obj64, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0.0d + "'", obj72, 0.0d);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + 0.0d + "'", obj87, 0.0d);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 0.0d + "'", obj89, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        boolean boolean19 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        java.lang.Object obj21 = fila10.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila10.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass28 = fila10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) (-1));
        boolean boolean19 = fila13.vazia();
        fila13.imprime();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj29 = fila26.desenfileira();
        fila23.enfileira((java.lang.Object) fila26);
        java.lang.Object obj31 = fila23.desenfileira();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        java.lang.Object obj34 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        fila17.imprime();
        java.lang.Object obj23 = fila17.desenfileira();
        java.lang.Object obj24 = fila17.desenfileira();
        fila8.enfileira(obj24);
        java.lang.Object obj26 = fila8.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0d + "'", obj24, 10.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj31 = fila28.desenfileira();
        fila25.enfileira((java.lang.Object) fila28);
        java.lang.Object obj33 = fila25.desenfileira();
        fila25.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        boolean boolean39 = fila35.vazia();
        fila35.imprime();
        boolean boolean41 = fila35.vazia();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.imprime();
        boolean boolean46 = fila42.vazia();
        boolean boolean47 = fila42.vazia();
        boolean boolean48 = fila42.vazia();
        fila35.enfileira((java.lang.Object) fila42);
        boolean boolean50 = fila42.vazia();
        fila42.imprime();
        java.lang.Object obj52 = fila42.desenfileira();
        fila42.imprime();
        fila25.enfileira((java.lang.Object) fila42);
        fila42.imprime();
        fila0.enfileira((java.lang.Object) fila42);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 0.0d);
        fila57.imprime();
        boolean boolean61 = fila57.vazia();
        fila57.imprime();
        boolean boolean63 = fila57.vazia();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 0.0d);
        fila64.imprime();
        boolean boolean68 = fila64.vazia();
        boolean boolean69 = fila64.vazia();
        boolean boolean70 = fila64.vazia();
        fila57.enfileira((java.lang.Object) fila64);
        fila64.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila74 = new ds.Fila();
        fila74.enfileira((java.lang.Object) 0.0d);
        fila74.enfileira((java.lang.Object) 10.0d);
        boolean boolean79 = fila74.vazia();
        boolean boolean80 = fila74.vazia();
        fila74.imprime();
        java.lang.Object obj82 = fila74.desenfileira();
        ds.Fila fila83 = new ds.Fila();
        fila83.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila86 = new ds.Fila();
        fila86.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj89 = fila86.desenfileira();
        fila83.enfileira((java.lang.Object) fila86);
        java.lang.Object obj91 = fila83.desenfileira();
        fila83.imprime();
        fila74.enfileira((java.lang.Object) fila83);
        fila64.enfileira((java.lang.Object) fila83);
        fila0.enfileira((java.lang.Object) fila83);
        java.lang.Object obj96 = fila83.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0.0d + "'", obj52, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 0.0d + "'", obj82, 0.0d);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 0.0d + "'", obj89, 0.0d);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + 0.0d + "'", obj91, 0.0d);
        org.junit.Assert.assertNotNull(obj96);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila4.desenfileira();
        boolean boolean13 = fila4.vazia();
        fila4.imprime();
        java.lang.Object obj15 = fila4.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        java.lang.Class<?> wildcardClass20 = fila16.getClass();
        fila4.enfileira((java.lang.Object) fila16);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0.0d);
        fila22.imprime();
        boolean boolean26 = fila22.vazia();
        fila22.imprime();
        fila22.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        boolean boolean34 = fila29.vazia();
        java.lang.Object obj35 = fila29.desenfileira();
        boolean boolean36 = fila29.vazia();
        fila22.enfileira((java.lang.Object) fila29);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0.0d);
        fila38.imprime();
        fila38.enfileira((java.lang.Object) (-1));
        boolean boolean44 = fila38.vazia();
        fila38.imprime();
        fila38.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 0.0d);
        fila48.imprime();
        boolean boolean52 = fila48.vazia();
        boolean boolean53 = fila48.vazia();
        java.lang.Object obj54 = fila48.desenfileira();
        fila48.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 0.0d);
        fila57.imprime();
        fila48.enfileira((java.lang.Object) fila57);
        fila38.enfileira((java.lang.Object) fila57);
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila66 = new ds.Fila();
        fila66.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj69 = fila66.desenfileira();
        fila63.enfileira((java.lang.Object) fila66);
        java.lang.Object obj71 = fila63.desenfileira();
        fila63.imprime();
        ds.Fila fila73 = new ds.Fila();
        fila73.enfileira((java.lang.Object) 0.0d);
        fila73.imprime();
        boolean boolean77 = fila73.vazia();
        fila73.imprime();
        boolean boolean79 = fila73.vazia();
        ds.Fila fila80 = new ds.Fila();
        fila80.enfileira((java.lang.Object) 0.0d);
        fila80.imprime();
        boolean boolean84 = fila80.vazia();
        boolean boolean85 = fila80.vazia();
        boolean boolean86 = fila80.vazia();
        fila73.enfileira((java.lang.Object) fila80);
        boolean boolean88 = fila80.vazia();
        fila80.imprime();
        java.lang.Object obj90 = fila80.desenfileira();
        fila80.imprime();
        fila63.enfileira((java.lang.Object) fila80);
        fila80.imprime();
        fila38.enfileira((java.lang.Object) fila80);
        fila29.enfileira((java.lang.Object) fila80);
        java.lang.Object obj96 = fila29.desenfileira();
        fila16.enfileira((java.lang.Object) fila29);
        java.lang.Object obj98 = null;
        fila16.enfileira(obj98);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0.0d + "'", obj54, 0.0d);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0.0d + "'", obj69, 0.0d);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 0.0d + "'", obj71, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 0.0d + "'", obj90, 0.0d);
        org.junit.Assert.assertNotNull(obj96);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 1);
        boolean boolean14 = fila8.vazia();
        java.lang.Object obj15 = fila8.desenfileira();
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.imprime();
        fila3.enfileira((java.lang.Object) fila8);
        java.lang.Object obj19 = fila3.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = fila20.desenfileira();
        boolean boolean26 = fila20.vazia();
        java.lang.Object obj27 = fila20.desenfileira();
        boolean boolean28 = fila20.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        boolean boolean34 = fila29.vazia();
        java.lang.Object obj35 = fila29.desenfileira();
        boolean boolean36 = fila29.vazia();
        fila29.enfileira((java.lang.Object) '4');
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) 1);
        fila39.imprime();
        java.lang.Object obj43 = fila39.desenfileira();
        fila29.enfileira((java.lang.Object) fila39);
        fila20.enfileira((java.lang.Object) fila29);
        fila3.enfileira((java.lang.Object) fila20);
        boolean boolean47 = fila3.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 10.0d + "'", obj27, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 1 + "'", obj43, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (short) 100);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        boolean boolean19 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        java.lang.Object obj21 = fila10.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila10.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean28 = fila10.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        fila10.enfileira((java.lang.Object) (-1));
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        java.lang.Object obj18 = fila10.desenfileira();
        java.lang.Class<?> wildcardClass19 = fila10.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1L));
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila4.enfileira((java.lang.Object) fila8);
        java.lang.Object obj16 = fila8.desenfileira();
        boolean boolean17 = fila8.vazia();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj22 = fila19.desenfileira();
        boolean boolean23 = fila19.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        fila30.imprime();
        fila30.enfileira((java.lang.Object) (-1));
        boolean boolean36 = fila30.vazia();
        java.lang.Object obj37 = fila30.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0.0d);
        fila38.enfileira((java.lang.Object) 10.0d);
        boolean boolean43 = fila38.vazia();
        boolean boolean44 = fila38.vazia();
        fila38.imprime();
        fila30.enfileira((java.lang.Object) fila38);
        java.lang.Object obj47 = fila30.desenfileira();
        java.lang.Object obj48 = fila30.desenfileira();
        fila19.enfileira(obj48);
        fila19.imprime();
        fila8.enfileira((java.lang.Object) fila19);
        boolean boolean52 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1) + "'", obj47, (-1));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.enfileira((java.lang.Object) 10.0d);
        fila9.imprime();
        java.lang.Object obj15 = fila9.desenfileira();
        boolean boolean16 = fila9.vazia();
        fila9.imprime();
        java.lang.Class<?> wildcardClass18 = fila9.getClass();
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        java.lang.Object obj11 = fila4.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.enfileira((java.lang.Object) 10.0d);
        boolean boolean17 = fila12.vazia();
        boolean boolean18 = fila12.vazia();
        fila12.imprime();
        fila4.enfileira((java.lang.Object) fila12);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj22 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (-1));
        boolean boolean17 = fila11.vazia();
        java.lang.Object obj18 = fila11.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.enfileira((java.lang.Object) 10.0d);
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Object obj28 = fila11.desenfileira();
        java.lang.Object obj29 = fila11.desenfileira();
        fila0.enfileira(obj29);
        java.lang.Object obj31 = fila0.desenfileira();
        java.lang.Object obj32 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass33 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        boolean boolean24 = fila18.vazia();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj26 = fila18.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass33 = fila27.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass33);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        fila18.imprime();
        fila18.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        fila3.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila13.enfileira((java.lang.Object) fila18);
        fila3.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass25 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila14.imprime();
        fila5.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean20 = fila5.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        fila21.imprime();
        boolean boolean28 = fila21.vazia();
        fila5.enfileira((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        fila0.enfileira(obj1);
        boolean boolean3 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) 1);
        boolean boolean12 = fila6.vazia();
        java.lang.Object obj13 = fila6.desenfileira();
        java.lang.Object obj14 = fila6.desenfileira();
        boolean boolean15 = fila6.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj19 = fila16.desenfileira();
        fila6.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        boolean boolean28 = fila24.vazia();
        fila24.imprime();
        boolean boolean30 = fila24.vazia();
        fila21.enfileira((java.lang.Object) fila24);
        java.lang.Object obj32 = fila24.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.imprime();
        fila33.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass39 = fila33.getClass();
        fila24.enfileira((java.lang.Object) wildcardClass39);
        fila6.enfileira((java.lang.Object) fila24);
        java.lang.Object obj42 = fila6.desenfileira();
        fila0.enfileira(obj42);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        java.lang.Object obj18 = fila8.desenfileira();
        boolean boolean19 = fila8.vazia();
        fila8.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object obj2 = new java.lang.Object();
        fila0.enfileira(obj2);
        fila0.imprime();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (-1));
        boolean boolean17 = fila11.vazia();
        java.lang.Object obj18 = fila11.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.enfileira((java.lang.Object) 10.0d);
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Object obj28 = fila11.desenfileira();
        java.lang.Object obj29 = fila11.desenfileira();
        fila0.enfileira(obj29);
        fila0.imprime();
        boolean boolean32 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.enfileira((java.lang.Object) '4');
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        boolean boolean19 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) 1);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila18.enfileira((java.lang.Object) fila28);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0.0d);
        fila36.enfileira((java.lang.Object) 10.0d);
        fila36.imprime();
        java.lang.Object obj42 = fila36.desenfileira();
        java.lang.Object obj43 = fila36.desenfileira();
        java.lang.Class<?> wildcardClass44 = fila36.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass44);
        boolean boolean46 = fila18.vazia();
        java.lang.Class<?> wildcardClass47 = fila18.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 10.0d + "'", obj43, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 1);
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        java.lang.Object obj20 = fila12.desenfileira();
        java.lang.Class<?> wildcardClass21 = fila12.getClass();
        fila3.enfileira((java.lang.Object) wildcardClass21);
        boolean boolean23 = fila3.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        fila15.imprime();
        boolean boolean21 = fila15.vazia();
        fila12.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        fila15.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        fila29.imprime();
        boolean boolean35 = fila29.vazia();
        fila26.enfileira((java.lang.Object) fila29);
        fila29.imprime();
        fila29.enfileira((java.lang.Object) (byte) 10);
        fila29.imprime();
        fila15.enfileira((java.lang.Object) fila29);
        fila15.enfileira((java.lang.Object) "hi!");
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj45 = fila15.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0d + "'", obj45, 0.0d);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        fila17.imprime();
        boolean boolean23 = fila17.vazia();
        fila14.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 10);
        fila17.imprime();
        fila3.enfileira((java.lang.Object) fila17);
        fila3.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj32 = fila3.desenfileira();
        java.lang.Class<?> wildcardClass33 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj15 = fila12.desenfileira();
        fila9.enfileira((java.lang.Object) fila12);
        java.lang.Object obj17 = fila9.desenfileira();
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj20 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) 1);
        fila12.imprime();
        boolean boolean19 = fila12.vazia();
        java.lang.Object obj20 = fila12.desenfileira();
        java.lang.Class<?> wildcardClass21 = fila12.getClass();
        fila3.enfileira((java.lang.Object) wildcardClass21);
        fila3.imprime();
        java.lang.Object obj24 = fila3.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class ds.Fila");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        boolean boolean19 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        java.lang.Object obj21 = fila10.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila10.enfileira((java.lang.Object) fila22);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        boolean boolean29 = fila27.vazia();
        fila27.enfileira((java.lang.Object) (byte) -1);
        boolean boolean32 = fila27.vazia();
        java.lang.Object obj33 = fila27.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        fila34.imprime();
        fila34.enfileira((java.lang.Object) (byte) 1);
        boolean boolean40 = fila34.vazia();
        java.lang.Object obj41 = fila34.desenfileira();
        java.lang.Object obj42 = fila34.desenfileira();
        boolean boolean43 = fila34.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila34.enfileira((java.lang.Object) fila44);
        fila34.imprime();
        fila27.enfileira((java.lang.Object) fila34);
        fila22.enfileira((java.lang.Object) fila27);
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0.0d);
        fila52.enfileira((java.lang.Object) 10.0d);
        fila52.imprime();
        java.lang.Object obj58 = fila52.desenfileira();
        boolean boolean59 = fila52.vazia();
        fila52.imprime();
        java.lang.Object obj61 = fila52.desenfileira();
        fila22.enfileira(obj61);
        fila0.enfileira(obj61);
        fila0.imprime();
        ds.Fila fila65 = new ds.Fila();
        fila65.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila68 = new ds.Fila();
        fila68.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj71 = fila68.desenfileira();
        fila65.enfileira((java.lang.Object) fila68);
        java.lang.Object obj73 = fila65.desenfileira();
        fila65.imprime();
        fila0.enfileira((java.lang.Object) fila65);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0.0d + "'", obj58, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 10.0d + "'", obj61, 10.0d);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 0.0d + "'", obj71, 0.0d);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 0.0d + "'", obj73, 0.0d);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        boolean boolean25 = fila19.vazia();
        java.lang.Object obj26 = fila19.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (-1L));
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.enfileira((java.lang.Object) 10.0d);
        boolean boolean36 = fila31.vazia();
        boolean boolean37 = fila31.vazia();
        fila27.enfileira((java.lang.Object) fila31);
        fila27.imprime();
        java.lang.Object obj40 = fila27.desenfileira();
        fila27.imprime();
        fila19.enfileira((java.lang.Object) fila27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1L) + "'", obj40, (-1L));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj25 = fila17.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj32 = fila29.desenfileira();
        fila26.enfileira((java.lang.Object) fila29);
        java.lang.Object obj34 = fila26.desenfileira();
        fila26.imprime();
        fila17.enfileira((java.lang.Object) fila26);
        fila7.enfileira((java.lang.Object) fila26);
        boolean boolean38 = fila26.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj17 = null;
        fila0.enfileira(obj17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj17 = fila6.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        boolean boolean24 = fila20.vazia();
        boolean boolean25 = fila20.vazia();
        fila20.imprime();
        fila20.imprime();
        fila18.enfileira((java.lang.Object) fila20);
        fila6.enfileira((java.lang.Object) fila18);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        fila30.imprime();
        boolean boolean34 = fila30.vazia();
        boolean boolean35 = fila30.vazia();
        fila18.enfileira((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj23 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj27 = fila15.desenfileira();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj31 = fila28.desenfileira();
        boolean boolean32 = fila28.vazia();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.imprime();
        boolean boolean37 = fila33.vazia();
        fila28.enfileira((java.lang.Object) fila33);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 0.0d);
        fila39.imprime();
        fila39.enfileira((java.lang.Object) (-1));
        boolean boolean45 = fila39.vazia();
        java.lang.Object obj46 = fila39.desenfileira();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0.0d);
        fila47.enfileira((java.lang.Object) 10.0d);
        boolean boolean52 = fila47.vazia();
        boolean boolean53 = fila47.vazia();
        fila47.imprime();
        fila39.enfileira((java.lang.Object) fila47);
        java.lang.Object obj56 = fila39.desenfileira();
        java.lang.Object obj57 = fila39.desenfileira();
        fila28.enfileira(obj57);
        java.lang.Object obj59 = fila28.desenfileira();
        java.lang.Object obj60 = fila28.desenfileira();
        fila15.enfileira(obj60);
        java.lang.Class<?> wildcardClass62 = fila15.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0.0d + "'", obj46, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1) + "'", obj56, (-1));
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj24 = fila21.desenfileira();
        boolean boolean25 = fila21.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        fila26.imprime();
        boolean boolean30 = fila26.vazia();
        fila21.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (-1));
        boolean boolean17 = fila11.vazia();
        java.lang.Object obj18 = fila11.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.enfileira((java.lang.Object) 10.0d);
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Object obj28 = fila11.desenfileira();
        java.lang.Object obj29 = fila11.desenfileira();
        fila0.enfileira(obj29);
        boolean boolean31 = fila0.vazia();
        java.lang.Object obj32 = fila0.desenfileira();
        java.lang.Object obj33 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        boolean boolean14 = fila9.vazia();
        java.lang.Class<?> wildcardClass15 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj15 = fila12.desenfileira();
        fila9.enfileira((java.lang.Object) fila12);
        java.lang.Object obj17 = fila9.desenfileira();
        fila9.imprime();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (-1));
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        java.lang.Object obj28 = fila20.desenfileira();
        fila9.enfileira((java.lang.Object) fila20);
        java.lang.Object obj30 = fila20.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0.0d + "'", obj28, 0.0d);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1) + "'", obj30, (-1));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj17 = fila6.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        boolean boolean24 = fila20.vazia();
        boolean boolean25 = fila20.vazia();
        fila20.imprime();
        fila20.imprime();
        fila18.enfileira((java.lang.Object) fila20);
        fila6.enfileira((java.lang.Object) fila18);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.imprime();
        boolean boolean37 = fila33.vazia();
        fila33.imprime();
        boolean boolean39 = fila33.vazia();
        fila30.enfileira((java.lang.Object) fila33);
        fila33.imprime();
        fila33.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0.0d);
        fila47.imprime();
        boolean boolean51 = fila47.vazia();
        fila47.imprime();
        boolean boolean53 = fila47.vazia();
        fila44.enfileira((java.lang.Object) fila47);
        fila47.imprime();
        fila47.enfileira((java.lang.Object) (byte) 10);
        fila47.imprime();
        fila33.enfileira((java.lang.Object) fila47);
        fila33.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj62 = fila33.desenfileira();
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) 0.0d);
        boolean boolean66 = fila63.vazia();
        java.lang.Object obj67 = fila63.desenfileira();
        fila33.enfileira((java.lang.Object) fila63);
        fila18.enfileira((java.lang.Object) fila33);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0.0d + "'", obj62, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0.0d + "'", obj67, 0.0d);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj20 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass21 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        boolean boolean17 = fila6.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj24 = fila21.desenfileira();
        fila18.enfileira((java.lang.Object) fila21);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        fila26.imprime();
        fila26.enfileira((java.lang.Object) (byte) 1);
        boolean boolean32 = fila26.vazia();
        java.lang.Object obj33 = fila26.desenfileira();
        java.lang.Object obj34 = fila26.desenfileira();
        fila26.imprime();
        fila21.enfileira((java.lang.Object) fila26);
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0.0d);
        fila37.imprime();
        fila37.enfileira((java.lang.Object) (byte) 1);
        boolean boolean43 = fila37.vazia();
        java.lang.Object obj44 = fila37.desenfileira();
        java.lang.Object obj45 = fila37.desenfileira();
        boolean boolean46 = fila37.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj50 = fila47.desenfileira();
        fila37.enfileira((java.lang.Object) fila47);
        fila21.enfileira((java.lang.Object) fila47);
        java.lang.Class<?> wildcardClass53 = fila47.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0.0d + "'", obj44, 0.0d);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 1 + "'", obj45, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) 1);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila18.enfileira((java.lang.Object) fila28);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object obj13 = new java.lang.Object();
        fila12.enfileira(obj13);
        fila12.imprime();
        fila7.enfileira((java.lang.Object) fila12);
        fila0.enfileira((java.lang.Object) fila7);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj22 = fila11.desenfileira();
        fila11.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        java.lang.Object obj21 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        fila7.enfileira((java.lang.Object) fila10);
        java.lang.Object obj18 = fila7.desenfileira();
        java.lang.Object obj19 = fila7.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (-1));
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        fila20.imprime();
        fila7.enfileira((java.lang.Object) fila20);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj36 = fila33.desenfileira();
        fila30.enfileira((java.lang.Object) fila33);
        java.lang.Object obj38 = fila30.desenfileira();
        fila30.imprime();
        fila7.enfileira((java.lang.Object) fila30);
        fila0.enfileira((java.lang.Object) fila30);
        java.lang.Object obj42 = fila30.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        java.lang.Object obj45 = new java.lang.Object();
        fila43.enfileira(obj45);
        java.lang.Object obj47 = fila43.desenfileira();
        fila30.enfileira((java.lang.Object) fila43);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0d + "'", obj38, 0.0d);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj9 = fila6.desenfileira();
        boolean boolean10 = fila6.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        fila6.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (-1));
        boolean boolean23 = fila17.vazia();
        java.lang.Object obj24 = fila17.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0.0d);
        fila25.enfileira((java.lang.Object) 10.0d);
        boolean boolean30 = fila25.vazia();
        boolean boolean31 = fila25.vazia();
        fila25.imprime();
        fila17.enfileira((java.lang.Object) fila25);
        java.lang.Object obj34 = fila17.desenfileira();
        java.lang.Object obj35 = fila17.desenfileira();
        fila6.enfileira(obj35);
        boolean boolean37 = fila6.vazia();
        java.lang.Object obj38 = fila6.desenfileira();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 0.0d);
        fila39.imprime();
        boolean boolean43 = fila39.vazia();
        fila39.imprime();
        boolean boolean45 = fila39.vazia();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0.0d);
        fila46.imprime();
        boolean boolean50 = fila46.vazia();
        boolean boolean51 = fila46.vazia();
        boolean boolean52 = fila46.vazia();
        fila39.enfileira((java.lang.Object) fila46);
        boolean boolean54 = fila46.vazia();
        fila46.imprime();
        java.lang.Object obj56 = fila46.desenfileira();
        fila46.imprime();
        java.lang.Class<?> wildcardClass58 = fila46.getClass();
        fila6.enfileira((java.lang.Object) fila46);
        fila0.enfileira((java.lang.Object) fila46);
        java.lang.Class<?> wildcardClass61 = fila46.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1) + "'", obj34, (-1));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0.0d + "'", obj56, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (-1));
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        fila21.imprime();
        boolean boolean27 = fila21.vazia();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj29 = fila18.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        boolean boolean32 = fila30.vazia();
        fila30.imprime();
        fila18.enfileira((java.lang.Object) fila30);
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        boolean boolean37 = fila35.vazia();
        fila35.enfileira((java.lang.Object) (byte) -1);
        boolean boolean40 = fila35.vazia();
        java.lang.Object obj41 = fila35.desenfileira();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.imprime();
        fila42.enfileira((java.lang.Object) (byte) 1);
        boolean boolean48 = fila42.vazia();
        java.lang.Object obj49 = fila42.desenfileira();
        java.lang.Object obj50 = fila42.desenfileira();
        boolean boolean51 = fila42.vazia();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj55 = fila52.desenfileira();
        fila42.enfileira((java.lang.Object) fila52);
        fila42.imprime();
        fila35.enfileira((java.lang.Object) fila42);
        fila30.enfileira((java.lang.Object) fila35);
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 0.0d);
        fila60.enfileira((java.lang.Object) 10.0d);
        fila60.imprime();
        java.lang.Object obj66 = fila60.desenfileira();
        boolean boolean67 = fila60.vazia();
        fila60.imprime();
        java.lang.Object obj69 = fila60.desenfileira();
        fila30.enfileira(obj69);
        fila8.enfileira(obj69);
        java.lang.Object obj72 = fila8.desenfileira();
        boolean boolean73 = fila8.vazia();
        boolean boolean74 = fila8.vazia();
        fila0.enfileira((java.lang.Object) boolean74);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 1 + "'", obj29, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (byte) 1 + "'", obj50, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 0.0d + "'", obj66, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 10.0d + "'", obj69, 10.0d);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0.0d + "'", obj72, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila10.enfileira((java.lang.Object) fila17);
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj27 = fila17.desenfileira();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        fila0.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.imprime();
        boolean boolean35 = fila31.vazia();
        fila31.imprime();
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0.0d);
        fila38.imprime();
        boolean boolean42 = fila38.vazia();
        boolean boolean43 = fila38.vazia();
        boolean boolean44 = fila38.vazia();
        fila31.enfileira((java.lang.Object) fila38);
        boolean boolean46 = fila38.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj50 = fila47.desenfileira();
        boolean boolean51 = fila47.vazia();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0.0d);
        fila52.imprime();
        boolean boolean56 = fila52.vazia();
        fila47.enfileira((java.lang.Object) fila52);
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0.0d);
        fila58.imprime();
        boolean boolean62 = fila58.vazia();
        java.lang.Object obj63 = fila58.desenfileira();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 0.0d);
        fila64.enfileira((java.lang.Object) 10.0d);
        boolean boolean69 = fila64.vazia();
        boolean boolean70 = fila64.vazia();
        fila64.imprime();
        fila58.enfileira((java.lang.Object) fila64);
        fila64.imprime();
        fila64.imprime();
        fila47.enfileira((java.lang.Object) fila64);
        ds.Fila fila76 = new ds.Fila();
        boolean boolean77 = fila76.vazia();
        fila76.imprime();
        ds.Fila fila79 = new ds.Fila();
        fila79.enfileira((java.lang.Object) 0.0d);
        fila79.imprime();
        boolean boolean83 = fila79.vazia();
        fila79.imprime();
        fila79.imprime();
        fila76.enfileira((java.lang.Object) fila79);
        fila47.enfileira((java.lang.Object) fila76);
        boolean boolean88 = fila47.vazia();
        fila47.imprime();
        fila38.enfileira((java.lang.Object) fila47);
        fila0.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0.0d + "'", obj63, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila10.enfileira((java.lang.Object) fila17);
        boolean boolean25 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj27 = fila17.desenfileira();
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        fila0.imprime();
        boolean boolean31 = fila0.vazia();
        java.lang.Object obj32 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj12 = fila4.desenfileira();
        boolean boolean13 = fila4.vazia();
        fila4.imprime();
        boolean boolean15 = fila4.vazia();
        fila4.imprime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0.0d);
        fila22.imprime();
        boolean boolean26 = fila22.vazia();
        boolean boolean27 = fila22.vazia();
        java.lang.Object obj28 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.imprime();
        fila22.enfileira((java.lang.Object) fila31);
        fila11.enfileira((java.lang.Object) fila31);
        fila11.imprime();
        java.lang.Object obj38 = new java.lang.Object();
        fila11.enfileira(obj38);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0.0d + "'", obj28, 0.0d);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        fila21.imprime();
        fila21.imprime();
        fila18.enfileira((java.lang.Object) fila21);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        fila29.imprime();
        fila29.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0.0d);
        fila36.imprime();
        boolean boolean40 = fila36.vazia();
        boolean boolean41 = fila36.vazia();
        java.lang.Object obj42 = fila36.desenfileira();
        boolean boolean43 = fila36.vazia();
        fila29.enfileira((java.lang.Object) fila36);
        fila21.enfileira((java.lang.Object) fila36);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 0.0d);
        fila49.imprime();
        boolean boolean53 = fila49.vazia();
        fila49.imprime();
        boolean boolean55 = fila49.vazia();
        fila46.enfileira((java.lang.Object) fila49);
        fila49.imprime();
        java.lang.Object obj58 = null;
        fila49.enfileira(obj58);
        fila21.enfileira((java.lang.Object) fila49);
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 0.0d);
        fila64.imprime();
        boolean boolean68 = fila64.vazia();
        fila64.imprime();
        boolean boolean70 = fila64.vazia();
        fila61.enfileira((java.lang.Object) fila64);
        java.lang.Object obj72 = fila64.desenfileira();
        ds.Fila fila73 = new ds.Fila();
        fila73.enfileira((java.lang.Object) 0.0d);
        fila73.imprime();
        fila73.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass79 = fila73.getClass();
        fila64.enfileira((java.lang.Object) wildcardClass79);
        fila49.enfileira((java.lang.Object) fila64);
        fila0.enfileira((java.lang.Object) fila49);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0.0d + "'", obj72, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (byte) 1);
        boolean boolean13 = fila7.vazia();
        java.lang.Object obj14 = fila7.desenfileira();
        java.lang.Object obj15 = fila7.desenfileira();
        boolean boolean16 = fila7.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj20 = fila17.desenfileira();
        fila7.enfileira((java.lang.Object) fila17);
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila0.imprime();
        java.lang.Object obj25 = null;
        fila0.enfileira(obj25);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        boolean boolean31 = fila27.vazia();
        java.lang.Object obj32 = fila27.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.enfileira((java.lang.Object) 10.0d);
        boolean boolean38 = fila33.vazia();
        boolean boolean39 = fila33.vazia();
        fila33.imprime();
        fila27.enfileira((java.lang.Object) fila33);
        java.lang.Class<?> wildcardClass42 = fila33.getClass();
        fila0.enfileira((java.lang.Object) fila33);
        boolean boolean44 = fila33.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 1 + "'", obj15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        boolean boolean18 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) (-1));
        boolean boolean19 = fila13.vazia();
        fila13.imprime();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj29 = fila26.desenfileira();
        fila23.enfileira((java.lang.Object) fila26);
        java.lang.Object obj31 = fila23.desenfileira();
        fila23.imprime();
        fila0.enfileira((java.lang.Object) fila23);
        boolean boolean34 = fila23.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        java.lang.Object obj27 = fila21.desenfileira();
        boolean boolean28 = fila21.vazia();
        boolean boolean29 = fila21.vazia();
        fila0.enfileira((java.lang.Object) boolean29);
        fila0.imprime();
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila3.desenfileira();
        fila3.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila13.enfileira((java.lang.Object) fila18);
        fila3.enfileira((java.lang.Object) fila13);
        fila13.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        java.lang.Object obj27 = fila21.desenfileira();
        boolean boolean28 = fila21.vazia();
        boolean boolean29 = fila21.vazia();
        fila0.enfileira((java.lang.Object) boolean29);
        java.lang.Object obj31 = fila0.desenfileira();
        java.lang.Object obj32 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (-1));
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj15 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj17 = fila6.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1) + "'", obj17, (-1));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        boolean boolean12 = fila8.vazia();
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.enfileira((java.lang.Object) '4');
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj22 = fila19.desenfileira();
        boolean boolean23 = fila19.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        boolean boolean28 = fila24.vazia();
        fila19.enfileira((java.lang.Object) fila24);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        fila30.imprime();
        boolean boolean34 = fila30.vazia();
        java.lang.Object obj35 = fila30.desenfileira();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0.0d);
        fila36.enfileira((java.lang.Object) 10.0d);
        boolean boolean41 = fila36.vazia();
        boolean boolean42 = fila36.vazia();
        fila36.imprime();
        fila30.enfileira((java.lang.Object) fila36);
        fila36.imprime();
        fila36.imprime();
        fila19.enfileira((java.lang.Object) fila36);
        java.lang.Class<?> wildcardClass48 = fila36.getClass();
        fila8.enfileira((java.lang.Object) fila36);
        java.lang.Object obj50 = fila36.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0d + "'", obj50, 0.0d);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean20 = fila0.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        boolean boolean26 = fila21.vazia();
        java.lang.Object obj27 = fila21.desenfileira();
        boolean boolean28 = fila21.vazia();
        boolean boolean29 = fila21.vazia();
        fila0.enfileira((java.lang.Object) boolean29);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj34 = fila31.desenfileira();
        boolean boolean35 = fila31.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0.0d);
        fila36.imprime();
        boolean boolean40 = fila36.vazia();
        fila31.enfileira((java.lang.Object) fila36);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.imprime();
        fila42.enfileira((java.lang.Object) (-1));
        boolean boolean48 = fila42.vazia();
        java.lang.Object obj49 = fila42.desenfileira();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 0.0d);
        fila50.enfileira((java.lang.Object) 10.0d);
        boolean boolean55 = fila50.vazia();
        boolean boolean56 = fila50.vazia();
        fila50.imprime();
        fila42.enfileira((java.lang.Object) fila50);
        java.lang.Object obj59 = fila42.desenfileira();
        java.lang.Object obj60 = fila42.desenfileira();
        fila31.enfileira(obj60);
        java.lang.Object obj62 = fila31.desenfileira();
        java.lang.Object obj63 = fila31.desenfileira();
        fila0.enfileira(obj63);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0d + "'", obj27, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1) + "'", obj59, (-1));
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.enfileira((java.lang.Object) 10.0d);
        boolean boolean22 = fila17.vazia();
        boolean boolean23 = fila17.vazia();
        fila17.imprime();
        java.lang.Object obj25 = fila17.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj32 = fila29.desenfileira();
        fila26.enfileira((java.lang.Object) fila29);
        java.lang.Object obj34 = fila26.desenfileira();
        fila26.imprime();
        fila17.enfileira((java.lang.Object) fila26);
        fila7.enfileira((java.lang.Object) fila26);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0.0d);
        fila41.imprime();
        boolean boolean45 = fila41.vazia();
        fila41.imprime();
        boolean boolean47 = fila41.vazia();
        fila38.enfileira((java.lang.Object) fila41);
        boolean boolean49 = fila38.vazia();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 0.0d);
        fila50.enfileira((java.lang.Object) 10.0d);
        fila50.imprime();
        fila50.imprime();
        java.lang.Class<?> wildcardClass57 = fila50.getClass();
        fila38.enfileira((java.lang.Object) wildcardClass57);
        fila7.enfileira((java.lang.Object) fila38);
        java.lang.Class<?> wildcardClass60 = fila7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0d + "'", obj34, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj8 = fila5.desenfileira();
        boolean boolean9 = fila5.vazia();
        fila5.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) (short) 100);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean15 = fila7.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        fila16.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        boolean boolean31 = fila27.vazia();
        java.lang.Object obj32 = fila27.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.enfileira((java.lang.Object) 10.0d);
        boolean boolean38 = fila33.vazia();
        boolean boolean39 = fila33.vazia();
        fila33.imprime();
        fila27.enfileira((java.lang.Object) fila33);
        fila33.imprime();
        fila33.imprime();
        fila16.enfileira((java.lang.Object) fila33);
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        fila45.imprime();
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 0.0d);
        fila48.imprime();
        boolean boolean52 = fila48.vazia();
        fila48.imprime();
        fila48.imprime();
        fila45.enfileira((java.lang.Object) fila48);
        fila16.enfileira((java.lang.Object) fila45);
        boolean boolean57 = fila16.vazia();
        fila16.imprime();
        fila7.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        java.lang.Object obj61 = fila16.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj21 = fila18.desenfileira();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj23 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 100);
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj27 = fila15.desenfileira();
        java.lang.Object obj28 = fila15.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        boolean boolean31 = fila29.vazia();
        fila15.enfileira((java.lang.Object) fila29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0d + "'", obj21, 0.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0d + "'", obj23, 0.0d);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100 + "'", obj28, 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        java.lang.Object obj12 = fila3.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) (-1));
        boolean boolean19 = fila13.vazia();
        java.lang.Object obj20 = fila13.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.enfileira((java.lang.Object) 10.0d);
        boolean boolean26 = fila21.vazia();
        boolean boolean27 = fila21.vazia();
        fila21.imprime();
        fila13.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila21.imprime();
        fila3.enfileira((java.lang.Object) fila21);
        boolean boolean33 = fila21.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = fila7.desenfileira();
        boolean boolean14 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (-1));
        boolean boolean22 = fila16.vazia();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0.0d);
        fila26.imprime();
        boolean boolean30 = fila26.vazia();
        boolean boolean31 = fila26.vazia();
        java.lang.Object obj32 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        fila26.enfileira((java.lang.Object) fila35);
        fila16.enfileira((java.lang.Object) fila35);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila41.enfileira((java.lang.Object) fila44);
        java.lang.Object obj49 = fila41.desenfileira();
        fila41.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0.0d);
        fila51.imprime();
        boolean boolean55 = fila51.vazia();
        fila51.imprime();
        boolean boolean57 = fila51.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0.0d);
        fila58.imprime();
        boolean boolean62 = fila58.vazia();
        boolean boolean63 = fila58.vazia();
        boolean boolean64 = fila58.vazia();
        fila51.enfileira((java.lang.Object) fila58);
        boolean boolean66 = fila58.vazia();
        fila58.imprime();
        java.lang.Object obj68 = fila58.desenfileira();
        fila58.imprime();
        fila41.enfileira((java.lang.Object) fila58);
        fila58.imprime();
        fila16.enfileira((java.lang.Object) fila58);
        fila7.enfileira((java.lang.Object) fila58);
        java.lang.Object obj74 = fila7.desenfileira();
        fila7.imprime();
        boolean boolean76 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 0.0d + "'", obj68, 0.0d);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (-1));
        boolean boolean17 = fila11.vazia();
        java.lang.Object obj18 = fila11.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.enfileira((java.lang.Object) 10.0d);
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Object obj28 = fila11.desenfileira();
        java.lang.Object obj29 = fila11.desenfileira();
        fila0.enfileira(obj29);
        java.lang.Object obj31 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        boolean boolean19 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        java.lang.Object obj21 = fila10.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila10.enfileira((java.lang.Object) fila22);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        boolean boolean29 = fila27.vazia();
        fila27.enfileira((java.lang.Object) (byte) -1);
        boolean boolean32 = fila27.vazia();
        java.lang.Object obj33 = fila27.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        fila34.imprime();
        fila34.enfileira((java.lang.Object) (byte) 1);
        boolean boolean40 = fila34.vazia();
        java.lang.Object obj41 = fila34.desenfileira();
        java.lang.Object obj42 = fila34.desenfileira();
        boolean boolean43 = fila34.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila34.enfileira((java.lang.Object) fila44);
        fila34.imprime();
        fila27.enfileira((java.lang.Object) fila34);
        fila22.enfileira((java.lang.Object) fila27);
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0.0d);
        fila52.enfileira((java.lang.Object) 10.0d);
        fila52.imprime();
        java.lang.Object obj58 = fila52.desenfileira();
        boolean boolean59 = fila52.vazia();
        fila52.imprime();
        java.lang.Object obj61 = fila52.desenfileira();
        fila22.enfileira(obj61);
        fila0.enfileira(obj61);
        java.lang.Object obj64 = fila0.desenfileira();
        boolean boolean65 = fila0.vazia();
        boolean boolean66 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass68 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0.0d + "'", obj58, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 10.0d + "'", obj61, 10.0d);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0.0d + "'", obj64, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0.0d);
        fila7.imprime();
        boolean boolean11 = fila7.vazia();
        boolean boolean12 = fila7.vazia();
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean15 = fila7.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        fila16.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        boolean boolean31 = fila27.vazia();
        java.lang.Object obj32 = fila27.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        fila33.enfileira((java.lang.Object) 10.0d);
        boolean boolean38 = fila33.vazia();
        boolean boolean39 = fila33.vazia();
        fila33.imprime();
        fila27.enfileira((java.lang.Object) fila33);
        fila33.imprime();
        fila33.imprime();
        fila16.enfileira((java.lang.Object) fila33);
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        fila45.imprime();
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 0.0d);
        fila48.imprime();
        boolean boolean52 = fila48.vazia();
        fila48.imprime();
        fila48.imprime();
        fila45.enfileira((java.lang.Object) fila48);
        fila16.enfileira((java.lang.Object) fila45);
        boolean boolean57 = fila16.vazia();
        fila16.imprime();
        fila7.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        java.lang.Class<?> wildcardClass61 = fila16.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0d + "'", obj19, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        boolean boolean14 = fila10.vazia();
        fila10.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 100);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0.0d);
        fila23.imprime();
        boolean boolean27 = fila23.vazia();
        fila23.imprime();
        boolean boolean29 = fila23.vazia();
        fila20.enfileira((java.lang.Object) fila23);
        java.lang.Object obj31 = fila20.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        boolean boolean34 = fila32.vazia();
        fila32.imprime();
        fila20.enfileira((java.lang.Object) fila32);
        fila10.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila20);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 0.0d);
        fila39.imprime();
        fila39.enfileira((java.lang.Object) (byte) 1);
        boolean boolean45 = fila39.vazia();
        java.lang.Object obj46 = fila39.desenfileira();
        java.lang.Object obj47 = fila39.desenfileira();
        fila39.imprime();
        boolean boolean49 = fila39.vazia();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 0.0d);
        fila50.imprime();
        boolean boolean54 = fila50.vazia();
        java.lang.Object obj55 = fila50.desenfileira();
        fila50.imprime();
        fila39.enfileira((java.lang.Object) fila50);
        fila20.enfileira((java.lang.Object) fila39);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 1 + "'", obj31, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0.0d + "'", obj46, 0.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) 1 + "'", obj47, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila11.enfileira((java.lang.Object) fila18);
        fila3.enfileira((java.lang.Object) fila18);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.imprime();
        boolean boolean35 = fila31.vazia();
        fila31.imprime();
        boolean boolean37 = fila31.vazia();
        fila28.enfileira((java.lang.Object) fila31);
        fila31.imprime();
        java.lang.Object obj40 = null;
        fila31.enfileira(obj40);
        fila3.enfileira((java.lang.Object) fila31);
        java.lang.Class<?> wildcardClass43 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.imprime();
        boolean boolean10 = fila6.vazia();
        boolean boolean11 = fila6.vazia();
        java.lang.Object obj12 = fila6.desenfileira();
        boolean boolean13 = fila6.vazia();
        fila6.enfileira((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass16 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        fila0.enfileira(obj1);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object obj1 = new java.lang.Object();
        fila0.enfileira(obj1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        java.lang.Object obj9 = fila4.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.enfileira((java.lang.Object) 10.0d);
        boolean boolean15 = fila10.vazia();
        boolean boolean16 = fila10.vazia();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0.0d);
        fila22.imprime();
        boolean boolean26 = fila22.vazia();
        fila22.imprime();
        boolean boolean28 = fila22.vazia();
        fila19.enfileira((java.lang.Object) fila22);
        java.lang.Object obj30 = fila22.desenfileira();
        fila22.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj35 = fila32.desenfileira();
        boolean boolean36 = fila32.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0.0d);
        fila37.imprime();
        boolean boolean41 = fila37.vazia();
        fila32.enfileira((java.lang.Object) fila37);
        fila22.enfileira((java.lang.Object) fila32);
        fila4.enfileira((java.lang.Object) fila22);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0d + "'", obj30, 0.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        boolean boolean19 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila17.vazia();
        java.lang.Object obj23 = fila17.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0.0d);
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) 1);
        boolean boolean30 = fila24.vazia();
        java.lang.Object obj31 = fila24.desenfileira();
        java.lang.Object obj32 = fila24.desenfileira();
        boolean boolean33 = fila24.vazia();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj37 = fila34.desenfileira();
        fila24.enfileira((java.lang.Object) fila34);
        fila24.imprime();
        fila17.enfileira((java.lang.Object) fila24);
        fila12.enfileira((java.lang.Object) fila17);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.enfileira((java.lang.Object) 10.0d);
        fila42.imprime();
        java.lang.Object obj48 = fila42.desenfileira();
        boolean boolean49 = fila42.vazia();
        fila42.imprime();
        java.lang.Object obj51 = fila42.desenfileira();
        fila12.enfileira(obj51);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 0.0d);
        fila53.imprime();
        boolean boolean57 = fila53.vazia();
        boolean boolean58 = fila53.vazia();
        java.lang.Object obj59 = fila53.desenfileira();
        fila53.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 0.0d);
        fila62.imprime();
        fila53.enfileira((java.lang.Object) fila62);
        fila12.enfileira((java.lang.Object) fila53);
        boolean boolean68 = fila12.vazia();
        fila12.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0d + "'", obj48, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 10.0d + "'", obj51, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0.0d + "'", obj59, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.enfileira((java.lang.Object) 10.0d);
        boolean boolean9 = fila4.vazia();
        boolean boolean10 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj20 = fila4.desenfileira();
        fila4.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila11.enfileira((java.lang.Object) fila18);
        fila3.enfileira((java.lang.Object) fila18);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.imprime();
        boolean boolean35 = fila31.vazia();
        fila31.imprime();
        boolean boolean37 = fila31.vazia();
        fila28.enfileira((java.lang.Object) fila31);
        fila31.imprime();
        java.lang.Object obj40 = null;
        fila31.enfileira(obj40);
        fila3.enfileira((java.lang.Object) fila31);
        java.lang.Object obj43 = fila31.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0d + "'", obj43, 0.0d);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila9.imprime();
        boolean boolean14 = fila9.vazia();
        fila0.enfileira((java.lang.Object) boolean14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0.0d);
        fila13.imprime();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        boolean boolean19 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        java.lang.Object obj21 = fila10.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila10.enfileira((java.lang.Object) fila22);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        boolean boolean29 = fila27.vazia();
        fila27.enfileira((java.lang.Object) (byte) -1);
        boolean boolean32 = fila27.vazia();
        java.lang.Object obj33 = fila27.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0.0d);
        fila34.imprime();
        fila34.enfileira((java.lang.Object) (byte) 1);
        boolean boolean40 = fila34.vazia();
        java.lang.Object obj41 = fila34.desenfileira();
        java.lang.Object obj42 = fila34.desenfileira();
        boolean boolean43 = fila34.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj47 = fila44.desenfileira();
        fila34.enfileira((java.lang.Object) fila44);
        fila34.imprime();
        fila27.enfileira((java.lang.Object) fila34);
        fila22.enfileira((java.lang.Object) fila27);
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0.0d);
        fila52.enfileira((java.lang.Object) 10.0d);
        fila52.imprime();
        java.lang.Object obj58 = fila52.desenfileira();
        boolean boolean59 = fila52.vazia();
        fila52.imprime();
        java.lang.Object obj61 = fila52.desenfileira();
        fila22.enfileira(obj61);
        fila0.enfileira(obj61);
        fila0.imprime();
        boolean boolean65 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0.0d + "'", obj58, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 10.0d + "'", obj61, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean15 = fila6.vazia();
        fila6.enfileira((java.lang.Object) "");
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) (-1L));
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0.0d);
        fila22.enfileira((java.lang.Object) 10.0d);
        boolean boolean27 = fila22.vazia();
        boolean boolean28 = fila22.vazia();
        fila18.enfileira((java.lang.Object) fila22);
        java.lang.Object obj30 = fila18.desenfileira();
        fila6.enfileira(obj30);
        boolean boolean32 = fila6.vazia();
        java.lang.Object obj33 = fila6.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj31 = fila28.desenfileira();
        fila25.enfileira((java.lang.Object) fila28);
        java.lang.Object obj33 = fila25.desenfileira();
        fila25.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0.0d);
        fila35.imprime();
        boolean boolean39 = fila35.vazia();
        fila35.imprime();
        boolean boolean41 = fila35.vazia();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.imprime();
        boolean boolean46 = fila42.vazia();
        boolean boolean47 = fila42.vazia();
        boolean boolean48 = fila42.vazia();
        fila35.enfileira((java.lang.Object) fila42);
        boolean boolean50 = fila42.vazia();
        fila42.imprime();
        java.lang.Object obj52 = fila42.desenfileira();
        fila42.imprime();
        fila25.enfileira((java.lang.Object) fila42);
        fila42.imprime();
        fila0.enfileira((java.lang.Object) fila42);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 0.0d);
        fila57.imprime();
        boolean boolean61 = fila57.vazia();
        fila57.imprime();
        boolean boolean63 = fila57.vazia();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 0.0d);
        fila64.imprime();
        boolean boolean68 = fila64.vazia();
        boolean boolean69 = fila64.vazia();
        boolean boolean70 = fila64.vazia();
        fila57.enfileira((java.lang.Object) fila64);
        fila64.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila74 = new ds.Fila();
        fila74.enfileira((java.lang.Object) 0.0d);
        fila74.enfileira((java.lang.Object) 10.0d);
        boolean boolean79 = fila74.vazia();
        boolean boolean80 = fila74.vazia();
        fila74.imprime();
        java.lang.Object obj82 = fila74.desenfileira();
        ds.Fila fila83 = new ds.Fila();
        fila83.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila86 = new ds.Fila();
        fila86.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj89 = fila86.desenfileira();
        fila83.enfileira((java.lang.Object) fila86);
        java.lang.Object obj91 = fila83.desenfileira();
        fila83.imprime();
        fila74.enfileira((java.lang.Object) fila83);
        fila64.enfileira((java.lang.Object) fila83);
        fila0.enfileira((java.lang.Object) fila83);
        java.lang.Class<?> wildcardClass96 = fila83.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0d + "'", obj33, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0.0d + "'", obj52, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 0.0d + "'", obj82, 0.0d);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 0.0d + "'", obj89, 0.0d);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + 0.0d + "'", obj91, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (-1));
        boolean boolean17 = fila11.vazia();
        java.lang.Object obj18 = fila11.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.enfileira((java.lang.Object) 10.0d);
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Object obj28 = fila11.desenfileira();
        java.lang.Object obj29 = fila11.desenfileira();
        fila0.enfileira(obj29);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0f);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        java.lang.Object obj16 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.imprime();
        fila10.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        boolean boolean28 = fila26.vazia();
        fila26.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0.0d);
        fila31.imprime();
        boolean boolean35 = fila31.vazia();
        boolean boolean36 = fila31.vazia();
        java.lang.Object obj37 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0.0d);
        fila40.imprime();
        fila31.enfileira((java.lang.Object) fila40);
        fila26.enfileira((java.lang.Object) fila31);
        boolean boolean46 = fila31.vazia();
        fila19.enfileira((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj6 = fila3.desenfileira();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) 1);
        boolean boolean14 = fila8.vazia();
        java.lang.Object obj15 = fila8.desenfileira();
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.imprime();
        fila3.enfileira((java.lang.Object) fila8);
        java.lang.Object obj19 = fila3.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj25 = fila20.desenfileira();
        boolean boolean26 = fila20.vazia();
        java.lang.Object obj27 = fila20.desenfileira();
        boolean boolean28 = fila20.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0.0d);
        fila29.imprime();
        boolean boolean33 = fila29.vazia();
        boolean boolean34 = fila29.vazia();
        java.lang.Object obj35 = fila29.desenfileira();
        boolean boolean36 = fila29.vazia();
        fila29.enfileira((java.lang.Object) '4');
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) 1);
        fila39.imprime();
        java.lang.Object obj43 = fila39.desenfileira();
        fila29.enfileira((java.lang.Object) fila39);
        fila20.enfileira((java.lang.Object) fila29);
        fila3.enfileira((java.lang.Object) fila20);
        fila20.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0d + "'", obj15, 0.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 10.0d + "'", obj27, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0d + "'", obj35, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 1 + "'", obj43, (byte) 1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        java.lang.Object obj11 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0.0d);
        fila14.imprime();
        fila5.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean20 = fila5.vazia();
        java.lang.Object obj21 = fila5.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0.0d);
        fila25.imprime();
        boolean boolean29 = fila25.vazia();
        fila25.imprime();
        boolean boolean31 = fila25.vazia();
        fila22.enfileira((java.lang.Object) fila25);
        fila25.imprime();
        fila25.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 0.0d);
        fila39.imprime();
        boolean boolean43 = fila39.vazia();
        fila39.imprime();
        boolean boolean45 = fila39.vazia();
        fila36.enfileira((java.lang.Object) fila39);
        fila39.imprime();
        fila39.enfileira((java.lang.Object) (byte) 10);
        fila39.imprime();
        fila25.enfileira((java.lang.Object) fila39);
        fila25.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj54 = fila25.desenfileira();
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 0.0d);
        boolean boolean58 = fila55.vazia();
        java.lang.Object obj59 = fila55.desenfileira();
        fila25.enfileira((java.lang.Object) fila55);
        fila5.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0.0d + "'", obj54, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0.0d + "'", obj59, 0.0d);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1L));
        fila0.enfileira((java.lang.Object) (-1L));
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        boolean boolean14 = fila10.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0.0d);
        fila15.imprime();
        boolean boolean19 = fila15.vazia();
        fila10.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        java.lang.Object obj26 = fila21.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.enfileira((java.lang.Object) 10.0d);
        boolean boolean32 = fila27.vazia();
        boolean boolean33 = fila27.vazia();
        fila27.imprime();
        fila21.enfileira((java.lang.Object) fila27);
        fila27.imprime();
        fila27.imprime();
        fila10.enfileira((java.lang.Object) fila27);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass40 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0.0d);
        fila4.imprime();
        boolean boolean8 = fila4.vazia();
        fila4.imprime();
        boolean boolean10 = fila4.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        boolean boolean17 = fila11.vazia();
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean19 = fila11.vazia();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean22 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean11 = fila3.vazia();
        java.lang.Class<?> wildcardClass12 = fila3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0.0d);
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0.0d);
        fila11.imprime();
        fila11.enfileira((java.lang.Object) (-1));
        boolean boolean17 = fila11.vazia();
        java.lang.Object obj18 = fila11.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        fila19.enfileira((java.lang.Object) 10.0d);
        boolean boolean24 = fila19.vazia();
        boolean boolean25 = fila19.vazia();
        fila19.imprime();
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Object obj28 = fila11.desenfileira();
        java.lang.Object obj29 = fila11.desenfileira();
        fila0.enfileira(obj29);
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0.0d);
        fila6.enfileira((java.lang.Object) 10.0d);
        boolean boolean11 = fila6.vazia();
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        boolean boolean17 = fila6.vazia();
        java.lang.Object obj18 = fila6.desenfileira();
        fila6.imprime();
        java.lang.Class<?> wildcardClass20 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj14 = fila9.desenfileira();
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        boolean boolean23 = fila18.vazia();
        java.lang.Object obj24 = fila18.desenfileira();
        boolean boolean25 = fila18.vazia();
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) 1);
        fila28.imprime();
        java.lang.Object obj32 = fila28.desenfileira();
        fila18.enfileira((java.lang.Object) fila28);
        fila9.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila18);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0.0d);
        fila36.enfileira((java.lang.Object) 10.0d);
        fila36.imprime();
        java.lang.Object obj42 = fila36.desenfileira();
        java.lang.Object obj43 = fila36.desenfileira();
        java.lang.Class<?> wildcardClass44 = fila36.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass44);
        fila18.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0d + "'", obj24, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0d + "'", obj42, 0.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 10.0d + "'", obj43, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0.0d);
        fila9.imprime();
        fila9.enfileira((java.lang.Object) (byte) 1);
        boolean boolean15 = fila9.vazia();
        java.lang.Object obj16 = fila9.desenfileira();
        java.lang.Object obj17 = fila9.desenfileira();
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj22 = fila19.desenfileira();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0d + "'", obj8, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0d + "'", obj16, 0.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0d + "'", obj22, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0d));
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        boolean boolean16 = fila10.vazia();
        fila7.enfileira((java.lang.Object) fila10);
        java.lang.Object obj18 = fila7.desenfileira();
        java.lang.Object obj19 = fila7.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0.0d);
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (-1));
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        fila20.imprime();
        fila7.enfileira((java.lang.Object) fila20);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj36 = fila33.desenfileira();
        fila30.enfileira((java.lang.Object) fila33);
        java.lang.Object obj38 = fila30.desenfileira();
        fila30.imprime();
        fila7.enfileira((java.lang.Object) fila30);
        fila0.enfileira((java.lang.Object) fila30);
        boolean boolean42 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0d + "'", obj36, 0.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0d + "'", obj38, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.enfileira((java.lang.Object) 10.0d);
        boolean boolean13 = fila8.vazia();
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        java.lang.Object obj18 = fila8.desenfileira();
        java.lang.Object obj19 = fila8.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0d + "'", obj18, 0.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0d + "'", obj19, 10.0d);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        fila6.imprime();
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila6.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0.0d);
        fila18.imprime();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        boolean boolean24 = fila18.vazia();
        fila15.enfileira((java.lang.Object) fila18);
        java.lang.Object obj26 = fila18.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0.0d);
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass33 = fila27.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass33);
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Object obj36 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) "");
        fila0.imprime();
        java.lang.Class<?> wildcardClass40 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0d + "'", obj26, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj13 = fila10.desenfileira();
        boolean boolean14 = fila10.vazia();
        fila10.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) (short) 100);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0.0d);
        fila23.imprime();
        boolean boolean27 = fila23.vazia();
        fila23.imprime();
        boolean boolean29 = fila23.vazia();
        fila20.enfileira((java.lang.Object) fila23);
        java.lang.Object obj31 = fila20.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        boolean boolean34 = fila32.vazia();
        fila32.imprime();
        fila20.enfileira((java.lang.Object) fila32);
        fila10.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila20);
        fila20.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0d + "'", obj6, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0d + "'", obj13, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 1 + "'", obj31, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0.0d);
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (-1));
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0.0d);
        fila21.imprime();
        boolean boolean25 = fila21.vazia();
        fila21.imprime();
        boolean boolean27 = fila21.vazia();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj29 = fila18.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        boolean boolean32 = fila30.vazia();
        fila30.imprime();
        fila18.enfileira((java.lang.Object) fila30);
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        boolean boolean37 = fila35.vazia();
        fila35.enfileira((java.lang.Object) (byte) -1);
        boolean boolean40 = fila35.vazia();
        java.lang.Object obj41 = fila35.desenfileira();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0.0d);
        fila42.imprime();
        fila42.enfileira((java.lang.Object) (byte) 1);
        boolean boolean48 = fila42.vazia();
        java.lang.Object obj49 = fila42.desenfileira();
        java.lang.Object obj50 = fila42.desenfileira();
        boolean boolean51 = fila42.vazia();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj55 = fila52.desenfileira();
        fila42.enfileira((java.lang.Object) fila52);
        fila42.imprime();
        fila35.enfileira((java.lang.Object) fila42);
        fila30.enfileira((java.lang.Object) fila35);
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 0.0d);
        fila60.enfileira((java.lang.Object) 10.0d);
        fila60.imprime();
        java.lang.Object obj66 = fila60.desenfileira();
        boolean boolean67 = fila60.vazia();
        fila60.imprime();
        java.lang.Object obj69 = fila60.desenfileira();
        fila30.enfileira(obj69);
        fila8.enfileira(obj69);
        java.lang.Object obj72 = fila8.desenfileira();
        boolean boolean73 = fila8.vazia();
        boolean boolean74 = fila8.vazia();
        fila0.enfileira((java.lang.Object) boolean74);
        boolean boolean76 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 1 + "'", obj29, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0d + "'", obj49, 0.0d);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (byte) 1 + "'", obj50, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0.0d + "'", obj55, 0.0d);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 0.0d + "'", obj66, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 10.0d + "'", obj69, 10.0d);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0.0d + "'", obj72, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0.0d);
        fila3.imprime();
        boolean boolean7 = fila3.vazia();
        fila3.imprime();
        boolean boolean9 = fila3.vazia();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0.0d);
        fila17.imprime();
        boolean boolean21 = fila17.vazia();
        fila17.imprime();
        boolean boolean23 = fila17.vazia();
        fila14.enfileira((java.lang.Object) fila17);
        fila17.imprime();
        fila17.enfileira((java.lang.Object) (byte) 10);
        fila17.imprime();
        fila3.enfileira((java.lang.Object) fila17);
        fila3.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj32 = fila3.desenfileira();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0d + "'", obj32, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }
}

