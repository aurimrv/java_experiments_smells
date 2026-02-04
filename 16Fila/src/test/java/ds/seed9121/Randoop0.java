package ds.seed9121;

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
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass12 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass15 = fila12.getClass();
        fila5.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass17 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass26 = fila13.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass15 = fila12.getClass();
        fila5.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
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
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass15 = fila12.getClass();
        fila5.enfileira((java.lang.Object) fila12);
        java.lang.Object obj17 = fila12.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 100.0d);
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj9 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Class<?> wildcardClass21 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Class<?> wildcardClass29 = obj26.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila13.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0);
        java.lang.Object obj11 = fila8.desenfileira();
        boolean boolean12 = fila8.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        fila8.enfileira((java.lang.Object) fila13);
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        boolean boolean26 = fila22.vazia();
        fila8.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass28 = fila22.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass28);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        fila0.enfileira((java.lang.Object) fila30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = fila30.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0);
        java.lang.Object obj11 = fila8.desenfileira();
        boolean boolean12 = fila8.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        fila8.enfileira((java.lang.Object) fila13);
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        boolean boolean26 = fila22.vazia();
        fila8.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass28 = fila22.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass28);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        fila0.enfileira((java.lang.Object) fila30);
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) 100.0d);
        fila26.enfileira((java.lang.Object) fila31);
        fila26.imprime();
        fila26.imprime();
        boolean boolean40 = fila26.vazia();
        java.lang.Object obj41 = fila26.desenfileira();
        fila0.enfileira(obj41);
        java.lang.Class<?> wildcardClass43 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Object obj21 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass22 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila0.enfileira((java.lang.Object) boolean8);
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) false);
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj20 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Class<?> wildcardClass12 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) 100.0d);
        fila26.enfileira((java.lang.Object) fila31);
        fila26.imprime();
        fila26.imprime();
        boolean boolean40 = fila26.vazia();
        java.lang.Object obj41 = fila26.desenfileira();
        fila0.enfileira(obj41);
        java.lang.Object obj43 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Object obj21 = fila5.desenfileira();
        boolean boolean22 = fila5.vazia();
        java.lang.Object obj23 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass24 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0f) + "'", obj23, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
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
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj31 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
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
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass20 = fila13.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        boolean boolean9 = fila5.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        fila5.enfileira((java.lang.Object) fila10);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0);
        java.lang.Object obj20 = fila17.desenfileira();
        boolean boolean21 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (-1.0f));
        fila10.enfileira((java.lang.Object) (-1.0f));
        fila10.imprime();
        java.lang.Object obj26 = fila10.desenfileira();
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        fila18.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila18);
        fila13.imprime();
        fila13.imprime();
        boolean boolean27 = fila13.vazia();
        java.lang.Object obj28 = fila13.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) 100.0d);
        fila29.enfileira((java.lang.Object) fila35);
        fila29.imprime();
        boolean boolean42 = fila29.vazia();
        java.lang.Object obj43 = null;
        fila29.enfileira(obj43);
        fila13.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass47 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0);
        fila33.enfileira((java.lang.Object) 100.0d);
        fila27.enfileira((java.lang.Object) fila33);
        fila27.imprime();
        boolean boolean40 = fila27.vazia();
        fila24.enfileira((java.lang.Object) boolean40);
        java.lang.Object obj42 = fila24.desenfileira();
        java.lang.Class<?> wildcardClass43 = fila24.getClass();
        fila0.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0 + "'", obj42, 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj19 = fila13.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila13.enfileira((java.lang.Object) boolean21);
        fila0.enfileira((java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        boolean boolean29 = fila0.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        java.lang.Object obj45 = fila42.desenfileira();
        boolean boolean46 = fila42.vazia();
        fila42.enfileira((java.lang.Object) (-1.0f));
        fila35.enfileira((java.lang.Object) (-1.0f));
        fila35.imprime();
        java.lang.Object obj51 = fila35.desenfileira();
        boolean boolean52 = fila35.vazia();
        boolean boolean53 = fila35.vazia();
        fila0.enfileira((java.lang.Object) boolean53);
        java.lang.Class<?> wildcardClass55 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Object obj21 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        fila5.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) (short) 10);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila13.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = null;
        fila0.enfileira(obj29);
        fila0.enfileira((java.lang.Object) (short) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0);
        java.lang.Object obj11 = fila8.desenfileira();
        boolean boolean12 = fila8.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        fila8.enfileira((java.lang.Object) fila13);
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        boolean boolean26 = fila22.vazia();
        fila8.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass28 = fila22.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass28);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        fila0.enfileira((java.lang.Object) fila30);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0);
        fila41.enfileira((java.lang.Object) 100.0d);
        fila35.enfileira((java.lang.Object) fila41);
        fila35.imprime();
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 0);
        java.lang.Object obj51 = fila48.desenfileira();
        boolean boolean52 = fila48.vazia();
        fila48.imprime();
        fila35.enfileira((java.lang.Object) fila48);
        java.lang.Class<?> wildcardClass55 = fila35.getClass();
        fila0.enfileira((java.lang.Object) fila35);
        boolean boolean57 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0 + "'", obj51, 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        java.lang.Object obj30 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        fila32.enfileira((java.lang.Object) (byte) 0);
        fila32.imprime();
        java.lang.Class<?> wildcardClass38 = fila32.getClass();
        fila0.enfileira((java.lang.Object) fila32);
        boolean boolean40 = fila32.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) false);
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        fila28.enfileira((java.lang.Object) 100.0d);
        fila22.enfileira((java.lang.Object) fila28);
        fila22.imprime();
        fila5.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass36 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        java.lang.Object obj13 = null;
        fila0.enfileira(obj13);
        boolean boolean15 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        fila16.imprime();
        boolean boolean29 = fila16.vazia();
        java.lang.Object obj30 = null;
        fila16.enfileira(obj30);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj33 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        java.lang.Object obj6 = fila3.desenfileira();
        fila3.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0);
        fila9.enfileira((java.lang.Object) 100.0d);
        fila3.enfileira((java.lang.Object) fila9);
        fila3.imprime();
        boolean boolean16 = fila3.vazia();
        fila0.enfileira((java.lang.Object) boolean16);
        boolean boolean18 = fila0.vazia();
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.enfileira((java.lang.Object) (-1.0f));
        boolean boolean18 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        java.lang.Object obj21 = fila11.desenfileira();
        fila0.enfileira(obj21);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) 100.0d);
        fila26.enfileira((java.lang.Object) fila31);
        fila26.imprime();
        fila26.imprime();
        boolean boolean40 = fila26.vazia();
        java.lang.Object obj41 = fila26.desenfileira();
        fila0.enfileira(obj41);
        java.lang.Object obj43 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass44 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        fila16.imprime();
        boolean boolean29 = fila16.vazia();
        java.lang.Object obj30 = null;
        fila16.enfileira(obj30);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj33 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila13.enfileira((java.lang.Object) fila26);
        java.lang.Object obj28 = fila13.desenfileira();
        boolean boolean29 = fila13.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0);
        fila36.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila36);
        java.lang.Object obj42 = fila30.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0);
        java.lang.Object obj46 = fila43.desenfileira();
        fila43.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 0);
        fila49.enfileira((java.lang.Object) 100.0d);
        fila43.enfileira((java.lang.Object) fila49);
        fila30.enfileira((java.lang.Object) fila43);
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 0);
        java.lang.Object obj59 = fila56.desenfileira();
        boolean boolean60 = fila56.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 0);
        java.lang.Object obj64 = fila61.desenfileira();
        fila61.enfileira((java.lang.Object) 100.0d);
        fila56.enfileira((java.lang.Object) fila61);
        fila56.imprime();
        fila56.imprime();
        boolean boolean70 = fila56.vazia();
        java.lang.Object obj71 = fila56.desenfileira();
        fila30.enfileira(obj71);
        java.lang.Object obj73 = fila30.desenfileira();
        fila13.enfileira((java.lang.Object) fila30);
        java.lang.Object obj75 = fila30.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        fila16.imprime();
        boolean boolean29 = fila16.vazia();
        java.lang.Object obj30 = null;
        fila16.enfileira(obj30);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj33 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) (byte) 0);
        fila6.imprime();
        java.lang.Class<?> wildcardClass12 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj14 = fila6.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = null;
        fila0.enfileira(obj29);
        boolean boolean31 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        fila0.enfileira((java.lang.Object) "hi!");
        fila0.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        java.lang.Object obj35 = fila32.desenfileira();
        boolean boolean36 = fila32.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.enfileira((java.lang.Object) 100.0d);
        fila32.enfileira((java.lang.Object) fila37);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0);
        java.lang.Object obj47 = fila44.desenfileira();
        boolean boolean48 = fila44.vazia();
        fila44.enfileira((java.lang.Object) (-1.0f));
        fila37.enfileira((java.lang.Object) (-1.0f));
        fila37.imprime();
        fila37.imprime();
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) 0);
        java.lang.Object obj57 = fila54.desenfileira();
        fila54.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 0);
        fila60.enfileira((java.lang.Object) 100.0d);
        fila54.enfileira((java.lang.Object) fila60);
        fila54.imprime();
        fila37.enfileira((java.lang.Object) fila54);
        boolean boolean68 = fila54.vazia();
        fila0.enfileira((java.lang.Object) boolean68);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0 + "'", obj47, 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 0 + "'", obj57, 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        fila18.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila18);
        fila13.imprime();
        fila13.imprime();
        boolean boolean27 = fila13.vazia();
        java.lang.Object obj28 = fila13.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) 100.0d);
        fila29.enfileira((java.lang.Object) fila35);
        fila29.imprime();
        boolean boolean42 = fila29.vazia();
        java.lang.Object obj43 = null;
        fila29.enfileira(obj43);
        fila13.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0);
        java.lang.Object obj50 = fila47.desenfileira();
        boolean boolean51 = fila47.vazia();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0);
        java.lang.Object obj55 = fila52.desenfileira();
        fila52.enfileira((java.lang.Object) 100.0d);
        fila47.enfileira((java.lang.Object) fila52);
        fila47.imprime();
        fila47.imprime();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 0);
        java.lang.Object obj64 = fila61.desenfileira();
        boolean boolean65 = fila61.vazia();
        fila47.enfileira((java.lang.Object) fila61);
        fila29.enfileira((java.lang.Object) fila61);
        // The following exception was thrown during execution in test generation
        try {
            fila29.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0 + "'", obj55, 0);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = null;
        fila0.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        java.lang.Object obj28 = fila16.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) 100.0d);
        fila29.enfileira((java.lang.Object) fila35);
        fila16.enfileira((java.lang.Object) fila29);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        java.lang.Object obj45 = fila42.desenfileira();
        boolean boolean46 = fila42.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.enfileira((java.lang.Object) 100.0d);
        fila42.enfileira((java.lang.Object) fila47);
        fila42.imprime();
        fila42.imprime();
        boolean boolean56 = fila42.vazia();
        java.lang.Object obj57 = fila42.desenfileira();
        fila16.enfileira(obj57);
        java.lang.Object obj59 = fila16.desenfileira();
        fila0.enfileira(obj59);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj20 = fila0.desenfileira();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = null;
        fila0.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        java.lang.Object obj28 = fila16.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) 100.0d);
        fila29.enfileira((java.lang.Object) fila35);
        fila16.enfileira((java.lang.Object) fila29);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        java.lang.Object obj45 = fila42.desenfileira();
        boolean boolean46 = fila42.vazia();
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.enfileira((java.lang.Object) 100.0d);
        fila42.enfileira((java.lang.Object) fila47);
        fila42.imprime();
        fila42.imprime();
        boolean boolean56 = fila42.vazia();
        java.lang.Object obj57 = fila42.desenfileira();
        fila16.enfileira(obj57);
        java.lang.Object obj59 = fila16.desenfileira();
        fila0.enfileira(obj59);
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 0);
        java.lang.Object obj64 = fila61.desenfileira();
        fila61.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila61);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Object obj21 = fila5.desenfileira();
        boolean boolean22 = fila5.vazia();
        java.lang.Object obj23 = fila5.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila5.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0f) + "'", obj23, (-1.0f));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        fila0.enfileira((java.lang.Object) "hi!");
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        java.lang.Object obj13 = null;
        fila0.enfileira(obj13);
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) 100.0d);
        fila26.enfileira((java.lang.Object) fila31);
        fila26.imprime();
        fila26.imprime();
        boolean boolean40 = fila26.vazia();
        java.lang.Object obj41 = fila26.desenfileira();
        fila0.enfileira(obj41);
        java.lang.Object obj43 = fila0.desenfileira();
        java.lang.Object obj44 = fila0.desenfileira();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        boolean boolean29 = fila0.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0);
        java.lang.Object obj47 = fila44.desenfileira();
        boolean boolean48 = fila44.vazia();
        fila44.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj51 = fila44.desenfileira();
        fila44.imprime();
        fila30.enfileira((java.lang.Object) fila44);
        java.lang.Object obj54 = fila30.desenfileira();
        java.lang.Object obj55 = fila30.desenfileira();
        fila0.enfileira((java.lang.Object) fila30);
        boolean boolean57 = fila30.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0 + "'", obj47, 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1.0f) + "'", obj51, (-1.0f));
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila5.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj30 = fila0.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        fila31.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj36 = fila31.desenfileira();
        fila0.enfileira((java.lang.Object) fila31);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila13.enfileira((java.lang.Object) fila26);
        java.lang.Object obj28 = fila13.desenfileira();
        boolean boolean29 = fila13.vazia();
        java.lang.Object obj30 = fila13.desenfileira();
        fila13.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) 0);
        java.lang.Object obj4 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0);
        fila7.enfileira((java.lang.Object) 100.0d);
        fila1.enfileira((java.lang.Object) fila7);
        java.lang.Object obj13 = fila1.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0);
        fila20.enfileira((java.lang.Object) 100.0d);
        fila14.enfileira((java.lang.Object) fila20);
        fila1.enfileira((java.lang.Object) fila14);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        fila27.enfileira((java.lang.Object) (byte) 0);
        fila1.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0);
        fila1.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass38 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0.0d);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        java.lang.Object obj18 = fila15.desenfileira();
        fila15.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        fila21.enfileira((java.lang.Object) 100.0d);
        fila15.enfileira((java.lang.Object) fila21);
        fila15.imprime();
        boolean boolean28 = fila15.vazia();
        fila15.enfileira((java.lang.Object) 'a');
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        java.lang.Object obj34 = fila31.desenfileira();
        boolean boolean35 = fila31.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0);
        java.lang.Object obj39 = fila36.desenfileira();
        fila36.enfileira((java.lang.Object) 100.0d);
        fila31.enfileira((java.lang.Object) fila36);
        fila31.imprime();
        fila15.enfileira((java.lang.Object) fila31);
        java.lang.Object obj45 = fila15.desenfileira();
        java.lang.Object obj46 = fila15.desenfileira();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass47);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0d + "'", obj45, 100.0d);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        fila26.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj36 = fila0.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0);
        fila43.enfileira((java.lang.Object) 100.0d);
        fila37.enfileira((java.lang.Object) fila43);
        fila37.imprime();
        boolean boolean50 = fila37.vazia();
        fila37.enfileira((java.lang.Object) 'a');
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 0);
        java.lang.Object obj56 = fila53.desenfileira();
        boolean boolean57 = fila53.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0);
        java.lang.Object obj61 = fila58.desenfileira();
        fila58.enfileira((java.lang.Object) 100.0d);
        fila53.enfileira((java.lang.Object) fila58);
        fila53.imprime();
        fila37.enfileira((java.lang.Object) fila53);
        java.lang.Object obj67 = fila37.desenfileira();
        java.lang.Object obj68 = fila37.desenfileira();
        ds.Fila fila69 = new ds.Fila();
        fila69.enfileira((java.lang.Object) 0);
        java.lang.Object obj72 = fila69.desenfileira();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        fila37.enfileira((java.lang.Object) wildcardClass73);
        fila0.enfileira((java.lang.Object) fila37);
        fila37.imprime();
        boolean boolean77 = fila37.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0 + "'", obj56, 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0 + "'", obj61, 0);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0d + "'", obj67, 100.0d);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0 + "'", obj72, 0);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0);
        fila17.enfileira((java.lang.Object) 100.0d);
        fila11.enfileira((java.lang.Object) fila17);
        java.lang.Object obj23 = fila11.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        fila30.enfileira((java.lang.Object) 100.0d);
        fila24.enfileira((java.lang.Object) fila30);
        fila11.enfileira((java.lang.Object) fila24);
        ds.Fila fila37 = new ds.Fila();
        fila24.enfileira((java.lang.Object) fila37);
        java.lang.Object obj39 = fila24.desenfileira();
        java.lang.Object obj40 = fila24.desenfileira();
        fila0.enfileira(obj40);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0d + "'", obj39, 100.0d);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        fila27.enfileira((java.lang.Object) 100.0d);
        fila21.enfileira((java.lang.Object) fila27);
        java.lang.Object obj33 = fila21.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        fila40.enfileira((java.lang.Object) 100.0d);
        fila34.enfileira((java.lang.Object) fila40);
        fila21.enfileira((java.lang.Object) fila34);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        fila21.enfileira(obj47);
        java.lang.Object obj50 = fila21.desenfileira();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0);
        java.lang.Object obj54 = fila51.desenfileira();
        boolean boolean55 = fila51.vazia();
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 0);
        java.lang.Object obj59 = fila56.desenfileira();
        fila56.enfileira((java.lang.Object) 100.0d);
        fila51.enfileira((java.lang.Object) fila56);
        fila51.imprime();
        fila51.imprime();
        fila51.imprime();
        fila21.enfileira((java.lang.Object) fila51);
        fila5.enfileira((java.lang.Object) fila51);
        boolean boolean68 = fila51.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        boolean boolean29 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100);
        java.lang.Object obj32 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        fila18.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila18);
        fila13.imprime();
        fila13.imprime();
        boolean boolean27 = fila13.vazia();
        java.lang.Object obj28 = fila13.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) 100.0d);
        fila29.enfileira((java.lang.Object) fila35);
        fila29.imprime();
        boolean boolean42 = fila29.vazia();
        java.lang.Object obj43 = null;
        fila29.enfileira(obj43);
        fila13.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        // The following exception was thrown during execution in test generation
        try {
            fila29.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        boolean boolean24 = fila14.vazia();
        boolean boolean25 = fila14.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 100.0d);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila13.enfileira((java.lang.Object) boolean21);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0);
        java.lang.Object obj26 = fila23.desenfileira();
        boolean boolean27 = fila23.vazia();
        fila23.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean33 = fila23.vazia();
        fila13.enfileira((java.lang.Object) fila23);
        java.lang.Object obj35 = null;
        fila13.enfileira(obj35);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0 + "'", obj26, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        fila26.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila13.enfileira((java.lang.Object) fila26);
        java.lang.Object obj28 = fila13.desenfileira();
        boolean boolean29 = fila13.vazia();
        java.lang.Object obj30 = fila13.desenfileira();
        java.lang.Object obj31 = fila13.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        fila0.enfileira((java.lang.Object) "hi!");
        ds.Fila fila31 = new ds.Fila();
        java.lang.Class<?> wildcardClass32 = fila31.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Object obj13 = null;
        fila0.enfileira(obj13);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        boolean boolean9 = fila5.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        fila5.enfileira((java.lang.Object) fila10);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0);
        java.lang.Object obj20 = fila17.desenfileira();
        boolean boolean21 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (-1.0f));
        fila10.enfileira((java.lang.Object) (-1.0f));
        fila10.imprime();
        java.lang.Object obj26 = fila10.desenfileira();
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass30 = fila10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila12.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0);
        java.lang.Object obj23 = fila20.desenfileira();
        boolean boolean24 = fila20.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) 100.0d);
        fila20.enfileira((java.lang.Object) fila25);
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        java.lang.Object obj37 = fila34.desenfileira();
        boolean boolean38 = fila34.vazia();
        fila20.enfileira((java.lang.Object) fila34);
        java.lang.Class<?> wildcardClass40 = fila34.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass40);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        java.lang.Object obj45 = fila42.desenfileira();
        fila12.enfileira((java.lang.Object) fila42);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 0);
        fila53.enfileira((java.lang.Object) 100.0d);
        fila47.enfileira((java.lang.Object) fila53);
        fila47.imprime();
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 0);
        java.lang.Object obj63 = fila60.desenfileira();
        boolean boolean64 = fila60.vazia();
        fila60.imprime();
        fila47.enfileira((java.lang.Object) fila60);
        java.lang.Class<?> wildcardClass67 = fila47.getClass();
        fila12.enfileira((java.lang.Object) fila47);
        fila5.enfileira((java.lang.Object) fila47);
        java.lang.Class<?> wildcardClass70 = fila47.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0 + "'", obj28, 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0 + "'", obj63, 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) 100.0d);
        fila12.enfileira((java.lang.Object) fila17);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0);
        java.lang.Object obj27 = fila24.desenfileira();
        boolean boolean28 = fila24.vazia();
        fila24.enfileira((java.lang.Object) (-1.0f));
        fila17.enfileira((java.lang.Object) (-1.0f));
        fila17.imprime();
        java.lang.Object obj33 = fila17.desenfileira();
        boolean boolean34 = fila17.vazia();
        fila0.enfileira((java.lang.Object) fila17);
        boolean boolean36 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila13.enfileira((java.lang.Object) boolean21);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0);
        java.lang.Object obj26 = fila23.desenfileira();
        boolean boolean27 = fila23.vazia();
        fila23.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean33 = fila23.vazia();
        fila13.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass35 = fila13.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0 + "'", obj26, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        boolean boolean17 = fila0.vazia();
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) (byte) 0);
        fila30.enfileira((java.lang.Object) (byte) 0);
        fila30.imprime();
        fila30.imprime();
        boolean boolean43 = fila30.vazia();
        boolean boolean44 = fila30.vazia();
        boolean boolean45 = fila30.vazia();
        boolean boolean46 = fila30.vazia();
        fila0.enfileira((java.lang.Object) boolean46);
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 0);
        fila48.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj53 = fila48.desenfileira();
        boolean boolean54 = fila48.vazia();
        java.lang.Object obj55 = fila48.desenfileira();
        boolean boolean56 = fila48.vazia();
        fila0.enfileira((java.lang.Object) boolean56);
        fila0.imprime();
        java.lang.Class<?> wildcardClass59 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0 + "'", obj53, 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) 0 + "'", obj55, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj27 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean12 = fila0.vazia();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        fila16.imprime();
        boolean boolean29 = fila16.vazia();
        java.lang.Object obj30 = null;
        fila16.enfileira(obj30);
        fila0.enfileira((java.lang.Object) fila16);
        // The following exception was thrown during execution in test generation
        try {
            fila16.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = fila5.desenfileira();
        boolean boolean21 = fila5.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        boolean boolean26 = fila22.vazia();
        fila22.enfileira((java.lang.Object) (-1.0f));
        fila22.imprime();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0);
        java.lang.Object obj47 = fila44.desenfileira();
        boolean boolean48 = fila44.vazia();
        fila30.enfileira((java.lang.Object) fila44);
        java.lang.Class<?> wildcardClass50 = fila44.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass50);
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0);
        java.lang.Object obj55 = fila52.desenfileira();
        fila22.enfileira((java.lang.Object) fila52);
        boolean boolean57 = fila22.vazia();
        fila5.enfileira((java.lang.Object) boolean57);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0 + "'", obj47, 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0 + "'", obj55, 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila0.enfileira((java.lang.Object) fila30);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        java.lang.Object obj49 = fila46.desenfileira();
        boolean boolean50 = fila46.vazia();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0);
        java.lang.Object obj54 = fila51.desenfileira();
        fila51.enfileira((java.lang.Object) 100.0d);
        fila46.enfileira((java.lang.Object) fila51);
        fila30.enfileira((java.lang.Object) fila51);
        boolean boolean59 = fila30.vazia();
        java.lang.Object obj60 = fila30.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0);
        java.lang.Object obj7 = fila4.desenfileira();
        boolean boolean8 = fila4.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0);
        java.lang.Object obj12 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) 100.0d);
        fila4.enfileira((java.lang.Object) fila9);
        fila4.imprime();
        fila4.imprime();
        boolean boolean18 = fila4.vazia();
        java.lang.Object obj19 = fila4.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0);
        java.lang.Object obj23 = fila20.desenfileira();
        fila20.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        fila26.enfileira((java.lang.Object) 100.0d);
        fila20.enfileira((java.lang.Object) fila26);
        fila20.imprime();
        boolean boolean33 = fila20.vazia();
        java.lang.Object obj34 = null;
        fila20.enfileira(obj34);
        fila4.enfileira((java.lang.Object) fila20);
        java.lang.Object obj37 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 0);
        java.lang.Object obj42 = fila39.desenfileira();
        fila39.enfileira((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass45 = fila39.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0 + "'", obj42, 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        boolean boolean29 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100);
        fila0.imprime();
        java.lang.Object obj33 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        boolean boolean9 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj31 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean36 = fila0.vazia();
        java.lang.Object obj37 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        fila26.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 0);
        boolean boolean36 = fila0.vazia();
        java.lang.Class<?> wildcardClass37 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        fila16.imprime();
        boolean boolean29 = fila16.vazia();
        java.lang.Object obj30 = null;
        fila16.enfileira(obj30);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj33 = fila16.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0);
        java.lang.Object obj10 = fila7.desenfileira();
        boolean boolean11 = fila7.vazia();
        fila7.enfileira((java.lang.Object) (-1.0f));
        boolean boolean14 = fila7.vazia();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean17 = fila7.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.imprime();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        java.lang.Object obj35 = fila32.desenfileira();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass36);
        java.lang.Object obj38 = fila0.desenfileira();
        boolean boolean39 = fila0.vazia();
        java.lang.Object obj40 = null;
        fila0.enfileira(obj40);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila0.enfileira((java.lang.Object) fila30);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        java.lang.Object obj49 = fila46.desenfileira();
        boolean boolean50 = fila46.vazia();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0);
        java.lang.Object obj54 = fila51.desenfileira();
        fila51.enfileira((java.lang.Object) 100.0d);
        fila46.enfileira((java.lang.Object) fila51);
        fila30.enfileira((java.lang.Object) fila51);
        java.lang.Class<?> wildcardClass59 = fila51.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila13.enfileira((java.lang.Object) boolean21);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0);
        java.lang.Object obj26 = fila23.desenfileira();
        boolean boolean27 = fila23.vazia();
        fila23.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = fila23.desenfileira();
        fila23.imprime();
        fila23.imprime();
        boolean boolean33 = fila23.vazia();
        fila13.enfileira((java.lang.Object) fila23);
        boolean boolean35 = fila13.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0 + "'", obj26, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        fila13.imprime();
        java.lang.Class<?> wildcardClass21 = fila13.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        boolean boolean24 = fila14.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = fila14.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Object obj21 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj24 = fila5.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        fila31.enfileira((java.lang.Object) 100.0d);
        fila25.enfileira((java.lang.Object) fila31);
        java.lang.Object obj37 = fila25.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0);
        fila44.enfileira((java.lang.Object) 100.0d);
        fila38.enfileira((java.lang.Object) fila44);
        fila25.enfileira((java.lang.Object) fila38);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        fila25.enfileira(obj51);
        fila25.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj56 = fila25.desenfileira();
        fila25.imprime();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 1.0d);
        fila5.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0 + "'", obj28, 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(obj56);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila0.enfileira((java.lang.Object) fila30);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        java.lang.Object obj49 = fila46.desenfileira();
        fila46.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0);
        fila52.enfileira((java.lang.Object) 100.0d);
        fila46.enfileira((java.lang.Object) fila52);
        java.lang.Object obj58 = fila46.desenfileira();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 0);
        java.lang.Object obj62 = fila59.desenfileira();
        fila59.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila65 = new ds.Fila();
        fila65.enfileira((java.lang.Object) 0);
        fila65.enfileira((java.lang.Object) 100.0d);
        fila59.enfileira((java.lang.Object) fila65);
        fila46.enfileira((java.lang.Object) fila59);
        boolean boolean72 = fila59.vazia();
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        fila59.enfileira(obj73);
        fila0.enfileira(obj73);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0 + "'", obj62, 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        boolean boolean9 = fila5.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        fila5.enfileira((java.lang.Object) fila10);
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        java.lang.Object obj22 = fila19.desenfileira();
        boolean boolean23 = fila19.vazia();
        fila19.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila5.enfileira((java.lang.Object) fila19);
        java.lang.Object obj29 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj32 = fila5.desenfileira();
        fila0.enfileira(obj32);
        boolean boolean34 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0f) + "'", obj26, (-1.0f));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean26 = fila13.vazia();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        fila13.enfileira(obj27);
        fila13.imprime();
        fila13.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0);
        java.lang.Object obj23 = fila20.desenfileira();
        boolean boolean24 = fila20.vazia();
        fila20.enfileira((java.lang.Object) (-1.0f));
        fila20.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        java.lang.Object obj31 = fila28.desenfileira();
        boolean boolean32 = fila28.vazia();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0);
        java.lang.Object obj36 = fila33.desenfileira();
        fila33.enfileira((java.lang.Object) 100.0d);
        fila28.enfileira((java.lang.Object) fila33);
        fila28.imprime();
        fila28.imprime();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        java.lang.Object obj45 = fila42.desenfileira();
        boolean boolean46 = fila42.vazia();
        fila28.enfileira((java.lang.Object) fila42);
        java.lang.Class<?> wildcardClass48 = fila42.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass48);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 0);
        java.lang.Object obj53 = fila50.desenfileira();
        fila20.enfileira((java.lang.Object) fila50);
        fila5.enfileira((java.lang.Object) fila50);
        boolean boolean56 = fila50.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0 + "'", obj53, 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila0.enfileira((java.lang.Object) boolean8);
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.imprime();
        boolean boolean13 = fila10.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) 100.0d);
        fila14.enfileira((java.lang.Object) fila19);
        fila14.imprime();
        fila14.imprime();
        boolean boolean28 = fila14.vazia();
        java.lang.Object obj29 = fila14.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0);
        fila36.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila36);
        fila30.imprime();
        boolean boolean43 = fila30.vazia();
        java.lang.Object obj44 = null;
        fila30.enfileira(obj44);
        fila14.enfileira((java.lang.Object) fila30);
        java.lang.Object obj47 = fila14.desenfileira();
        fila10.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        fila16.enfileira((java.lang.Object) 100.0d);
        fila10.enfileira((java.lang.Object) fila16);
        fila10.imprime();
        boolean boolean23 = fila10.vazia();
        fila7.enfileira((java.lang.Object) boolean23);
        fila0.enfileira((java.lang.Object) boolean23);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        boolean boolean3 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        fila14.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila0.enfileira((java.lang.Object) fila30);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        fila46.enfileira((java.lang.Object) (byte) 0);
        fila46.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0);
        fila52.enfileira((java.lang.Object) (byte) 0);
        fila52.imprime();
        java.lang.Class<?> wildcardClass58 = fila52.getClass();
        fila46.enfileira((java.lang.Object) fila52);
        fila30.enfileira((java.lang.Object) fila46);
        fila30.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj27 = fila0.desenfileira();
        boolean boolean28 = fila0.vazia();
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0);
        java.lang.Object obj10 = fila7.desenfileira();
        boolean boolean11 = fila7.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        fila12.enfileira((java.lang.Object) (byte) 0);
        fila7.enfileira((java.lang.Object) (byte) 0);
        fila7.imprime();
        fila7.imprime();
        boolean boolean20 = fila7.vazia();
        boolean boolean21 = fila7.vazia();
        boolean boolean22 = fila7.vazia();
        boolean boolean23 = fila7.vazia();
        java.lang.Object obj24 = fila7.desenfileira();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        fila0.enfileira(obj24);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila0.enfileira((java.lang.Object) boolean8);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = fila5.desenfileira();
        boolean boolean21 = fila5.vazia();
        boolean boolean22 = fila5.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) 100.0d);
        fila29.enfileira((java.lang.Object) fila35);
        java.lang.Object obj41 = fila29.desenfileira();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        java.lang.Object obj45 = fila42.desenfileira();
        fila42.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 0);
        fila48.enfileira((java.lang.Object) 100.0d);
        fila42.enfileira((java.lang.Object) fila48);
        fila29.enfileira((java.lang.Object) fila42);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        fila29.enfileira(obj55);
        fila29.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj60 = fila29.desenfileira();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass61);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        fila26.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj36 = fila0.desenfileira();
        boolean boolean37 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0);
        fila11.enfileira((java.lang.Object) 100.0d);
        fila5.enfileira((java.lang.Object) fila11);
        java.lang.Object obj17 = fila5.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        fila18.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0);
        fila24.enfileira((java.lang.Object) 100.0d);
        fila18.enfileira((java.lang.Object) fila24);
        fila5.enfileira((java.lang.Object) fila18);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        fila5.enfileira(obj31);
        boolean boolean34 = fila5.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        boolean boolean39 = fila35.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.enfileira((java.lang.Object) 100.0d);
        fila35.enfileira((java.lang.Object) fila40);
        fila35.imprime();
        fila35.imprime();
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 0);
        java.lang.Object obj52 = fila49.desenfileira();
        boolean boolean53 = fila49.vazia();
        fila49.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj56 = fila49.desenfileira();
        fila49.imprime();
        fila35.enfileira((java.lang.Object) fila49);
        java.lang.Object obj59 = fila35.desenfileira();
        java.lang.Object obj60 = fila35.desenfileira();
        fila5.enfileira((java.lang.Object) fila35);
        java.lang.Class<?> wildcardClass62 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass62);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0d + "'", obj17, 100.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0 + "'", obj43, 0);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0 + "'", obj52, 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1.0f) + "'", obj56, (-1.0f));
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = null;
        fila0.enfileira(obj14);
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        boolean boolean9 = fila5.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        fila5.enfileira((java.lang.Object) fila10);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0);
        java.lang.Object obj20 = fila17.desenfileira();
        boolean boolean21 = fila17.vazia();
        fila17.enfileira((java.lang.Object) (-1.0f));
        fila10.enfileira((java.lang.Object) (-1.0f));
        fila10.imprime();
        java.lang.Object obj26 = fila10.desenfileira();
        fila10.imprime();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        fila16.imprime();
        boolean boolean29 = fila16.vazia();
        java.lang.Object obj30 = null;
        fila16.enfileira(obj30);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0);
        java.lang.Object obj36 = fila33.desenfileira();
        boolean boolean37 = fila33.vazia();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) 100.0d);
        fila33.enfileira((java.lang.Object) fila38);
        fila33.imprime();
        fila33.imprime();
        fila33.imprime();
        boolean boolean48 = fila33.vazia();
        java.lang.Object obj49 = fila33.desenfileira();
        fila0.enfileira((java.lang.Object) fila33);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0);
        java.lang.Object obj7 = fila4.desenfileira();
        boolean boolean8 = fila4.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0);
        java.lang.Object obj12 = fila9.desenfileira();
        fila9.enfileira((java.lang.Object) 100.0d);
        fila4.enfileira((java.lang.Object) fila9);
        fila4.imprime();
        fila4.imprime();
        boolean boolean18 = fila4.vazia();
        java.lang.Object obj19 = fila4.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0);
        java.lang.Object obj23 = fila20.desenfileira();
        fila20.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        fila26.enfileira((java.lang.Object) 100.0d);
        fila20.enfileira((java.lang.Object) fila26);
        fila20.imprime();
        boolean boolean33 = fila20.vazia();
        java.lang.Object obj34 = null;
        fila20.enfileira(obj34);
        fila4.enfileira((java.lang.Object) fila20);
        java.lang.Object obj37 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean39 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Object obj21 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj24 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        fila28.enfileira((java.lang.Object) 100.0d);
        fila22.enfileira((java.lang.Object) fila28);
        fila22.imprime();
        fila5.enfileira((java.lang.Object) fila22);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0);
        java.lang.Object obj39 = fila36.desenfileira();
        boolean boolean40 = fila36.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0);
        java.lang.Object obj44 = fila41.desenfileira();
        fila41.enfileira((java.lang.Object) 100.0d);
        fila36.enfileira((java.lang.Object) fila41);
        fila36.imprime();
        fila36.imprime();
        boolean boolean50 = fila36.vazia();
        fila36.enfileira((java.lang.Object) 0.0f);
        java.lang.Object obj53 = fila36.desenfileira();
        fila5.enfileira((java.lang.Object) fila36);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0 + "'", obj44, 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        java.lang.Object obj25 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        java.lang.Object obj25 = fila13.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        fila32.enfileira((java.lang.Object) 100.0d);
        fila26.enfileira((java.lang.Object) fila32);
        fila13.enfileira((java.lang.Object) fila26);
        boolean boolean39 = fila26.vazia();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        fila26.enfileira(obj40);
        fila0.enfileira(obj40);
        boolean boolean44 = fila0.vazia();
        java.lang.Class<?> wildcardClass45 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Object obj21 = fila5.desenfileira();
        fila5.imprime();
        java.lang.Class<?> wildcardClass23 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        java.lang.Object obj25 = fila13.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        fila26.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        fila32.enfileira((java.lang.Object) 100.0d);
        fila26.enfileira((java.lang.Object) fila32);
        fila13.enfileira((java.lang.Object) fila26);
        boolean boolean39 = fila26.vazia();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        fila26.enfileira(obj40);
        fila0.enfileira(obj40);
        boolean boolean44 = fila0.vazia();
        java.lang.Object obj45 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        fila0.imprime();
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        java.lang.Object obj9 = fila6.desenfileira();
        boolean boolean10 = fila6.vazia();
        fila6.enfileira((java.lang.Object) (-1.0f));
        fila6.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) 100.0d);
        fila14.enfileira((java.lang.Object) fila19);
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        java.lang.Object obj31 = fila28.desenfileira();
        boolean boolean32 = fila28.vazia();
        fila14.enfileira((java.lang.Object) fila28);
        java.lang.Class<?> wildcardClass34 = fila28.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass34);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0);
        java.lang.Object obj39 = fila36.desenfileira();
        fila6.enfileira((java.lang.Object) fila36);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0);
        fila33.enfileira((java.lang.Object) 100.0d);
        fila27.enfileira((java.lang.Object) fila33);
        java.lang.Object obj39 = fila27.desenfileira();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        fila46.enfileira((java.lang.Object) 100.0d);
        fila40.enfileira((java.lang.Object) fila46);
        fila27.enfileira((java.lang.Object) fila40);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        fila27.enfileira(obj53);
        boolean boolean56 = fila27.vazia();
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 0);
        java.lang.Object obj60 = fila57.desenfileira();
        boolean boolean61 = fila57.vazia();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 0);
        java.lang.Object obj65 = fila62.desenfileira();
        fila62.enfileira((java.lang.Object) 100.0d);
        fila57.enfileira((java.lang.Object) fila62);
        ds.Fila fila69 = new ds.Fila();
        fila69.enfileira((java.lang.Object) 0);
        java.lang.Object obj72 = fila69.desenfileira();
        boolean boolean73 = fila69.vazia();
        fila69.enfileira((java.lang.Object) (-1.0f));
        fila62.enfileira((java.lang.Object) (-1.0f));
        fila62.imprime();
        java.lang.Object obj78 = fila62.desenfileira();
        boolean boolean79 = fila62.vazia();
        boolean boolean80 = fila62.vazia();
        fila27.enfileira((java.lang.Object) boolean80);
        fila0.enfileira((java.lang.Object) boolean80);
        boolean boolean83 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0d + "'", obj39, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0 + "'", obj43, 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0 + "'", obj60, 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0 + "'", obj65, 0);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0 + "'", obj72, 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 100.0d + "'", obj78, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        fila18.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila18);
        fila13.imprime();
        fila13.imprime();
        boolean boolean27 = fila13.vazia();
        java.lang.Object obj28 = fila13.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) 100.0d);
        fila29.enfileira((java.lang.Object) fila35);
        fila29.imprime();
        boolean boolean42 = fila29.vazia();
        java.lang.Object obj43 = null;
        fila29.enfileira(obj43);
        fila13.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0);
        java.lang.Object obj50 = fila47.desenfileira();
        boolean boolean51 = fila47.vazia();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0);
        java.lang.Object obj55 = fila52.desenfileira();
        fila52.enfileira((java.lang.Object) 100.0d);
        fila47.enfileira((java.lang.Object) fila52);
        fila47.imprime();
        fila47.imprime();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 0);
        java.lang.Object obj64 = fila61.desenfileira();
        boolean boolean65 = fila61.vazia();
        fila47.enfileira((java.lang.Object) fila61);
        fila29.enfileira((java.lang.Object) fila61);
        fila61.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj69 = fila61.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0 + "'", obj55, 0);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila0.enfileira((java.lang.Object) fila30);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        fila46.enfileira((java.lang.Object) (byte) 0);
        fila46.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) 0);
        fila52.enfileira((java.lang.Object) (byte) 0);
        fila52.imprime();
        java.lang.Class<?> wildcardClass58 = fila52.getClass();
        fila46.enfileira((java.lang.Object) fila52);
        fila30.enfileira((java.lang.Object) fila46);
        boolean boolean61 = fila30.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        boolean boolean29 = fila0.vazia();
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0);
        fila17.enfileira((java.lang.Object) (byte) 0);
        fila12.enfileira((java.lang.Object) (byte) 0);
        fila12.imprime();
        boolean boolean24 = fila12.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0);
        java.lang.Object obj28 = fila25.desenfileira();
        boolean boolean29 = fila25.vazia();
        fila25.enfileira((java.lang.Object) (-1.0f));
        boolean boolean32 = fila25.vazia();
        fila25.imprime();
        fila12.enfileira((java.lang.Object) fila25);
        fila0.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0 + "'", obj28, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = null;
        fila0.enfileira(obj14);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1));
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0);
        java.lang.Object obj11 = fila8.desenfileira();
        boolean boolean12 = fila8.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        fila8.enfileira((java.lang.Object) fila13);
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        boolean boolean26 = fila22.vazia();
        fila8.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass28 = fila22.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass28);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        fila0.enfileira((java.lang.Object) fila30);
        boolean boolean35 = fila0.vazia();
        boolean boolean36 = fila0.vazia();
        java.lang.Class<?> wildcardClass37 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        fila34.enfileira((java.lang.Object) 100.0d);
        fila28.enfileira((java.lang.Object) fila34);
        fila28.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0);
        java.lang.Object obj44 = fila41.desenfileira();
        boolean boolean45 = fila41.vazia();
        fila41.imprime();
        fila28.enfileira((java.lang.Object) fila41);
        fila28.imprime();
        fila0.enfileira((java.lang.Object) fila28);
        fila0.imprime();
        java.lang.Object obj51 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0 + "'", obj44, 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila13.enfileira((java.lang.Object) fila26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = fila26.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean20 = fila0.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        fila27.enfileira((java.lang.Object) 100.0d);
        fila21.enfileira((java.lang.Object) fila27);
        java.lang.Object obj33 = fila21.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        fila40.enfileira((java.lang.Object) 100.0d);
        fila34.enfileira((java.lang.Object) fila40);
        fila21.enfileira((java.lang.Object) fila34);
        fila21.imprime();
        boolean boolean48 = fila21.vazia();
        fila0.enfileira((java.lang.Object) boolean48);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        boolean boolean9 = fila5.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        fila5.enfileira((java.lang.Object) fila10);
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        java.lang.Object obj22 = fila19.desenfileira();
        boolean boolean23 = fila19.vazia();
        fila19.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = fila19.desenfileira();
        fila19.imprime();
        fila5.enfileira((java.lang.Object) fila19);
        java.lang.Object obj29 = fila5.desenfileira();
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj32 = fila5.desenfileira();
        fila0.enfileira(obj32);
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0f) + "'", obj26, (-1.0f));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = fila13.desenfileira();
        fila13.imprime();
        fila13.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean26 = fila13.vazia();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        fila13.enfileira(obj27);
        boolean boolean30 = fila13.vazia();
        java.lang.Class<?> wildcardClass31 = fila13.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = null;
        fila0.enfileira(obj8);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        java.lang.Object obj17 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.imprime();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0);
        java.lang.Object obj20 = fila17.desenfileira();
        fila17.enfileira((java.lang.Object) 100.0d);
        fila12.enfileira((java.lang.Object) fila17);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0);
        java.lang.Object obj27 = fila24.desenfileira();
        boolean boolean28 = fila24.vazia();
        fila24.enfileira((java.lang.Object) (-1.0f));
        fila17.enfileira((java.lang.Object) (-1.0f));
        fila17.imprime();
        java.lang.Object obj33 = fila17.desenfileira();
        boolean boolean34 = fila17.vazia();
        fila0.enfileira((java.lang.Object) fila17);
        fila0.imprime();
        java.lang.Class<?> wildcardClass37 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) (byte) 0);
        fila30.enfileira((java.lang.Object) (byte) 0);
        fila30.imprime();
        fila30.imprime();
        boolean boolean43 = fila30.vazia();
        boolean boolean44 = fila30.vazia();
        boolean boolean45 = fila30.vazia();
        boolean boolean46 = fila30.vazia();
        fila0.enfileira((java.lang.Object) boolean46);
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 0);
        fila48.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj53 = fila48.desenfileira();
        boolean boolean54 = fila48.vazia();
        java.lang.Object obj55 = fila48.desenfileira();
        boolean boolean56 = fila48.vazia();
        fila0.enfileira((java.lang.Object) boolean56);
        fila0.imprime();
        boolean boolean59 = fila0.vazia();
        java.lang.Object obj60 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0 + "'", obj53, 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) 0 + "'", obj55, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean20 = fila13.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        fila27.enfileira((java.lang.Object) 100.0d);
        fila21.enfileira((java.lang.Object) fila27);
        java.lang.Object obj33 = fila21.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        fila40.enfileira((java.lang.Object) 100.0d);
        fila34.enfileira((java.lang.Object) fila40);
        fila21.enfileira((java.lang.Object) fila34);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        fila21.enfileira(obj47);
        boolean boolean50 = fila21.vazia();
        fila21.enfileira((java.lang.Object) 100);
        fila21.imprime();
        java.lang.Object obj54 = fila21.desenfileira();
        fila13.enfileira(obj54);
        java.lang.Object obj56 = fila13.desenfileira();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        boolean boolean28 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila12.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0);
        java.lang.Object obj23 = fila20.desenfileira();
        boolean boolean24 = fila20.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) 100.0d);
        fila20.enfileira((java.lang.Object) fila25);
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        java.lang.Object obj37 = fila34.desenfileira();
        boolean boolean38 = fila34.vazia();
        fila20.enfileira((java.lang.Object) fila34);
        java.lang.Class<?> wildcardClass40 = fila34.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass40);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        java.lang.Object obj45 = fila42.desenfileira();
        fila12.enfileira((java.lang.Object) fila42);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 0);
        fila53.enfileira((java.lang.Object) 100.0d);
        fila47.enfileira((java.lang.Object) fila53);
        fila47.imprime();
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) 0);
        java.lang.Object obj63 = fila60.desenfileira();
        boolean boolean64 = fila60.vazia();
        fila60.imprime();
        fila47.enfileira((java.lang.Object) fila60);
        java.lang.Class<?> wildcardClass67 = fila47.getClass();
        fila12.enfileira((java.lang.Object) fila47);
        fila5.enfileira((java.lang.Object) fila47);
        boolean boolean70 = fila5.vazia();
        java.lang.Class<?> wildcardClass71 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0 + "'", obj28, 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0 + "'", obj63, 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        fila26.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj36 = fila0.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        fila37.imprime();
        boolean boolean40 = fila37.vazia();
        fila0.enfileira((java.lang.Object) fila37);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        fila26.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0);
        java.lang.Object obj11 = fila8.desenfileira();
        boolean boolean12 = fila8.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        fila8.enfileira((java.lang.Object) fila13);
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        boolean boolean26 = fila22.vazia();
        fila8.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass28 = fila22.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass28);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        fila30.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0);
        fila36.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila36);
        java.lang.Object obj42 = fila30.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0);
        java.lang.Object obj46 = fila43.desenfileira();
        fila43.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 0);
        fila49.enfileira((java.lang.Object) 100.0d);
        fila43.enfileira((java.lang.Object) fila49);
        fila30.enfileira((java.lang.Object) fila43);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        fila30.enfileira(obj56);
        boolean boolean59 = fila30.vazia();
        fila30.enfileira((java.lang.Object) 100);
        fila30.imprime();
        java.lang.Object obj63 = fila30.desenfileira();
        fila0.enfileira((java.lang.Object) fila30);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0);
        fila20.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj25 = fila20.desenfileira();
        fila20.imprime();
        fila14.enfileira((java.lang.Object) fila20);
        boolean boolean28 = fila20.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean26 = fila13.vazia();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0);
        fila33.enfileira((java.lang.Object) 100.0d);
        fila27.enfileira((java.lang.Object) fila33);
        fila27.imprime();
        boolean boolean40 = fila27.vazia();
        fila27.enfileira((java.lang.Object) 'a');
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0);
        java.lang.Object obj46 = fila43.desenfileira();
        boolean boolean47 = fila43.vazia();
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 0);
        java.lang.Object obj51 = fila48.desenfileira();
        fila48.enfileira((java.lang.Object) 100.0d);
        fila43.enfileira((java.lang.Object) fila48);
        fila43.imprime();
        fila27.enfileira((java.lang.Object) fila43);
        java.lang.Object obj57 = fila27.desenfileira();
        java.lang.Object obj58 = fila27.desenfileira();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 0);
        java.lang.Object obj62 = fila59.desenfileira();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass63);
        java.lang.Object obj65 = fila27.desenfileira();
        fila13.enfileira((java.lang.Object) fila27);
        java.lang.Object obj67 = fila27.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0 + "'", obj51, 0);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0d + "'", obj57, 100.0d);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0 + "'", obj62, 0);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 'a' + "'", obj65, 'a');
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        fila34.enfileira((java.lang.Object) 100.0d);
        fila28.enfileira((java.lang.Object) fila34);
        fila28.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0);
        java.lang.Object obj44 = fila41.desenfileira();
        boolean boolean45 = fila41.vazia();
        fila41.imprime();
        fila28.enfileira((java.lang.Object) fila41);
        fila28.imprime();
        fila0.enfileira((java.lang.Object) fila28);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 0);
        java.lang.Object obj53 = fila50.desenfileira();
        fila50.enfileira((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass56 = fila50.getClass();
        fila0.enfileira((java.lang.Object) fila50);
        fila50.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0 + "'", obj44, 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0 + "'", obj53, 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0);
        java.lang.Object obj12 = fila9.desenfileira();
        boolean boolean13 = fila9.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        fila14.enfileira((java.lang.Object) (byte) 0);
        fila9.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = null;
        fila9.enfileira(obj20);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        boolean boolean26 = fila22.vazia();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) 100.0d);
        fila22.enfileira((java.lang.Object) fila27);
        fila22.imprime();
        fila22.imprime();
        boolean boolean36 = fila22.vazia();
        java.lang.Object obj37 = fila22.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0);
        fila44.enfileira((java.lang.Object) 100.0d);
        fila38.enfileira((java.lang.Object) fila44);
        fila38.imprime();
        boolean boolean51 = fila38.vazia();
        java.lang.Object obj52 = null;
        fila38.enfileira(obj52);
        fila22.enfileira((java.lang.Object) fila38);
        fila9.enfileira((java.lang.Object) fila38);
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 0);
        java.lang.Object obj59 = fila56.desenfileira();
        boolean boolean60 = fila56.vazia();
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 0);
        java.lang.Object obj64 = fila61.desenfileira();
        fila61.enfileira((java.lang.Object) 100.0d);
        fila56.enfileira((java.lang.Object) fila61);
        fila56.imprime();
        fila56.imprime();
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) 0);
        java.lang.Object obj73 = fila70.desenfileira();
        boolean boolean74 = fila70.vazia();
        fila56.enfileira((java.lang.Object) fila70);
        fila38.enfileira((java.lang.Object) fila70);
        fila0.enfileira((java.lang.Object) fila70);
        boolean boolean78 = fila70.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 0 + "'", obj73, 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        fila0.enfileira((java.lang.Object) "hi!");
        fila0.imprime();
        java.lang.Object obj32 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0);
        fila18.enfileira((java.lang.Object) 100.0d);
        fila12.enfileira((java.lang.Object) fila18);
        java.lang.Object obj24 = fila12.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0);
        java.lang.Object obj28 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        fila31.enfileira((java.lang.Object) 100.0d);
        fila25.enfileira((java.lang.Object) fila31);
        fila12.enfileira((java.lang.Object) fila25);
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        fila12.enfileira(obj38);
        java.lang.Object obj41 = fila12.desenfileira();
        fila0.enfileira(obj41);
        java.lang.Class<?> wildcardClass43 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0 + "'", obj28, 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.enfileira((java.lang.Object) (-1.0f));
        boolean boolean20 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) (short) 0);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj13 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        java.lang.Object obj6 = fila3.desenfileira();
        fila3.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0);
        fila9.enfileira((java.lang.Object) 100.0d);
        fila3.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila3.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        fila3.enfileira((java.lang.Object) fila16);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        fila3.enfileira(obj29);
        fila3.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj34 = fila3.desenfileira();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        java.lang.Object obj30 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        java.lang.Object obj35 = fila32.desenfileira();
        boolean boolean36 = fila32.vazia();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.enfileira((java.lang.Object) 100.0d);
        fila32.enfileira((java.lang.Object) fila37);
        fila32.imprime();
        fila32.imprime();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        java.lang.Object obj49 = fila46.desenfileira();
        boolean boolean50 = fila46.vazia();
        fila32.enfileira((java.lang.Object) fila46);
        boolean boolean52 = fila46.vazia();
        fila0.enfileira((java.lang.Object) fila46);
        ds.Fila fila54 = new ds.Fila();
        fila54.enfileira((java.lang.Object) 0);
        java.lang.Object obj57 = fila54.desenfileira();
        boolean boolean58 = fila54.vazia();
        fila54.enfileira((java.lang.Object) (-1.0f));
        boolean boolean61 = fila54.vazia();
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        fila54.enfileira((java.lang.Object) wildcardClass63);
        fila0.enfileira((java.lang.Object) wildcardClass63);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 0 + "'", obj57, 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.imprime();
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean20 = fila13.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        fila27.enfileira((java.lang.Object) 100.0d);
        fila21.enfileira((java.lang.Object) fila27);
        java.lang.Object obj33 = fila21.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        fila40.enfileira((java.lang.Object) 100.0d);
        fila34.enfileira((java.lang.Object) fila40);
        fila21.enfileira((java.lang.Object) fila34);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        fila21.enfileira(obj47);
        boolean boolean50 = fila21.vazia();
        fila21.enfileira((java.lang.Object) 100);
        fila21.imprime();
        java.lang.Object obj54 = fila21.desenfileira();
        fila13.enfileira(obj54);
        fila13.imprime();
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 0);
        java.lang.Object obj60 = fila57.desenfileira();
        boolean boolean61 = fila57.vazia();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 0);
        java.lang.Object obj65 = fila62.desenfileira();
        fila62.enfileira((java.lang.Object) 100.0d);
        fila57.enfileira((java.lang.Object) fila62);
        fila57.imprime();
        fila57.imprime();
        boolean boolean71 = fila57.vazia();
        fila13.enfileira((java.lang.Object) fila57);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0 + "'", obj60, 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0 + "'", obj65, 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila14.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = fila14.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        java.lang.Object obj6 = fila3.desenfileira();
        fila3.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0);
        fila9.enfileira((java.lang.Object) 100.0d);
        fila3.enfileira((java.lang.Object) fila9);
        fila3.imprime();
        boolean boolean16 = fila3.vazia();
        fila0.enfileira((java.lang.Object) boolean16);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        java.lang.Object obj35 = fila32.desenfileira();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass36);
        java.lang.Object obj38 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        java.lang.Object obj27 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        fila28.enfileira((java.lang.Object) 100.0d);
        fila22.enfileira((java.lang.Object) fila28);
        fila22.imprime();
        fila5.enfileira((java.lang.Object) fila22);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0);
        java.lang.Object obj39 = fila36.desenfileira();
        fila36.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        fila42.enfileira((java.lang.Object) 100.0d);
        fila36.enfileira((java.lang.Object) fila42);
        java.lang.Object obj48 = fila36.desenfileira();
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 0);
        java.lang.Object obj52 = fila49.desenfileira();
        fila49.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 0);
        fila55.enfileira((java.lang.Object) 100.0d);
        fila49.enfileira((java.lang.Object) fila55);
        fila36.enfileira((java.lang.Object) fila49);
        ds.Fila fila62 = new ds.Fila();
        fila49.enfileira((java.lang.Object) fila62);
        fila49.imprime();
        java.lang.Object obj65 = fila49.desenfileira();
        fila5.enfileira(obj65);
        java.lang.Object obj67 = fila5.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0d + "'", obj48, 100.0d);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0 + "'", obj52, 0);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 100.0d + "'", obj65, 100.0d);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0d + "'", obj67, 100.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        fila16.imprime();
        boolean boolean29 = fila16.vazia();
        java.lang.Object obj30 = null;
        fila16.enfileira(obj30);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj33 = fila0.desenfileira();
        boolean boolean34 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0f);
        java.lang.Object obj17 = fila0.desenfileira();
        boolean boolean18 = fila0.vazia();
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj31 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        boolean boolean36 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0);
        java.lang.Object obj41 = fila38.desenfileira();
        fila38.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0);
        fila44.enfileira((java.lang.Object) 100.0d);
        fila38.enfileira((java.lang.Object) fila44);
        java.lang.Object obj50 = fila38.desenfileira();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0);
        java.lang.Object obj54 = fila51.desenfileira();
        fila51.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 0);
        fila57.enfileira((java.lang.Object) 100.0d);
        fila51.enfileira((java.lang.Object) fila57);
        fila38.enfileira((java.lang.Object) fila51);
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        fila38.enfileira(obj64);
        fila38.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj69 = fila38.desenfileira();
        fila38.imprime();
        fila38.imprime();
        fila0.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0d + "'", obj50, 100.0d);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        fila0.imprime();
        boolean boolean25 = fila0.vazia();
        java.lang.Object obj26 = null;
        fila0.enfileira(obj26);
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        java.lang.Object obj17 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        java.lang.Object obj13 = null;
        fila0.enfileira(obj13);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.enfileira((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass20 = fila15.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        boolean boolean30 = fila0.vazia();
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        java.lang.Object obj35 = fila32.desenfileira();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass36);
        java.lang.Object obj38 = fila0.desenfileira();
        boolean boolean39 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        fila0.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        fila27.enfileira((java.lang.Object) 100.0d);
        fila21.enfileira((java.lang.Object) fila27);
        java.lang.Object obj33 = fila21.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        java.lang.Object obj37 = fila34.desenfileira();
        fila34.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        fila40.enfileira((java.lang.Object) 100.0d);
        fila34.enfileira((java.lang.Object) fila40);
        fila21.enfileira((java.lang.Object) fila34);
        boolean boolean47 = fila34.vazia();
        fila34.imprime();
        fila0.enfileira((java.lang.Object) fila34);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        fila28.enfileira((java.lang.Object) 100.0d);
        fila22.enfileira((java.lang.Object) fila28);
        fila22.imprime();
        fila5.enfileira((java.lang.Object) fila22);
        boolean boolean36 = fila5.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila0.enfileira((java.lang.Object) fila30);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        java.lang.Object obj49 = fila46.desenfileira();
        boolean boolean50 = fila46.vazia();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0);
        java.lang.Object obj54 = fila51.desenfileira();
        fila51.enfileira((java.lang.Object) 100.0d);
        fila46.enfileira((java.lang.Object) fila51);
        fila30.enfileira((java.lang.Object) fila51);
        java.lang.Object obj59 = fila51.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 0);
        java.lang.Object obj13 = fila10.desenfileira();
        fila10.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        fila16.enfileira((java.lang.Object) 100.0d);
        fila10.enfileira((java.lang.Object) fila16);
        java.lang.Object obj22 = fila10.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 0);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0);
        fila29.enfileira((java.lang.Object) 100.0d);
        fila23.enfileira((java.lang.Object) fila29);
        fila10.enfileira((java.lang.Object) fila23);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        fila10.enfileira(obj36);
        java.lang.Object obj39 = fila10.desenfileira();
        fila0.enfileira(obj39);
        boolean boolean41 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0 + "'", obj26, 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        fila34.enfileira((java.lang.Object) 100.0d);
        fila28.enfileira((java.lang.Object) fila34);
        fila28.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0);
        java.lang.Object obj44 = fila41.desenfileira();
        boolean boolean45 = fila41.vazia();
        fila41.imprime();
        fila28.enfileira((java.lang.Object) fila41);
        fila28.imprime();
        fila0.enfileira((java.lang.Object) fila28);
        fila0.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0);
        java.lang.Object obj54 = fila51.desenfileira();
        fila51.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 0);
        fila57.enfileira((java.lang.Object) 100.0d);
        fila51.enfileira((java.lang.Object) fila57);
        java.lang.Object obj63 = fila51.desenfileira();
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 0);
        java.lang.Object obj67 = fila64.desenfileira();
        fila64.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) 0);
        fila70.enfileira((java.lang.Object) 100.0d);
        fila64.enfileira((java.lang.Object) fila70);
        fila51.enfileira((java.lang.Object) fila64);
        ds.Fila fila77 = new ds.Fila();
        fila77.enfileira((java.lang.Object) 0);
        fila77.enfileira((java.lang.Object) (byte) 0);
        fila51.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila83 = new ds.Fila();
        fila83.enfileira((java.lang.Object) 0);
        fila51.enfileira((java.lang.Object) 0);
        java.lang.Object obj87 = fila51.desenfileira();
        fila0.enfileira((java.lang.Object) fila51);
        boolean boolean89 = fila51.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0 + "'", obj44, 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0d + "'", obj63, 100.0d);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0 + "'", obj67, 0);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) (short) 0);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0);
        java.lang.Object obj10 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj13 = fila7.desenfileira();
        fila7.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 0);
        java.lang.Object obj20 = fila17.desenfileira();
        boolean boolean21 = fila17.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) 100.0d);
        fila17.enfileira((java.lang.Object) fila22);
        fila7.enfileira((java.lang.Object) fila17);
        boolean boolean30 = fila17.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        fila31.enfileira((java.lang.Object) (byte) 0);
        boolean boolean36 = fila31.vazia();
        java.lang.Object obj37 = fila31.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0);
        java.lang.Object obj41 = fila38.desenfileira();
        boolean boolean42 = fila38.vazia();
        fila38.enfileira((java.lang.Object) (-1.0f));
        boolean boolean45 = fila38.vazia();
        fila38.imprime();
        fila31.enfileira((java.lang.Object) fila38);
        fila17.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = fila13.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        java.lang.Object obj30 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 0);
        fila33.enfileira((java.lang.Object) 100.0d);
        fila27.enfileira((java.lang.Object) fila33);
        java.lang.Object obj39 = fila27.desenfileira();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        fila46.enfileira((java.lang.Object) 100.0d);
        fila40.enfileira((java.lang.Object) fila46);
        fila27.enfileira((java.lang.Object) fila40);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        fila27.enfileira(obj53);
        java.lang.Object obj56 = fila27.desenfileira();
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 0);
        java.lang.Object obj60 = fila57.desenfileira();
        boolean boolean61 = fila57.vazia();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 0);
        java.lang.Object obj65 = fila62.desenfileira();
        fila62.enfileira((java.lang.Object) 100.0d);
        fila57.enfileira((java.lang.Object) fila62);
        fila57.imprime();
        fila57.imprime();
        fila57.imprime();
        fila27.enfileira((java.lang.Object) fila57);
        fila13.enfileira((java.lang.Object) fila27);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0d + "'", obj39, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0 + "'", obj43, 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0 + "'", obj60, 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0 + "'", obj65, 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        fila16.enfileira((java.lang.Object) (-1.0f));
        boolean boolean23 = fila16.vazia();
        fila16.imprime();
        fila16.imprime();
        java.lang.Object obj26 = fila16.desenfileira();
        java.lang.Class<?> wildcardClass27 = fila16.getClass();
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0f) + "'", obj26, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        java.lang.Object obj35 = fila32.desenfileira();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass36);
        boolean boolean38 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj31 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1.0d);
        fila0.imprime();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0);
        fila43.enfileira((java.lang.Object) 100.0d);
        fila37.enfileira((java.lang.Object) fila43);
        java.lang.Object obj49 = fila37.desenfileira();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 0);
        java.lang.Object obj53 = fila50.desenfileira();
        fila50.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 0);
        fila56.enfileira((java.lang.Object) 100.0d);
        fila50.enfileira((java.lang.Object) fila56);
        fila37.enfileira((java.lang.Object) fila50);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        fila37.enfileira(obj63);
        java.lang.Object obj66 = fila37.desenfileira();
        fila0.enfileira((java.lang.Object) fila37);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0 + "'", obj53, 0);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        fila0.imprime();
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Object obj22 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = fila5.desenfileira();
        fila5.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) 0);
        java.lang.Object obj4 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 0);
        fila7.enfileira((java.lang.Object) 100.0d);
        fila1.enfileira((java.lang.Object) fila7);
        java.lang.Object obj13 = fila1.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        fila14.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0);
        fila20.enfileira((java.lang.Object) 100.0d);
        fila14.enfileira((java.lang.Object) fila20);
        fila1.enfileira((java.lang.Object) fila14);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        fila1.enfileira(obj27);
        java.lang.Object obj30 = fila1.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        java.lang.Object obj34 = fila31.desenfileira();
        boolean boolean35 = fila31.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0);
        fila36.enfileira((java.lang.Object) (byte) 0);
        fila31.enfileira((java.lang.Object) (byte) 0);
        fila31.imprime();
        fila31.imprime();
        boolean boolean44 = fila31.vazia();
        boolean boolean45 = fila31.vazia();
        boolean boolean46 = fila31.vazia();
        boolean boolean47 = fila31.vazia();
        fila1.enfileira((java.lang.Object) boolean47);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 0);
        fila49.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj54 = fila49.desenfileira();
        boolean boolean55 = fila49.vazia();
        java.lang.Object obj56 = fila49.desenfileira();
        boolean boolean57 = fila49.vazia();
        fila1.enfileira((java.lang.Object) boolean57);
        fila1.imprime();
        boolean boolean60 = fila1.vazia();
        fila0.enfileira((java.lang.Object) boolean60);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) 0 + "'", obj56, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean30 = fila16.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Object obj21 = fila5.desenfileira();
        boolean boolean22 = fila5.vazia();
        java.lang.Object obj23 = fila5.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        fila30.enfileira((java.lang.Object) 100.0d);
        fila24.enfileira((java.lang.Object) fila30);
        java.lang.Object obj36 = fila24.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0);
        fila43.enfileira((java.lang.Object) 100.0d);
        fila37.enfileira((java.lang.Object) fila43);
        fila24.enfileira((java.lang.Object) fila37);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        fila24.enfileira(obj50);
        java.lang.Object obj53 = fila24.desenfileira();
        fila5.enfileira(obj53);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 0);
        fila55.enfileira((java.lang.Object) (byte) 0);
        boolean boolean60 = fila55.vazia();
        java.lang.Class<?> wildcardClass61 = fila55.getClass();
        fila5.enfileira((java.lang.Object) fila55);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0f) + "'", obj23, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        fila28.enfileira((java.lang.Object) 100.0d);
        fila22.enfileira((java.lang.Object) fila28);
        fila22.imprime();
        fila5.enfileira((java.lang.Object) fila22);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 0);
        java.lang.Object obj39 = fila36.desenfileira();
        fila36.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        fila42.enfileira((java.lang.Object) 100.0d);
        fila36.enfileira((java.lang.Object) fila42);
        java.lang.Object obj48 = fila36.desenfileira();
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 0);
        java.lang.Object obj52 = fila49.desenfileira();
        fila49.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 0);
        fila55.enfileira((java.lang.Object) 100.0d);
        fila49.enfileira((java.lang.Object) fila55);
        fila36.enfileira((java.lang.Object) fila49);
        ds.Fila fila62 = new ds.Fila();
        fila49.enfileira((java.lang.Object) fila62);
        fila49.imprime();
        java.lang.Object obj65 = fila49.desenfileira();
        fila5.enfileira(obj65);
        java.lang.Class<?> wildcardClass67 = obj65.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0d + "'", obj48, 100.0d);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0 + "'", obj52, 0);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 100.0d + "'", obj65, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 0);
        java.lang.Object obj11 = fila8.desenfileira();
        boolean boolean12 = fila8.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        fila8.enfileira((java.lang.Object) fila13);
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        java.lang.Object obj25 = fila22.desenfileira();
        boolean boolean26 = fila22.vazia();
        fila8.enfileira((java.lang.Object) fila22);
        java.lang.Class<?> wildcardClass28 = fila22.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass28);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        fila0.enfileira((java.lang.Object) fila30);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0);
        fila41.enfileira((java.lang.Object) 100.0d);
        fila35.enfileira((java.lang.Object) fila41);
        fila35.imprime();
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 0);
        java.lang.Object obj51 = fila48.desenfileira();
        boolean boolean52 = fila48.vazia();
        fila48.imprime();
        fila35.enfileira((java.lang.Object) fila48);
        java.lang.Class<?> wildcardClass55 = fila35.getClass();
        fila0.enfileira((java.lang.Object) fila35);
        java.lang.Object obj57 = fila35.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0 + "'", obj51, 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0d + "'", obj57, 100.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) 100.0d);
        fila26.enfileira((java.lang.Object) fila31);
        fila26.imprime();
        fila26.imprime();
        boolean boolean40 = fila26.vazia();
        java.lang.Object obj41 = fila26.desenfileira();
        fila0.enfileira(obj41);
        java.lang.Object obj43 = fila0.desenfileira();
        java.lang.Object obj44 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj46 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 100.0d);
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        java.lang.Object obj30 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        fila32.enfileira((java.lang.Object) (byte) 0);
        fila32.imprime();
        java.lang.Class<?> wildcardClass38 = fila32.getClass();
        fila0.enfileira((java.lang.Object) fila32);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        java.lang.Object obj43 = fila40.desenfileira();
        fila40.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        fila46.enfileira((java.lang.Object) 100.0d);
        fila40.enfileira((java.lang.Object) fila46);
        java.lang.Object obj52 = fila40.desenfileira();
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 0);
        java.lang.Object obj56 = fila53.desenfileira();
        fila53.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) 0);
        fila59.enfileira((java.lang.Object) 100.0d);
        fila53.enfileira((java.lang.Object) fila59);
        fila40.enfileira((java.lang.Object) fila53);
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        fila40.enfileira(obj66);
        fila40.enfileira((java.lang.Object) "hi!");
        fila40.imprime();
        fila40.imprime();
        fila32.enfileira((java.lang.Object) fila40);
        fila40.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0 + "'", obj43, 0);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0 + "'", obj56, 0);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 0L);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        boolean boolean32 = fila0.vazia();
        boolean boolean33 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        boolean boolean13 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        boolean boolean20 = fila16.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        java.lang.Object obj24 = fila21.desenfileira();
        fila21.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila21);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        boolean boolean32 = fila0.vazia();
        boolean boolean33 = fila0.vazia();
        java.lang.Object obj34 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 'a' + "'", obj34, 'a');
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        fila18.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila18);
        fila13.imprime();
        fila13.imprime();
        boolean boolean27 = fila13.vazia();
        java.lang.Object obj28 = fila13.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 0);
        java.lang.Object obj32 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        fila35.enfileira((java.lang.Object) 100.0d);
        fila29.enfileira((java.lang.Object) fila35);
        fila29.imprime();
        boolean boolean42 = fila29.vazia();
        java.lang.Object obj43 = null;
        fila29.enfileira(obj43);
        fila13.enfileira((java.lang.Object) fila29);
        fila0.enfileira((java.lang.Object) fila29);
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) 0);
        java.lang.Object obj50 = fila47.desenfileira();
        boolean boolean51 = fila47.vazia();
        fila47.imprime();
        fila47.enfileira((java.lang.Object) false);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 0);
        fila55.enfileira((java.lang.Object) 100.0d);
        fila55.enfileira((java.lang.Object) (short) 0);
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 0);
        java.lang.Object obj65 = fila62.desenfileira();
        fila62.enfileira((java.lang.Object) 100.0d);
        java.lang.Object obj68 = fila62.desenfileira();
        fila62.enfileira((java.lang.Object) 0);
        fila55.enfileira((java.lang.Object) fila62);
        fila47.enfileira((java.lang.Object) fila62);
        fila0.enfileira((java.lang.Object) fila47);
        fila47.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0 + "'", obj65, 0);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0d + "'", obj68, 100.0d);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj20 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        boolean boolean29 = fila0.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) 0);
        java.lang.Object obj47 = fila44.desenfileira();
        boolean boolean48 = fila44.vazia();
        fila44.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj51 = fila44.desenfileira();
        fila44.imprime();
        fila30.enfileira((java.lang.Object) fila44);
        java.lang.Object obj54 = fila30.desenfileira();
        java.lang.Object obj55 = fila30.desenfileira();
        fila0.enfileira((java.lang.Object) fila30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = fila30.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0 + "'", obj47, 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1.0f) + "'", obj51, (-1.0f));
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean26 = fila13.vazia();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        fila13.enfileira(obj27);
        fila13.imprime();
        java.lang.Class<?> wildcardClass31 = fila13.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        java.lang.Object obj17 = fila14.desenfileira();
        boolean boolean18 = fila14.vazia();
        fila14.enfileira((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = fila14.desenfileira();
        fila14.imprime();
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        java.lang.Object obj31 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 0);
        fila34.enfileira((java.lang.Object) 100.0d);
        fila28.enfileira((java.lang.Object) fila34);
        fila28.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 0);
        java.lang.Object obj44 = fila41.desenfileira();
        boolean boolean45 = fila41.vazia();
        fila41.imprime();
        fila28.enfileira((java.lang.Object) fila41);
        fila28.imprime();
        fila0.enfileira((java.lang.Object) fila28);
        boolean boolean50 = fila0.vazia();
        java.lang.Object obj51 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0f) + "'", obj21, (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0 + "'", obj44, 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.enfileira((java.lang.Object) (-1.0f));
        fila5.enfileira((java.lang.Object) (-1.0f));
        fila5.imprime();
        java.lang.Object obj21 = fila5.desenfileira();
        fila5.imprime();
        java.lang.Object obj23 = null;
        fila5.enfileira(obj23);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        java.lang.Object obj13 = null;
        fila0.enfileira(obj13);
        boolean boolean15 = fila0.vazia();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        java.lang.Object obj22 = fila19.desenfileira();
        fila19.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 0);
        fila25.enfileira((java.lang.Object) 100.0d);
        fila19.enfileira((java.lang.Object) fila25);
        java.lang.Object obj31 = fila19.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        java.lang.Object obj35 = fila32.desenfileira();
        fila32.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 0);
        fila38.enfileira((java.lang.Object) 100.0d);
        fila32.enfileira((java.lang.Object) fila38);
        fila19.enfileira((java.lang.Object) fila32);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        fila19.enfileira(obj45);
        fila19.enfileira((java.lang.Object) "hi!");
        java.lang.Object obj50 = fila19.desenfileira();
        fila19.imprime();
        fila19.imprime();
        fila19.enfileira((java.lang.Object) 1.0d);
        fila19.imprime();
        fila16.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        java.lang.Object obj8 = fila5.desenfileira();
        fila5.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        fila0.imprime();
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        java.lang.Object obj19 = fila16.desenfileira();
        fila16.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) 0);
        fila22.enfileira((java.lang.Object) 100.0d);
        fila16.enfileira((java.lang.Object) fila22);
        fila16.imprime();
        boolean boolean29 = fila16.vazia();
        java.lang.Object obj30 = null;
        fila16.enfileira(obj30);
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean33 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        java.lang.Object obj29 = fila26.desenfileira();
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 0);
        java.lang.Object obj34 = fila31.desenfileira();
        fila31.enfileira((java.lang.Object) 100.0d);
        fila26.enfileira((java.lang.Object) fila31);
        fila26.imprime();
        fila26.imprime();
        boolean boolean40 = fila26.vazia();
        java.lang.Object obj41 = fila26.desenfileira();
        fila0.enfileira(obj41);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0);
        java.lang.Object obj46 = fila43.desenfileira();
        fila43.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 0);
        fila49.enfileira((java.lang.Object) 100.0d);
        fila43.enfileira((java.lang.Object) fila49);
        java.lang.Object obj55 = fila43.desenfileira();
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) 0);
        java.lang.Object obj59 = fila56.desenfileira();
        fila56.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) 0);
        fila62.enfileira((java.lang.Object) 100.0d);
        fila56.enfileira((java.lang.Object) fila62);
        fila43.enfileira((java.lang.Object) fila56);
        ds.Fila fila69 = new ds.Fila();
        fila56.enfileira((java.lang.Object) fila69);
        java.lang.Object obj71 = fila56.desenfileira();
        fila0.enfileira((java.lang.Object) fila56);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0d + "'", obj71, 100.0d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        fila0.enfileira(obj26);
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        java.lang.Object obj33 = fila30.desenfileira();
        boolean boolean34 = fila30.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 0);
        java.lang.Object obj38 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) 100.0d);
        fila30.enfileira((java.lang.Object) fila35);
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila0.enfileira((java.lang.Object) fila30);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) 0);
        java.lang.Object obj49 = fila46.desenfileira();
        boolean boolean50 = fila46.vazia();
        ds.Fila fila51 = new ds.Fila();
        fila51.enfileira((java.lang.Object) 0);
        java.lang.Object obj54 = fila51.desenfileira();
        fila51.enfileira((java.lang.Object) 100.0d);
        fila46.enfileira((java.lang.Object) fila51);
        fila30.enfileira((java.lang.Object) fila51);
        boolean boolean59 = fila30.vazia();
        boolean boolean60 = fila30.vazia();
        java.lang.Object obj61 = fila30.desenfileira();
        java.lang.Class<?> wildcardClass62 = fila30.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (-1.0f));
        fila0.imprime();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        fila0.enfileira(obj8);
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.enfileira((java.lang.Object) 100.0d);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 0);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 0);
        fila19.enfileira((java.lang.Object) 100.0d);
        fila13.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 0);
        fila26.enfileira((java.lang.Object) (byte) 0);
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 0);
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj36 = fila0.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) 0);
        fila43.enfileira((java.lang.Object) 100.0d);
        fila37.enfileira((java.lang.Object) fila43);
        fila37.imprime();
        boolean boolean50 = fila37.vazia();
        fila37.enfileira((java.lang.Object) 'a');
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 0);
        java.lang.Object obj56 = fila53.desenfileira();
        boolean boolean57 = fila53.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) 0);
        java.lang.Object obj61 = fila58.desenfileira();
        fila58.enfileira((java.lang.Object) 100.0d);
        fila53.enfileira((java.lang.Object) fila58);
        fila53.imprime();
        fila37.enfileira((java.lang.Object) fila53);
        java.lang.Object obj67 = fila37.desenfileira();
        java.lang.Object obj68 = fila37.desenfileira();
        ds.Fila fila69 = new ds.Fila();
        fila69.enfileira((java.lang.Object) 0);
        java.lang.Object obj72 = fila69.desenfileira();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        fila37.enfileira((java.lang.Object) wildcardClass73);
        fila0.enfileira((java.lang.Object) fila37);
        java.lang.Object obj76 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0 + "'", obj56, 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0 + "'", obj61, 0);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0d + "'", obj67, 100.0d);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0 + "'", obj72, 0);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(obj76);
    }
}

