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
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean10 = fila0.vazia();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = null;
        fila0.enfileira(obj15);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        fila18.imprime();
        fila1.enfileira((java.lang.Object) fila18);
        java.lang.Class<?> wildcardClass29 = fila1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        fila18.imprime();
        fila1.enfileira((java.lang.Object) fila18);
        // The following exception was thrown during execution in test generation
        try {
            fila1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        fila0.imprime();
        java.lang.Object obj28 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        java.lang.Object obj26 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 1 + "'", obj3, (short) 1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (short) 1);
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Class<?> wildcardClass18 = fila13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj8 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean18 = fila1.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
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
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        java.lang.Object obj19 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) -1);
        fila23.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        java.lang.Class<?> wildcardClass30 = fila28.getClass();
        fila23.enfileira((java.lang.Object) wildcardClass30);
        java.lang.Object obj32 = fila23.desenfileira();
        fila23.imprime();
        boolean boolean34 = fila23.vazia();
        fila11.enfileira((java.lang.Object) boolean34);
        fila0.enfileira((java.lang.Object) boolean34);
        java.lang.Class<?> wildcardClass37 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1L + "'", obj19, 1L);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila0.desenfileira();
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.enfileira((java.lang.Object) '4');
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        java.lang.Class<?> wildcardClass32 = fila30.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = fila25.desenfileira();
        fila25.imprime();
        java.lang.Object obj36 = new java.lang.Object();
        fila25.enfileira(obj36);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (byte) -1);
        fila38.imprime();
        fila38.imprime();
        boolean boolean43 = fila38.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (byte) -1);
        fila38.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj48 = fila38.desenfileira();
        fila25.enfileira((java.lang.Object) fila38);
        boolean boolean50 = fila38.vazia();
        fila38.imprime();
        java.lang.Class<?> wildcardClass52 = fila38.getClass();
        fila13.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        java.lang.Object obj18 = fila13.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila19.imprime();
        fila19.imprime();
        fila13.enfileira((java.lang.Object) fila19);
        fila13.enfileira((java.lang.Object) 'a');
        fila0.enfileira((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean15 = fila0.vazia();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj29 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "class ds.Fila");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        boolean boolean16 = fila0.vazia();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        java.lang.Class<?> wildcardClass23 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass12 = fila6.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '4' + "'", obj7, '4');
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj25 = fila0.desenfileira();
        java.lang.Object obj26 = fila0.desenfileira();
        java.lang.Object obj27 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class ds.Fila");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        fila0.enfileira(obj3);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = fila6.desenfileira();
        fila6.imprime();
        java.lang.Class<?> wildcardClass17 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) -1);
        fila20.enfileira((java.lang.Object) '4');
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        java.lang.Class<?> wildcardClass27 = fila25.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = fila20.desenfileira();
        fila20.imprime();
        java.lang.Object obj31 = new java.lang.Object();
        fila20.enfileira(obj31);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (byte) -1);
        fila33.imprime();
        fila33.imprime();
        boolean boolean38 = fila33.vazia();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila33.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = fila33.desenfileira();
        fila20.enfileira((java.lang.Object) fila33);
        fila20.imprime();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (byte) -1);
        fila46.enfileira((java.lang.Object) '4');
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        java.lang.Class<?> wildcardClass53 = fila51.getClass();
        fila46.enfileira((java.lang.Object) wildcardClass53);
        java.lang.Object obj55 = fila46.desenfileira();
        boolean boolean56 = fila46.vazia();
        fila20.enfileira((java.lang.Object) fila46);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj59 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass60 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) 1 + "'", obj59, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) -1);
        fila8.enfileira((java.lang.Object) '4');
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        java.lang.Class<?> wildcardClass15 = fila13.getClass();
        fila8.enfileira((java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = fila8.desenfileira();
        java.lang.Object obj18 = null;
        fila8.enfileira(obj18);
        java.lang.Object obj20 = fila8.desenfileira();
        fila8.enfileira((java.lang.Object) (byte) -1);
        boolean boolean23 = fila8.vazia();
        fila7.enfileira((java.lang.Object) fila8);
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass26 = fila8.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        // The following exception was thrown during execution in test generation
        try {
            fila1.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        boolean boolean13 = fila0.vazia();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.imprime();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.imprime();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 1L);
        java.lang.Object obj19 = fila12.desenfileira();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj26 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) '4');
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) (-1L));
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) 10.0d);
        boolean boolean29 = fila23.vazia();
        fila11.enfileira((java.lang.Object) boolean29);
        fila0.enfileira((java.lang.Object) boolean29);
        fila0.imprime();
        java.lang.Class<?> wildcardClass33 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        boolean boolean18 = fila1.vazia();
        java.lang.Class<?> wildcardClass19 = fila1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) -1);
        fila5.imprime();
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj11 = fila5.desenfileira();
        fila5.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 1L);
        java.lang.Object obj20 = fila13.desenfileira();
        java.lang.Object obj21 = fila13.desenfileira();
        fila13.imprime();
        fila13.imprime();
        fila13.imprime();
        fila13.imprime();
        fila5.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj28 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1L + "'", obj21, 1L);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        fila13.imprime();
        fila13.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) -1);
        fila8.enfileira((java.lang.Object) '4');
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        java.lang.Class<?> wildcardClass15 = fila13.getClass();
        fila8.enfileira((java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = fila8.desenfileira();
        java.lang.Object obj18 = null;
        fila8.enfileira(obj18);
        java.lang.Object obj20 = fila8.desenfileira();
        fila8.enfileira((java.lang.Object) (byte) -1);
        boolean boolean23 = fila8.vazia();
        fila7.enfileira((java.lang.Object) fila8);
        fila0.enfileira((java.lang.Object) fila8);
        // The following exception was thrown during execution in test generation
        try {
            fila8.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        fila13.imprime();
        boolean boolean16 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean16);
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.imprime();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 1L);
        java.lang.Object obj19 = fila12.desenfileira();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj26 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        fila0.enfileira(obj3);
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        fila13.imprime();
        boolean boolean26 = fila13.vazia();
        fila13.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean15 = fila0.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila16.enfileira(obj19);
        fila16.imprime();
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass22 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.imprime();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 1L);
        java.lang.Object obj19 = fila12.desenfileira();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass26 = fila12.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        boolean boolean14 = fila12.vazia();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        fila18.imprime();
        fila12.enfileira((java.lang.Object) fila18);
        java.lang.Object obj29 = fila18.desenfileira();
        java.lang.Object obj30 = fila18.desenfileira();
        fila0.enfileira(obj30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '4' + "'", obj30, '4');
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean20 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
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
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) '4');
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = fila4.desenfileira();
        fila4.imprime();
        boolean boolean15 = fila4.vazia();
        java.lang.Object obj16 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass18 = fila4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj17 = fila6.desenfileira();
        boolean boolean18 = fila6.vazia();
        boolean boolean19 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (short) 1);
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class ds.Fila");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = null;
        fila0.enfileira(obj12);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '4' + "'", obj7, '4');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        fila26.enfileira(obj29);
        fila0.enfileira((java.lang.Object) fila26);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.imprime();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 1L);
        java.lang.Object obj19 = fila12.desenfileira();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        fila0.imprime();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        fila0.imprime();
        boolean boolean28 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila6.enfileira(obj9);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Class<?> wildcardClass23 = fila12.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass23);
        boolean boolean25 = fila6.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) '4');
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        java.lang.Class<?> wildcardClass33 = fila31.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila26.desenfileira();
        fila26.imprime();
        java.lang.Object obj37 = new java.lang.Object();
        fila26.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.imprime();
        fila39.imprime();
        boolean boolean44 = fila39.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = fila39.desenfileira();
        fila26.enfileira((java.lang.Object) fila39);
        fila26.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (byte) -1);
        fila52.enfileira((java.lang.Object) '4');
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        java.lang.Class<?> wildcardClass59 = fila57.getClass();
        fila52.enfileira((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = fila52.desenfileira();
        boolean boolean62 = fila52.vazia();
        fila26.enfileira((java.lang.Object) fila52);
        fila6.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        java.lang.Object obj66 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        fila19.enfileira(obj22);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.enfileira((java.lang.Object) '4');
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        java.lang.Class<?> wildcardClass32 = fila30.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = fila25.desenfileira();
        fila25.imprime();
        java.lang.Class<?> wildcardClass36 = fila25.getClass();
        fila19.enfileira((java.lang.Object) wildcardClass36);
        boolean boolean38 = fila19.vazia();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) '4');
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        java.lang.Class<?> wildcardClass46 = fila44.getClass();
        fila39.enfileira((java.lang.Object) wildcardClass46);
        java.lang.Object obj48 = fila39.desenfileira();
        fila39.imprime();
        java.lang.Object obj50 = new java.lang.Object();
        fila39.enfileira(obj50);
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (byte) -1);
        fila52.imprime();
        fila52.imprime();
        boolean boolean57 = fila52.vazia();
        ds.Fila fila58 = new ds.Fila();
        fila58.enfileira((java.lang.Object) (byte) -1);
        fila52.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj62 = fila52.desenfileira();
        fila39.enfileira((java.lang.Object) fila52);
        fila39.imprime();
        ds.Fila fila65 = new ds.Fila();
        fila65.enfileira((java.lang.Object) (byte) -1);
        fila65.enfileira((java.lang.Object) '4');
        ds.Fila fila70 = new ds.Fila();
        fila70.imprime();
        java.lang.Class<?> wildcardClass72 = fila70.getClass();
        fila65.enfileira((java.lang.Object) wildcardClass72);
        java.lang.Object obj74 = fila65.desenfileira();
        boolean boolean75 = fila65.vazia();
        fila39.enfileira((java.lang.Object) fila65);
        fila19.enfileira((java.lang.Object) fila39);
        fila13.enfileira((java.lang.Object) fila39);
        fila0.enfileira((java.lang.Object) fila39);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) -1 + "'", obj62, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (byte) -1 + "'", obj74, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila0.vazia();
        boolean boolean16 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass20 = fila17.getClass();
        fila0.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean16 = fila0.vazia();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        java.lang.Object obj31 = fila25.desenfileira();
        fila0.enfileira((java.lang.Object) fila25);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (byte) -1);
        fila33.imprime();
        fila33.imprime();
        fila33.enfileira((java.lang.Object) 1L);
        java.lang.Object obj40 = fila33.desenfileira();
        java.lang.Object obj41 = fila33.desenfileira();
        fila33.imprime();
        fila33.imprime();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (byte) -1);
        fila44.enfileira((java.lang.Object) '4');
        ds.Fila fila49 = new ds.Fila();
        fila49.imprime();
        java.lang.Class<?> wildcardClass51 = fila49.getClass();
        fila44.enfileira((java.lang.Object) wildcardClass51);
        fila44.imprime();
        fila33.enfileira((java.lang.Object) fila44);
        java.lang.Object obj55 = fila33.desenfileira();
        boolean boolean56 = fila33.vazia();
        java.lang.Class<?> wildcardClass57 = fila33.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1L + "'", obj41, 1L);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        java.lang.Object obj19 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) -1);
        fila23.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        java.lang.Class<?> wildcardClass30 = fila28.getClass();
        fila23.enfileira((java.lang.Object) wildcardClass30);
        java.lang.Object obj32 = fila23.desenfileira();
        fila23.imprime();
        boolean boolean34 = fila23.vazia();
        fila11.enfileira((java.lang.Object) boolean34);
        fila0.enfileira((java.lang.Object) boolean34);
        boolean boolean37 = fila0.vazia();
        java.lang.Class<?> wildcardClass38 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1L + "'", obj19, 1L);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.imprime();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 1L);
        java.lang.Object obj19 = fila12.desenfileira();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj26 = fila0.desenfileira();
        boolean boolean27 = fila0.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.imprime();
        fila28.imprime();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Object obj35 = fila28.desenfileira();
        java.lang.Object obj36 = fila28.desenfileira();
        fila28.imprime();
        fila28.imprime();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) '4');
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        java.lang.Class<?> wildcardClass46 = fila44.getClass();
        fila39.enfileira((java.lang.Object) wildcardClass46);
        fila39.imprime();
        fila28.enfileira((java.lang.Object) fila39);
        fila39.imprime();
        java.lang.Object obj51 = fila39.desenfileira();
        fila0.enfileira(obj51);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1L + "'", obj36, 1L);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean25 = fila13.vazia();
        fila13.imprime();
        java.lang.Object obj27 = fila13.desenfileira();
        fila13.imprime();
        boolean boolean29 = fila13.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Class<?> wildcardClass18 = fila1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean15 = fila0.vazia();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) -1);
        fila16.enfileira((java.lang.Object) '4');
        ds.Fila fila21 = new ds.Fila();
        fila21.imprime();
        java.lang.Class<?> wildcardClass23 = fila21.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass23);
        boolean boolean25 = fila16.vazia();
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (short) 1);
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean18 = fila13.vazia();
        java.lang.Class<?> wildcardClass19 = fila13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj17 = fila6.desenfileira();
        fila6.imprime();
        java.lang.Object obj19 = fila6.desenfileira();
        boolean boolean20 = fila6.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        fila6.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        boolean boolean16 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) '4');
        boolean boolean20 = fila14.vazia();
        java.lang.Class<?> wildcardClass21 = fila14.getClass();
        fila6.enfileira((java.lang.Object) fila14);
        java.lang.Object obj23 = fila6.desenfileira();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) -1);
        fila24.enfileira((java.lang.Object) '4');
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        java.lang.Class<?> wildcardClass31 = fila29.getClass();
        fila24.enfileira((java.lang.Object) wildcardClass31);
        boolean boolean33 = fila24.vazia();
        boolean boolean34 = fila24.vazia();
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) -1);
        fila35.enfileira((java.lang.Object) '4');
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        java.lang.Class<?> wildcardClass42 = fila40.getClass();
        fila35.enfileira((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = fila35.desenfileira();
        fila35.enfileira((java.lang.Object) (-1L));
        ds.Fila fila47 = new ds.Fila();
        fila47.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj50 = fila47.desenfileira();
        fila47.enfileira((java.lang.Object) 10.0d);
        boolean boolean53 = fila47.vazia();
        fila35.enfileira((java.lang.Object) boolean53);
        fila24.enfileira((java.lang.Object) boolean53);
        fila6.enfileira((java.lang.Object) boolean53);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (byte) -1 + "'", obj50, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        java.lang.Object obj18 = fila11.desenfileira();
        java.lang.Object obj19 = fila11.desenfileira();
        fila11.imprime();
        fila11.imprime();
        fila11.imprime();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) -1);
        fila23.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.imprime();
        java.lang.Class<?> wildcardClass30 = fila28.getClass();
        fila23.enfileira((java.lang.Object) wildcardClass30);
        java.lang.Object obj32 = fila23.desenfileira();
        fila23.imprime();
        boolean boolean34 = fila23.vazia();
        fila11.enfileira((java.lang.Object) boolean34);
        fila0.enfileira((java.lang.Object) boolean34);
        boolean boolean37 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1L + "'", obj19, 1L);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) -1);
        fila8.imprime();
        fila8.imprime();
        fila8.enfileira((java.lang.Object) 1L);
        java.lang.Object obj15 = fila8.desenfileira();
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila8.imprime();
        fila0.enfileira((java.lang.Object) fila8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1L + "'", obj16, 1L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj25 = fila0.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (byte) -1);
        fila27.enfileira((java.lang.Object) '4');
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        java.lang.Class<?> wildcardClass34 = fila32.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass34);
        java.lang.Object obj36 = fila27.desenfileira();
        java.lang.Object obj37 = null;
        fila27.enfileira(obj37);
        java.lang.Object obj39 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (byte) -1);
        boolean boolean42 = fila27.vazia();
        fila26.enfileira((java.lang.Object) fila27);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (byte) -1);
        fila44.enfileira((java.lang.Object) '4');
        ds.Fila fila49 = new ds.Fila();
        fila49.imprime();
        java.lang.Class<?> wildcardClass51 = fila49.getClass();
        fila44.enfileira((java.lang.Object) wildcardClass51);
        fila44.imprime();
        fila27.enfileira((java.lang.Object) fila44);
        boolean boolean55 = fila44.vazia();
        java.lang.Object obj56 = null;
        fila44.enfileira(obj56);
        java.lang.Object obj58 = fila44.desenfileira();
        java.lang.Object obj59 = fila44.desenfileira();
        fila0.enfileira((java.lang.Object) fila44);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '4' + "'", obj39, '4');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) -1 + "'", obj58, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + '4' + "'", obj59, '4');
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) -1);
        fila20.enfileira((java.lang.Object) '4');
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        java.lang.Class<?> wildcardClass27 = fila25.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = fila20.desenfileira();
        java.lang.Object obj30 = null;
        fila20.enfileira(obj30);
        java.lang.Object obj32 = fila20.desenfileira();
        fila20.enfileira((java.lang.Object) (byte) -1);
        boolean boolean35 = fila20.vazia();
        fila19.enfileira((java.lang.Object) fila20);
        fila12.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila20);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        fila39.enfileira(obj42);
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila45.enfileira((java.lang.Object) '4');
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        java.lang.Class<?> wildcardClass52 = fila50.getClass();
        fila45.enfileira((java.lang.Object) wildcardClass52);
        java.lang.Object obj54 = fila45.desenfileira();
        fila45.imprime();
        java.lang.Class<?> wildcardClass56 = fila45.getClass();
        fila39.enfileira((java.lang.Object) wildcardClass56);
        boolean boolean58 = fila39.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) -1);
        fila59.enfileira((java.lang.Object) '4');
        ds.Fila fila64 = new ds.Fila();
        fila64.imprime();
        java.lang.Class<?> wildcardClass66 = fila64.getClass();
        fila59.enfileira((java.lang.Object) wildcardClass66);
        java.lang.Object obj68 = fila59.desenfileira();
        fila59.imprime();
        java.lang.Object obj70 = new java.lang.Object();
        fila59.enfileira(obj70);
        ds.Fila fila72 = new ds.Fila();
        fila72.enfileira((java.lang.Object) (byte) -1);
        fila72.imprime();
        fila72.imprime();
        boolean boolean77 = fila72.vazia();
        ds.Fila fila78 = new ds.Fila();
        fila78.enfileira((java.lang.Object) (byte) -1);
        fila72.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj82 = fila72.desenfileira();
        fila59.enfileira((java.lang.Object) fila72);
        fila59.imprime();
        ds.Fila fila85 = new ds.Fila();
        fila85.enfileira((java.lang.Object) (byte) -1);
        fila85.enfileira((java.lang.Object) '4');
        ds.Fila fila90 = new ds.Fila();
        fila90.imprime();
        java.lang.Class<?> wildcardClass92 = fila90.getClass();
        fila85.enfileira((java.lang.Object) wildcardClass92);
        java.lang.Object obj94 = fila85.desenfileira();
        boolean boolean95 = fila85.vazia();
        fila59.enfileira((java.lang.Object) fila85);
        fila39.enfileira((java.lang.Object) fila59);
        boolean boolean98 = fila59.vazia();
        fila20.enfileira((java.lang.Object) boolean98);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '4' + "'", obj32, '4');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (byte) -1 + "'", obj68, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (byte) -1 + "'", obj82, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertEquals("'" + obj94 + "' != '" + (byte) -1 + "'", obj94, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) -1);
        fila16.imprime();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 1L);
        java.lang.Object obj23 = fila16.desenfileira();
        java.lang.Object obj24 = fila16.desenfileira();
        fila16.imprime();
        java.lang.Class<?> wildcardClass26 = fila16.getClass();
        fila0.enfileira((java.lang.Object) fila16);
        fila16.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1L + "'", obj24, 1L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.enfileira((java.lang.Object) '4');
        java.lang.Object obj22 = fila11.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) -1);
        fila7.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila0.enfileira(obj14);
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        fila0.enfileira(obj3);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = fila6.desenfileira();
        fila6.imprime();
        java.lang.Class<?> wildcardClass17 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        fila0.imprime();
        boolean boolean20 = fila0.vazia();
        java.lang.Object obj21 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 1 + "'", obj21, (short) 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (short) 1);
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = fila18.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.imprime();
        fila22.imprime();
        boolean boolean27 = fila22.vazia();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) fila22);
        boolean boolean33 = fila18.vazia();
        fila0.enfileira((java.lang.Object) boolean33);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) -1);
        fila16.imprime();
        fila16.imprime();
        boolean boolean21 = fila16.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila16.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) fila16);
        fila12.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.imprime();
        fila28.imprime();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Object obj35 = fila28.desenfileira();
        java.lang.Object obj36 = fila28.desenfileira();
        fila28.imprime();
        java.lang.Class<?> wildcardClass38 = fila28.getClass();
        fila12.enfileira((java.lang.Object) fila28);
        fila12.enfileira((java.lang.Object) true);
        fila0.enfileira((java.lang.Object) true);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (byte) -1);
        fila43.enfileira((java.lang.Object) '4');
        ds.Fila fila48 = new ds.Fila();
        fila48.imprime();
        java.lang.Class<?> wildcardClass50 = fila48.getClass();
        fila43.enfileira((java.lang.Object) wildcardClass50);
        java.lang.Object obj52 = fila43.desenfileira();
        fila43.imprime();
        java.lang.Class<?> wildcardClass54 = fila43.getClass();
        fila0.enfileira((java.lang.Object) fila43);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1L + "'", obj36, 1L);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) -1 + "'", obj52, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean14 = fila6.vazia();
        java.lang.Class<?> wildcardClass15 = fila6.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj29 = fila0.desenfileira();
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "class ds.Fila");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = fila10.desenfileira();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila16.enfileira(obj19);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        java.lang.Class<?> wildcardClass29 = fila27.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = fila22.desenfileira();
        fila22.imprime();
        java.lang.Class<?> wildcardClass33 = fila22.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass33);
        boolean boolean35 = fila16.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) -1);
        fila36.enfileira((java.lang.Object) '4');
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        java.lang.Class<?> wildcardClass43 = fila41.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass43);
        java.lang.Object obj45 = fila36.desenfileira();
        fila36.imprime();
        java.lang.Object obj47 = new java.lang.Object();
        fila36.enfileira(obj47);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (byte) -1);
        fila49.imprime();
        fila49.imprime();
        boolean boolean54 = fila49.vazia();
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) -1);
        fila49.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj59 = fila49.desenfileira();
        fila36.enfileira((java.lang.Object) fila49);
        fila36.imprime();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) (byte) -1);
        fila62.enfileira((java.lang.Object) '4');
        ds.Fila fila67 = new ds.Fila();
        fila67.imprime();
        java.lang.Class<?> wildcardClass69 = fila67.getClass();
        fila62.enfileira((java.lang.Object) wildcardClass69);
        java.lang.Object obj71 = fila62.desenfileira();
        boolean boolean72 = fila62.vazia();
        fila36.enfileira((java.lang.Object) fila62);
        fila16.enfileira((java.lang.Object) fila36);
        fila10.enfileira((java.lang.Object) fila36);
        fila10.imprime();
        fila6.enfileira((java.lang.Object) fila10);
        ds.Fila fila78 = new ds.Fila();
        fila78.imprime();
        fila78.imprime();
        boolean boolean81 = fila78.vazia();
        java.lang.Class<?> wildcardClass82 = fila78.getClass();
        fila6.enfileira((java.lang.Object) fila78);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) -1 + "'", obj59, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (byte) -1 + "'", obj71, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        fila0.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila19.vazia();
        java.lang.Class<?> wildcardClass23 = fila19.getClass();
        fila0.enfileira((java.lang.Object) fila19);
        fila19.imprime();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        fila0.enfileira(obj3);
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Object obj23 = new java.lang.Object();
        fila12.enfileira(obj23);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        boolean boolean30 = fila25.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) -1);
        fila25.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = fila25.desenfileira();
        fila12.enfileira((java.lang.Object) fila25);
        java.lang.Class<?> wildcardClass37 = fila12.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass37);
        boolean boolean39 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Class<?> wildcardClass13 = fila12.getClass();
        fila0.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) (byte) -1);
        fila9.imprime();
        fila9.imprime();
        java.lang.Object obj14 = fila9.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (byte) -1);
        fila15.imprime();
        fila15.imprime();
        fila9.enfileira((java.lang.Object) fila15);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) -1);
        fila21.imprime();
        fila21.imprime();
        fila21.enfileira((java.lang.Object) 1L);
        java.lang.Object obj28 = fila21.desenfileira();
        java.lang.Object obj29 = fila21.desenfileira();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila21.imprime();
        fila9.enfileira((java.lang.Object) fila21);
        fila0.enfileira((java.lang.Object) fila21);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) -1 + "'", obj28, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1L + "'", obj29, 1L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj15 = fila10.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) 1L);
        java.lang.Object obj13 = fila6.desenfileira();
        java.lang.Object obj14 = fila6.desenfileira();
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass18 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        boolean boolean21 = fila12.vazia();
        java.lang.Object obj22 = fila12.desenfileira();
        boolean boolean23 = fila12.vazia();
        boolean boolean24 = fila12.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        boolean boolean30 = fila25.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) -1);
        fila25.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = fila25.desenfileira();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass36);
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        boolean boolean40 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        fila13.imprime();
        boolean boolean26 = fila13.vazia();
        boolean boolean27 = fila13.vazia();
        ds.Fila fila28 = new ds.Fila();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) -1);
        fila29.enfileira((java.lang.Object) '4');
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        java.lang.Class<?> wildcardClass36 = fila34.getClass();
        fila29.enfileira((java.lang.Object) wildcardClass36);
        java.lang.Object obj38 = fila29.desenfileira();
        java.lang.Object obj39 = null;
        fila29.enfileira(obj39);
        java.lang.Object obj41 = fila29.desenfileira();
        fila29.enfileira((java.lang.Object) (byte) -1);
        boolean boolean44 = fila29.vazia();
        fila28.enfileira((java.lang.Object) fila29);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (byte) -1);
        fila46.enfileira((java.lang.Object) '4');
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        java.lang.Class<?> wildcardClass53 = fila51.getClass();
        fila46.enfileira((java.lang.Object) wildcardClass53);
        java.lang.Object obj55 = fila46.desenfileira();
        fila46.imprime();
        java.lang.Object obj57 = new java.lang.Object();
        fila46.enfileira(obj57);
        fila46.imprime();
        ds.Fila fila60 = new ds.Fila();
        fila60.enfileira((java.lang.Object) (byte) -1);
        fila60.enfileira((java.lang.Object) '4');
        ds.Fila fila65 = new ds.Fila();
        fila65.imprime();
        java.lang.Class<?> wildcardClass67 = fila65.getClass();
        fila60.enfileira((java.lang.Object) wildcardClass67);
        java.lang.Object obj69 = fila60.desenfileira();
        boolean boolean70 = fila60.vazia();
        java.lang.Class<?> wildcardClass71 = fila60.getClass();
        fila46.enfileira((java.lang.Object) wildcardClass71);
        java.lang.Object obj73 = fila46.desenfileira();
        fila46.imprime();
        fila46.imprime();
        fila28.enfileira((java.lang.Object) fila46);
        fila13.enfileira((java.lang.Object) fila28);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (byte) -1 + "'", obj69, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + '4' + "'", obj73, '4');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        fila0.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) '4');
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        java.lang.Class<?> wildcardClass33 = fila31.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila26.desenfileira();
        boolean boolean36 = fila26.vazia();
        fila0.enfileira((java.lang.Object) fila26);
        fila26.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj30 = fila0.desenfileira();
        boolean boolean31 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj25 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean27 = fila0.vazia();
        java.lang.Object obj28 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class ds.Fila");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.enfileira((java.lang.Object) '4');
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        java.lang.Class<?> wildcardClass35 = fila33.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass35);
        fila28.imprime();
        fila22.enfileira((java.lang.Object) fila28);
        fila11.enfileira((java.lang.Object) fila22);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) -1);
        fila40.enfileira((java.lang.Object) '4');
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        java.lang.Class<?> wildcardClass47 = fila45.getClass();
        fila40.enfileira((java.lang.Object) wildcardClass47);
        java.lang.Object obj49 = fila40.desenfileira();
        fila40.imprime();
        java.lang.Object obj51 = new java.lang.Object();
        fila40.enfileira(obj51);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (byte) -1);
        fila53.imprime();
        fila53.imprime();
        boolean boolean58 = fila53.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) -1);
        fila53.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj63 = fila53.desenfileira();
        fila40.enfileira((java.lang.Object) fila53);
        java.lang.Object obj65 = fila40.desenfileira();
        fila40.imprime();
        ds.Fila fila67 = new ds.Fila();
        boolean boolean68 = fila67.vazia();
        boolean boolean69 = fila67.vazia();
        fila67.imprime();
        fila40.enfileira((java.lang.Object) fila67);
        fila11.enfileira((java.lang.Object) fila40);
        java.lang.Class<?> wildcardClass73 = fila11.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) -1 + "'", obj63, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '4' + "'", obj65, '4');
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean21 = fila0.vazia();
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) (-1L));
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) 10.0d);
        boolean boolean29 = fila23.vazia();
        fila11.enfileira((java.lang.Object) boolean29);
        fila0.enfileira((java.lang.Object) boolean29);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) -1);
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 1L);
        boolean boolean39 = fila32.vazia();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj43 = fila32.desenfileira();
        fila32.imprime();
        fila0.enfileira((java.lang.Object) fila32);
        boolean boolean46 = fila32.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) (-1L));
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) 10.0d);
        boolean boolean29 = fila23.vazia();
        fila11.enfileira((java.lang.Object) boolean29);
        fila0.enfileira((java.lang.Object) boolean29);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) -1);
        fila32.imprime();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 1L);
        boolean boolean39 = fila32.vazia();
        fila32.imprime();
        fila32.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj43 = fila32.desenfileira();
        fila32.imprime();
        fila0.enfileira((java.lang.Object) fila32);
        boolean boolean46 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass24);
        boolean boolean26 = fila0.vazia();
        boolean boolean27 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.enfileira((java.lang.Object) '4');
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        java.lang.Class<?> wildcardClass35 = fila33.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass35);
        fila28.imprime();
        fila22.enfileira((java.lang.Object) fila28);
        fila11.enfileira((java.lang.Object) fila22);
        boolean boolean40 = fila11.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean20 = fila11.vazia();
        java.lang.Class<?> wildcardClass21 = fila11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = fila11.desenfileira();
        fila11.imprime();
        java.lang.Object obj22 = new java.lang.Object();
        fila11.enfileira(obj22);
        boolean boolean24 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean24);
        ds.Fila fila26 = new ds.Fila();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (byte) -1);
        fila27.enfileira((java.lang.Object) '4');
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        java.lang.Class<?> wildcardClass34 = fila32.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass34);
        java.lang.Object obj36 = fila27.desenfileira();
        java.lang.Object obj37 = null;
        fila27.enfileira(obj37);
        java.lang.Object obj39 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (byte) -1);
        boolean boolean42 = fila27.vazia();
        fila26.enfileira((java.lang.Object) fila27);
        fila26.imprime();
        fila0.enfileira((java.lang.Object) fila26);
        java.lang.Class<?> wildcardClass46 = fila26.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '4' + "'", obj39, '4');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.imprime();
        java.lang.Object obj16 = fila0.desenfileira();
        java.lang.Object obj17 = null;
        fila0.enfileira(obj17);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila6.enfileira((java.lang.Object) fila13);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        java.lang.Class<?> wildcardClass16 = fila4.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj25 = fila0.desenfileira();
        java.lang.Object obj26 = fila0.desenfileira();
        java.lang.Object obj27 = fila0.desenfileira();
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class ds.Fila");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '4' + "'", obj6, '4');
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        boolean boolean16 = fila0.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) -1);
        fila17.imprime();
        fila17.imprime();
        boolean boolean22 = fila17.vazia();
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) -1);
        fila17.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = fila17.desenfileira();
        fila0.enfileira(obj27);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean20 = fila0.vazia();
        java.lang.Object obj21 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.enfileira((java.lang.Object) '4');
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        java.lang.Class<?> wildcardClass35 = fila33.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass35);
        fila28.imprime();
        fila22.enfileira((java.lang.Object) fila28);
        fila11.enfileira((java.lang.Object) fila22);
        fila22.imprime();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        fila18.imprime();
        fila1.enfileira((java.lang.Object) fila18);
        boolean boolean29 = fila18.vazia();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (byte) -1);
        fila30.imprime();
        fila30.imprime();
        java.lang.Object obj35 = fila30.desenfileira();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) -1);
        fila36.imprime();
        fila36.imprime();
        java.lang.Class<?> wildcardClass41 = fila36.getClass();
        fila30.enfileira((java.lang.Object) wildcardClass41);
        fila30.imprime();
        fila18.enfileira((java.lang.Object) fila30);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '4' + "'", obj7, '4');
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass11 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass11);
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila6.enfileira(obj9);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Class<?> wildcardClass23 = fila12.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass23);
        boolean boolean25 = fila6.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) '4');
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        java.lang.Class<?> wildcardClass33 = fila31.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila26.desenfileira();
        fila26.imprime();
        java.lang.Object obj37 = new java.lang.Object();
        fila26.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.imprime();
        fila39.imprime();
        boolean boolean44 = fila39.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = fila39.desenfileira();
        fila26.enfileira((java.lang.Object) fila39);
        fila26.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (byte) -1);
        fila52.enfileira((java.lang.Object) '4');
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        java.lang.Class<?> wildcardClass59 = fila57.getClass();
        fila52.enfileira((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = fila52.desenfileira();
        boolean boolean62 = fila52.vazia();
        fila26.enfileira((java.lang.Object) fila52);
        fila6.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        java.lang.Object obj66 = fila26.desenfileira();
        java.lang.Class<?> wildcardClass67 = fila26.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '4' + "'", obj66, '4');
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0f);
        java.lang.Object obj11 = fila0.desenfileira();
        boolean boolean12 = fila0.vazia();
        java.lang.Object obj13 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1L + "'", obj13, 1L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        boolean boolean34 = fila29.vazia();
        fila0.enfileira((java.lang.Object) fila29);
        fila29.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj17 = fila6.desenfileira();
        java.lang.Object obj18 = fila6.desenfileira();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '4' + "'", obj18, '4');
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Object obj23 = new java.lang.Object();
        fila12.enfileira(obj23);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        boolean boolean30 = fila25.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) -1);
        fila25.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = fila25.desenfileira();
        fila12.enfileira((java.lang.Object) fila25);
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj39 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class ds.Fila");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (short) 1);
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean18 = fila13.vazia();
        boolean boolean19 = fila13.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean12 = fila6.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        boolean boolean16 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) '4');
        boolean boolean20 = fila14.vazia();
        java.lang.Class<?> wildcardClass21 = fila14.getClass();
        fila6.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass23 = fila6.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        boolean boolean19 = fila17.vazia();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) '4');
        java.lang.Object obj23 = fila17.desenfileira();
        fila11.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass26 = fila11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 100L);
        fila6.enfileira((java.lang.Object) 100L);
        java.lang.Object obj20 = fila6.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = fila6.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100L + "'", obj20, 100L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100L);
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj17 = fila6.desenfileira();
        fila6.imprime();
        java.lang.Object obj19 = fila6.desenfileira();
        java.lang.Object obj20 = fila6.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = fila6.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class ds.Fila");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.enfileira((java.lang.Object) '4');
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        java.lang.Class<?> wildcardClass17 = fila15.getClass();
        fila10.enfileira((java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = fila10.desenfileira();
        fila10.imprime();
        java.lang.Object obj21 = new java.lang.Object();
        fila10.enfileira(obj21);
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) -1);
        fila23.imprime();
        fila23.imprime();
        boolean boolean28 = fila23.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) -1);
        fila23.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj33 = fila23.desenfileira();
        fila10.enfileira((java.lang.Object) fila23);
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) -1);
        fila35.imprime();
        fila35.imprime();
        fila35.imprime();
        java.lang.Object obj41 = fila35.desenfileira();
        fila10.enfileira((java.lang.Object) fila35);
        java.lang.Object obj43 = null;
        fila35.enfileira(obj43);
        fila0.enfileira((java.lang.Object) fila35);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj12 = fila6.desenfileira();
        fila6.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        fila0.enfileira(obj3);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = fila6.desenfileira();
        fila6.imprime();
        java.lang.Class<?> wildcardClass17 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) -1);
        fila20.enfileira((java.lang.Object) '4');
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        java.lang.Class<?> wildcardClass27 = fila25.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = fila20.desenfileira();
        fila20.imprime();
        java.lang.Object obj31 = new java.lang.Object();
        fila20.enfileira(obj31);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (byte) -1);
        fila33.imprime();
        fila33.imprime();
        boolean boolean38 = fila33.vazia();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila33.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = fila33.desenfileira();
        fila20.enfileira((java.lang.Object) fila33);
        fila20.imprime();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (byte) -1);
        fila46.enfileira((java.lang.Object) '4');
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        java.lang.Class<?> wildcardClass53 = fila51.getClass();
        fila46.enfileira((java.lang.Object) wildcardClass53);
        java.lang.Object obj55 = fila46.desenfileira();
        boolean boolean56 = fila46.vazia();
        fila20.enfileira((java.lang.Object) fila46);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj59 = fila20.desenfileira();
        boolean boolean60 = fila20.vazia();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + '4' + "'", obj59, '4');
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        boolean boolean19 = fila17.vazia();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) '4');
        java.lang.Object obj23 = fila17.desenfileira();
        fila11.enfileira((java.lang.Object) fila17);
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        java.lang.Object obj27 = fila11.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 10.0d + "'", obj27, 10.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean14 = fila6.vazia();
        boolean boolean15 = fila6.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) 1L);
        java.lang.Object obj13 = fila6.desenfileira();
        java.lang.Object obj14 = fila6.desenfileira();
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 1L);
        boolean boolean25 = fila18.vazia();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Object obj29 = fila18.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = fila8.desenfileira();
        fila8.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        boolean boolean16 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) '4');
        java.lang.Object obj20 = fila14.desenfileira();
        fila8.enfileira((java.lang.Object) fila14);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = fila22.desenfileira();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.imprime();
        fila26.imprime();
        boolean boolean31 = fila26.vazia();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) fila26);
        fila22.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (byte) -1);
        fila38.imprime();
        fila38.imprime();
        fila38.enfileira((java.lang.Object) 1L);
        java.lang.Object obj45 = fila38.desenfileira();
        java.lang.Object obj46 = fila38.desenfileira();
        fila38.imprime();
        java.lang.Class<?> wildcardClass48 = fila38.getClass();
        fila22.enfileira((java.lang.Object) fila38);
        fila14.enfileira((java.lang.Object) fila38);
        fila0.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1L + "'", obj46, 1L);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj8 = null;
        fila0.enfileira(obj8);
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (byte) -1);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila15.enfileira(obj18);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) -1);
        fila21.enfileira((java.lang.Object) '4');
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        java.lang.Class<?> wildcardClass28 = fila26.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = fila21.desenfileira();
        fila21.imprime();
        java.lang.Class<?> wildcardClass32 = fila21.getClass();
        fila15.enfileira((java.lang.Object) wildcardClass32);
        boolean boolean34 = fila15.vazia();
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) -1);
        fila36.imprime();
        fila36.imprime();
        fila36.enfileira((java.lang.Object) 1L);
        boolean boolean43 = fila36.vazia();
        fila36.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj46 = fila36.desenfileira();
        boolean boolean47 = fila36.vazia();
        fila0.enfileira((java.lang.Object) fila36);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        fila0.enfileira(obj3);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        boolean boolean15 = fila6.vazia();
        fila6.imprime();
        java.lang.Object obj17 = fila6.desenfileira();
        java.lang.Class<?> wildcardClass18 = fila6.getClass();
        fila0.enfileira((java.lang.Object) fila6);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        java.lang.Class<?> wildcardClass10 = fila8.getClass();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        java.lang.Object obj31 = fila25.desenfileira();
        fila0.enfileira((java.lang.Object) fila25);
        java.lang.Object obj33 = null;
        fila25.enfileira(obj33);
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        boolean boolean37 = fila35.vazia();
        fila25.enfileira((java.lang.Object) boolean37);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        boolean boolean24 = fila0.vazia();
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = fila10.desenfileira();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila16.enfileira(obj19);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        java.lang.Class<?> wildcardClass29 = fila27.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = fila22.desenfileira();
        fila22.imprime();
        java.lang.Class<?> wildcardClass33 = fila22.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass33);
        boolean boolean35 = fila16.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) -1);
        fila36.enfileira((java.lang.Object) '4');
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        java.lang.Class<?> wildcardClass43 = fila41.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass43);
        java.lang.Object obj45 = fila36.desenfileira();
        fila36.imprime();
        java.lang.Object obj47 = new java.lang.Object();
        fila36.enfileira(obj47);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (byte) -1);
        fila49.imprime();
        fila49.imprime();
        boolean boolean54 = fila49.vazia();
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) -1);
        fila49.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj59 = fila49.desenfileira();
        fila36.enfileira((java.lang.Object) fila49);
        fila36.imprime();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) (byte) -1);
        fila62.enfileira((java.lang.Object) '4');
        ds.Fila fila67 = new ds.Fila();
        fila67.imprime();
        java.lang.Class<?> wildcardClass69 = fila67.getClass();
        fila62.enfileira((java.lang.Object) wildcardClass69);
        java.lang.Object obj71 = fila62.desenfileira();
        boolean boolean72 = fila62.vazia();
        fila36.enfileira((java.lang.Object) fila62);
        fila16.enfileira((java.lang.Object) fila36);
        fila10.enfileira((java.lang.Object) fila36);
        fila10.imprime();
        fila6.enfileira((java.lang.Object) fila10);
        boolean boolean78 = fila6.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) -1 + "'", obj59, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (byte) -1 + "'", obj71, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean20 = fila11.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) -1);
        fila21.enfileira((java.lang.Object) '4');
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        java.lang.Class<?> wildcardClass28 = fila26.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = fila21.desenfileira();
        fila21.imprime();
        java.lang.Object obj32 = new java.lang.Object();
        fila21.enfileira(obj32);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) -1);
        fila34.imprime();
        fila34.imprime();
        boolean boolean39 = fila34.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) -1);
        fila34.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj44 = fila34.desenfileira();
        fila21.enfileira((java.lang.Object) fila34);
        fila11.enfileira((java.lang.Object) fila21);
        ds.Fila fila47 = new ds.Fila();
        fila47.imprime();
        fila47.imprime();
        java.lang.Class<?> wildcardClass50 = fila47.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila6.enfileira(obj9);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Class<?> wildcardClass23 = fila12.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass23);
        boolean boolean25 = fila6.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) '4');
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        java.lang.Class<?> wildcardClass33 = fila31.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila26.desenfileira();
        fila26.imprime();
        java.lang.Object obj37 = new java.lang.Object();
        fila26.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.imprime();
        fila39.imprime();
        boolean boolean44 = fila39.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = fila39.desenfileira();
        fila26.enfileira((java.lang.Object) fila39);
        fila26.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (byte) -1);
        fila52.enfileira((java.lang.Object) '4');
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        java.lang.Class<?> wildcardClass59 = fila57.getClass();
        fila52.enfileira((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = fila52.desenfileira();
        boolean boolean62 = fila52.vazia();
        fila26.enfileira((java.lang.Object) fila52);
        fila6.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        java.lang.Object obj66 = fila26.desenfileira();
        boolean boolean67 = fila26.vazia();
        fila26.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '4' + "'", obj66, '4');
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass15 = fila10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        java.lang.Object obj31 = fila25.desenfileira();
        fila0.enfileira((java.lang.Object) fila25);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (byte) -1);
        fila33.imprime();
        fila33.imprime();
        fila33.enfileira((java.lang.Object) 1L);
        boolean boolean40 = fila33.vazia();
        fila33.imprime();
        java.lang.Class<?> wildcardClass42 = fila33.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass42);
        java.lang.Class<?> wildcardClass44 = fila25.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Class<?> wildcardClass17 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 100L);
        fila6.enfileira((java.lang.Object) 100L);
        java.lang.Object obj20 = fila6.desenfileira();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100L + "'", obj20, 100L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        java.lang.Class<?> wildcardClass10 = fila8.getClass();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) (byte) -1);
        fila5.imprime();
        fila5.imprime();
        fila5.imprime();
        java.lang.Object obj11 = fila5.desenfileira();
        fila5.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 1L);
        java.lang.Object obj20 = fila13.desenfileira();
        java.lang.Object obj21 = fila13.desenfileira();
        fila13.imprime();
        fila13.imprime();
        fila13.imprime();
        fila13.imprime();
        fila5.enfileira((java.lang.Object) fila13);
        fila0.enfileira((java.lang.Object) fila5);
        boolean boolean28 = fila5.vazia();
        fila5.imprime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1L + "'", obj21, 1L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) -1);
        fila7.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila0.enfileira(obj14);
        java.lang.Object obj16 = null;
        fila0.enfileira(obj16);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        fila0.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila19.enfileira((java.lang.Object) '4');
        ds.Fila fila24 = new ds.Fila();
        fila24.imprime();
        java.lang.Class<?> wildcardClass26 = fila24.getClass();
        fila19.enfileira((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = fila19.desenfileira();
        fila19.imprime();
        boolean boolean30 = fila19.vazia();
        fila0.enfileira((java.lang.Object) boolean30);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) -1 + "'", obj28, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean20 = fila11.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) -1);
        fila21.enfileira((java.lang.Object) '4');
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        java.lang.Class<?> wildcardClass28 = fila26.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = fila21.desenfileira();
        fila21.imprime();
        java.lang.Object obj32 = new java.lang.Object();
        fila21.enfileira(obj32);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) -1);
        fila34.imprime();
        fila34.imprime();
        boolean boolean39 = fila34.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) -1);
        fila34.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj44 = fila34.desenfileira();
        fila21.enfileira((java.lang.Object) fila34);
        fila11.enfileira((java.lang.Object) fila21);
        java.lang.Object obj47 = fila11.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) -1 + "'", obj47, (byte) -1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = fila11.desenfileira();
        fila11.enfileira((java.lang.Object) (-1L));
        ds.Fila fila23 = new ds.Fila();
        fila23.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = fila23.desenfileira();
        fila23.enfileira((java.lang.Object) 10.0d);
        boolean boolean29 = fila23.vazia();
        fila11.enfileira((java.lang.Object) boolean29);
        fila0.enfileira((java.lang.Object) boolean29);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        java.lang.Object obj30 = fila25.desenfileira();
        fila13.enfileira(obj30);
        java.lang.Object obj32 = fila13.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = fila17.desenfileira();
        fila6.enfileira(obj20);
        java.lang.Class<?> wildcardClass22 = obj20.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        boolean boolean34 = fila29.vazia();
        fila0.enfileira((java.lang.Object) fila29);
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) -1);
        fila36.enfileira((java.lang.Object) '4');
        java.lang.Object obj41 = fila36.desenfileira();
        fila36.imprime();
        fila36.imprime();
        ds.Fila fila44 = new ds.Fila();
        fila44.imprime();
        java.lang.Class<?> wildcardClass46 = fila44.getClass();
        fila36.enfileira((java.lang.Object) fila44);
        fila29.enfileira((java.lang.Object) fila44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = fila44.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj25 = fila13.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (short) 1);
        fila13.imprime();
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = fila10.desenfileira();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila16.enfileira(obj19);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        java.lang.Class<?> wildcardClass29 = fila27.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = fila22.desenfileira();
        fila22.imprime();
        java.lang.Class<?> wildcardClass33 = fila22.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass33);
        boolean boolean35 = fila16.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) -1);
        fila36.enfileira((java.lang.Object) '4');
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        java.lang.Class<?> wildcardClass43 = fila41.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass43);
        java.lang.Object obj45 = fila36.desenfileira();
        fila36.imprime();
        java.lang.Object obj47 = new java.lang.Object();
        fila36.enfileira(obj47);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (byte) -1);
        fila49.imprime();
        fila49.imprime();
        boolean boolean54 = fila49.vazia();
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) -1);
        fila49.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj59 = fila49.desenfileira();
        fila36.enfileira((java.lang.Object) fila49);
        fila36.imprime();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) (byte) -1);
        fila62.enfileira((java.lang.Object) '4');
        ds.Fila fila67 = new ds.Fila();
        fila67.imprime();
        java.lang.Class<?> wildcardClass69 = fila67.getClass();
        fila62.enfileira((java.lang.Object) wildcardClass69);
        java.lang.Object obj71 = fila62.desenfileira();
        boolean boolean72 = fila62.vazia();
        fila36.enfileira((java.lang.Object) fila62);
        fila16.enfileira((java.lang.Object) fila36);
        fila10.enfileira((java.lang.Object) fila36);
        fila10.imprime();
        fila6.enfileira((java.lang.Object) fila10);
        fila10.imprime();
        java.lang.Class<?> wildcardClass79 = fila10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) -1 + "'", obj59, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (byte) -1 + "'", obj71, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = fila11.desenfileira();
        fila11.imprime();
        java.lang.Object obj22 = new java.lang.Object();
        fila11.enfileira(obj22);
        boolean boolean24 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean24);
        ds.Fila fila26 = new ds.Fila();
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) (byte) -1);
        fila27.enfileira((java.lang.Object) '4');
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        java.lang.Class<?> wildcardClass34 = fila32.getClass();
        fila27.enfileira((java.lang.Object) wildcardClass34);
        java.lang.Object obj36 = fila27.desenfileira();
        java.lang.Object obj37 = null;
        fila27.enfileira(obj37);
        java.lang.Object obj39 = fila27.desenfileira();
        fila27.enfileira((java.lang.Object) (byte) -1);
        boolean boolean42 = fila27.vazia();
        fila26.enfileira((java.lang.Object) fila27);
        fila26.imprime();
        fila0.enfileira((java.lang.Object) fila26);
        java.lang.Object obj46 = fila0.desenfileira();
        boolean boolean47 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '4' + "'", obj39, '4');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        boolean boolean27 = fila18.vazia();
        boolean boolean28 = fila18.vazia();
        java.lang.Object obj29 = fila18.desenfileira();
        fila0.enfileira(obj29);
        boolean boolean31 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        fila25.enfileira((java.lang.Object) 1L);
        boolean boolean32 = fila25.vazia();
        fila25.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = fila25.desenfileira();
        boolean boolean36 = fila25.vazia();
        fila25.imprime();
        fila0.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = fila12.desenfileira();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) -1);
        fila16.imprime();
        fila16.imprime();
        boolean boolean21 = fila16.vazia();
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila16.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) fila16);
        fila12.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.imprime();
        fila28.imprime();
        fila28.enfileira((java.lang.Object) 1L);
        java.lang.Object obj35 = fila28.desenfileira();
        java.lang.Object obj36 = fila28.desenfileira();
        fila28.imprime();
        java.lang.Class<?> wildcardClass38 = fila28.getClass();
        fila12.enfileira((java.lang.Object) fila28);
        fila12.enfileira((java.lang.Object) true);
        fila0.enfileira((java.lang.Object) true);
        boolean boolean43 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1L + "'", obj36, 1L);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.imprime();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) 1L);
        java.lang.Object obj29 = fila22.desenfileira();
        java.lang.Object obj30 = fila22.desenfileira();
        fila22.imprime();
        java.lang.Class<?> wildcardClass32 = fila22.getClass();
        fila0.enfileira((java.lang.Object) fila22);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1L + "'", obj30, 1L);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        boolean boolean27 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        boolean boolean15 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) '4');
        fila0.enfileira((java.lang.Object) fila13);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila6.enfileira(obj9);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Class<?> wildcardClass23 = fila12.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass23);
        boolean boolean25 = fila6.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) '4');
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        java.lang.Class<?> wildcardClass33 = fila31.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila26.desenfileira();
        fila26.imprime();
        java.lang.Object obj37 = new java.lang.Object();
        fila26.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.imprime();
        fila39.imprime();
        boolean boolean44 = fila39.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = fila39.desenfileira();
        fila26.enfileira((java.lang.Object) fila39);
        fila26.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (byte) -1);
        fila52.enfileira((java.lang.Object) '4');
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        java.lang.Class<?> wildcardClass59 = fila57.getClass();
        fila52.enfileira((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = fila52.desenfileira();
        boolean boolean62 = fila52.vazia();
        fila26.enfileira((java.lang.Object) fila52);
        fila6.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        boolean boolean66 = fila26.vazia();
        java.lang.Object obj67 = fila26.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + '4' + "'", obj67, '4');
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean20 = fila11.vazia();
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) -1);
        fila21.enfileira((java.lang.Object) '4');
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        java.lang.Class<?> wildcardClass28 = fila26.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = fila21.desenfileira();
        fila21.imprime();
        java.lang.Object obj32 = new java.lang.Object();
        fila21.enfileira(obj32);
        ds.Fila fila34 = new ds.Fila();
        fila34.enfileira((java.lang.Object) (byte) -1);
        fila34.imprime();
        fila34.imprime();
        boolean boolean39 = fila34.vazia();
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) -1);
        fila34.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj44 = fila34.desenfileira();
        fila21.enfileira((java.lang.Object) fila34);
        fila11.enfileira((java.lang.Object) fila21);
        java.lang.Object obj47 = fila21.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + '4' + "'", obj47, '4');
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.enfileira((java.lang.Object) '4');
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        java.lang.Class<?> wildcardClass32 = fila30.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = fila25.desenfileira();
        fila25.enfileira((java.lang.Object) (-1L));
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = fila37.desenfileira();
        fila37.enfileira((java.lang.Object) 10.0d);
        boolean boolean43 = fila37.vazia();
        fila25.enfileira((java.lang.Object) boolean43);
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila45.enfileira((java.lang.Object) '4');
        ds.Fila fila50 = new ds.Fila();
        fila50.imprime();
        java.lang.Class<?> wildcardClass52 = fila50.getClass();
        fila45.enfileira((java.lang.Object) wildcardClass52);
        fila45.imprime();
        fila25.enfileira((java.lang.Object) fila45);
        fila25.imprime();
        fila13.enfileira((java.lang.Object) fila25);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        java.lang.Object obj30 = fila25.desenfileira();
        fila13.enfileira(obj30);
        boolean boolean32 = fila13.vazia();
        java.lang.Object obj33 = fila13.desenfileira();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = fila17.desenfileira();
        fila6.enfileira(obj20);
        java.lang.Object obj22 = null;
        fila6.enfileira(obj22);
        java.lang.Class<?> wildcardClass24 = fila6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        java.lang.Object obj31 = fila25.desenfileira();
        fila0.enfileira((java.lang.Object) fila25);
        java.lang.Object obj33 = null;
        fila25.enfileira(obj33);
        java.lang.Object obj35 = fila25.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        boolean boolean16 = fila4.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) -1);
        fila17.enfileira((java.lang.Object) '4');
        java.lang.Object obj22 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        java.lang.Class<?> wildcardClass27 = fila25.getClass();
        fila17.enfileira((java.lang.Object) fila25);
        boolean boolean29 = fila17.vazia();
        fila4.enfileira((java.lang.Object) boolean29);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila8.enfileira((java.lang.Object) (byte) -1);
        fila8.enfileira((java.lang.Object) '4');
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        java.lang.Class<?> wildcardClass15 = fila13.getClass();
        fila8.enfileira((java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = fila8.desenfileira();
        java.lang.Object obj18 = null;
        fila8.enfileira(obj18);
        java.lang.Object obj20 = fila8.desenfileira();
        fila8.enfileira((java.lang.Object) (byte) -1);
        boolean boolean23 = fila8.vazia();
        fila7.enfileira((java.lang.Object) fila8);
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj26 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        java.lang.Object obj18 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        fila0.enfileira((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) '4');
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = fila4.desenfileira();
        fila4.imprime();
        boolean boolean15 = fila4.vazia();
        java.lang.Object obj16 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila18.desenfileira();
        boolean boolean28 = fila18.vazia();
        ds.Fila fila29 = new ds.Fila();
        fila29.enfileira((java.lang.Object) (byte) -1);
        fila29.imprime();
        fila29.imprime();
        fila29.enfileira((java.lang.Object) 1L);
        java.lang.Object obj36 = fila29.desenfileira();
        java.lang.Object obj37 = fila29.desenfileira();
        fila29.imprime();
        fila29.imprime();
        fila29.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.enfileira((java.lang.Object) (byte) -1);
        fila41.enfileira((java.lang.Object) '4');
        ds.Fila fila46 = new ds.Fila();
        fila46.imprime();
        java.lang.Class<?> wildcardClass48 = fila46.getClass();
        fila41.enfileira((java.lang.Object) wildcardClass48);
        java.lang.Object obj50 = fila41.desenfileira();
        fila41.imprime();
        boolean boolean52 = fila41.vazia();
        fila29.enfileira((java.lang.Object) boolean52);
        fila18.enfileira((java.lang.Object) boolean52);
        boolean boolean55 = fila18.vazia();
        fila4.enfileira((java.lang.Object) boolean55);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1L + "'", obj37, 1L);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (byte) -1 + "'", obj50, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = fila13.desenfileira();
        boolean boolean17 = fila13.vazia();
        fila13.imprime();
        fila13.enfileira((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass21 = fila13.getClass();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj23 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        fila0.imprime();
        boolean boolean28 = fila0.vazia();
        boolean boolean29 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj25 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila27 = new ds.Fila();
        boolean boolean28 = fila27.vazia();
        boolean boolean29 = fila27.vazia();
        fila27.imprime();
        fila0.enfileira((java.lang.Object) fila27);
        fila0.imprime();
        java.lang.Object obj33 = null;
        fila0.enfileira(obj33);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj22 = fila0.desenfileira();
        boolean boolean23 = fila0.vazia();
        boolean boolean24 = fila0.vazia();
        java.lang.Class<?> wildcardClass25 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj17 = fila6.desenfileira();
        boolean boolean18 = fila6.vazia();
        fila6.imprime();
        fila6.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        boolean boolean24 = fila22.vazia();
        fila22.imprime();
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.enfileira((java.lang.Object) '4');
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        java.lang.Class<?> wildcardClass35 = fila33.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass35);
        fila28.imprime();
        fila22.enfileira((java.lang.Object) fila28);
        fila11.enfileira((java.lang.Object) fila22);
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) (byte) -1);
        fila40.enfileira((java.lang.Object) '4');
        ds.Fila fila45 = new ds.Fila();
        fila45.imprime();
        java.lang.Class<?> wildcardClass47 = fila45.getClass();
        fila40.enfileira((java.lang.Object) wildcardClass47);
        java.lang.Object obj49 = fila40.desenfileira();
        fila40.imprime();
        java.lang.Object obj51 = new java.lang.Object();
        fila40.enfileira(obj51);
        ds.Fila fila53 = new ds.Fila();
        fila53.enfileira((java.lang.Object) (byte) -1);
        fila53.imprime();
        fila53.imprime();
        boolean boolean58 = fila53.vazia();
        ds.Fila fila59 = new ds.Fila();
        fila59.enfileira((java.lang.Object) (byte) -1);
        fila53.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj63 = fila53.desenfileira();
        fila40.enfileira((java.lang.Object) fila53);
        java.lang.Object obj65 = fila40.desenfileira();
        fila40.imprime();
        ds.Fila fila67 = new ds.Fila();
        boolean boolean68 = fila67.vazia();
        boolean boolean69 = fila67.vazia();
        fila67.imprime();
        fila40.enfileira((java.lang.Object) fila67);
        fila11.enfileira((java.lang.Object) fila40);
        java.lang.Class<?> wildcardClass73 = fila40.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) -1 + "'", obj63, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '4' + "'", obj65, '4');
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        fila0.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        boolean boolean22 = fila19.vazia();
        java.lang.Class<?> wildcardClass23 = fila19.getClass();
        fila0.enfileira((java.lang.Object) fila19);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.enfileira((java.lang.Object) '4');
        ds.Fila fila30 = new ds.Fila();
        fila30.imprime();
        java.lang.Class<?> wildcardClass32 = fila30.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = fila25.desenfileira();
        fila25.imprime();
        java.lang.Object obj36 = new java.lang.Object();
        fila25.enfileira(obj36);
        ds.Fila fila38 = new ds.Fila();
        fila38.enfileira((java.lang.Object) (byte) -1);
        fila38.imprime();
        fila38.imprime();
        boolean boolean43 = fila38.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (byte) -1);
        fila38.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj48 = fila38.desenfileira();
        fila25.enfileira((java.lang.Object) fila38);
        boolean boolean50 = fila38.vazia();
        boolean boolean51 = fila38.vazia();
        fila38.imprime();
        fila0.enfileira((java.lang.Object) fila38);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) -1);
        fila17.imprime();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 1L);
        java.lang.Object obj24 = fila17.desenfileira();
        java.lang.Object obj25 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.enfileira((java.lang.Object) '4');
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        java.lang.Class<?> wildcardClass35 = fila33.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass35);
        fila28.imprime();
        fila17.enfileira((java.lang.Object) fila28);
        fila0.enfileira((java.lang.Object) fila28);
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        boolean boolean42 = fila40.vazia();
        fila40.imprime();
        fila40.enfileira((java.lang.Object) '4');
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (byte) -1);
        fila46.enfileira((java.lang.Object) '4');
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        java.lang.Class<?> wildcardClass53 = fila51.getClass();
        fila46.enfileira((java.lang.Object) wildcardClass53);
        fila46.imprime();
        fila40.enfileira((java.lang.Object) fila46);
        java.lang.Object obj57 = fila46.desenfileira();
        fila46.imprime();
        fila0.enfileira((java.lang.Object) fila46);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1L + "'", obj25, 1L);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) -1);
        fila7.enfileira((java.lang.Object) '4');
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        java.lang.Class<?> wildcardClass14 = fila12.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Object obj18 = fila7.desenfileira();
        java.lang.Object obj19 = fila7.desenfileira();
        fila0.enfileira(obj19);
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '4' + "'", obj18, '4');
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        fila18.imprime();
        fila1.enfileira((java.lang.Object) fila18);
        boolean boolean29 = fila18.vazia();
        java.lang.Object obj30 = null;
        fila18.enfileira(obj30);
        java.lang.Object obj32 = fila18.desenfileira();
        java.lang.Object obj33 = fila18.desenfileira();
        java.lang.Object obj34 = fila18.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '4' + "'", obj33, '4');
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class ds.Fila");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        fila0.imprime();
        boolean boolean28 = fila0.vazia();
        java.lang.Object obj29 = fila0.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (byte) -1);
        fila30.enfileira((java.lang.Object) '4');
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        java.lang.Class<?> wildcardClass37 = fila35.getClass();
        fila30.enfileira((java.lang.Object) wildcardClass37);
        java.lang.Object obj39 = fila30.desenfileira();
        fila30.imprime();
        java.lang.Object obj41 = new java.lang.Object();
        fila30.enfileira(obj41);
        ds.Fila fila43 = new ds.Fila();
        fila43.enfileira((java.lang.Object) (byte) -1);
        fila43.imprime();
        fila43.imprime();
        boolean boolean48 = fila43.vazia();
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (byte) -1);
        fila43.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = fila43.desenfileira();
        fila30.enfileira((java.lang.Object) fila43);
        fila30.imprime();
        ds.Fila fila56 = new ds.Fila();
        fila56.enfileira((java.lang.Object) (byte) -1);
        fila56.enfileira((java.lang.Object) '4');
        ds.Fila fila61 = new ds.Fila();
        fila61.imprime();
        java.lang.Class<?> wildcardClass63 = fila61.getClass();
        fila56.enfileira((java.lang.Object) wildcardClass63);
        java.lang.Object obj65 = fila56.desenfileira();
        boolean boolean66 = fila56.vazia();
        fila30.enfileira((java.lang.Object) fila56);
        java.lang.Object obj68 = fila30.desenfileira();
        fila0.enfileira(obj68);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '4' + "'", obj29, '4');
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) -1 + "'", obj65, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + '4' + "'", obj68, '4');
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        fila0.enfileira(obj3);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = fila6.desenfileira();
        fila6.imprime();
        java.lang.Class<?> wildcardClass17 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) -1);
        fila20.enfileira((java.lang.Object) '4');
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        java.lang.Class<?> wildcardClass27 = fila25.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = fila20.desenfileira();
        fila20.imprime();
        java.lang.Object obj31 = new java.lang.Object();
        fila20.enfileira(obj31);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (byte) -1);
        fila33.imprime();
        fila33.imprime();
        boolean boolean38 = fila33.vazia();
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila33.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = fila33.desenfileira();
        fila20.enfileira((java.lang.Object) fila33);
        fila20.imprime();
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (byte) -1);
        fila46.enfileira((java.lang.Object) '4');
        ds.Fila fila51 = new ds.Fila();
        fila51.imprime();
        java.lang.Class<?> wildcardClass53 = fila51.getClass();
        fila46.enfileira((java.lang.Object) wildcardClass53);
        java.lang.Object obj55 = fila46.desenfileira();
        boolean boolean56 = fila46.vazia();
        fila20.enfileira((java.lang.Object) fila46);
        fila0.enfileira((java.lang.Object) fila20);
        boolean boolean59 = fila20.vazia();
        java.lang.Class<?> wildcardClass60 = fila20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj30 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        boolean boolean6 = fila4.vazia();
        fila4.imprime();
        fila4.enfileira((java.lang.Object) '4');
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.imprime();
        fila10.imprime();
        fila10.enfileira((java.lang.Object) 1L);
        java.lang.Object obj17 = fila10.desenfileira();
        java.lang.Object obj18 = fila10.desenfileira();
        fila10.imprime();
        fila10.imprime();
        fila4.enfileira((java.lang.Object) fila10);
        fila0.enfileira((java.lang.Object) fila10);
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass11 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass11);
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.imprime();
        fila12.imprime();
        boolean boolean17 = fila12.vazia();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila18.desenfileira();
        fila18.imprime();
        java.lang.Object obj29 = new java.lang.Object();
        fila18.enfileira(obj29);
        fila18.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) -1);
        fila32.enfileira((java.lang.Object) '4');
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        java.lang.Class<?> wildcardClass39 = fila37.getClass();
        fila32.enfileira((java.lang.Object) wildcardClass39);
        java.lang.Object obj41 = fila32.desenfileira();
        boolean boolean42 = fila32.vazia();
        java.lang.Class<?> wildcardClass43 = fila32.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass43);
        java.lang.Object obj45 = fila18.desenfileira();
        fila18.imprime();
        fila18.imprime();
        fila0.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        java.lang.Class<?> wildcardClass50 = fila18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '4' + "'", obj45, '4');
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) 1L);
        java.lang.Object obj13 = fila6.desenfileira();
        java.lang.Object obj14 = fila6.desenfileira();
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.imprime();
        fila18.imprime();
        fila18.enfileira((java.lang.Object) 1L);
        boolean boolean25 = fila18.vazia();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila18);
        java.lang.Class<?> wildcardClass29 = fila18.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) -1);
        fila16.imprime();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 1L);
        java.lang.Object obj23 = fila16.desenfileira();
        java.lang.Object obj24 = fila16.desenfileira();
        fila16.imprime();
        java.lang.Class<?> wildcardClass26 = fila16.getClass();
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Class<?> wildcardClass28 = fila16.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1L + "'", obj24, 1L);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass11 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass11);
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) -1);
        fila20.enfileira((java.lang.Object) '4');
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        java.lang.Class<?> wildcardClass27 = fila25.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = fila20.desenfileira();
        java.lang.Object obj30 = null;
        fila20.enfileira(obj30);
        java.lang.Object obj32 = fila20.desenfileira();
        fila20.enfileira((java.lang.Object) (byte) -1);
        boolean boolean35 = fila20.vazia();
        fila19.enfileira((java.lang.Object) fila20);
        fila12.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila20);
        // The following exception was thrown during execution in test generation
        try {
            fila20.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '4' + "'", obj32, '4');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean10 = fila0.vazia();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.enfileira((java.lang.Object) (-1L));
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = fila24.desenfileira();
        fila24.enfileira((java.lang.Object) 10.0d);
        boolean boolean30 = fila24.vazia();
        fila12.enfileira((java.lang.Object) boolean30);
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) -1);
        fila32.enfileira((java.lang.Object) '4');
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        java.lang.Class<?> wildcardClass39 = fila37.getClass();
        fila32.enfileira((java.lang.Object) wildcardClass39);
        fila32.imprime();
        fila12.enfileira((java.lang.Object) fila32);
        boolean boolean43 = fila32.vazia();
        boolean boolean44 = fila32.vazia();
        fila0.enfileira((java.lang.Object) fila32);
        java.lang.Object obj46 = fila32.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        boolean boolean24 = fila14.vazia();
        java.lang.Class<?> wildcardClass25 = fila14.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass25);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj25 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (-1L));
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = fila12.desenfileira();
        fila12.enfileira((java.lang.Object) 10.0d);
        boolean boolean18 = fila12.vazia();
        fila0.enfileira((java.lang.Object) boolean18);
        boolean boolean20 = fila0.vazia();
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) -1);
        fila7.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila0.enfileira(obj14);
        fila0.imprime();
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) -1);
        fila20.enfileira((java.lang.Object) '4');
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        java.lang.Class<?> wildcardClass27 = fila25.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = fila20.desenfileira();
        java.lang.Object obj30 = null;
        fila20.enfileira(obj30);
        java.lang.Object obj32 = fila20.desenfileira();
        fila20.enfileira((java.lang.Object) (byte) -1);
        boolean boolean35 = fila20.vazia();
        fila19.enfileira((java.lang.Object) fila20);
        fila12.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj39 = fila20.desenfileira();
        java.lang.Object obj40 = fila20.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '4' + "'", obj32, '4');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class ds.Fila");
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        java.lang.Class<?> wildcardClass29 = fila27.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass29);
        fila22.imprime();
        boolean boolean32 = fila22.vazia();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (byte) -1);
        fila33.enfileira((java.lang.Object) '4');
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        java.lang.Class<?> wildcardClass40 = fila38.getClass();
        fila33.enfileira((java.lang.Object) wildcardClass40);
        boolean boolean42 = fila33.vazia();
        java.lang.Object obj43 = fila33.desenfileira();
        boolean boolean44 = fila33.vazia();
        fila33.imprime();
        fila22.enfileira((java.lang.Object) fila33);
        fila11.enfileira((java.lang.Object) fila33);
        boolean boolean48 = fila33.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        java.lang.Class<?> wildcardClass29 = fila27.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass29);
        fila22.imprime();
        boolean boolean32 = fila22.vazia();
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (byte) -1);
        fila33.enfileira((java.lang.Object) '4');
        ds.Fila fila38 = new ds.Fila();
        fila38.imprime();
        java.lang.Class<?> wildcardClass40 = fila38.getClass();
        fila33.enfileira((java.lang.Object) wildcardClass40);
        boolean boolean42 = fila33.vazia();
        java.lang.Object obj43 = fila33.desenfileira();
        boolean boolean44 = fila33.vazia();
        fila33.imprime();
        fila22.enfileira((java.lang.Object) fila33);
        fila11.enfileira((java.lang.Object) fila33);
        java.lang.Object obj48 = fila33.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '4' + "'", obj48, '4');
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        fila0.enfileira(obj3);
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = fila6.desenfileira();
        fila6.imprime();
        java.lang.Class<?> wildcardClass17 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        fila0.imprime();
        java.lang.Object obj20 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 1 + "'", obj20, (short) 1);
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
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) '4');
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = fila4.desenfileira();
        fila4.imprime();
        boolean boolean15 = fila4.vazia();
        java.lang.Object obj16 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0f);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = fila11.desenfileira();
        fila11.imprime();
        java.lang.Object obj22 = new java.lang.Object();
        fila11.enfileira(obj22);
        boolean boolean24 = fila11.vazia();
        fila0.enfileira((java.lang.Object) boolean24);
        fila0.imprime();
        java.lang.Object obj27 = null;
        fila0.enfileira(obj27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        boolean boolean20 = fila11.vazia();
        java.lang.Object obj21 = fila11.desenfileira();
        boolean boolean22 = fila11.vazia();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        boolean boolean25 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        boolean boolean16 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) '4');
        boolean boolean20 = fila14.vazia();
        java.lang.Class<?> wildcardClass21 = fila14.getClass();
        fila6.enfileira((java.lang.Object) fila14);
        boolean boolean23 = fila14.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) (byte) -1);
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        fila15.enfileira(obj18);
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) (byte) -1);
        fila21.enfileira((java.lang.Object) '4');
        ds.Fila fila26 = new ds.Fila();
        fila26.imprime();
        java.lang.Class<?> wildcardClass28 = fila26.getClass();
        fila21.enfileira((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = fila21.desenfileira();
        fila21.imprime();
        java.lang.Class<?> wildcardClass32 = fila21.getClass();
        fila15.enfileira((java.lang.Object) wildcardClass32);
        boolean boolean34 = fila15.vazia();
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj36 = fila15.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 1 + "'", obj36, (short) 1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila6.enfileira(obj9);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Class<?> wildcardClass23 = fila12.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass23);
        boolean boolean25 = fila6.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) '4');
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        java.lang.Class<?> wildcardClass33 = fila31.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila26.desenfileira();
        fila26.imprime();
        java.lang.Object obj37 = new java.lang.Object();
        fila26.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.imprime();
        fila39.imprime();
        boolean boolean44 = fila39.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = fila39.desenfileira();
        fila26.enfileira((java.lang.Object) fila39);
        fila26.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (byte) -1);
        fila52.enfileira((java.lang.Object) '4');
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        java.lang.Class<?> wildcardClass59 = fila57.getClass();
        fila52.enfileira((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = fila52.desenfileira();
        boolean boolean62 = fila52.vazia();
        fila26.enfileira((java.lang.Object) fila52);
        fila6.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        fila0.imprime();
        java.lang.Object obj67 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        java.lang.Class<?> wildcardClass10 = fila8.getClass();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) false);
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        boolean boolean16 = fila14.vazia();
        fila14.imprime();
        fila14.enfileira((java.lang.Object) '4');
        boolean boolean20 = fila14.vazia();
        java.lang.Class<?> wildcardClass21 = fila14.getClass();
        fila6.enfileira((java.lang.Object) fila14);
        java.lang.Object obj23 = fila6.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila6.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1L));
        fila0.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) -1);
        fila17.imprime();
        fila17.imprime();
        fila17.enfileira((java.lang.Object) 1L);
        java.lang.Object obj24 = fila17.desenfileira();
        java.lang.Object obj25 = fila17.desenfileira();
        fila17.imprime();
        fila17.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.enfileira((java.lang.Object) '4');
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        java.lang.Class<?> wildcardClass35 = fila33.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass35);
        fila28.imprime();
        fila17.enfileira((java.lang.Object) fila28);
        fila0.enfileira((java.lang.Object) fila28);
        fila28.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1L + "'", obj25, 1L);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean15 = fila0.vazia();
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        boolean boolean18 = fila16.vazia();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) '4');
        fila0.enfileira((java.lang.Object) '4');
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        fila18.imprime();
        fila1.enfileira((java.lang.Object) fila18);
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        boolean boolean31 = fila29.vazia();
        fila29.imprime();
        fila29.enfileira((java.lang.Object) '4');
        ds.Fila fila35 = new ds.Fila();
        fila35.enfileira((java.lang.Object) (byte) -1);
        fila35.enfileira((java.lang.Object) '4');
        ds.Fila fila40 = new ds.Fila();
        fila40.imprime();
        java.lang.Class<?> wildcardClass42 = fila40.getClass();
        fila35.enfileira((java.lang.Object) wildcardClass42);
        fila35.imprime();
        fila29.enfileira((java.lang.Object) fila35);
        ds.Fila fila46 = new ds.Fila();
        fila46.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = fila46.desenfileira();
        fila35.enfileira(obj49);
        fila1.enfileira(obj49);
        java.lang.Object obj52 = fila1.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class ds.Fila");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean20 = fila0.vazia();
        java.lang.Object obj21 = fila0.desenfileira();
        boolean boolean22 = fila0.vazia();
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass11 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass11);
        boolean boolean13 = fila0.vazia();
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) (byte) -1);
        fila14.enfileira((java.lang.Object) '4');
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        java.lang.Class<?> wildcardClass21 = fila19.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = fila14.desenfileira();
        fila14.imprime();
        java.lang.Object obj25 = new java.lang.Object();
        fila14.enfileira(obj25);
        fila14.imprime();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.enfileira((java.lang.Object) '4');
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        java.lang.Class<?> wildcardClass35 = fila33.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass35);
        java.lang.Object obj37 = fila28.desenfileira();
        boolean boolean38 = fila28.vazia();
        java.lang.Class<?> wildcardClass39 = fila28.getClass();
        fila14.enfileira((java.lang.Object) wildcardClass39);
        java.lang.Object obj41 = fila14.desenfileira();
        fila14.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.imprime();
        fila43.imprime();
        fila43.imprime();
        fila43.imprime();
        boolean boolean48 = fila43.vazia();
        fila14.enfileira((java.lang.Object) fila43);
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass51 = fila14.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.imprime();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 1L);
        boolean boolean18 = fila11.vazia();
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object obj20 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        boolean boolean25 = fila13.vazia();
        fila13.imprime();
        java.lang.Object obj27 = fila13.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = fila13.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila6.enfileira(obj9);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Class<?> wildcardClass23 = fila12.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass23);
        boolean boolean25 = fila6.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) '4');
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        java.lang.Class<?> wildcardClass33 = fila31.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila26.desenfileira();
        fila26.imprime();
        java.lang.Object obj37 = new java.lang.Object();
        fila26.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.imprime();
        fila39.imprime();
        boolean boolean44 = fila39.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = fila39.desenfileira();
        fila26.enfileira((java.lang.Object) fila39);
        fila26.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (byte) -1);
        fila52.enfileira((java.lang.Object) '4');
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        java.lang.Class<?> wildcardClass59 = fila57.getClass();
        fila52.enfileira((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = fila52.desenfileira();
        boolean boolean62 = fila52.vazia();
        fila26.enfileira((java.lang.Object) fila52);
        fila6.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        boolean boolean66 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        fila4.imprime();
        boolean boolean16 = fila4.vazia();
        fila4.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj15 = fila12.desenfileira();
        boolean boolean16 = fila12.vazia();
        fila12.imprime();
        boolean boolean18 = fila12.vazia();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) (byte) -1);
        fila20.enfileira((java.lang.Object) '4');
        ds.Fila fila25 = new ds.Fila();
        fila25.imprime();
        java.lang.Class<?> wildcardClass27 = fila25.getClass();
        fila20.enfileira((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = fila20.desenfileira();
        java.lang.Object obj30 = null;
        fila20.enfileira(obj30);
        java.lang.Object obj32 = fila20.desenfileira();
        fila20.enfileira((java.lang.Object) (byte) -1);
        boolean boolean35 = fila20.vazia();
        fila19.enfileira((java.lang.Object) fila20);
        fila12.enfileira((java.lang.Object) fila20);
        fila0.enfileira((java.lang.Object) fila20);
        java.lang.Object obj39 = fila20.desenfileira();
        boolean boolean40 = fila20.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '4' + "'", obj32, '4');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        boolean boolean20 = fila11.vazia();
        java.lang.Object obj21 = fila11.desenfileira();
        boolean boolean22 = fila11.vazia();
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        boolean boolean10 = fila0.vazia();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        boolean boolean21 = fila12.vazia();
        java.lang.Object obj22 = fila12.desenfileira();
        boolean boolean23 = fila12.vazia();
        boolean boolean24 = fila12.vazia();
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        boolean boolean30 = fila25.vazia();
        ds.Fila fila31 = new ds.Fila();
        fila31.enfileira((java.lang.Object) (byte) -1);
        fila25.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj35 = fila25.desenfileira();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass36);
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj40 = fila12.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '4' + "'", obj40, '4');
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) '4');
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = fila4.desenfileira();
        fila4.imprime();
        boolean boolean15 = fila4.vazia();
        java.lang.Object obj16 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 1 + "'", obj4, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj13 = null;
        fila0.enfileira(obj13);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = fila13.desenfileira();
        fila13.enfileira((java.lang.Object) 10.0d);
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj20 = fila13.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) -1);
        fila7.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila0.enfileira(obj14);
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) -1);
        fila16.enfileira((java.lang.Object) '4');
        java.lang.Object obj21 = fila16.desenfileira();
        fila16.imprime();
        fila16.imprime();
        java.lang.Object obj24 = null;
        fila16.enfileira(obj24);
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        boolean boolean23 = fila12.vazia();
        fila0.enfileira((java.lang.Object) boolean23);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.enfileira((java.lang.Object) '4');
        java.lang.Object obj30 = fila25.desenfileira();
        fila25.imprime();
        fila25.imprime();
        boolean boolean33 = fila25.vazia();
        fila0.enfileira((java.lang.Object) boolean33);
        boolean boolean35 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        java.lang.Object obj31 = fila25.desenfileira();
        fila0.enfileira((java.lang.Object) fila25);
        ds.Fila fila33 = new ds.Fila();
        fila33.enfileira((java.lang.Object) (byte) -1);
        fila33.imprime();
        fila33.imprime();
        fila33.enfileira((java.lang.Object) 1L);
        boolean boolean40 = fila33.vazia();
        fila33.imprime();
        java.lang.Class<?> wildcardClass42 = fila33.getClass();
        fila25.enfileira((java.lang.Object) wildcardClass42);
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (short) 1);
        fila44.imprime();
        java.lang.Object obj48 = fila44.desenfileira();
        fila44.imprime();
        fila25.enfileira((java.lang.Object) fila44);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 1 + "'", obj48, (short) 1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        ds.Fila fila25 = new ds.Fila();
        fila25.enfileira((java.lang.Object) (byte) -1);
        fila25.imprime();
        fila25.imprime();
        fila25.imprime();
        java.lang.Object obj31 = fila25.desenfileira();
        fila0.enfileira((java.lang.Object) fila25);
        java.lang.Object obj33 = null;
        fila25.enfileira(obj33);
        fila25.enfileira((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 100L);
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila17.imprime();
        boolean boolean20 = fila17.vazia();
        boolean boolean21 = fila17.vazia();
        boolean boolean22 = fila17.vazia();
        fila0.enfileira((java.lang.Object) fila17);
        boolean boolean24 = fila0.vazia();
        boolean boolean25 = fila0.vazia();
        java.lang.Object obj26 = fila0.desenfileira();
        ds.Fila fila27 = new ds.Fila();
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) (byte) -1);
        fila28.enfileira((java.lang.Object) '4');
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        java.lang.Class<?> wildcardClass35 = fila33.getClass();
        fila28.enfileira((java.lang.Object) wildcardClass35);
        java.lang.Object obj37 = fila28.desenfileira();
        java.lang.Object obj38 = null;
        fila28.enfileira(obj38);
        java.lang.Object obj40 = fila28.desenfileira();
        fila28.enfileira((java.lang.Object) (byte) -1);
        boolean boolean43 = fila28.vazia();
        fila27.enfileira((java.lang.Object) fila28);
        boolean boolean45 = fila28.vazia();
        boolean boolean46 = fila28.vazia();
        fila0.enfileira((java.lang.Object) fila28);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '4' + "'", obj40, '4');
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = fila18.desenfileira();
        fila18.imprime();
        java.lang.Object obj29 = new java.lang.Object();
        fila18.enfileira(obj29);
        fila18.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.enfileira((java.lang.Object) (byte) -1);
        fila32.enfileira((java.lang.Object) '4');
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        java.lang.Class<?> wildcardClass39 = fila37.getClass();
        fila32.enfileira((java.lang.Object) wildcardClass39);
        java.lang.Object obj41 = fila32.desenfileira();
        boolean boolean42 = fila32.vazia();
        java.lang.Class<?> wildcardClass43 = fila32.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass43);
        java.lang.Object obj45 = fila18.desenfileira();
        fila18.imprime();
        fila18.imprime();
        fila0.enfileira((java.lang.Object) fila18);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (byte) -1);
        fila49.enfileira((java.lang.Object) '4');
        ds.Fila fila54 = new ds.Fila();
        fila54.imprime();
        java.lang.Class<?> wildcardClass56 = fila54.getClass();
        fila49.enfileira((java.lang.Object) wildcardClass56);
        java.lang.Object obj58 = fila49.desenfileira();
        fila49.imprime();
        java.lang.Class<?> wildcardClass60 = fila49.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '4' + "'", obj45, '4');
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) -1 + "'", obj58, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila6.enfileira(obj9);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Class<?> wildcardClass23 = fila12.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass23);
        boolean boolean25 = fila6.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) '4');
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        java.lang.Class<?> wildcardClass33 = fila31.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila26.desenfileira();
        fila26.imprime();
        java.lang.Object obj37 = new java.lang.Object();
        fila26.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.imprime();
        fila39.imprime();
        boolean boolean44 = fila39.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = fila39.desenfileira();
        fila26.enfileira((java.lang.Object) fila39);
        fila26.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (byte) -1);
        fila52.enfileira((java.lang.Object) '4');
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        java.lang.Class<?> wildcardClass59 = fila57.getClass();
        fila52.enfileira((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = fila52.desenfileira();
        boolean boolean62 = fila52.vazia();
        fila26.enfileira((java.lang.Object) fila52);
        fila6.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        java.lang.Object obj66 = fila26.desenfileira();
        ds.Fila fila67 = new ds.Fila();
        fila67.imprime();
        fila67.imprime();
        fila67.imprime();
        fila67.imprime();
        boolean boolean72 = fila67.vazia();
        fila67.imprime();
        fila26.enfileira((java.lang.Object) fila67);
        boolean boolean75 = fila26.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '4' + "'", obj66, '4');
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.imprime();
        fila12.imprime();
        fila12.enfileira((java.lang.Object) 1L);
        java.lang.Object obj19 = fila12.desenfileira();
        java.lang.Object obj20 = fila12.desenfileira();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila12.imprime();
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        java.lang.Class<?> wildcardClass29 = fila27.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = fila22.desenfileira();
        java.lang.Object obj32 = null;
        fila22.enfileira(obj32);
        java.lang.Object obj34 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass37 = fila22.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass37);
        fila11.imprime();
        boolean boolean40 = fila11.vazia();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '4' + "'", obj34, '4');
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.enfileira((java.lang.Object) 10.0d);
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        boolean boolean8 = fila6.vazia();
        fila6.imprime();
        fila6.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila6.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + '4' + "'", obj12, '4');
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        fila18.imprime();
        fila1.enfileira((java.lang.Object) fila18);
        boolean boolean29 = fila18.vazia();
        java.lang.Object obj30 = null;
        fila18.enfileira(obj30);
        java.lang.Object obj32 = fila18.desenfileira();
        boolean boolean33 = fila18.vazia();
        boolean boolean34 = fila18.vazia();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
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
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        fila0.imprime();
        java.lang.Object obj10 = fila0.desenfileira();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 10.0f);
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.imprime();
        fila6.imprime();
        java.lang.Class<?> wildcardClass11 = fila6.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass11);
        fila0.imprime();
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "class ds.Fila");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) '4');
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        java.lang.Class<?> wildcardClass11 = fila9.getClass();
        fila4.enfileira((java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = fila4.desenfileira();
        fila4.imprime();
        boolean boolean15 = fila4.vazia();
        java.lang.Object obj16 = fila4.desenfileira();
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean18 = fila4.vazia();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        fila0.imprime();
        fila0.imprime();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.enfileira((java.lang.Object) (byte) -1);
        fila7.enfileira((java.lang.Object) '4');
        java.lang.Object obj12 = fila7.desenfileira();
        fila7.imprime();
        java.lang.Object obj14 = fila7.desenfileira();
        fila0.enfileira(obj14);
        fila0.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.enfileira((java.lang.Object) (byte) -1);
        fila17.enfileira((java.lang.Object) '4');
        ds.Fila fila22 = new ds.Fila();
        fila22.imprime();
        java.lang.Class<?> wildcardClass24 = fila22.getClass();
        fila17.enfileira((java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = fila17.desenfileira();
        fila17.imprime();
        java.lang.Object obj28 = new java.lang.Object();
        fila17.enfileira(obj28);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (byte) -1);
        fila30.imprime();
        fila30.imprime();
        boolean boolean35 = fila30.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) -1);
        fila30.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = fila30.desenfileira();
        fila17.enfileira((java.lang.Object) fila30);
        java.lang.Object obj42 = fila17.desenfileira();
        fila17.imprime();
        java.lang.Class<?> wildcardClass44 = fila17.getClass();
        fila0.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + '4' + "'", obj14, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + '4' + "'", obj42, '4');
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        fila0.enfileira(obj3);
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = new java.lang.Object();
        fila0.enfileira(obj11);
        ds.Fila fila13 = new ds.Fila();
        fila13.enfileira((java.lang.Object) (byte) -1);
        fila13.imprime();
        fila13.imprime();
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        fila19.enfileira((java.lang.Object) (byte) -1);
        fila13.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila13.desenfileira();
        fila0.enfileira((java.lang.Object) fila13);
        java.lang.Object obj25 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object obj12 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class ds.Fila");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        boolean boolean4 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        fila6.enfileira(obj9);
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila12.enfileira((java.lang.Object) '4');
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        java.lang.Class<?> wildcardClass19 = fila17.getClass();
        fila12.enfileira((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = fila12.desenfileira();
        fila12.imprime();
        java.lang.Class<?> wildcardClass23 = fila12.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass23);
        boolean boolean25 = fila6.vazia();
        ds.Fila fila26 = new ds.Fila();
        fila26.enfileira((java.lang.Object) (byte) -1);
        fila26.enfileira((java.lang.Object) '4');
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        java.lang.Class<?> wildcardClass33 = fila31.getClass();
        fila26.enfileira((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = fila26.desenfileira();
        fila26.imprime();
        java.lang.Object obj37 = new java.lang.Object();
        fila26.enfileira(obj37);
        ds.Fila fila39 = new ds.Fila();
        fila39.enfileira((java.lang.Object) (byte) -1);
        fila39.imprime();
        fila39.imprime();
        boolean boolean44 = fila39.vazia();
        ds.Fila fila45 = new ds.Fila();
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila39.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = fila39.desenfileira();
        fila26.enfileira((java.lang.Object) fila39);
        fila26.imprime();
        ds.Fila fila52 = new ds.Fila();
        fila52.enfileira((java.lang.Object) (byte) -1);
        fila52.enfileira((java.lang.Object) '4');
        ds.Fila fila57 = new ds.Fila();
        fila57.imprime();
        java.lang.Class<?> wildcardClass59 = fila57.getClass();
        fila52.enfileira((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = fila52.desenfileira();
        boolean boolean62 = fila52.vazia();
        fila26.enfileira((java.lang.Object) fila52);
        fila6.enfileira((java.lang.Object) fila26);
        fila0.enfileira((java.lang.Object) fila26);
        boolean boolean66 = fila26.vazia();
        fila26.imprime();
        boolean boolean68 = fila26.vazia();
        fila26.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila10.enfileira((java.lang.Object) '4');
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        java.lang.Class<?> wildcardClass17 = fila15.getClass();
        fila10.enfileira((java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = fila10.desenfileira();
        fila10.imprime();
        java.lang.Object obj21 = fila10.desenfileira();
        java.lang.Object obj22 = fila10.desenfileira();
        java.lang.Class<?> wildcardClass23 = fila10.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '4' + "'", obj21, '4');
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class ds.Fila");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class ds.Fila");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class ds.Fila");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = fila10.desenfileira();
        boolean boolean14 = fila10.vazia();
        fila10.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        fila16.enfileira(obj19);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        java.lang.Class<?> wildcardClass29 = fila27.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = fila22.desenfileira();
        fila22.imprime();
        java.lang.Class<?> wildcardClass33 = fila22.getClass();
        fila16.enfileira((java.lang.Object) wildcardClass33);
        boolean boolean35 = fila16.vazia();
        ds.Fila fila36 = new ds.Fila();
        fila36.enfileira((java.lang.Object) (byte) -1);
        fila36.enfileira((java.lang.Object) '4');
        ds.Fila fila41 = new ds.Fila();
        fila41.imprime();
        java.lang.Class<?> wildcardClass43 = fila41.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass43);
        java.lang.Object obj45 = fila36.desenfileira();
        fila36.imprime();
        java.lang.Object obj47 = new java.lang.Object();
        fila36.enfileira(obj47);
        ds.Fila fila49 = new ds.Fila();
        fila49.enfileira((java.lang.Object) (byte) -1);
        fila49.imprime();
        fila49.imprime();
        boolean boolean54 = fila49.vazia();
        ds.Fila fila55 = new ds.Fila();
        fila55.enfileira((java.lang.Object) (byte) -1);
        fila49.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj59 = fila49.desenfileira();
        fila36.enfileira((java.lang.Object) fila49);
        fila36.imprime();
        ds.Fila fila62 = new ds.Fila();
        fila62.enfileira((java.lang.Object) (byte) -1);
        fila62.enfileira((java.lang.Object) '4');
        ds.Fila fila67 = new ds.Fila();
        fila67.imprime();
        java.lang.Class<?> wildcardClass69 = fila67.getClass();
        fila62.enfileira((java.lang.Object) wildcardClass69);
        java.lang.Object obj71 = fila62.desenfileira();
        boolean boolean72 = fila62.vazia();
        fila36.enfileira((java.lang.Object) fila62);
        fila16.enfileira((java.lang.Object) fila36);
        fila10.enfileira((java.lang.Object) fila36);
        fila10.imprime();
        fila6.enfileira((java.lang.Object) fila10);
        ds.Fila fila78 = new ds.Fila();
        fila78.enfileira((java.lang.Object) (short) 1);
        fila78.imprime();
        java.lang.Object obj82 = fila78.desenfileira();
        fila6.enfileira((java.lang.Object) fila78);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) -1 + "'", obj59, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (byte) -1 + "'", obj71, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (short) 1 + "'", obj82, (short) 1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 1L);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        fila11.enfileira((java.lang.Object) '4');
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        java.lang.Class<?> wildcardClass18 = fila16.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass18);
        fila11.imprime();
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila22 = new ds.Fila();
        fila22.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) '4');
        ds.Fila fila27 = new ds.Fila();
        fila27.imprime();
        java.lang.Class<?> wildcardClass29 = fila27.getClass();
        fila22.enfileira((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = fila22.desenfileira();
        java.lang.Object obj32 = null;
        fila22.enfileira(obj32);
        java.lang.Object obj34 = fila22.desenfileira();
        fila22.enfileira((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass37 = fila22.getClass();
        fila11.enfileira((java.lang.Object) wildcardClass37);
        boolean boolean39 = fila11.vazia();
        fila11.imprime();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '4' + "'", obj34, '4');
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.imprime();
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) false);
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj10 = fila6.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = fila11.desenfileira();
        boolean boolean15 = fila11.vazia();
        fila11.imprime();
        fila11.enfileira((java.lang.Object) 100L);
        fila6.enfileira((java.lang.Object) 100L);
        java.lang.Object obj20 = fila6.desenfileira();
        fila6.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100L + "'", obj20, 100L);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        java.lang.Class<?> wildcardClass7 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass7);
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        boolean boolean12 = fila0.vazia();
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        fila8.imprime();
        java.lang.Class<?> wildcardClass10 = fila8.getClass();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        fila18.enfileira((java.lang.Object) '4');
        ds.Fila fila23 = new ds.Fila();
        fila23.imprime();
        java.lang.Class<?> wildcardClass25 = fila23.getClass();
        fila18.enfileira((java.lang.Object) wildcardClass25);
        fila18.imprime();
        fila1.enfileira((java.lang.Object) fila18);
        fila18.imprime();
        boolean boolean30 = fila18.vazia();
        java.lang.Object obj31 = fila18.desenfileira();
        java.lang.Object obj32 = fila18.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '4' + "'", obj32, '4');
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) '4');
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '4' + "'", obj7, '4');
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila4.imprime();
        fila4.imprime();
        boolean boolean9 = fila4.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.enfileira((java.lang.Object) (byte) -1);
        fila4.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) (byte) -1);
        fila16.imprime();
        fila16.imprime();
        fila16.enfileira((java.lang.Object) 1L);
        java.lang.Object obj23 = fila16.desenfileira();
        java.lang.Object obj24 = fila16.desenfileira();
        fila16.imprime();
        java.lang.Class<?> wildcardClass26 = fila16.getClass();
        fila0.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) true);
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1L + "'", obj24, 1L);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        fila0.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) (byte) -1);
        fila6.enfileira((java.lang.Object) '4');
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        java.lang.Class<?> wildcardClass13 = fila11.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass13);
        fila6.imprime();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object obj17 = fila6.desenfileira();
        boolean boolean18 = fila6.vazia();
        java.lang.Object obj19 = fila6.desenfileira();
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) false);
        java.lang.Class<?> wildcardClass23 = fila20.getClass();
        fila6.enfileira((java.lang.Object) fila20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.enfileira((java.lang.Object) (byte) -1);
        fila1.enfileira((java.lang.Object) '4');
        ds.Fila fila6 = new ds.Fila();
        fila6.imprime();
        java.lang.Class<?> wildcardClass8 = fila6.getClass();
        fila1.enfileira((java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = fila1.desenfileira();
        java.lang.Object obj11 = null;
        fila1.enfileira(obj11);
        java.lang.Object obj13 = fila1.desenfileira();
        fila1.enfileira((java.lang.Object) (byte) -1);
        boolean boolean16 = fila1.vazia();
        fila0.enfileira((java.lang.Object) fila1);
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj21 = fila18.desenfileira();
        boolean boolean22 = fila18.vazia();
        fila18.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        fila24.enfileira(obj27);
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) (byte) -1);
        fila30.enfileira((java.lang.Object) '4');
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        java.lang.Class<?> wildcardClass37 = fila35.getClass();
        fila30.enfileira((java.lang.Object) wildcardClass37);
        java.lang.Object obj39 = fila30.desenfileira();
        fila30.imprime();
        java.lang.Class<?> wildcardClass41 = fila30.getClass();
        fila24.enfileira((java.lang.Object) wildcardClass41);
        boolean boolean43 = fila24.vazia();
        ds.Fila fila44 = new ds.Fila();
        fila44.enfileira((java.lang.Object) (byte) -1);
        fila44.enfileira((java.lang.Object) '4');
        ds.Fila fila49 = new ds.Fila();
        fila49.imprime();
        java.lang.Class<?> wildcardClass51 = fila49.getClass();
        fila44.enfileira((java.lang.Object) wildcardClass51);
        java.lang.Object obj53 = fila44.desenfileira();
        fila44.imprime();
        java.lang.Object obj55 = new java.lang.Object();
        fila44.enfileira(obj55);
        ds.Fila fila57 = new ds.Fila();
        fila57.enfileira((java.lang.Object) (byte) -1);
        fila57.imprime();
        fila57.imprime();
        boolean boolean62 = fila57.vazia();
        ds.Fila fila63 = new ds.Fila();
        fila63.enfileira((java.lang.Object) (byte) -1);
        fila57.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = fila57.desenfileira();
        fila44.enfileira((java.lang.Object) fila57);
        fila44.imprime();
        ds.Fila fila70 = new ds.Fila();
        fila70.enfileira((java.lang.Object) (byte) -1);
        fila70.enfileira((java.lang.Object) '4');
        ds.Fila fila75 = new ds.Fila();
        fila75.imprime();
        java.lang.Class<?> wildcardClass77 = fila75.getClass();
        fila70.enfileira((java.lang.Object) wildcardClass77);
        java.lang.Object obj79 = fila70.desenfileira();
        boolean boolean80 = fila70.vazia();
        fila44.enfileira((java.lang.Object) fila70);
        fila24.enfileira((java.lang.Object) fila44);
        fila18.enfileira((java.lang.Object) fila44);
        boolean boolean84 = fila44.vazia();
        fila0.enfileira((java.lang.Object) fila44);
        java.lang.Object obj86 = fila44.desenfileira();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (byte) -1 + "'", obj67, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + (byte) -1 + "'", obj79, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + '4' + "'", obj86, '4');
    }
}

