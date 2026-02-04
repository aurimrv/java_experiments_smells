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
        fila0.imprime();
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10L + "'", obj6, 10L);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila3.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass8 = fila5.getClass();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj10 = fila5.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass9 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        fila0.imprime();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila4.vazia();
        java.lang.Object obj16 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.enfileira((java.lang.Object) 10.0f);
        boolean boolean17 = fila4.vazia();
        java.lang.Class<?> wildcardClass18 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila4.vazia();
        fila4.imprime();
        boolean boolean17 = fila4.vazia();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        java.lang.Class<?> wildcardClass37 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 10L);
        fila18.imprime();
        fila18.imprime();
        fila15.enfileira((java.lang.Object) fila18);
        fila11.enfileira((java.lang.Object) fila15);
        java.lang.Object obj26 = fila11.desenfileira();
        boolean boolean27 = fila11.vazia();
        boolean boolean28 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass30 = fila11.getClass();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        boolean boolean16 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        java.lang.Class<?> wildcardClass42 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        fila0.imprime();
        java.lang.Class<?> wildcardClass45 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass8 = fila5.getClass();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        boolean boolean12 = fila10.vazia();
        boolean boolean13 = fila10.vazia();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        fila5.enfileira((java.lang.Object) boolean15);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass9 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        boolean boolean14 = fila12.vazia();
        boolean boolean15 = fila12.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 'a');
        java.lang.Object obj19 = fila16.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila16.enfileira((java.lang.Object) fila20);
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila20.enfileira((java.lang.Object) fila26);
        fila12.enfileira((java.lang.Object) fila20);
        java.lang.Class<?> wildcardClass30 = fila12.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj13 = fila10.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila10.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        boolean boolean23 = fila21.vazia();
        boolean boolean24 = fila21.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 'a');
        java.lang.Object obj28 = fila25.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila25.enfileira((java.lang.Object) fila29);
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila29.enfileira((java.lang.Object) fila35);
        fila21.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass39 = fila21.getClass();
        fila10.enfileira((java.lang.Object) fila21);
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        boolean boolean43 = fila41.vazia();
        boolean boolean44 = fila41.vazia();
        fila41.imprime();
        fila10.enfileira((java.lang.Object) fila41);
        fila0.enfileira((java.lang.Object) fila41);
        java.lang.Class<?> wildcardClass48 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 'a' + "'", obj28, 'a');
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 10L);
        fila18.imprime();
        fila18.imprime();
        fila15.enfileira((java.lang.Object) fila18);
        fila11.enfileira((java.lang.Object) fila15);
        java.lang.Object obj26 = fila11.desenfileira();
        boolean boolean27 = fila11.vazia();
        boolean boolean28 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.imprime();
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila33.enfileira((java.lang.Object) 10L);
        fila33.imprime();
        fila33.imprime();
        fila30.enfileira((java.lang.Object) fila33);
        java.lang.Class<?> wildcardClass40 = fila33.getClass();
        fila11.enfileira((java.lang.Object) fila33);
        ds.Fila fila42 = new ds.Fila();
        fila42.imprime();
        fila42.enfileira((java.lang.Object) 10L);
        fila42.imprime();
        boolean boolean47 = fila42.vazia();
        fila11.enfileira((java.lang.Object) boolean47);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 'a');
        java.lang.Object obj27 = fila24.desenfileira();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila24.enfileira((java.lang.Object) fila28);
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila28.enfileira((java.lang.Object) fila34);
        java.lang.Object obj37 = fila28.desenfileira();
        fila14.enfileira((java.lang.Object) fila28);
        fila4.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 'a' + "'", obj27, 'a');
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        boolean boolean6 = fila4.vazia();
        boolean boolean7 = fila4.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila8.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila8.enfileira((java.lang.Object) fila12);
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila12.enfileira((java.lang.Object) fila18);
        fila4.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass22 = fila4.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass22);
        fila0.imprime();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Object obj38 = fila4.desenfileira();
        fila4.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila5.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean17 = fila0.vazia();
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila8.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila8.enfileira((java.lang.Object) fila12);
        boolean boolean18 = fila8.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        boolean boolean21 = fila19.vazia();
        boolean boolean22 = fila19.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj26 = fila23.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila23.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila27.enfileira((java.lang.Object) fila33);
        fila19.enfileira((java.lang.Object) fila27);
        java.lang.Class<?> wildcardClass37 = fila19.getClass();
        fila8.enfileira((java.lang.Object) fila19);
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        boolean boolean41 = fila39.vazia();
        boolean boolean42 = fila39.vazia();
        fila39.imprime();
        fila8.enfileira((java.lang.Object) fila39);
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila45.imprime();
        fila45.imprime();
        fila45.imprime();
        java.lang.Class<?> wildcardClass50 = fila45.getClass();
        fila8.enfileira((java.lang.Object) fila45);
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass54 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj13 = fila10.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila14.enfileira((java.lang.Object) fila20);
        java.lang.Object obj23 = fila14.desenfileira();
        fila0.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        java.lang.Class<?> wildcardClass26 = fila14.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        boolean boolean39 = fila14.vazia();
        java.lang.Class<?> wildcardClass40 = fila14.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) 10L);
        fila22.imprime();
        fila22.imprime();
        fila19.enfileira((java.lang.Object) fila22);
        fila15.enfileira((java.lang.Object) fila19);
        fila19.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj32 = fila19.desenfileira();
        java.lang.Class<?> wildcardClass33 = fila19.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila4.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila4.vazia();
        fila4.imprime();
        java.lang.Class<?> wildcardClass17 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass9 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = fila0.desenfileira();
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10L + "'", obj11, 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass18 = fila14.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.enfileira((java.lang.Object) 10.0f);
        boolean boolean17 = fila4.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 'a');
        java.lang.Object obj21 = fila18.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        fila18.enfileira((java.lang.Object) fila22);
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila22.enfileira((java.lang.Object) fila28);
        java.lang.Object obj31 = fila22.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) 'a');
        fila22.enfileira((java.lang.Object) fila32);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 'a');
        fila36.imprime();
        java.lang.Class<?> wildcardClass40 = fila36.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass40);
        fila4.enfileira((java.lang.Object) wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        boolean boolean6 = fila4.vazia();
        boolean boolean7 = fila4.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila8.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila8.enfileira((java.lang.Object) fila12);
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila12.enfileira((java.lang.Object) fila18);
        fila4.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass22 = fila4.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass22);
        boolean boolean24 = fila0.vazia();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj13 = fila10.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila10.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        boolean boolean23 = fila21.vazia();
        boolean boolean24 = fila21.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 'a');
        java.lang.Object obj28 = fila25.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila25.enfileira((java.lang.Object) fila29);
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila29.enfileira((java.lang.Object) fila35);
        fila21.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass39 = fila21.getClass();
        fila10.enfileira((java.lang.Object) fila21);
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        boolean boolean43 = fila41.vazia();
        boolean boolean44 = fila41.vazia();
        fila41.imprime();
        fila10.enfileira((java.lang.Object) fila41);
        fila0.enfileira((java.lang.Object) fila41);
        boolean boolean48 = fila0.vazia();
        java.lang.Class<?> wildcardClass49 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 'a' + "'", obj28, 'a');
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass13 = fila10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        boolean boolean38 = fila4.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 0);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        java.lang.Class<?> wildcardClass42 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        boolean boolean44 = fila37.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 'a');
        java.lang.Object obj6 = fila3.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila3.enfileira((java.lang.Object) fila7);
        fila3.imprime();
        java.lang.Object obj14 = fila3.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila19.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 'a');
        fila19.enfileira((java.lang.Object) fila29);
        fila3.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila3.desenfileira();
        boolean boolean11 = fila3.vazia();
        fila3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila3.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila4.vazia();
        fila4.imprime();
        java.lang.Object obj17 = fila4.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 'a');
        java.lang.Object obj7 = fila4.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila4.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila8.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        boolean boolean19 = fila8.vazia();
        java.lang.Class<?> wildcardClass20 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj13 = fila10.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila10.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        boolean boolean23 = fila21.vazia();
        boolean boolean24 = fila21.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 'a');
        java.lang.Object obj28 = fila25.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila25.enfileira((java.lang.Object) fila29);
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila29.enfileira((java.lang.Object) fila35);
        fila21.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass39 = fila21.getClass();
        fila10.enfileira((java.lang.Object) fila21);
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        boolean boolean43 = fila41.vazia();
        boolean boolean44 = fila41.vazia();
        fila41.imprime();
        fila10.enfileira((java.lang.Object) fila41);
        fila0.enfileira((java.lang.Object) fila41);
        fila41.enfileira((java.lang.Object) 10.0d);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 'a' + "'", obj28, 'a');
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila21.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila21.enfileira((java.lang.Object) fila25);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila25.enfileira((java.lang.Object) fila31);
        fila10.enfileira((java.lang.Object) fila31);
        java.lang.Object obj35 = fila10.desenfileira();
        boolean boolean36 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.enfileira((java.lang.Object) 10.0f);
        boolean boolean17 = fila4.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 10L);
        fila18.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass26 = fila23.getClass();
        fila18.enfileira((java.lang.Object) fila23);
        fila4.enfileira((java.lang.Object) fila23);
        java.lang.Class<?> wildcardClass29 = fila23.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 10L);
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean23 = fila0.vazia();
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila5.imprime();
        fila5.imprime();
        boolean boolean9 = fila5.vazia();
        boolean boolean10 = fila5.vazia();
        fila5.enfileira((java.lang.Object) 'a');
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 'a');
        java.lang.Object obj16 = fila13.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.imprime();
        fila17.imprime();
        fila13.enfileira((java.lang.Object) fila17);
        boolean boolean23 = fila13.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        boolean boolean26 = fila24.vazia();
        boolean boolean27 = fila24.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 'a');
        java.lang.Object obj31 = fila28.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.imprime();
        fila32.imprime();
        fila28.enfileira((java.lang.Object) fila32);
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        fila32.enfileira((java.lang.Object) fila38);
        fila24.enfileira((java.lang.Object) fila32);
        java.lang.Class<?> wildcardClass42 = fila24.getClass();
        fila13.enfileira((java.lang.Object) fila24);
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        boolean boolean46 = fila44.vazia();
        boolean boolean47 = fila44.vazia();
        fila44.imprime();
        fila13.enfileira((java.lang.Object) fila44);
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        fila50.imprime();
        fila50.imprime();
        fila50.imprime();
        java.lang.Class<?> wildcardClass55 = fila50.getClass();
        fila13.enfileira((java.lang.Object) fila50);
        fila13.imprime();
        fila5.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) fila13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 10L);
        fila18.imprime();
        fila18.imprime();
        fila15.enfileira((java.lang.Object) fila18);
        fila11.enfileira((java.lang.Object) fila15);
        java.lang.Object obj26 = fila11.desenfileira();
        boolean boolean27 = fila11.vazia();
        boolean boolean28 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.enfileira((java.lang.Object) 10L);
        fila37.imprime();
        boolean boolean42 = fila37.vazia();
        fila31.enfileira((java.lang.Object) fila37);
        boolean boolean44 = fila31.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 0);
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Object obj16 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.imprime();
        boolean boolean3 = fila1.vazia();
        boolean boolean4 = fila1.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila9.enfileira((java.lang.Object) fila15);
        fila1.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila1);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass19 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj21 = fila11.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        boolean boolean15 = fila13.vazia();
        boolean boolean16 = fila13.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 'a');
        java.lang.Object obj20 = fila17.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila17.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila21.enfileira((java.lang.Object) fila27);
        fila13.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila37.enfileira((java.lang.Object) fila43);
        java.lang.Object obj46 = fila37.desenfileira();
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.imprime();
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        fila50.enfileira((java.lang.Object) 10L);
        fila50.imprime();
        fila50.imprime();
        fila47.enfileira((java.lang.Object) fila50);
        java.lang.Object obj57 = fila47.desenfileira();
        ds.Fila fila58 = new ds.Fila();
        fila58.imprime();
        fila58.enfileira((java.lang.Object) 10L);
        fila58.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass67 = fila64.getClass();
        fila58.enfileira((java.lang.Object) wildcardClass67);
        fila47.enfileira((java.lang.Object) wildcardClass67);
        fila37.enfileira((java.lang.Object) fila47);
        fila21.enfileira((java.lang.Object) fila37);
        fila37.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.enfileira((java.lang.Object) "");
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        java.lang.Class<?> wildcardClass42 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        boolean boolean44 = fila0.vazia();
        java.lang.Class<?> wildcardClass45 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila4.desenfileira();
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila3.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Object obj14 = fila11.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila15.enfileira((java.lang.Object) fila21);
        fila3.enfileira((java.lang.Object) fila15);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila35.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        fila38.enfileira((java.lang.Object) 10L);
        fila38.imprime();
        fila38.imprime();
        fila35.enfileira((java.lang.Object) fila38);
        fila31.enfileira((java.lang.Object) fila35);
        fila31.imprime();
        java.lang.Object obj47 = fila31.desenfileira();
        fila25.enfileira((java.lang.Object) fila31);
        fila25.imprime();
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        boolean boolean52 = fila50.vazia();
        boolean boolean53 = fila50.vazia();
        fila50.imprime();
        fila50.imprime();
        fila25.enfileira((java.lang.Object) fila50);
        fila15.enfileira((java.lang.Object) fila50);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        java.lang.Class<?> wildcardClass16 = fila4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj24 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj26 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 1 + "'", obj26, (short) 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) -1);
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 100L);
        fila8.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        boolean boolean15 = fila13.vazia();
        boolean boolean16 = fila13.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 'a');
        java.lang.Object obj20 = fila17.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila17.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila21.enfileira((java.lang.Object) fila27);
        fila13.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila37.enfileira((java.lang.Object) fila43);
        java.lang.Object obj46 = fila37.desenfileira();
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.imprime();
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        fila50.enfileira((java.lang.Object) 10L);
        fila50.imprime();
        fila50.imprime();
        fila47.enfileira((java.lang.Object) fila50);
        java.lang.Object obj57 = fila47.desenfileira();
        ds.Fila fila58 = new ds.Fila();
        fila58.imprime();
        fila58.enfileira((java.lang.Object) 10L);
        fila58.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass67 = fila64.getClass();
        fila58.enfileira((java.lang.Object) wildcardClass67);
        fila47.enfileira((java.lang.Object) wildcardClass67);
        fila37.enfileira((java.lang.Object) fila47);
        fila21.enfileira((java.lang.Object) fila37);
        java.lang.Object obj72 = fila21.desenfileira();
        java.lang.Class<?> wildcardClass73 = fila21.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 'a');
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila16.enfileira((java.lang.Object) fila22);
        java.lang.Object obj25 = fila16.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 'a');
        fila16.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass10 = fila4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila21.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila21.enfileira((java.lang.Object) fila25);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila25.enfileira((java.lang.Object) fila31);
        fila10.enfileira((java.lang.Object) fila31);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 'a');
        java.lang.Object obj38 = fila35.desenfileira();
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        fila39.imprime();
        fila39.imprime();
        fila39.imprime();
        fila35.enfileira((java.lang.Object) fila39);
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila39.enfileira((java.lang.Object) fila45);
        java.lang.Object obj48 = fila39.desenfileira();
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 'a');
        fila39.enfileira((java.lang.Object) fila49);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 'a');
        fila53.imprime();
        java.lang.Class<?> wildcardClass57 = fila53.getClass();
        fila39.enfileira((java.lang.Object) wildcardClass57);
        java.lang.Class<?> wildcardClass59 = fila39.getClass();
        fila31.enfileira((java.lang.Object) fila39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        fila0.imprime();
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
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10L + "'", obj6, 10L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        boolean boolean12 = fila0.vazia();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        java.lang.Object obj19 = fila14.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila14.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila21.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila21.enfileira((java.lang.Object) fila25);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila25.enfileira((java.lang.Object) fila31);
        fila10.enfileira((java.lang.Object) fila31);
        java.lang.Object obj35 = fila10.desenfileira();
        fila10.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila5.imprime();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) (byte) -1);
        boolean boolean11 = fila5.vazia();
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 100L);
        fila5.enfileira((java.lang.Object) 100L);
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) 10L);
        fila27.imprime();
        fila27.imprime();
        fila24.enfileira((java.lang.Object) fila27);
        fila20.enfileira((java.lang.Object) fila24);
        fila24.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj37 = fila24.desenfileira();
        java.lang.Class<?> wildcardClass38 = fila24.getClass();
        fila5.enfileira((java.lang.Object) wildcardClass38);
        fila0.enfileira((java.lang.Object) wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 'a');
        java.lang.Object obj7 = fila4.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila4.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila8.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        boolean boolean19 = fila8.vazia();
        boolean boolean20 = fila8.vazia();
        java.lang.Class<?> wildcardClass21 = fila8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj17 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        java.lang.Object obj10 = null;
        fila5.enfileira(obj10);
        boolean boolean12 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        // The following exception was thrown during execution in test generation
        try {
            fila5.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        boolean boolean16 = fila0.vazia();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila3.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Object obj14 = fila11.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila15.enfileira((java.lang.Object) fila21);
        fila3.enfileira((java.lang.Object) fila15);
        java.lang.Class<?> wildcardClass25 = fila3.getClass();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila21.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila21.enfileira((java.lang.Object) fila25);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila25.enfileira((java.lang.Object) fila31);
        fila10.enfileira((java.lang.Object) fila31);
        boolean boolean35 = fila10.vazia();
        fila10.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10L);
        fila11.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass20 = fila17.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass20);
        fila0.enfileira((java.lang.Object) wildcardClass20);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj26 = fila23.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila23.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila27.enfileira((java.lang.Object) fila33);
        boolean boolean36 = fila27.vazia();
        fila27.imprime();
        fila0.enfileira((java.lang.Object) fila27);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 'a');
        java.lang.Object obj9 = fila6.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        fila6.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila10.enfileira((java.lang.Object) fila16);
        java.lang.Object obj19 = fila10.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila23.enfileira((java.lang.Object) 10L);
        fila23.imprime();
        fila23.imprime();
        fila20.enfileira((java.lang.Object) fila23);
        java.lang.Object obj30 = fila20.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.enfileira((java.lang.Object) 10L);
        fila31.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass40 = fila37.getClass();
        fila31.enfileira((java.lang.Object) wildcardClass40);
        fila20.enfileira((java.lang.Object) wildcardClass40);
        fila10.enfileira((java.lang.Object) fila20);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass46 = fila10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass8 = fila5.getClass();
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        java.lang.Object obj19 = fila13.desenfileira();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass22 = fila10.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10L + "'", obj19, 10L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila3.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Object obj14 = fila11.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila15.enfileira((java.lang.Object) fila21);
        fila3.enfileira((java.lang.Object) fila15);
        java.lang.Object obj25 = fila3.desenfileira();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        fila14.imprime();
        java.lang.Object obj20 = fila14.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        java.lang.Object obj4 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10L + "'", obj4, 10L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 10L);
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        fila11.enfileira((java.lang.Object) "");
        java.lang.Object obj23 = fila11.desenfileira();
        fila0.enfileira(obj23);
        java.lang.Class<?> wildcardClass25 = obj23.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100L);
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        java.lang.Object obj10 = null;
        fila5.enfileira(obj10);
        boolean boolean12 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean14 = fila5.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj10 = fila7.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass26 = fila23.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass26);
        fila7.enfileira((java.lang.Object) wildcardClass26);
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) 10L);
        fila30.imprime();
        java.lang.Class<?> wildcardClass35 = fila30.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass35);
        boolean boolean37 = fila0.vazia();
        boolean boolean38 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10L + "'", obj6, 10L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass31 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 'a');
        fila18.imprime();
        java.lang.Class<?> wildcardClass22 = fila18.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass22);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) 10L);
        fila27.imprime();
        fila27.imprime();
        fila24.enfileira((java.lang.Object) fila27);
        java.lang.Object obj34 = fila24.desenfileira();
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila35.enfileira((java.lang.Object) 10L);
        fila35.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass44 = fila41.getClass();
        fila35.enfileira((java.lang.Object) wildcardClass44);
        fila24.enfileira((java.lang.Object) wildcardClass44);
        java.lang.Class<?> wildcardClass47 = fila24.getClass();
        fila4.enfileira((java.lang.Object) fila24);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 'a');
        java.lang.Object obj41 = fila38.desenfileira();
        boolean boolean42 = fila38.vazia();
        fila4.enfileira((java.lang.Object) boolean42);
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        fila44.imprime();
        fila44.imprime();
        ds.Fila fila48 = new ds.Fila();
        fila48.imprime();
        fila48.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        fila51.enfileira((java.lang.Object) 10L);
        fila51.imprime();
        fila51.imprime();
        fila48.enfileira((java.lang.Object) fila51);
        fila44.enfileira((java.lang.Object) fila48);
        fila48.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj61 = fila48.desenfileira();
        java.lang.Object obj62 = fila48.desenfileira();
        fila4.enfileira(obj62);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 'a' + "'", obj41, 'a');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 10.0f + "'", obj62, 10.0f);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10L);
        fila11.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass20 = fila17.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass20);
        fila0.enfileira((java.lang.Object) wildcardClass20);
        fila0.imprime();
        java.lang.Object obj24 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 'a');
        java.lang.Object obj27 = fila24.desenfileira();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila24.enfileira((java.lang.Object) fila28);
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila28.enfileira((java.lang.Object) fila34);
        java.lang.Object obj37 = fila28.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        fila38.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        fila41.enfileira((java.lang.Object) 10L);
        fila41.imprime();
        fila41.imprime();
        fila38.enfileira((java.lang.Object) fila41);
        java.lang.Object obj48 = fila38.desenfileira();
        ds.Fila fila49 = new ds.Fila();
        fila49.imprime();
        fila49.enfileira((java.lang.Object) 10L);
        fila49.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass58 = fila55.getClass();
        fila49.enfileira((java.lang.Object) wildcardClass58);
        fila38.enfileira((java.lang.Object) wildcardClass58);
        fila28.enfileira((java.lang.Object) fila38);
        java.lang.Object obj62 = fila28.desenfileira();
        fila0.enfileira(obj62);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 'a' + "'", obj27, 'a');
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 'a');
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila16.enfileira((java.lang.Object) fila22);
        java.lang.Object obj25 = fila16.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 'a');
        fila16.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj31 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila5.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 10L);
        fila8.imprime();
        fila8.imprime();
        fila5.enfileira((java.lang.Object) fila8);
        fila5.enfileira((java.lang.Object) "");
        java.lang.Object obj17 = fila5.desenfileira();
        fila0.enfileira(obj17);
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        boolean boolean6 = fila4.vazia();
        boolean boolean7 = fila4.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila8.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila8.enfileira((java.lang.Object) fila12);
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila12.enfileira((java.lang.Object) fila18);
        fila4.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass22 = fila4.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass22);
        fila0.imprime();
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj10 = fila7.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass26 = fila23.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass26);
        fila7.enfileira((java.lang.Object) wildcardClass26);
        fila0.enfileira((java.lang.Object) fila7);
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) 10L);
        fila30.imprime();
        java.lang.Class<?> wildcardClass35 = fila30.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10L + "'", obj6, 10L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean24 = fila6.vazia();
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Object obj14 = fila11.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) 10L);
        fila21.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass30 = fila27.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass30);
        fila11.enfileira((java.lang.Object) wildcardClass30);
        fila0.enfileira((java.lang.Object) wildcardClass30);
        java.lang.Object obj34 = fila0.desenfileira();
        java.lang.Object obj35 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "class ds.Fila");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) 10L);
        fila22.imprime();
        fila22.imprime();
        fila19.enfileira((java.lang.Object) fila22);
        fila15.enfileira((java.lang.Object) fila19);
        fila19.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj32 = fila19.desenfileira();
        java.lang.Class<?> wildcardClass33 = fila19.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 10L);
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean23 = fila0.vazia();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 'a');
        java.lang.Object obj27 = fila24.desenfileira();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila24.enfileira((java.lang.Object) fila28);
        boolean boolean34 = fila24.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila35.imprime();
        fila35.imprime();
        boolean boolean39 = fila35.vazia();
        boolean boolean40 = fila35.vazia();
        fila35.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass43 = fila35.getClass();
        fila24.enfileira((java.lang.Object) fila35);
        fila0.enfileira((java.lang.Object) fila24);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 'a' + "'", obj27, 'a');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 'a');
        java.lang.Object obj6 = fila3.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila3.enfileira((java.lang.Object) fila7);
        fila3.imprime();
        java.lang.Object obj14 = fila3.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila19.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 'a');
        fila19.enfileira((java.lang.Object) fila29);
        fila3.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj35 = fila0.desenfileira();
        ds.Fila fila36 = new ds.Fila();
        fila36.imprime();
        fila36.imprime();
        fila36.imprime();
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        fila40.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila43.enfileira((java.lang.Object) 10L);
        fila43.imprime();
        fila43.imprime();
        fila40.enfileira((java.lang.Object) fila43);
        fila36.enfileira((java.lang.Object) fila40);
        fila40.imprime();
        fila0.enfileira((java.lang.Object) fila40);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 'a' + "'", obj35, 'a');
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        boolean boolean39 = fila14.vazia();
        java.lang.Object obj40 = fila14.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class ds.Fila");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj17 = fila4.desenfileira();
        fila4.imprime();
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 'a');
        java.lang.Object obj41 = fila38.desenfileira();
        boolean boolean42 = fila38.vazia();
        fila4.enfileira((java.lang.Object) boolean42);
        java.lang.Object obj44 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass45 = fila4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 'a' + "'", obj41, 'a');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) 10L);
        fila24.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass33 = fila30.getClass();
        fila24.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila24.desenfileira();
        fila0.enfileira(obj35);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        boolean boolean39 = fila37.vazia();
        fila37.imprime();
        fila0.enfileira((java.lang.Object) fila37);
        java.lang.Object obj42 = fila0.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila43.imprime();
        fila43.imprime();
        fila43.enfileira((java.lang.Object) (byte) -1);
        boolean boolean49 = fila43.vazia();
        fila0.enfileira((java.lang.Object) fila43);
        java.lang.Class<?> wildcardClass51 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10L + "'", obj35, 10L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 10L + "'", obj42, 10L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj10 = fila7.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass26 = fila23.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass26);
        fila7.enfileira((java.lang.Object) wildcardClass26);
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        boolean boolean31 = fila7.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10L + "'", obj6, 10L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        java.lang.Object obj25 = fila15.desenfileira();
        fila10.enfileira((java.lang.Object) fila15);
        boolean boolean27 = fila15.vazia();
        boolean boolean28 = fila15.vazia();
        boolean boolean29 = fila15.vazia();
        boolean boolean30 = fila15.vazia();
        fila3.enfileira((java.lang.Object) boolean30);
        boolean boolean32 = fila3.vazia();
        boolean boolean33 = fila3.vazia();
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 'a');
        java.lang.Object obj19 = fila16.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila16.enfileira((java.lang.Object) fila20);
        java.lang.Object obj26 = fila16.desenfileira();
        fila11.enfileira((java.lang.Object) fila16);
        fila3.enfileira((java.lang.Object) fila11);
        boolean boolean29 = fila11.vazia();
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) -1);
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj15 = fila6.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        boolean boolean21 = fila16.vazia();
        fila16.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila16.desenfileira();
        fila16.imprime();
        fila6.enfileira((java.lang.Object) fila16);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 'a');
        java.lang.Object obj30 = fila27.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.imprime();
        fila31.imprime();
        fila27.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila31.enfileira((java.lang.Object) fila37);
        fila16.enfileira((java.lang.Object) fila37);
        fila0.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        boolean boolean43 = fila16.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 'a' + "'", obj30, 'a');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 10L);
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj23 = fila11.desenfileira();
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj16 = fila0.desenfileira();
        boolean boolean17 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10L);
        fila11.enfileira((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass17 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj19 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean17 = fila5.vazia();
        boolean boolean18 = fila5.vazia();
        boolean boolean19 = fila5.vazia();
        boolean boolean20 = fila5.vazia();
        fila5.imprime();
        java.lang.Class<?> wildcardClass22 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 'a');
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila16.enfileira((java.lang.Object) fila22);
        java.lang.Object obj25 = fila16.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 'a');
        fila16.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila34.enfileira((java.lang.Object) 10L);
        fila34.imprime();
        fila34.imprime();
        fila31.enfileira((java.lang.Object) fila34);
        java.lang.Object obj41 = fila34.desenfileira();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 'a');
        java.lang.Object obj45 = fila42.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        fila46.imprime();
        fila46.imprime();
        fila46.imprime();
        fila42.enfileira((java.lang.Object) fila46);
        ds.Fila fila52 = new ds.Fila();
        fila52.imprime();
        fila46.enfileira((java.lang.Object) fila52);
        fila34.enfileira((java.lang.Object) fila46);
        fila16.enfileira((java.lang.Object) fila34);
        java.lang.Object obj57 = fila16.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10L + "'", obj41, 10L);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 'a' + "'", obj45, 'a');
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        fila4.imprime();
        java.lang.Class<?> wildcardClass39 = fila4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 'a');
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila16.enfileira((java.lang.Object) fila22);
        java.lang.Object obj25 = fila16.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 'a');
        fila16.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila16);
        boolean boolean31 = fila16.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) 10L);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 10L);
        fila16.imprime();
        fila16.imprime();
        fila13.enfileira((java.lang.Object) fila16);
        fila13.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) 10L);
        fila27.imprime();
        fila27.imprime();
        fila24.enfileira((java.lang.Object) fila27);
        fila24.imprime();
        fila13.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 'a');
        java.lang.Object obj40 = fila37.desenfileira();
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        fila41.imprime();
        fila41.imprime();
        fila41.imprime();
        fila37.enfileira((java.lang.Object) fila41);
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.enfileira((java.lang.Object) 10L);
        fila47.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass56 = fila53.getClass();
        fila47.enfileira((java.lang.Object) wildcardClass56);
        fila37.enfileira((java.lang.Object) wildcardClass56);
        fila24.enfileira((java.lang.Object) fila37);
        fila0.enfileira((java.lang.Object) fila24);
        fila24.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila4.vazia();
        fila4.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        java.lang.Object obj23 = fila17.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 'a');
        java.lang.Object obj27 = fila24.desenfileira();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila24.enfileira((java.lang.Object) fila28);
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila34.enfileira((java.lang.Object) 10L);
        fila34.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass43 = fila40.getClass();
        fila34.enfileira((java.lang.Object) wildcardClass43);
        fila24.enfileira((java.lang.Object) wildcardClass43);
        fila17.enfileira((java.lang.Object) fila24);
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.enfileira((java.lang.Object) 10L);
        fila47.imprime();
        java.lang.Class<?> wildcardClass52 = fila47.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass52);
        fila4.enfileira((java.lang.Object) fila17);
        java.lang.Object obj55 = fila17.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10L + "'", obj23, 10L);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 'a' + "'", obj27, 'a');
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila8.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila8.enfileira((java.lang.Object) fila12);
        boolean boolean18 = fila8.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        boolean boolean21 = fila19.vazia();
        boolean boolean22 = fila19.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj26 = fila23.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila23.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila27.enfileira((java.lang.Object) fila33);
        fila19.enfileira((java.lang.Object) fila27);
        java.lang.Class<?> wildcardClass37 = fila19.getClass();
        fila8.enfileira((java.lang.Object) fila19);
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        boolean boolean41 = fila39.vazia();
        boolean boolean42 = fila39.vazia();
        fila39.imprime();
        fila8.enfileira((java.lang.Object) fila39);
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila45.imprime();
        fila45.imprime();
        fila45.imprime();
        java.lang.Class<?> wildcardClass50 = fila45.getClass();
        fila8.enfileira((java.lang.Object) fila45);
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj54 = fila8.desenfileira();
        boolean boolean55 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.enfileira((java.lang.Object) 10.0f);
        boolean boolean17 = fila4.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 10L);
        fila18.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass26 = fila23.getClass();
        fila18.enfileira((java.lang.Object) fila23);
        fila4.enfileira((java.lang.Object) fila23);
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 'a');
        java.lang.Object obj37 = fila34.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        fila38.imprime();
        fila38.imprime();
        fila38.imprime();
        fila34.enfileira((java.lang.Object) fila38);
        java.lang.Object obj44 = fila34.desenfileira();
        fila29.enfileira((java.lang.Object) fila34);
        boolean boolean46 = fila34.vazia();
        boolean boolean47 = fila34.vazia();
        fila4.enfileira((java.lang.Object) fila34);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 'a' + "'", obj37, 'a');
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) 10L);
        fila24.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass33 = fila30.getClass();
        fila24.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila24.desenfileira();
        fila0.enfileira(obj35);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        boolean boolean39 = fila37.vazia();
        fila37.imprime();
        fila0.enfileira((java.lang.Object) fila37);
        fila37.imprime();
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10L + "'", obj35, 10L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        java.lang.Class<?> wildcardClass42 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        fila0.imprime();
        fila0.imprime();
        boolean boolean46 = fila0.vazia();
        boolean boolean47 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 'a');
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila16.enfileira((java.lang.Object) fila22);
        java.lang.Object obj25 = fila16.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 'a');
        fila16.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila34.enfileira((java.lang.Object) 10L);
        fila34.imprime();
        fila34.imprime();
        fila31.enfileira((java.lang.Object) fila34);
        java.lang.Object obj41 = fila34.desenfileira();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 'a');
        java.lang.Object obj45 = fila42.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        fila46.imprime();
        fila46.imprime();
        fila46.imprime();
        fila42.enfileira((java.lang.Object) fila46);
        ds.Fila fila52 = new ds.Fila();
        fila52.imprime();
        fila46.enfileira((java.lang.Object) fila52);
        fila34.enfileira((java.lang.Object) fila46);
        fila16.enfileira((java.lang.Object) fila34);
        fila34.imprime();
        java.lang.Object obj58 = null;
        fila34.enfileira(obj58);
        java.lang.Object obj60 = fila34.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10L + "'", obj41, 10L);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 'a' + "'", obj45, 'a');
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        fila4.imprime();
        java.lang.Object obj17 = fila4.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 10L);
        fila18.imprime();
        fila18.imprime();
        java.lang.Object obj24 = fila18.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 'a');
        java.lang.Object obj28 = fila25.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila25.enfileira((java.lang.Object) fila29);
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila35.enfileira((java.lang.Object) 10L);
        fila35.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass44 = fila41.getClass();
        fila35.enfileira((java.lang.Object) wildcardClass44);
        fila25.enfileira((java.lang.Object) wildcardClass44);
        fila18.enfileira((java.lang.Object) fila25);
        ds.Fila fila48 = new ds.Fila();
        fila48.imprime();
        fila48.enfileira((java.lang.Object) 10L);
        fila48.imprime();
        java.lang.Class<?> wildcardClass53 = fila48.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass53);
        fila4.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 'a' + "'", obj28, 'a');
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10L);
        fila11.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass20 = fila17.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass20);
        fila0.enfileira((java.lang.Object) wildcardClass20);
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila23.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) 10L);
        fila26.imprime();
        fila26.imprime();
        fila23.enfileira((java.lang.Object) fila26);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila37.enfileira((java.lang.Object) fila43);
        java.lang.Object obj46 = fila37.desenfileira();
        fila23.enfileira((java.lang.Object) fila37);
        fila0.enfileira((java.lang.Object) fila37);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        boolean boolean15 = fila13.vazia();
        boolean boolean16 = fila13.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 'a');
        java.lang.Object obj20 = fila17.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila17.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila21.enfileira((java.lang.Object) fila27);
        fila13.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila37.enfileira((java.lang.Object) fila43);
        java.lang.Object obj46 = fila37.desenfileira();
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.imprime();
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        fila50.enfileira((java.lang.Object) 10L);
        fila50.imprime();
        fila50.imprime();
        fila47.enfileira((java.lang.Object) fila50);
        java.lang.Object obj57 = fila47.desenfileira();
        ds.Fila fila58 = new ds.Fila();
        fila58.imprime();
        fila58.enfileira((java.lang.Object) 10L);
        fila58.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass67 = fila64.getClass();
        fila58.enfileira((java.lang.Object) wildcardClass67);
        fila47.enfileira((java.lang.Object) wildcardClass67);
        fila37.enfileira((java.lang.Object) fila47);
        fila21.enfileira((java.lang.Object) fila37);
        java.lang.Object obj72 = fila21.desenfileira();
        boolean boolean73 = fila21.vazia();
        fila21.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj17 = fila4.desenfileira();
        java.lang.Object obj18 = fila4.desenfileira();
        fila4.imprime();
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0f + "'", obj18, 10.0f);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        fila31.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Object obj14 = fila11.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) 10L);
        fila21.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass30 = fila27.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass30);
        fila11.enfileira((java.lang.Object) wildcardClass30);
        fila0.enfileira((java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        boolean boolean27 = fila25.vazia();
        boolean boolean28 = fila25.vazia();
        fila25.imprime();
        fila25.imprime();
        fila0.enfileira((java.lang.Object) fila25);
        boolean boolean32 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        java.lang.Class<?> wildcardClass42 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        fila0.imprime();
        fila0.imprime();
        boolean boolean46 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass48 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean17 = fila5.vazia();
        boolean boolean18 = fila5.vazia();
        boolean boolean19 = fila5.vazia();
        java.lang.Class<?> wildcardClass20 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) -1);
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 100L);
        fila8.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        boolean boolean24 = fila0.vazia();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj31 = fila11.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj13 = fila10.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila14.enfileira((java.lang.Object) fila20);
        java.lang.Object obj23 = fila14.desenfileira();
        fila0.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) 10L);
        fila26.imprime();
        fila26.imprime();
        java.lang.Object obj32 = fila26.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila43.enfileira((java.lang.Object) 10L);
        fila43.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass52 = fila49.getClass();
        fila43.enfileira((java.lang.Object) wildcardClass52);
        fila33.enfileira((java.lang.Object) wildcardClass52);
        fila26.enfileira((java.lang.Object) fila33);
        fila14.enfileira((java.lang.Object) fila33);
        java.lang.Class<?> wildcardClass57 = fila14.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10L + "'", obj32, 10L);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Object obj38 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass39 = fila4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (byte) -1);
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        fila20.imprime();
        boolean boolean29 = fila20.vazia();
        boolean boolean30 = fila20.vazia();
        fila14.enfileira((java.lang.Object) fila20);
        fila14.imprime();
        java.lang.Object obj33 = fila14.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 'a' + "'", obj33, 'a');
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        boolean boolean8 = fila5.vazia();
        java.lang.Object obj9 = fila5.desenfileira();
        java.lang.Object obj10 = null;
        fila5.enfileira(obj10);
        boolean boolean12 = fila5.vazia();
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj14 = fila5.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10L + "'", obj6, 10L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass9 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 10L);
        fila12.enfileira((java.lang.Object) (short) 1);
        boolean boolean18 = fila12.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean17 = fila5.vazia();
        java.lang.Class<?> wildcardClass18 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 'a');
        java.lang.Object obj7 = fila4.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila4.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila8.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila8);
        fila8.imprime();
        boolean boolean19 = fila8.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 'a');
        java.lang.Object obj23 = fila20.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila20.enfileira((java.lang.Object) fila24);
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) 10L);
        fila30.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass39 = fila36.getClass();
        fila30.enfileira((java.lang.Object) wildcardClass39);
        fila20.enfileira((java.lang.Object) wildcardClass39);
        fila8.enfileira((java.lang.Object) fila20);
        fila8.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 'a' + "'", obj23, 'a');
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        boolean boolean15 = fila13.vazia();
        boolean boolean16 = fila13.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 'a');
        java.lang.Object obj20 = fila17.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila17.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila21.enfileira((java.lang.Object) fila27);
        fila13.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila37.enfileira((java.lang.Object) fila43);
        java.lang.Object obj46 = fila37.desenfileira();
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.imprime();
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        fila50.enfileira((java.lang.Object) 10L);
        fila50.imprime();
        fila50.imprime();
        fila47.enfileira((java.lang.Object) fila50);
        java.lang.Object obj57 = fila47.desenfileira();
        ds.Fila fila58 = new ds.Fila();
        fila58.imprime();
        fila58.enfileira((java.lang.Object) 10L);
        fila58.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass67 = fila64.getClass();
        fila58.enfileira((java.lang.Object) wildcardClass67);
        fila47.enfileira((java.lang.Object) wildcardClass67);
        fila37.enfileira((java.lang.Object) fila47);
        fila21.enfileira((java.lang.Object) fila37);
        java.lang.Object obj72 = fila21.desenfileira();
        fila21.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(obj72);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10L + "'", obj6, 10L);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass15 = fila4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) 10L);
        fila14.imprime();
        fila14.imprime();
        fila11.enfileira((java.lang.Object) fila14);
        fila11.enfileira((java.lang.Object) "");
        java.lang.Object obj23 = fila11.desenfileira();
        fila0.enfileira(obj23);
        boolean boolean25 = fila0.vazia();
        java.lang.Object obj26 = fila0.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila27.enfileira((java.lang.Object) (byte) -1);
        boolean boolean33 = fila27.vazia();
        fila27.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila35.imprime();
        fila35.imprime();
        fila35.enfileira((java.lang.Object) (byte) -1);
        boolean boolean41 = fila35.vazia();
        fila35.imprime();
        fila35.imprime();
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        fila44.imprime();
        fila44.enfileira((java.lang.Object) 100L);
        fila35.enfileira((java.lang.Object) 100L);
        fila27.enfileira((java.lang.Object) 100L);
        boolean boolean51 = fila27.vazia();
        fila0.enfileira((java.lang.Object) boolean51);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Object obj38 = fila14.desenfileira();
        fila14.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class ds.Fila");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila4.vazia();
        java.lang.Object obj16 = fila4.desenfileira();
        fila4.imprime();
        boolean boolean18 = fila4.vazia();
        boolean boolean19 = fila4.vazia();
        fila4.imprime();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) 10L);
        fila10.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass19 = fila16.getClass();
        fila10.enfileira((java.lang.Object) wildcardClass19);
        fila0.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        java.lang.Object obj24 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class ds.Fila");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila3.desenfileira();
        boolean boolean11 = fila3.vazia();
        boolean boolean12 = fila3.vazia();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 'a');
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        java.lang.Object obj22 = fila12.desenfileira();
        fila7.enfileira((java.lang.Object) fila12);
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila12.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        java.lang.Class<?> wildcardClass42 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass46 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass38 = fila14.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 'a');
        java.lang.Object obj19 = fila16.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila16.enfileira((java.lang.Object) fila20);
        java.lang.Object obj26 = fila16.desenfileira();
        fila11.enfileira((java.lang.Object) fila16);
        fila3.enfileira((java.lang.Object) fila11);
        fila3.imprime();
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        java.lang.Class<?> wildcardClass42 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        boolean boolean44 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj46 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean21 = fila10.vazia();
        boolean boolean22 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) -1);
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 100L);
        fila8.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        boolean boolean24 = fila0.vazia();
        java.lang.Object obj25 = fila0.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 'a');
        java.lang.Object obj29 = fila26.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila26.enfileira((java.lang.Object) fila30);
        boolean boolean36 = fila26.vazia();
        fila26.imprime();
        fila0.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 'a' + "'", obj29, 'a');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila21.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila21.enfileira((java.lang.Object) fila25);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila25.enfileira((java.lang.Object) fila31);
        fila10.enfileira((java.lang.Object) fila31);
        boolean boolean35 = fila31.vazia();
        boolean boolean36 = fila31.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 10L);
        fila18.imprime();
        fila18.imprime();
        fila15.enfileira((java.lang.Object) fila18);
        fila11.enfileira((java.lang.Object) fila15);
        java.lang.Object obj26 = fila11.desenfileira();
        boolean boolean27 = fila11.vazia();
        boolean boolean28 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 'a');
        java.lang.Object obj33 = fila30.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila34.imprime();
        fila34.imprime();
        fila34.imprime();
        fila30.enfileira((java.lang.Object) fila34);
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        fila34.enfileira((java.lang.Object) fila40);
        java.lang.Object obj43 = fila34.desenfileira();
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        fila44.imprime();
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.enfileira((java.lang.Object) 10L);
        fila47.imprime();
        fila47.imprime();
        fila44.enfileira((java.lang.Object) fila47);
        java.lang.Object obj54 = fila44.desenfileira();
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        fila55.enfileira((java.lang.Object) 10L);
        fila55.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass64 = fila61.getClass();
        fila55.enfileira((java.lang.Object) wildcardClass64);
        fila44.enfileira((java.lang.Object) wildcardClass64);
        fila34.enfileira((java.lang.Object) fila44);
        fila44.imprime();
        java.lang.Class<?> wildcardClass69 = fila44.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass69);
        boolean boolean71 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 'a' + "'", obj33, 'a');
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        boolean boolean27 = fila25.vazia();
        boolean boolean28 = fila25.vazia();
        fila25.imprime();
        fila25.imprime();
        fila0.enfileira((java.lang.Object) fila25);
        java.lang.Class<?> wildcardClass32 = fila25.getClass();
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) -1);
        boolean boolean18 = fila12.vazia();
        fila12.imprime();
        fila12.imprime();
        boolean boolean21 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj26 = fila23.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila23.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        boolean boolean43 = fila33.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        boolean boolean46 = fila44.vazia();
        boolean boolean47 = fila44.vazia();
        ds.Fila fila48 = new ds.Fila();
        fila48.enfileira((java.lang.Object) 'a');
        java.lang.Object obj51 = fila48.desenfileira();
        ds.Fila fila52 = new ds.Fila();
        fila52.imprime();
        fila52.imprime();
        fila52.imprime();
        fila52.imprime();
        fila48.enfileira((java.lang.Object) fila52);
        ds.Fila fila58 = new ds.Fila();
        fila58.imprime();
        fila52.enfileira((java.lang.Object) fila58);
        fila44.enfileira((java.lang.Object) fila52);
        java.lang.Class<?> wildcardClass62 = fila44.getClass();
        fila33.enfileira((java.lang.Object) fila44);
        ds.Fila fila64 = new ds.Fila();
        fila64.imprime();
        boolean boolean66 = fila64.vazia();
        boolean boolean67 = fila64.vazia();
        fila64.imprime();
        fila33.enfileira((java.lang.Object) fila64);
        fila23.enfileira((java.lang.Object) fila64);
        boolean boolean71 = fila23.vazia();
        fila12.enfileira((java.lang.Object) boolean71);
        fila0.enfileira((java.lang.Object) fila12);
        fila12.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 'a' + "'", obj51, 'a');
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        java.lang.Class<?> wildcardClass42 = fila37.getClass();
        fila0.enfileira((java.lang.Object) fila37);
        fila0.imprime();
        fila0.imprime();
        boolean boolean46 = fila0.vazia();
        fila0.imprime();
        boolean boolean48 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj13 = fila10.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila14.enfileira((java.lang.Object) fila20);
        java.lang.Object obj23 = fila14.desenfileira();
        fila0.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) 10L);
        fila26.imprime();
        fila26.imprime();
        java.lang.Object obj32 = fila26.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila43.enfileira((java.lang.Object) 10L);
        fila43.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass52 = fila49.getClass();
        fila43.enfileira((java.lang.Object) wildcardClass52);
        fila33.enfileira((java.lang.Object) wildcardClass52);
        fila26.enfileira((java.lang.Object) fila33);
        fila14.enfileira((java.lang.Object) fila33);
        fila14.imprime();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10L + "'", obj32, 10L);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) -1);
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 100L);
        fila8.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        boolean boolean24 = fila0.vazia();
        java.lang.Object obj25 = fila0.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 'a');
        java.lang.Object obj29 = fila26.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila30.imprime();
        fila26.enfileira((java.lang.Object) fila30);
        boolean boolean36 = fila26.vazia();
        fila26.imprime();
        fila0.enfileira((java.lang.Object) fila26);
        java.lang.Object obj39 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 'a' + "'", obj29, 'a');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100L + "'", obj39, 100L);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        boolean boolean13 = fila11.vazia();
        boolean boolean14 = fila11.vazia();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        fila11.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass29 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        boolean boolean33 = fila31.vazia();
        boolean boolean34 = fila31.vazia();
        fila31.imprime();
        fila0.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.enfileira((java.lang.Object) 10L);
        fila37.imprime();
        boolean boolean42 = fila37.vazia();
        fila31.enfileira((java.lang.Object) fila37);
        java.lang.Object obj44 = fila37.desenfileira();
        java.lang.Class<?> wildcardClass45 = fila37.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 10L + "'", obj44, 10L);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 'a');
        java.lang.Object obj7 = fila4.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila4.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila8.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean18 = fila8.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila3.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Object obj14 = fila11.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila15.enfileira((java.lang.Object) fila21);
        fila3.enfileira((java.lang.Object) fila15);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) (byte) -1);
        boolean boolean31 = fila25.vazia();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 0);
        fila25.imprime();
        fila3.enfileira((java.lang.Object) fila25);
        java.lang.Class<?> wildcardClass37 = fila3.getClass();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Object obj14 = fila11.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila21.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila21.enfileira((java.lang.Object) fila25);
        boolean boolean31 = fila21.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        boolean boolean34 = fila32.vazia();
        boolean boolean35 = fila32.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 'a');
        java.lang.Object obj39 = fila36.desenfileira();
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        fila40.imprime();
        fila40.imprime();
        fila40.imprime();
        fila36.enfileira((java.lang.Object) fila40);
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        fila40.enfileira((java.lang.Object) fila46);
        fila32.enfileira((java.lang.Object) fila40);
        java.lang.Class<?> wildcardClass50 = fila32.getClass();
        fila21.enfileira((java.lang.Object) fila32);
        ds.Fila fila52 = new ds.Fila();
        fila52.imprime();
        boolean boolean54 = fila52.vazia();
        boolean boolean55 = fila52.vazia();
        fila52.imprime();
        fila21.enfileira((java.lang.Object) fila52);
        fila11.enfileira((java.lang.Object) fila52);
        boolean boolean59 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean59);
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 'a');
        java.lang.Object obj64 = fila61.desenfileira();
        boolean boolean65 = fila61.vazia();
        fila0.enfileira((java.lang.Object) fila61);
        java.lang.Class<?> wildcardClass67 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 'a' + "'", obj64, 'a');
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 'a');
        java.lang.Object obj7 = fila4.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila4.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila8.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj18 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj17 = fila4.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 'a');
        java.lang.Object obj21 = fila18.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        fila18.enfileira((java.lang.Object) fila22);
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.enfileira((java.lang.Object) 10L);
        fila28.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass37 = fila34.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass37);
        fila18.enfileira((java.lang.Object) wildcardClass37);
        java.lang.Object obj40 = fila18.desenfileira();
        fila4.enfileira((java.lang.Object) fila18);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        fila3.imprime();
        boolean boolean12 = fila3.vazia();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Object obj16 = fila0.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 0);
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila3.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 'a');
        java.lang.Object obj19 = fila16.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila16.enfileira((java.lang.Object) fila20);
        java.lang.Object obj26 = fila16.desenfileira();
        fila11.enfileira((java.lang.Object) fila16);
        fila3.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass29 = fila3.getClass();
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        boolean boolean6 = fila4.vazia();
        boolean boolean7 = fila4.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila8.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila8.enfileira((java.lang.Object) fila12);
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila12.enfileira((java.lang.Object) fila18);
        fila4.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass22 = fila4.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass22);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) (byte) -1);
        boolean boolean30 = fila24.vazia();
        fila24.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) (byte) -1);
        boolean boolean38 = fila32.vazia();
        fila32.imprime();
        fila32.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        fila41.imprime();
        fila41.enfileira((java.lang.Object) 100L);
        fila32.enfileira((java.lang.Object) 100L);
        fila24.enfileira((java.lang.Object) 100L);
        boolean boolean48 = fila24.vazia();
        java.lang.Object obj49 = fila24.desenfileira();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 'a');
        java.lang.Object obj53 = fila50.desenfileira();
        ds.Fila fila54 = new ds.Fila();
        fila54.imprime();
        fila54.imprime();
        fila54.imprime();
        fila54.imprime();
        fila50.enfileira((java.lang.Object) fila54);
        boolean boolean60 = fila50.vazia();
        fila50.imprime();
        fila24.enfileira((java.lang.Object) fila50);
        fila0.enfileira((java.lang.Object) fila24);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 'a' + "'", obj53, 'a');
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        java.lang.Object obj19 = fila13.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 'a');
        java.lang.Object obj23 = fila20.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila20.enfileira((java.lang.Object) fila24);
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        fila30.enfileira((java.lang.Object) 10L);
        fila30.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass39 = fila36.getClass();
        fila30.enfileira((java.lang.Object) wildcardClass39);
        fila20.enfileira((java.lang.Object) wildcardClass39);
        fila13.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila13);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10L + "'", obj19, 10L);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 'a' + "'", obj23, 'a');
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 'a');
        fila18.imprime();
        java.lang.Class<?> wildcardClass22 = fila18.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass22);
        fila4.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) 'a');
        java.lang.Object obj11 = fila8.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila8.enfileira((java.lang.Object) fila12);
        boolean boolean18 = fila8.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        boolean boolean21 = fila19.vazia();
        boolean boolean22 = fila19.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Object obj26 = fila23.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila27.imprime();
        fila23.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila27.enfileira((java.lang.Object) fila33);
        fila19.enfileira((java.lang.Object) fila27);
        java.lang.Class<?> wildcardClass37 = fila19.getClass();
        fila8.enfileira((java.lang.Object) fila19);
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        boolean boolean41 = fila39.vazia();
        boolean boolean42 = fila39.vazia();
        fila39.imprime();
        fila8.enfileira((java.lang.Object) fila39);
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila45.imprime();
        fila45.imprime();
        fila45.imprime();
        java.lang.Class<?> wildcardClass50 = fila45.getClass();
        fila8.enfileira((java.lang.Object) fila45);
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 'a');
        java.lang.Object obj16 = fila13.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.imprime();
        fila17.imprime();
        fila13.enfileira((java.lang.Object) fila17);
        boolean boolean23 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) (byte) -1);
        boolean boolean31 = fila25.vazia();
        fila25.imprime();
        fila25.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila34.imprime();
        fila34.enfileira((java.lang.Object) 100L);
        fila25.enfileira((java.lang.Object) 100L);
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        fila40.imprime();
        fila40.imprime();
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        fila44.imprime();
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.enfileira((java.lang.Object) 10L);
        fila47.imprime();
        fila47.imprime();
        fila44.enfileira((java.lang.Object) fila47);
        fila40.enfileira((java.lang.Object) fila44);
        fila44.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj57 = fila44.desenfileira();
        java.lang.Class<?> wildcardClass58 = fila44.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass58);
        fila13.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        boolean boolean15 = fila13.vazia();
        boolean boolean16 = fila13.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) 'a');
        java.lang.Object obj20 = fila17.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila17.enfileira((java.lang.Object) fila21);
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        fila21.enfileira((java.lang.Object) fila27);
        fila13.enfileira((java.lang.Object) fila21);
        fila21.imprime();
        fila10.enfileira((java.lang.Object) fila21);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila37.enfileira((java.lang.Object) fila43);
        java.lang.Object obj46 = fila37.desenfileira();
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.imprime();
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        fila50.enfileira((java.lang.Object) 10L);
        fila50.imprime();
        fila50.imprime();
        fila47.enfileira((java.lang.Object) fila50);
        java.lang.Object obj57 = fila47.desenfileira();
        ds.Fila fila58 = new ds.Fila();
        fila58.imprime();
        fila58.enfileira((java.lang.Object) 10L);
        fila58.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila64 = new ds.Fila();
        fila64.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass67 = fila64.getClass();
        fila58.enfileira((java.lang.Object) wildcardClass67);
        fila47.enfileira((java.lang.Object) wildcardClass67);
        fila37.enfileira((java.lang.Object) fila47);
        fila21.enfileira((java.lang.Object) fila37);
        java.lang.Object obj72 = fila21.desenfileira();
        boolean boolean73 = fila21.vazia();
        boolean boolean74 = fila21.vazia();
        fila21.enfileira((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass77 = fila21.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) (byte) -1);
        boolean boolean12 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        java.lang.Object obj15 = fila6.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        boolean boolean20 = fila16.vazia();
        boolean boolean21 = fila16.vazia();
        fila16.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila16.desenfileira();
        fila16.imprime();
        fila6.enfileira((java.lang.Object) fila16);
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 'a');
        java.lang.Object obj30 = fila27.desenfileira();
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        fila31.imprime();
        fila31.imprime();
        fila27.enfileira((java.lang.Object) fila31);
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila31.enfileira((java.lang.Object) fila37);
        fila16.enfileira((java.lang.Object) fila37);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass42 = fila16.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 'a' + "'", obj30, 'a');
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 'a');
        java.lang.Object obj21 = fila18.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        fila18.enfileira((java.lang.Object) fila22);
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.enfileira((java.lang.Object) 10L);
        fila28.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass37 = fila34.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass37);
        fila18.enfileira((java.lang.Object) wildcardClass37);
        fila4.enfileira((java.lang.Object) fila18);
        boolean boolean41 = fila4.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        boolean boolean2 = fila0.vazia();
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 'a');
        java.lang.Object obj7 = fila4.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila4.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila8.enfileira((java.lang.Object) fila14);
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj18 = fila0.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) 'a');
        java.lang.Object obj22 = fila19.desenfileira();
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        fila23.imprime();
        fila23.imprime();
        fila23.imprime();
        fila19.enfileira((java.lang.Object) fila23);
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila23.enfileira((java.lang.Object) fila29);
        java.lang.Object obj32 = fila23.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila33.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.imprime();
        fila36.enfileira((java.lang.Object) 10L);
        fila36.imprime();
        fila36.imprime();
        fila33.enfileira((java.lang.Object) fila36);
        java.lang.Object obj43 = fila33.desenfileira();
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        fila44.enfileira((java.lang.Object) 10L);
        fila44.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass53 = fila50.getClass();
        fila44.enfileira((java.lang.Object) wildcardClass53);
        fila33.enfileira((java.lang.Object) wildcardClass53);
        fila23.enfileira((java.lang.Object) fila33);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) 'a');
        java.lang.Object obj60 = fila57.desenfileira();
        boolean boolean61 = fila57.vazia();
        fila23.enfileira((java.lang.Object) boolean61);
        fila0.enfileira((java.lang.Object) fila23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 'a' + "'", obj60, 'a');
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        boolean boolean15 = fila11.vazia();
        boolean boolean16 = fila11.vazia();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass19 = fila11.getClass();
        fila0.enfileira((java.lang.Object) fila11);
        fila0.enfileira((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 'a');
        java.lang.Object obj21 = fila18.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        fila22.imprime();
        fila18.enfileira((java.lang.Object) fila22);
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.enfileira((java.lang.Object) 10L);
        fila28.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass37 = fila34.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass37);
        fila18.enfileira((java.lang.Object) wildcardClass37);
        fila4.enfileira((java.lang.Object) fila18);
        java.lang.Object obj41 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass42 = fila4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 'a');
        fila18.imprime();
        java.lang.Class<?> wildcardClass22 = fila18.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass22);
        boolean boolean24 = fila4.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10L + "'", obj5, 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean17 = fila5.vazia();
        boolean boolean18 = fila5.vazia();
        boolean boolean19 = fila5.vazia();
        fila5.enfileira((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass22 = fila5.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 0);
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 10L);
        fila11.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) 10L);
        fila24.imprime();
        fila24.imprime();
        fila21.enfileira((java.lang.Object) fila24);
        fila17.enfileira((java.lang.Object) fila21);
        fila17.imprime();
        java.lang.Object obj33 = fila17.desenfileira();
        fila11.enfileira((java.lang.Object) fila17);
        fila11.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.imprime();
        boolean boolean38 = fila36.vazia();
        boolean boolean39 = fila36.vazia();
        fila36.imprime();
        fila36.imprime();
        fila11.enfileira((java.lang.Object) fila36);
        fila0.enfileira((java.lang.Object) fila36);
        boolean boolean44 = fila36.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        java.lang.Object obj25 = fila15.desenfileira();
        fila10.enfileira((java.lang.Object) fila15);
        boolean boolean27 = fila15.vazia();
        boolean boolean28 = fila15.vazia();
        boolean boolean29 = fila15.vazia();
        boolean boolean30 = fila15.vazia();
        fila3.enfileira((java.lang.Object) boolean30);
        boolean boolean32 = fila3.vazia();
        java.lang.Class<?> wildcardClass33 = fila3.getClass();
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila4.vazia();
        java.lang.Object obj16 = fila4.desenfileira();
        fila4.imprime();
        boolean boolean18 = fila4.vazia();
        boolean boolean19 = fila4.vazia();
        java.lang.Class<?> wildcardClass20 = fila4.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) -1);
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 0);
        boolean boolean18 = fila8.vazia();
        boolean boolean19 = fila8.vazia();
        fila0.enfileira((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila20.imprime();
        fila20.imprime();
        fila20.enfileira((java.lang.Object) (byte) -1);
        boolean boolean26 = fila20.vazia();
        fila20.imprime();
        fila20.imprime();
        boolean boolean29 = fila20.vazia();
        boolean boolean30 = fila20.vazia();
        fila14.enfileira((java.lang.Object) fila20);
        boolean boolean32 = fila14.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj13 = fila10.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila14.enfileira((java.lang.Object) fila20);
        java.lang.Object obj23 = fila14.desenfileira();
        fila0.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        fila26.enfileira((java.lang.Object) 10L);
        fila26.imprime();
        fila26.imprime();
        java.lang.Object obj32 = fila26.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) 'a');
        java.lang.Object obj36 = fila33.desenfileira();
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila37.imprime();
        fila33.enfileira((java.lang.Object) fila37);
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila43.enfileira((java.lang.Object) 10L);
        fila43.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass52 = fila49.getClass();
        fila43.enfileira((java.lang.Object) wildcardClass52);
        fila33.enfileira((java.lang.Object) wildcardClass52);
        fila26.enfileira((java.lang.Object) fila33);
        fila14.enfileira((java.lang.Object) fila33);
        boolean boolean57 = fila14.vazia();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10L + "'", obj32, 10L);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 'a');
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila16.enfileira((java.lang.Object) fila22);
        java.lang.Object obj25 = fila16.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 'a');
        fila16.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object obj31 = fila16.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.imprime();
        fila36.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        fila39.enfileira((java.lang.Object) 10L);
        fila39.imprime();
        fila39.imprime();
        fila36.enfileira((java.lang.Object) fila39);
        fila32.enfileira((java.lang.Object) fila36);
        fila36.imprime();
        fila36.imprime();
        java.lang.Object obj49 = fila36.desenfileira();
        fila16.enfileira((java.lang.Object) fila36);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Object obj14 = fila11.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila15.imprime();
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila21.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila21.enfileira((java.lang.Object) fila25);
        boolean boolean31 = fila21.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        boolean boolean34 = fila32.vazia();
        boolean boolean35 = fila32.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) 'a');
        java.lang.Object obj39 = fila36.desenfileira();
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        fila40.imprime();
        fila40.imprime();
        fila40.imprime();
        fila36.enfileira((java.lang.Object) fila40);
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        fila40.enfileira((java.lang.Object) fila46);
        fila32.enfileira((java.lang.Object) fila40);
        java.lang.Class<?> wildcardClass50 = fila32.getClass();
        fila21.enfileira((java.lang.Object) fila32);
        ds.Fila fila52 = new ds.Fila();
        fila52.imprime();
        boolean boolean54 = fila52.vazia();
        boolean boolean55 = fila52.vazia();
        fila52.imprime();
        fila21.enfileira((java.lang.Object) fila52);
        fila11.enfileira((java.lang.Object) fila52);
        boolean boolean59 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean59);
        ds.Fila fila61 = new ds.Fila();
        fila61.enfileira((java.lang.Object) 'a');
        java.lang.Object obj64 = fila61.desenfileira();
        boolean boolean65 = fila61.vazia();
        fila0.enfileira((java.lang.Object) fila61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = fila61.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 'a' + "'", obj64, 'a');
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 'a');
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        java.lang.Object obj22 = fila12.desenfileira();
        fila7.enfileira((java.lang.Object) fila12);
        fila0.enfileira((java.lang.Object) fila12);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 'a');
        java.lang.Object obj28 = fila25.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila25.enfileira((java.lang.Object) fila29);
        boolean boolean35 = fila25.vazia();
        java.lang.Class<?> wildcardClass36 = fila25.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 'a' + "'", obj28, 'a');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        fila14.imprime();
        boolean boolean39 = fila14.vazia();
        fila14.imprime();
        fila14.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj16 = fila0.desenfileira();
        boolean boolean17 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 'a');
        java.lang.Object obj41 = fila38.desenfileira();
        boolean boolean42 = fila38.vazia();
        fila4.enfileira((java.lang.Object) boolean42);
        boolean boolean44 = fila4.vazia();
        boolean boolean45 = fila4.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 'a' + "'", obj41, 'a');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 10L);
        fila12.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass21 = fila18.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass21);
        fila12.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        boolean boolean26 = fila24.vazia();
        boolean boolean27 = fila24.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 'a');
        java.lang.Object obj31 = fila28.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        fila32.imprime();
        fila32.imprime();
        fila32.imprime();
        fila28.enfileira((java.lang.Object) fila32);
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        fila32.enfileira((java.lang.Object) fila38);
        fila24.enfileira((java.lang.Object) fila32);
        java.lang.Class<?> wildcardClass42 = fila24.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass42);
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        fila44.imprime();
        fila44.imprime();
        ds.Fila fila48 = new ds.Fila();
        fila48.imprime();
        fila48.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        fila51.enfileira((java.lang.Object) 10L);
        fila51.imprime();
        fila51.imprime();
        fila48.enfileira((java.lang.Object) fila51);
        fila44.enfileira((java.lang.Object) fila48);
        java.lang.Object obj59 = fila44.desenfileira();
        boolean boolean60 = fila44.vazia();
        boolean boolean61 = fila44.vazia();
        fila44.imprime();
        java.lang.Class<?> wildcardClass63 = fila44.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass63);
        fila0.enfileira((java.lang.Object) wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean17 = fila5.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) 10L);
        fila21.imprime();
        fila21.imprime();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj28 = fila18.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.enfileira((java.lang.Object) 10L);
        fila29.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass38 = fila35.getClass();
        fila29.enfileira((java.lang.Object) wildcardClass38);
        fila18.enfileira((java.lang.Object) wildcardClass38);
        fila18.imprime();
        fila5.enfileira((java.lang.Object) fila18);
        java.lang.Object obj43 = fila18.desenfileira();
        fila18.imprime();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class ds.Fila");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 'a');
        java.lang.Object obj6 = fila3.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila3.enfileira((java.lang.Object) fila7);
        fila3.imprime();
        java.lang.Object obj14 = fila3.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila19.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 'a');
        fila19.enfileira((java.lang.Object) fila29);
        fila3.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila3);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 'a');
        java.lang.Object obj38 = fila35.desenfileira();
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        fila39.imprime();
        fila39.imprime();
        fila39.imprime();
        fila35.enfileira((java.lang.Object) fila39);
        boolean boolean45 = fila35.vazia();
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        boolean boolean48 = fila46.vazia();
        boolean boolean49 = fila46.vazia();
        ds.Fila fila50 = new ds.Fila();
        fila50.enfileira((java.lang.Object) 'a');
        java.lang.Object obj53 = fila50.desenfileira();
        ds.Fila fila54 = new ds.Fila();
        fila54.imprime();
        fila54.imprime();
        fila54.imprime();
        fila54.imprime();
        fila50.enfileira((java.lang.Object) fila54);
        ds.Fila fila60 = new ds.Fila();
        fila60.imprime();
        fila54.enfileira((java.lang.Object) fila60);
        fila46.enfileira((java.lang.Object) fila54);
        java.lang.Class<?> wildcardClass64 = fila46.getClass();
        fila35.enfileira((java.lang.Object) fila46);
        ds.Fila fila66 = new ds.Fila();
        fila66.imprime();
        boolean boolean68 = fila66.vazia();
        boolean boolean69 = fila66.vazia();
        fila66.imprime();
        fila35.enfileira((java.lang.Object) fila66);
        ds.Fila fila72 = new ds.Fila();
        fila72.imprime();
        fila72.enfileira((java.lang.Object) 10L);
        fila72.imprime();
        boolean boolean77 = fila72.vazia();
        fila66.enfileira((java.lang.Object) fila72);
        boolean boolean79 = fila72.vazia();
        java.lang.Object obj80 = fila72.desenfileira();
        fila3.enfileira(obj80);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 'a' + "'", obj53, 'a');
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 10L + "'", obj80, 10L);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj10 = fila7.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila11.enfileira((java.lang.Object) fila17);
        java.lang.Object obj20 = fila11.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        fila11.enfileira((java.lang.Object) fila21);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 'a');
        fila25.imprime();
        java.lang.Class<?> wildcardClass29 = fila25.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass29);
        fila0.enfileira((java.lang.Object) wildcardClass29);
        boolean boolean32 = fila0.vazia();
        java.lang.Class<?> wildcardClass33 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean17 = fila5.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) 10L);
        fila21.imprime();
        fila21.imprime();
        fila18.enfileira((java.lang.Object) fila21);
        java.lang.Object obj28 = fila18.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.enfileira((java.lang.Object) 10L);
        fila29.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass38 = fila35.getClass();
        fila29.enfileira((java.lang.Object) wildcardClass38);
        fila18.enfileira((java.lang.Object) wildcardClass38);
        fila18.imprime();
        fila5.enfileira((java.lang.Object) fila18);
        java.lang.Object obj43 = fila5.desenfileira();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass9 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 10L);
        fila12.enfileira((java.lang.Object) (short) 1);
        boolean boolean18 = fila12.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 'a');
        java.lang.Object obj23 = fila20.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila20.enfileira((java.lang.Object) fila24);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 'a');
        java.lang.Object obj33 = fila30.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila34.imprime();
        fila34.imprime();
        fila34.imprime();
        fila30.enfileira((java.lang.Object) fila34);
        boolean boolean40 = fila30.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        boolean boolean43 = fila41.vazia();
        boolean boolean44 = fila41.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 'a');
        java.lang.Object obj48 = fila45.desenfileira();
        ds.Fila fila49 = new ds.Fila();
        fila49.imprime();
        fila49.imprime();
        fila49.imprime();
        fila49.imprime();
        fila45.enfileira((java.lang.Object) fila49);
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        fila49.enfileira((java.lang.Object) fila55);
        fila41.enfileira((java.lang.Object) fila49);
        java.lang.Class<?> wildcardClass59 = fila41.getClass();
        fila30.enfileira((java.lang.Object) fila41);
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        boolean boolean63 = fila61.vazia();
        boolean boolean64 = fila61.vazia();
        fila61.imprime();
        fila30.enfileira((java.lang.Object) fila61);
        fila20.enfileira((java.lang.Object) fila61);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj69 = fila20.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 'a' + "'", obj23, 'a');
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 'a' + "'", obj33, 'a');
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 'a' + "'", obj48, 'a');
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        java.lang.Object obj38 = fila14.desenfileira();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 'a');
        java.lang.Object obj41 = fila38.desenfileira();
        boolean boolean42 = fila38.vazia();
        fila4.enfileira((java.lang.Object) boolean42);
        java.lang.Object obj44 = fila4.desenfileira();
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila45.imprime();
        fila45.imprime();
        fila45.enfileira((java.lang.Object) (byte) -1);
        boolean boolean51 = fila45.vazia();
        fila45.imprime();
        ds.Fila fila53 = new ds.Fila();
        fila53.imprime();
        fila45.enfileira((java.lang.Object) fila53);
        boolean boolean56 = fila53.vazia();
        fila4.enfileira((java.lang.Object) fila53);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 'a' + "'", obj41, 'a');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj10 = fila3.desenfileira();
        fila3.imprime();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 'a');
        java.lang.Object obj6 = fila3.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila7.imprime();
        fila3.enfileira((java.lang.Object) fila7);
        fila3.imprime();
        java.lang.Object obj14 = fila3.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila19.enfileira((java.lang.Object) fila25);
        java.lang.Object obj28 = fila19.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) 'a');
        fila19.enfileira((java.lang.Object) fila29);
        fila3.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila3);
        java.lang.Object obj35 = fila0.desenfileira();
        boolean boolean36 = fila0.vazia();
        boolean boolean37 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 'a' + "'", obj35, 'a');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 'a');
        fila4.enfileira((java.lang.Object) fila14);
        fila4.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila5.enfileira((java.lang.Object) 10L);
        fila5.imprime();
        java.lang.Object obj10 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) (byte) -1);
        boolean boolean18 = fila12.vazia();
        fila12.imprime();
        ds.Fila fila20 = new ds.Fila();
        fila20.imprime();
        fila12.enfileira((java.lang.Object) fila20);
        boolean boolean23 = fila20.vazia();
        java.lang.Class<?> wildcardClass24 = fila20.getClass();
        fila5.enfileira((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj13 = fila10.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila14.imprime();
        fila10.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila10.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        boolean boolean23 = fila21.vazia();
        boolean boolean24 = fila21.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 'a');
        java.lang.Object obj28 = fila25.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila25.enfileira((java.lang.Object) fila29);
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila29.enfileira((java.lang.Object) fila35);
        fila21.enfileira((java.lang.Object) fila29);
        java.lang.Class<?> wildcardClass39 = fila21.getClass();
        fila10.enfileira((java.lang.Object) fila21);
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        boolean boolean43 = fila41.vazia();
        boolean boolean44 = fila41.vazia();
        fila41.imprime();
        fila10.enfileira((java.lang.Object) fila41);
        fila0.enfileira((java.lang.Object) fila41);
        boolean boolean48 = fila0.vazia();
        java.lang.Object obj49 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 'a' + "'", obj28, 'a');
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        fila0.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        boolean boolean27 = fila25.vazia();
        boolean boolean28 = fila25.vazia();
        fila25.imprime();
        fila25.imprime();
        fila0.enfileira((java.lang.Object) fila25);
        java.lang.Object obj32 = fila0.desenfileira();
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila33.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.imprime();
        fila36.enfileira((java.lang.Object) 10L);
        fila36.imprime();
        fila36.imprime();
        fila33.enfileira((java.lang.Object) fila36);
        java.lang.Object obj43 = fila33.desenfileira();
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        fila44.imprime();
        fila44.imprime();
        ds.Fila fila48 = new ds.Fila();
        fila48.imprime();
        fila48.imprime();
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        fila51.enfileira((java.lang.Object) 10L);
        fila51.imprime();
        fila51.imprime();
        fila48.enfileira((java.lang.Object) fila51);
        fila44.enfileira((java.lang.Object) fila48);
        java.lang.Object obj59 = fila44.desenfileira();
        boolean boolean60 = fila44.vazia();
        boolean boolean61 = fila44.vazia();
        fila33.enfileira((java.lang.Object) fila44);
        java.lang.Object obj63 = fila33.desenfileira();
        fila0.enfileira(obj63);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10L + "'", obj32, 10L);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        java.lang.Object obj13 = fila4.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        fila14.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.imprime();
        fila17.imprime();
        fila14.enfileira((java.lang.Object) fila17);
        java.lang.Object obj24 = fila14.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 10L);
        fila25.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass34 = fila31.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass34);
        fila14.enfileira((java.lang.Object) wildcardClass34);
        fila4.enfileira((java.lang.Object) fila14);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) 'a');
        java.lang.Object obj41 = fila38.desenfileira();
        boolean boolean42 = fila38.vazia();
        fila4.enfileira((java.lang.Object) boolean42);
        java.lang.Object obj44 = fila4.desenfileira();
        java.lang.Object obj45 = fila4.desenfileira();
        boolean boolean46 = fila4.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 'a' + "'", obj41, 'a');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + true + "'", obj45, true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj9 = fila0.desenfileira();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        fila10.imprime();
        boolean boolean14 = fila10.vazia();
        boolean boolean15 = fila10.vazia();
        fila10.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        java.lang.Object obj24 = fila21.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        fila21.enfileira((java.lang.Object) fila25);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila25.enfileira((java.lang.Object) fila31);
        fila10.enfileira((java.lang.Object) fila31);
        java.lang.Object obj35 = fila10.desenfileira();
        ds.Fila fila36 = new ds.Fila();
        fila36.imprime();
        fila36.imprime();
        fila36.imprime();
        fila36.enfileira((java.lang.Object) (byte) -1);
        boolean boolean42 = fila36.vazia();
        fila36.imprime();
        fila36.imprime();
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        fila45.imprime();
        fila45.enfileira((java.lang.Object) 100L);
        fila36.enfileira((java.lang.Object) 100L);
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        fila51.imprime();
        fila51.imprime();
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        fila55.imprime();
        ds.Fila fila58 = new ds.Fila();
        fila58.imprime();
        fila58.enfileira((java.lang.Object) 10L);
        fila58.imprime();
        fila58.imprime();
        fila55.enfileira((java.lang.Object) fila58);
        fila51.enfileira((java.lang.Object) fila55);
        fila55.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj68 = fila55.desenfileira();
        java.lang.Class<?> wildcardClass69 = fila55.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass69);
        fila10.enfileira((java.lang.Object) fila36);
        java.lang.Object obj72 = fila36.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) -1 + "'", obj72, (byte) -1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10L + "'", obj6, 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj10 = fila7.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 10L);
        fila17.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass26 = fila23.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass26);
        fila7.enfileira((java.lang.Object) wildcardClass26);
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Object obj31 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj10 = fila7.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila11.enfileira((java.lang.Object) fila17);
        java.lang.Object obj20 = fila11.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        fila11.enfileira((java.lang.Object) fila21);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 'a');
        fila25.imprime();
        java.lang.Class<?> wildcardClass29 = fila25.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass29);
        fila0.enfileira((java.lang.Object) wildcardClass29);
        boolean boolean32 = fila0.vazia();
        java.lang.Object obj33 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class ds.Fila");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) 'a');
        java.lang.Object obj16 = fila13.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.imprime();
        fila17.imprime();
        fila13.enfileira((java.lang.Object) fila17);
        boolean boolean23 = fila13.vazia();
        fila10.enfileira((java.lang.Object) fila13);
        boolean boolean25 = fila13.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass9 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass9);
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 10L);
        fila12.enfileira((java.lang.Object) (short) 1);
        boolean boolean18 = fila12.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 'a');
        java.lang.Object obj23 = fila20.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila24.imprime();
        fila20.enfileira((java.lang.Object) fila24);
        fila0.enfileira((java.lang.Object) fila20);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 'a' + "'", obj23, 'a');
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 'a');
        java.lang.Object obj8 = fila5.desenfileira();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila9.imprime();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila5.desenfileira();
        fila0.enfileira((java.lang.Object) fila5);
        fila0.imprime();
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        boolean boolean13 = fila4.vazia();
        boolean boolean14 = fila4.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) (byte) -1);
        boolean boolean14 = fila8.vazia();
        fila8.imprime();
        fila8.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 100L);
        fila8.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 'a');
        java.lang.Object obj27 = fila24.desenfileira();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila28.imprime();
        fila24.enfileira((java.lang.Object) fila28);
        boolean boolean34 = fila24.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        boolean boolean37 = fila35.vazia();
        boolean boolean38 = fila35.vazia();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) 'a');
        java.lang.Object obj42 = fila39.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila43.imprime();
        fila43.imprime();
        fila43.imprime();
        fila39.enfileira((java.lang.Object) fila43);
        ds.Fila fila49 = new ds.Fila();
        fila49.imprime();
        fila43.enfileira((java.lang.Object) fila49);
        fila35.enfileira((java.lang.Object) fila43);
        java.lang.Class<?> wildcardClass53 = fila35.getClass();
        fila24.enfileira((java.lang.Object) fila35);
        ds.Fila fila55 = new ds.Fila();
        fila55.imprime();
        boolean boolean57 = fila55.vazia();
        boolean boolean58 = fila55.vazia();
        fila55.imprime();
        fila24.enfileira((java.lang.Object) fila55);
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        fila61.enfileira((java.lang.Object) 10L);
        fila61.imprime();
        boolean boolean66 = fila61.vazia();
        fila55.enfileira((java.lang.Object) fila61);
        fila0.enfileira((java.lang.Object) fila55);
        java.lang.Class<?> wildcardClass69 = fila55.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 'a' + "'", obj27, 'a');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 'a' + "'", obj42, 'a');
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila7.enfileira((java.lang.Object) 10L);
        fila7.imprime();
        fila7.imprime();
        fila4.enfileira((java.lang.Object) fila7);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj16 = fila0.desenfileira();
        boolean boolean17 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass19 = fila0.getClass();
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        fila3.enfileira((java.lang.Object) 10L);
        fila3.imprime();
        fila3.imprime();
        fila0.enfileira((java.lang.Object) fila3);
        fila0.enfileira((java.lang.Object) "");
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 'a');
        java.lang.Object obj18 = fila15.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila19.imprime();
        fila15.enfileira((java.lang.Object) fila19);
        boolean boolean25 = fila15.vazia();
        fila15.imprime();
        fila15.imprime();
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj29 = fila15.desenfileira();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 'a');
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila4.imprime();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 'a');
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila16.imprime();
        fila12.enfileira((java.lang.Object) fila16);
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        fila16.enfileira((java.lang.Object) fila22);
        java.lang.Object obj25 = fila16.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) 'a');
        fila16.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila16);
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        fila31.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila34.enfileira((java.lang.Object) 10L);
        fila34.imprime();
        fila34.imprime();
        fila31.enfileira((java.lang.Object) fila34);
        java.lang.Object obj41 = fila34.desenfileira();
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 'a');
        java.lang.Object obj45 = fila42.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        fila46.imprime();
        fila46.imprime();
        fila46.imprime();
        fila42.enfileira((java.lang.Object) fila46);
        ds.Fila fila52 = new ds.Fila();
        fila52.imprime();
        fila46.enfileira((java.lang.Object) fila52);
        fila34.enfileira((java.lang.Object) fila46);
        fila16.enfileira((java.lang.Object) fila34);
        fila34.imprime();
        java.lang.Object obj58 = null;
        fila34.enfileira(obj58);
        // The following exception was thrown during execution in test generation
        try {
            fila34.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10L + "'", obj41, 10L);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 'a' + "'", obj45, 'a');
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) 'a');
        java.lang.Object obj10 = fila7.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila11.enfileira((java.lang.Object) fila17);
        java.lang.Object obj20 = fila11.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 'a');
        fila11.enfileira((java.lang.Object) fila21);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) 'a');
        fila25.imprime();
        java.lang.Class<?> wildcardClass29 = fila25.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass29);
        fila0.enfileira((java.lang.Object) wildcardClass29);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10L);
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        fila6.imprime();
        fila6.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        fila10.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 10L);
        fila13.imprime();
        fila13.imprime();
        fila10.enfileira((java.lang.Object) fila13);
        fila6.enfileira((java.lang.Object) fila10);
        fila6.imprime();
        java.lang.Object obj22 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        fila24.enfileira((java.lang.Object) 10L);
        fila24.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass33 = fila30.getClass();
        fila24.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila24.desenfileira();
        fila0.enfileira(obj35);
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean39 = fila0.vazia();
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10L + "'", obj35, 10L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila9.imprime();
        fila9.enfileira((java.lang.Object) 100L);
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila15.enfileira((java.lang.Object) 10L);
        fila15.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        fila25.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        fila28.enfileira((java.lang.Object) 10L);
        fila28.imprime();
        fila28.imprime();
        fila25.enfileira((java.lang.Object) fila28);
        fila21.enfileira((java.lang.Object) fila25);
        fila21.imprime();
        java.lang.Object obj37 = fila21.desenfileira();
        fila15.enfileira((java.lang.Object) fila21);
        ds.Fila fila39 = new ds.Fila();
        fila39.imprime();
        fila39.enfileira((java.lang.Object) 10L);
        fila39.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass48 = fila45.getClass();
        fila39.enfileira((java.lang.Object) wildcardClass48);
        java.lang.Object obj50 = fila39.desenfileira();
        fila15.enfileira(obj50);
        fila0.enfileira((java.lang.Object) fila15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 10L + "'", obj50, 10L);
    }
}

