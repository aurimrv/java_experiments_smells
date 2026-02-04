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
        fila0.tras = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
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
        fila0.tras = 0;
        int int3 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        java.lang.Object[] objArray15 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.frente;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.tras;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.frente = 97;
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
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
        ds.Fila fila5 = new ds.Fila();
        fila5.tras = 0;
        fila5.frente = 10;
        boolean boolean10 = fila5.vazia();
        int int11 = fila5.frente;
        fila0.enfileira((java.lang.Object) int11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.frente = 0;
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.tras;
        boolean boolean4 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        int int5 = fila2.tras;
        java.lang.Object[] objArray6 = fila2.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila2.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila2.desenfileira();
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
        fila0.tras = 0;
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        fila4.tras = 0;
        fila4.imprime();
        int int8 = fila4.tras;
        java.lang.Object[] objArray9 = fila4.item;
        fila0.enfileira((java.lang.Object) objArray9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 1L);
        int int7 = fila2.tras;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila2.enfileira((java.lang.Object) fila4);
        int int7 = fila4.tras;
        java.lang.Object[] objArray8 = fila4.item;
        fila0.item = objArray8;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        fila0.tras = 10;
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = 0;
        fila18.imprime();
        int int22 = fila18.tras;
        java.lang.Object[] objArray23 = fila18.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
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
        fila2.enfileira((java.lang.Object) 1L);
        fila2.tras = 100;
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
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
        ds.Fila fila5 = new ds.Fila();
        fila5.tras = 'a';
        fila5.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila5.desenfileira();
        java.lang.Class<?> wildcardClass11 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        ds.Fila fila9 = new ds.Fila();
        fila9.tras = 0;
        fila9.frente = 10;
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = 0;
        fila14.frente = 10;
        java.lang.Object[] objArray20 = new java.lang.Object[] { true, fila9, fila14, (-1) };
        fila7.item = objArray20;
        fila0.item = objArray20;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila3.enfileira((java.lang.Object) fila5);
        int int8 = fila5.tras;
        java.lang.Object[] objArray9 = fila5.item;
        fila0.item = objArray9;
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        java.lang.Object[] objArray15 = fila0.item;
        int int16 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 0;
        fila0.tras = (short) -1;
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.frente = (short) 100;
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.tras;
        fila0.frente = (short) 100;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.tras = '4';
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object[] objArray12 = fila0.item;
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        fila0.tras = 98;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100L);
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        int int6 = fila0.frente;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        fila0.frente = (short) -1;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        fila6.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = fila6.desenfileira();
        java.lang.Object[] objArray12 = fila6.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = 0;
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.imprime();
        fila16.enfileira((java.lang.Object) fila18);
        int int21 = fila18.tras;
        java.lang.Object[] objArray22 = fila18.item;
        fila13.item = objArray22;
        fila6.item = objArray22;
        fila0.item = objArray22;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.tras = 'a';
        fila5.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila5.desenfileira();
        java.lang.Object[] objArray11 = fila5.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.tras = 0;
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        fila15.enfileira((java.lang.Object) fila17);
        int int20 = fila17.tras;
        java.lang.Object[] objArray21 = fila17.item;
        fila12.item = objArray21;
        fila5.item = objArray21;
        fila0.item = objArray21;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        int int5 = fila2.tras;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        fila6.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.tras = (short) 100;
        boolean boolean14 = fila6.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        java.lang.Object[] objArray17 = fila15.item;
        fila6.item = objArray17;
        fila2.enfileira((java.lang.Object) objArray17);
        java.lang.Class<?> wildcardClass20 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 'a';
        fila2.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = fila2.desenfileira();
        fila2.tras = (short) 100;
        boolean boolean10 = fila2.vazia();
        fila0.enfileira((java.lang.Object) boolean10);
        fila0.tras = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila2.enfileira((java.lang.Object) fila4);
        int int7 = fila4.tras;
        java.lang.Object[] objArray8 = fila4.item;
        fila0.item = objArray8;
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = (-1);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        fila0.tras = 10;
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1) + "'", obj7, (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        int int5 = fila2.tras;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        fila6.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.tras = (short) 100;
        boolean boolean14 = fila6.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        java.lang.Object[] objArray17 = fila15.item;
        fila6.item = objArray17;
        fila2.enfileira((java.lang.Object) objArray17);
        int int20 = fila2.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        int int16 = fila0.frente;
        fila0.tras = ' ';
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        fila0.enfileira((java.lang.Object) (short) 0);
        boolean boolean17 = fila0.vazia();
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila3.enfileira((java.lang.Object) fila5);
        int int8 = fila5.tras;
        java.lang.Object[] objArray9 = fila5.item;
        fila0.item = objArray9;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.tras = (-1);
        ds.Fila fila15 = new ds.Fila();
        fila15.tras = 0;
        fila15.imprime();
        fila15.tras = (short) -1;
        int int21 = fila15.frente;
        ds.Fila fila22 = new ds.Fila();
        fila22.tras = 'a';
        int int25 = fila22.tras;
        java.lang.Object[] objArray26 = fila22.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.tras = 'a';
        fila27.enfileira((java.lang.Object) (byte) -1);
        fila22.enfileira((java.lang.Object) (byte) -1);
        int int33 = fila22.tras;
        java.lang.Object[] objArray34 = fila22.item;
        fila15.item = objArray34;
        fila0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        java.lang.Object[] objArray14 = fila12.item;
        fila0.item = objArray14;
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        int int12 = fila9.tras;
        java.lang.Object[] objArray13 = fila9.item;
        fila0.item = objArray13;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 1L);
        fila2.enfileira((java.lang.Object) (short) 0);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        int int14 = fila11.tras;
        java.lang.Object[] objArray15 = fila11.item;
        fila2.item = objArray15;
        fila2.tras = (byte) 100;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = ' ';
        fila0.frente = (short) 1;
        fila0.frente = (byte) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
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
        int int5 = fila2.tras;
        java.lang.Object[] objArray6 = fila2.item;
        java.lang.Object[] objArray7 = fila2.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100L);
        fila0.tras = (short) 10;
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        fila0.tras = (byte) 10;
        ds.Fila fila9 = new ds.Fila();
        fila9.tras = 'a';
        int int12 = fila9.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.enfileira((java.lang.Object) 10L);
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object[] objArray12 = fila0.item;
        int int13 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 'a';
        int int10 = fila7.tras;
        java.lang.Object[] objArray11 = fila7.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.tras = 'a';
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila7.enfileira((java.lang.Object) (byte) -1);
        int int18 = fila7.tras;
        java.lang.Object[] objArray19 = fila7.item;
        fila0.item = objArray19;
        ds.Fila fila21 = new ds.Fila();
        fila21.tras = 0;
        fila21.imprime();
        int int25 = fila21.tras;
        java.lang.Object[] objArray26 = fila21.item;
        fila21.tras = ' ';
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila21);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        int int6 = fila0.frente;
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        java.lang.Object[] objArray14 = fila12.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        fila16.tras = 0;
        fila16.imprime();
        fila16.enfileira((java.lang.Object) (-1));
        boolean boolean22 = fila16.vazia();
        java.lang.Object obj23 = fila16.desenfileira();
        fila0.enfileira(obj23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1) + "'", obj23, (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.tras = (short) 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        java.lang.Object[] objArray11 = fila7.item;
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.tras = (short) 10;
        int int7 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.tras = 'a';
        fila5.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        int int11 = fila0.tras;
        java.lang.Object[] objArray12 = fila0.item;
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.tras = (byte) 0;
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 'a';
        fila7.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = fila7.desenfileira();
        int int13 = fila7.frente;
        fila0.enfileira((java.lang.Object) fila7);
        fila0.tras = '4';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.tras;
        fila0.frente = (short) 100;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100L);
        fila0.tras = (short) 10;
        ds.Fila fila11 = new ds.Fila();
        fila11.tras = 'a';
        int int14 = fila11.frente;
        boolean boolean15 = fila11.vazia();
        fila11.frente = 10;
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = 'a';
        int int21 = fila18.frente;
        boolean boolean22 = fila18.vazia();
        java.lang.Object[] objArray23 = fila18.item;
        fila11.item = objArray23;
        fila0.item = objArray23;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.tras = 'a';
        fila5.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        int int11 = fila0.tras;
        java.lang.Object[] objArray12 = fila0.item;
        fila0.frente = 97;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        fila0.tras = 10;
        boolean boolean17 = fila0.vazia();
        boolean boolean18 = fila0.vazia();
        ds.Fila fila19 = new ds.Fila();
        ds.Fila fila21 = new ds.Fila();
        fila21.tras = 0;
        fila21.frente = 10;
        ds.Fila fila26 = new ds.Fila();
        fila26.tras = 0;
        fila26.frente = 10;
        java.lang.Object[] objArray32 = new java.lang.Object[] { true, fila21, fila26, (-1) };
        fila19.item = objArray32;
        java.lang.Object[] objArray34 = fila19.item;
        fila19.frente = (byte) 0;
        java.lang.Object[] objArray37 = fila19.item;
        fila0.item = objArray37;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        int int15 = fila12.tras;
        java.lang.Object[] objArray16 = fila12.item;
        fila7.item = objArray16;
        fila0.item = objArray16;
        ds.Fila fila19 = new ds.Fila();
        fila19.tras = 0;
        fila19.frente = 10;
        java.lang.Object[] objArray24 = fila19.item;
        fila0.item = objArray24;
        int int26 = fila0.frente;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        int int6 = fila0.frente;
        fila0.frente = '#';
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
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
        boolean boolean5 = fila2.vazia();
        ds.Fila fila6 = new ds.Fila();
        ds.Fila fila8 = new ds.Fila();
        fila8.tras = 0;
        fila8.frente = 10;
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = 0;
        fila13.frente = 10;
        java.lang.Object[] objArray19 = new java.lang.Object[] { true, fila8, fila13, (-1) };
        fila6.item = objArray19;
        fila2.item = objArray19;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.frente = (byte) 0;
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        fila0.tras = 10;
        boolean boolean17 = fila0.vazia();
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        fila0.tras = ' ';
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila3.enfileira((java.lang.Object) fila5);
        int int8 = fila5.tras;
        java.lang.Object[] objArray9 = fila5.item;
        fila0.item = objArray9;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.tras = (-1);
        boolean boolean15 = fila0.vazia();
        int int16 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        int int9 = fila6.tras;
        java.lang.Object[] objArray10 = fila6.item;
        fila0.item = objArray10;
        fila0.tras = ' ';
        fila0.tras = 100;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.tras = 0;
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 100L);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.tras;
        java.lang.Object[] objArray16 = fila13.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        java.lang.Class<?> wildcardClass20 = fila17.getClass();
        ds.Fila fila21 = new ds.Fila();
        fila21.tras = 0;
        fila21.frente = 10;
        fila21.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray28 = new java.lang.Object[] { objArray16, fila17, fila21 };
        fila4.item = objArray28;
        fila0.item = objArray28;
        int int31 = fila0.frente;
        ds.Fila fila32 = new ds.Fila();
        fila32.tras = 'a';
        int int35 = fila32.tras;
        java.lang.Object[] objArray36 = fila32.item;
        ds.Fila fila37 = new ds.Fila();
        fila37.tras = 'a';
        fila37.enfileira((java.lang.Object) (byte) -1);
        fila32.enfileira((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass43 = fila32.getClass();
        fila0.enfileira((java.lang.Object) fila32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = (short) 100;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        java.lang.Object[] objArray14 = fila12.item;
        fila0.item = objArray14;
        fila0.tras = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 'a';
        int int10 = fila7.tras;
        java.lang.Object[] objArray11 = fila7.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.tras = 'a';
        fila12.enfileira((java.lang.Object) (byte) -1);
        fila7.enfileira((java.lang.Object) (byte) -1);
        int int18 = fila7.tras;
        java.lang.Object[] objArray19 = fila7.item;
        fila0.item = objArray19;
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        int int11 = fila9.tras;
        java.lang.Object[] objArray12 = fila9.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = 0;
        java.lang.Class<?> wildcardClass16 = fila13.getClass();
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        fila17.frente = 10;
        fila17.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray12, fila13, fila17 };
        fila0.item = objArray24;
        int int26 = fila0.frente;
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        fila6.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.tras = (short) 100;
        boolean boolean14 = fila6.vazia();
        java.lang.Object[] objArray15 = fila6.item;
        fila0.item = objArray15;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.tras = 'a';
        fila5.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        int int11 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
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
        int int5 = fila2.tras;
        java.lang.Object[] objArray6 = fila2.item;
        fila2.frente = (byte) 10;
        fila2.frente = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.frente = (byte) 0;
        fila0.frente = 100;
        fila0.tras = (short) 100;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = (short) 100;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object obj10 = fila0.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        fila11.tras = 0;
        fila11.frente = 10;
        int int16 = fila11.frente;
        java.lang.Class<?> wildcardClass17 = fila11.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass17);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        int int11 = fila9.tras;
        java.lang.Object[] objArray12 = fila9.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = 0;
        java.lang.Class<?> wildcardClass16 = fila13.getClass();
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        fila17.frente = 10;
        fila17.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray12, fila13, fila17 };
        fila0.item = objArray24;
        java.lang.Class<?> wildcardClass26 = objArray24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1) + "'", obj6, (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        fila0.imprime();
        fila0.tras = 1;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        int int9 = fila6.tras;
        java.lang.Object[] objArray10 = fila6.item;
        fila0.item = objArray10;
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray18 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        fila0.tras = 100;
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        fila0.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        int int12 = fila9.tras;
        fila0.enfileira((java.lang.Object) fila9);
        int int14 = fila9.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.frente;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
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
        int int5 = fila2.tras;
        java.lang.Object[] objArray6 = fila2.item;
        fila2.frente = (byte) 10;
        int int9 = fila2.frente;
        java.lang.Object[] objArray10 = fila2.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        fila0.frente = 2;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        fila6.frente = 10;
        ds.Fila fila11 = new ds.Fila();
        fila11.tras = 0;
        fila11.frente = 10;
        java.lang.Object[] objArray17 = new java.lang.Object[] { true, fila6, fila11, (-1) };
        fila4.item = objArray17;
        fila0.item = objArray17;
        fila0.tras = (byte) 10;
        fila0.tras = 1;
        ds.Fila fila24 = new ds.Fila();
        fila24.tras = 0;
        fila24.frente = 10;
        boolean boolean29 = fila24.vazia();
        int int30 = fila24.frente;
        fila24.enfileira((java.lang.Object) 0);
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila33.enfileira((java.lang.Object) fila35);
        int int38 = fila35.tras;
        java.lang.Object[] objArray39 = fila35.item;
        fila24.item = objArray39;
        fila0.enfileira((java.lang.Object) fila24);
        int int42 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        fila0.tras = 10;
        boolean boolean17 = fila0.vazia();
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        java.lang.Object[] objArray20 = fila18.item;
        java.lang.Object obj21 = new java.lang.Object();
        fila18.enfileira(obj21);
        int int23 = fila18.tras;
        ds.Fila fila24 = new ds.Fila();
        fila24.tras = 0;
        fila24.frente = 10;
        java.lang.Object[] objArray29 = fila24.item;
        fila18.item = objArray29;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.frente = '#';
        fila0.frente = '#';
        fila0.frente = (-1);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.imprime();
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        fila8.tras = 'a';
        fila8.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = fila8.desenfileira();
        fila8.tras = (short) 100;
        boolean boolean16 = fila8.vazia();
        java.lang.Object[] objArray17 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        fila0.tras = 100;
        java.lang.Object obj17 = fila0.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = 'a';
        int int21 = fila18.frente;
        ds.Fila fila22 = new ds.Fila();
        ds.Fila fila24 = new ds.Fila();
        fila24.tras = 0;
        fila24.frente = 10;
        ds.Fila fila29 = new ds.Fila();
        fila29.tras = 0;
        fila29.frente = 10;
        java.lang.Object[] objArray35 = new java.lang.Object[] { true, fila24, fila29, (-1) };
        fila22.item = objArray35;
        fila18.item = objArray35;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        int int11 = fila9.tras;
        java.lang.Object[] objArray12 = fila9.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = 0;
        java.lang.Class<?> wildcardClass16 = fila13.getClass();
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        fila17.frente = 10;
        fila17.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray12, fila13, fila17 };
        fila0.item = objArray24;
        int int26 = fila0.frente;
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 1L);
        fila2.enfileira((java.lang.Object) (short) 0);
        ds.Fila fila9 = new ds.Fila();
        fila9.tras = 0;
        fila9.frente = 10;
        java.lang.Object[] objArray14 = fila9.item;
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila17.enfileira((java.lang.Object) fila19);
        int int22 = fila19.tras;
        java.lang.Object[] objArray23 = fila19.item;
        fila15.item = objArray23;
        java.lang.Object[] objArray25 = fila15.item;
        fila9.item = objArray25;
        fila2.item = objArray25;
        java.lang.Object[] objArray28 = fila2.item;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
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
        fila2.enfileira((java.lang.Object) 1L);
        fila2.enfileira((java.lang.Object) (short) 0);
        fila2.imprime();
        fila2.imprime();
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
        fila2.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.tras;
        fila7.imprime();
        fila2.enfileira((java.lang.Object) fila7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.tras = 0;
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 100L);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.tras;
        java.lang.Object[] objArray16 = fila13.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        java.lang.Class<?> wildcardClass20 = fila17.getClass();
        ds.Fila fila21 = new ds.Fila();
        fila21.tras = 0;
        fila21.frente = 10;
        fila21.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray28 = new java.lang.Object[] { objArray16, fila17, fila21 };
        fila4.item = objArray28;
        fila0.item = objArray28;
        ds.Fila fila31 = new ds.Fila();
        fila31.tras = 'a';
        fila31.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj36 = fila31.desenfileira();
        java.lang.Object obj37 = fila31.desenfileira();
        java.lang.Object[] objArray38 = fila31.item;
        fila0.item = objArray38;
        fila0.frente = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila3.enfileira((java.lang.Object) fila5);
        int int8 = fila5.tras;
        java.lang.Object[] objArray9 = fila5.item;
        fila0.item = objArray9;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.tras = (-1);
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        fila0.imprime();
        fila0.tras = 1;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila6.frente = 10;
        ds.Fila fila13 = new ds.Fila();
        fila13.imprime();
        ds.Fila fila15 = new ds.Fila();
        fila15.imprime();
        fila13.enfileira((java.lang.Object) fila15);
        int int18 = fila15.tras;
        fila6.enfileira((java.lang.Object) fila15);
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object obj21 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Object obj6 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1) + "'", obj6, (-1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila3.enfileira((java.lang.Object) fila5);
        int int8 = fila5.tras;
        java.lang.Object[] objArray9 = fila5.item;
        fila0.item = objArray9;
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = fila0.desenfileira();
        int int14 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        fila0.frente = (byte) 1;
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.enfileira((java.lang.Object) 0);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        int int14 = fila11.tras;
        java.lang.Object[] objArray15 = fila11.item;
        fila0.item = objArray15;
        java.lang.Object obj17 = fila0.desenfileira();
        int int18 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.tras = (byte) 10;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
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
        int int5 = fila2.tras;
        java.lang.Object[] objArray6 = fila2.item;
        int int7 = fila2.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.frente = (byte) 0;
        fila0.frente = 100;
        boolean boolean20 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = 10;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        fila0.frente = 'a';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = 0;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila3.enfileira((java.lang.Object) fila5);
        int int8 = fila5.tras;
        java.lang.Object[] objArray9 = fila5.item;
        fila0.item = objArray9;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.tras = (-1);
        int int15 = fila0.tras;
        ds.Fila fila16 = new ds.Fila();
        fila16.tras = 'a';
        int int19 = fila16.tras;
        java.lang.Object[] objArray20 = fila16.item;
        ds.Fila fila21 = new ds.Fila();
        fila21.tras = 'a';
        fila21.enfileira((java.lang.Object) (byte) -1);
        fila16.enfileira((java.lang.Object) (byte) -1);
        int int27 = fila16.tras;
        int int28 = fila16.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 98 + "'", int28 == 98);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.tras = ' ';
        fila0.tras = (short) 100;
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1) + "'", obj6, (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.enfileira((java.lang.Object) 0);
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.enfileira((java.lang.Object) 0);
        int int9 = fila0.frente;
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = (short) 100;
        boolean boolean8 = fila0.vazia();
        fila0.tras = ' ';
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        int int11 = fila9.tras;
        java.lang.Object[] objArray12 = fila9.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = 0;
        java.lang.Class<?> wildcardClass16 = fila13.getClass();
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        fila17.frente = 10;
        fila17.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray12, fila13, fila17 };
        fila0.item = objArray24;
        int int26 = fila0.frente;
        ds.Fila fila27 = new ds.Fila();
        fila27.tras = 'a';
        int int30 = fila27.frente;
        ds.Fila fila31 = new ds.Fila();
        ds.Fila fila33 = new ds.Fila();
        fila33.tras = 0;
        fila33.frente = 10;
        ds.Fila fila38 = new ds.Fila();
        fila38.tras = 0;
        fila38.frente = 10;
        java.lang.Object[] objArray44 = new java.lang.Object[] { true, fila33, fila38, (-1) };
        fila31.item = objArray44;
        fila27.item = objArray44;
        int int47 = fila27.tras;
        ds.Fila fila48 = new ds.Fila();
        fila48.tras = 0;
        fila48.frente = 10;
        java.lang.Object[] objArray53 = fila48.item;
        fila48.frente = '#';
        fila48.frente = '#';
        java.lang.Object[] objArray58 = fila48.item;
        fila27.item = objArray58;
        fila0.item = objArray58;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        int int16 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila2.enfileira((java.lang.Object) fila4);
        int int7 = fila4.tras;
        java.lang.Object[] objArray8 = fila4.item;
        fila0.item = objArray8;
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        int int5 = fila2.tras;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        fila6.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = fila6.desenfileira();
        fila6.tras = (short) 100;
        boolean boolean14 = fila6.vazia();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        java.lang.Object[] objArray17 = fila15.item;
        fila6.item = objArray17;
        fila2.enfileira((java.lang.Object) objArray17);
        ds.Fila fila20 = new ds.Fila();
        fila20.tras = 'a';
        fila20.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = fila20.desenfileira();
        fila20.tras = (short) 100;
        boolean boolean28 = fila20.vazia();
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        java.lang.Object[] objArray31 = fila29.item;
        fila20.item = objArray31;
        fila2.item = objArray31;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.tras = 0;
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 100L);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.tras;
        java.lang.Object[] objArray16 = fila13.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        java.lang.Class<?> wildcardClass20 = fila17.getClass();
        ds.Fila fila21 = new ds.Fila();
        fila21.tras = 0;
        fila21.frente = 10;
        fila21.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray28 = new java.lang.Object[] { objArray16, fila17, fila21 };
        fila4.item = objArray28;
        fila0.item = objArray28;
        ds.Fila fila31 = new ds.Fila();
        fila31.tras = 'a';
        fila31.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj36 = fila31.desenfileira();
        java.lang.Object obj37 = fila31.desenfileira();
        java.lang.Object[] objArray38 = fila31.item;
        fila0.item = objArray38;
        ds.Fila fila40 = new ds.Fila();
        fila40.tras = 'a';
        int int43 = fila40.tras;
        java.lang.Object[] objArray44 = fila40.item;
        ds.Fila fila45 = new ds.Fila();
        fila45.tras = 'a';
        fila45.enfileira((java.lang.Object) (byte) -1);
        fila40.enfileira((java.lang.Object) (byte) -1);
        int int51 = fila40.tras;
        java.lang.Object[] objArray52 = fila40.item;
        fila0.item = objArray52;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 98 + "'", int51 == 98);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        fila0.frente = 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (-1.0d));
        int int7 = fila0.frente;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        fila6.frente = 10;
        ds.Fila fila11 = new ds.Fila();
        fila11.tras = 0;
        fila11.frente = 10;
        java.lang.Object[] objArray17 = new java.lang.Object[] { true, fila6, fila11, (-1) };
        fila4.item = objArray17;
        fila0.item = objArray17;
        fila0.tras = (byte) 10;
        fila0.tras = 1;
        ds.Fila fila24 = new ds.Fila();
        fila24.tras = 0;
        fila24.frente = 10;
        boolean boolean29 = fila24.vazia();
        int int30 = fila24.frente;
        fila24.enfileira((java.lang.Object) 0);
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila33.enfileira((java.lang.Object) fila35);
        int int38 = fila35.tras;
        java.lang.Object[] objArray39 = fila35.item;
        fila24.item = objArray39;
        fila0.enfileira((java.lang.Object) fila24);
        java.lang.Object obj42 = fila24.desenfileira();
        fila24.tras = (byte) -1;
        java.lang.Class<?> wildcardClass45 = fila24.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.tras;
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object[] objArray5 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.tras = 0;
        fila1.frente = 10;
        java.lang.Object[] objArray6 = fila1.item;
        java.lang.Object[] objArray7 = fila1.item;
        fila0.enfileira((java.lang.Object) objArray7);
        ds.Fila fila9 = new ds.Fila();
        ds.Fila fila11 = new ds.Fila();
        fila11.tras = 0;
        fila11.frente = 10;
        ds.Fila fila16 = new ds.Fila();
        fila16.tras = 0;
        fila16.frente = 10;
        java.lang.Object[] objArray22 = new java.lang.Object[] { true, fila11, fila16, (-1) };
        fila9.item = objArray22;
        boolean boolean24 = fila9.vazia();
        int int25 = fila9.frente;
        java.lang.Object[] objArray26 = fila9.item;
        fila0.item = objArray26;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        int int5 = fila2.tras;
        java.lang.Object[] objArray6 = fila2.item;
        fila2.frente = (byte) 10;
        java.lang.Object[] objArray9 = fila2.item;
        fila2.frente = '4';
        fila2.enfileira((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        fila1.tras = 0;
        fila1.frente = 10;
        java.lang.Object[] objArray6 = fila1.item;
        java.lang.Object[] objArray7 = fila1.item;
        fila0.enfileira((java.lang.Object) objArray7);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        int int15 = fila12.tras;
        java.lang.Object[] objArray16 = fila12.item;
        fila7.item = objArray16;
        fila0.item = objArray16;
        int int19 = fila0.frente;
        java.lang.Object[] objArray20 = fila0.item;
        int int21 = fila0.frente;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
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
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        java.lang.Object[] objArray9 = fila7.item;
        fila2.enfileira((java.lang.Object) fila7);
        int int11 = fila2.tras;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        int int5 = fila2.tras;
        java.lang.Object[] objArray6 = fila2.item;
        fila2.frente = (byte) 10;
        java.lang.Object[] objArray9 = fila2.item;
        fila2.frente = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.enfileira((java.lang.Object) 0);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        int int14 = fila11.tras;
        java.lang.Object[] objArray15 = fila11.item;
        fila0.item = objArray15;
        java.lang.Object obj17 = fila0.desenfileira();
        fila0.tras = 'a';
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        java.lang.Object[] objArray8 = fila6.item;
        fila0.item = objArray8;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100.0d);
        fila0.imprime();
        fila0.tras = (-1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.imprime();
        fila7.enfileira((java.lang.Object) (-1));
        boolean boolean13 = fila7.vazia();
        fila0.enfileira((java.lang.Object) fila7);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.tras = 0;
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 100L);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.tras;
        java.lang.Object[] objArray16 = fila13.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        java.lang.Class<?> wildcardClass20 = fila17.getClass();
        ds.Fila fila21 = new ds.Fila();
        fila21.tras = 0;
        fila21.frente = 10;
        fila21.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray28 = new java.lang.Object[] { objArray16, fila17, fila21 };
        fila4.item = objArray28;
        fila0.item = objArray28;
        int int31 = fila0.frente;
        ds.Fila fila32 = new ds.Fila();
        fila32.imprime();
        ds.Fila fila34 = new ds.Fila();
        fila34.imprime();
        fila32.enfileira((java.lang.Object) fila34);
        int int37 = fila34.tras;
        int int38 = fila34.tras;
        fila0.enfileira((java.lang.Object) int38);
        boolean boolean40 = fila0.vazia();
        ds.Fila fila41 = new ds.Fila();
        fila41.tras = 'a';
        fila41.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj46 = fila41.desenfileira();
        int int47 = fila41.frente;
        java.lang.Object[] objArray48 = fila41.item;
        fila0.item = objArray48;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object[] objArray12 = fila6.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila6.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        int int9 = fila6.tras;
        java.lang.Object[] objArray10 = fila6.item;
        fila0.item = objArray10;
        int int12 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.tras;
        fila0.frente = 2;
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.frente;
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.frente;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.tras = (short) -1;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        int int9 = fila6.tras;
        java.lang.Object[] objArray10 = fila6.item;
        fila0.item = objArray10;
        fila0.tras = ' ';
        int int14 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.enfileira((java.lang.Object) 0);
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.imprime();
        fila9.enfileira((java.lang.Object) fila11);
        int int14 = fila11.tras;
        java.lang.Object[] objArray15 = fila11.item;
        fila0.item = objArray15;
        java.lang.Object obj17 = fila0.desenfileira();
        java.lang.Object obj18 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.tras;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        int int4 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.tras = (short) 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila0.enfileira((java.lang.Object) fila7);
        fila7.imprime();
        ds.Fila fila11 = new ds.Fila();
        fila11.tras = 'a';
        int int14 = fila11.tras;
        java.lang.Object[] objArray15 = fila11.item;
        int int16 = fila11.frente;
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        int int20 = fila17.frente;
        boolean boolean21 = fila17.vazia();
        fila11.enfileira((java.lang.Object) fila17);
        ds.Fila fila23 = new ds.Fila();
        fila23.tras = 'a';
        fila23.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = fila23.desenfileira();
        java.lang.Object[] objArray29 = fila23.item;
        fila17.item = objArray29;
        fila7.enfileira((java.lang.Object) fila17);
        fila17.tras = (byte) 0;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.frente = (short) 0;
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.frente = 0;
        boolean boolean9 = fila0.vazia();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = 'a';
        int int13 = fila10.tras;
        java.lang.Object[] objArray14 = fila10.item;
        int int15 = fila10.frente;
        ds.Fila fila16 = new ds.Fila();
        fila16.tras = 0;
        int int19 = fila16.frente;
        boolean boolean20 = fila16.vazia();
        fila10.enfileira((java.lang.Object) fila16);
        java.lang.Object[] objArray22 = fila16.item;
        fila0.item = objArray22;
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1) + "'", obj6, (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        fila6.frente = 10;
        ds.Fila fila11 = new ds.Fila();
        fila11.tras = 0;
        fila11.frente = 10;
        java.lang.Object[] objArray17 = new java.lang.Object[] { true, fila6, fila11, (-1) };
        fila4.item = objArray17;
        fila0.item = objArray17;
        fila0.tras = (byte) 10;
        fila0.tras = 1;
        ds.Fila fila24 = new ds.Fila();
        fila24.tras = 0;
        fila24.frente = 10;
        boolean boolean29 = fila24.vazia();
        int int30 = fila24.frente;
        fila24.enfileira((java.lang.Object) 0);
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        ds.Fila fila35 = new ds.Fila();
        fila35.imprime();
        fila33.enfileira((java.lang.Object) fila35);
        int int38 = fila35.tras;
        java.lang.Object[] objArray39 = fila35.item;
        fila24.item = objArray39;
        fila0.enfileira((java.lang.Object) fila24);
        java.lang.Object obj42 = fila24.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        fila43.tras = 0;
        fila43.imprime();
        fila43.tras = (short) -1;
        int int49 = fila43.frente;
        ds.Fila fila50 = new ds.Fila();
        fila50.tras = 'a';
        int int53 = fila50.tras;
        java.lang.Object[] objArray54 = fila50.item;
        ds.Fila fila55 = new ds.Fila();
        fila55.tras = 'a';
        fila55.enfileira((java.lang.Object) (byte) -1);
        fila50.enfileira((java.lang.Object) (byte) -1);
        int int61 = fila50.tras;
        java.lang.Object[] objArray62 = fila50.item;
        fila43.item = objArray62;
        fila24.item = objArray62;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 98 + "'", int61 == 98);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.frente = (byte) 0;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.frente;
        int int7 = fila0.frente;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.tras;
        int int4 = fila0.frente;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 1L);
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        java.lang.Object[] objArray9 = fila7.item;
        fila2.enfileira((java.lang.Object) fila7);
        int int11 = fila7.frente;
        boolean boolean12 = fila7.vazia();
        java.lang.Object obj13 = null;
        fila7.enfileira(obj13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.enfileira((java.lang.Object) 97);
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        boolean boolean12 = fila7.vazia();
        int int13 = fila7.frente;
        fila7.enfileira((java.lang.Object) 0);
        int int16 = fila7.frente;
        fila0.enfileira((java.lang.Object) int16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = fila0.item;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 'a';
        int int10 = fila7.tras;
        java.lang.Object[] objArray11 = fila7.item;
        fila0.item = objArray11;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        fila6.frente = 10;
        ds.Fila fila11 = new ds.Fila();
        fila11.tras = 0;
        fila11.frente = 10;
        java.lang.Object[] objArray17 = new java.lang.Object[] { true, fila6, fila11, (-1) };
        fila4.item = objArray17;
        fila0.item = objArray17;
        fila0.tras = (byte) 10;
        fila0.frente = 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        boolean boolean15 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100.0d);
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        int int20 = fila18.tras;
        fila18.imprime();
        fila18.tras = 1;
        ds.Fila fila24 = new ds.Fila();
        fila24.tras = 'a';
        int int27 = fila24.frente;
        boolean boolean28 = fila24.vazia();
        fila24.frente = 10;
        ds.Fila fila31 = new ds.Fila();
        fila31.imprime();
        ds.Fila fila33 = new ds.Fila();
        fila33.imprime();
        fila31.enfileira((java.lang.Object) fila33);
        int int36 = fila33.tras;
        fila24.enfileira((java.lang.Object) fila33);
        fila18.enfileira((java.lang.Object) fila33);
        ds.Fila fila39 = new ds.Fila();
        fila39.tras = 'a';
        int int42 = fila39.frente;
        ds.Fila fila43 = new ds.Fila();
        ds.Fila fila45 = new ds.Fila();
        fila45.tras = 0;
        fila45.frente = 10;
        ds.Fila fila50 = new ds.Fila();
        fila50.tras = 0;
        fila50.frente = 10;
        java.lang.Object[] objArray56 = new java.lang.Object[] { true, fila45, fila50, (-1) };
        fila43.item = objArray56;
        fila39.item = objArray56;
        fila39.tras = (byte) 10;
        fila39.frente = (short) 100;
        java.lang.Object[] objArray63 = fila39.item;
        fila33.item = objArray63;
        fila0.item = objArray63;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        fila0.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        int int12 = fila9.tras;
        fila0.enfileira((java.lang.Object) fila9);
        int int14 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila2.enfileira((java.lang.Object) fila4);
        int int7 = fila4.tras;
        java.lang.Object[] objArray8 = fila4.item;
        fila0.item = objArray8;
        int int10 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        int int15 = fila12.tras;
        java.lang.Object[] objArray16 = fila12.item;
        fila7.item = objArray16;
        fila0.item = objArray16;
        java.lang.Object[] objArray19 = fila0.item;
        ds.Fila fila20 = new ds.Fila();
        fila20.tras = 0;
        fila20.imprime();
        fila20.tras = 97;
        fila0.enfileira((java.lang.Object) fila20);
        fila0.frente = (short) 100;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        fila0.tras = (short) 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        boolean boolean12 = fila9.vazia();
        fila0.enfileira((java.lang.Object) boolean12);
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        fila7.tras = (short) 10;
        ds.Fila fila14 = new ds.Fila();
        fila14.imprime();
        ds.Fila fila16 = new ds.Fila();
        fila16.imprime();
        fila14.enfileira((java.lang.Object) fila16);
        boolean boolean19 = fila16.vazia();
        fila7.enfileira((java.lang.Object) boolean19);
        fila0.enfileira((java.lang.Object) boolean19);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.tras = 'a';
        fila5.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) (byte) -1);
        int int11 = fila0.tras;
        java.lang.Object[] objArray12 = fila0.item;
        int int13 = fila0.frente;
        java.lang.Object obj14 = fila0.desenfileira();
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = (short) 100;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        fila0.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        ds.Fila fila9 = new ds.Fila();
        fila9.imprime();
        fila7.enfileira((java.lang.Object) fila9);
        int int12 = fila9.tras;
        fila0.enfileira((java.lang.Object) fila9);
        int int14 = fila0.tras;
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        int int17 = fila15.tras;
        fila15.imprime();
        fila15.tras = 1;
        java.lang.Object[] objArray21 = fila15.item;
        fila0.item = objArray21;
        java.lang.Object[] objArray23 = fila0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        int int5 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        fila0.frente = 98;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = new java.lang.Object();
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        fila5.tras = 'a';
        fila5.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = fila5.desenfileira();
        fila5.tras = (short) 100;
        boolean boolean13 = fila5.vazia();
        java.lang.Object[] objArray14 = fila5.item;
        java.lang.Object[] objArray15 = fila5.item;
        fila0.item = objArray15;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        fila0.frente = (short) -1;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 'a';
        int int9 = fila6.tras;
        java.lang.Object[] objArray10 = fila6.item;
        int int11 = fila6.frente;
        ds.Fila fila12 = new ds.Fila();
        fila12.tras = 0;
        int int15 = fila12.frente;
        boolean boolean16 = fila12.vazia();
        fila6.enfileira((java.lang.Object) fila12);
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = 'a';
        fila18.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = fila18.desenfileira();
        java.lang.Object[] objArray24 = fila18.item;
        fila12.item = objArray24;
        fila0.item = objArray24;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila3.enfileira((java.lang.Object) fila5);
        int int8 = fila5.tras;
        java.lang.Object[] objArray9 = fila5.item;
        fila0.item = objArray9;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.tras = (-1);
        java.lang.Object[] objArray15 = fila0.item;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (short) 10;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        fila10.frente = (short) 100;
        int int17 = fila10.frente;
        fila0.enfileira((java.lang.Object) int17);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        int int15 = fila12.tras;
        java.lang.Object[] objArray16 = fila12.item;
        fila7.item = objArray16;
        fila0.item = objArray16;
        ds.Fila fila19 = new ds.Fila();
        fila19.tras = 0;
        fila19.frente = 10;
        java.lang.Object[] objArray24 = fila19.item;
        fila0.item = objArray24;
        java.lang.Object obj26 = fila0.desenfileira();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila2 = new ds.Fila();
        fila2.tras = 0;
        fila2.frente = 10;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray13 = new java.lang.Object[] { true, fila2, fila7, (-1) };
        fila0.item = objArray13;
        java.lang.Object[] objArray15 = fila0.item;
        fila0.imprime();
        fila0.frente = 98;
        fila0.frente = 2;
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        ds.Fila fila7 = new ds.Fila();
        fila7.imprime();
        fila5.enfileira((java.lang.Object) fila7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { fila7 };
        fila0.item = objArray10;
        int int12 = fila0.tras;
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        int int15 = fila12.tras;
        java.lang.Object[] objArray16 = fila12.item;
        fila7.item = objArray16;
        fila0.item = objArray16;
        java.lang.Object[] objArray19 = fila0.item;
        ds.Fila fila20 = new ds.Fila();
        fila20.tras = 0;
        fila20.imprime();
        fila20.tras = 97;
        fila0.enfileira((java.lang.Object) fila20);
        fila20.frente = 0;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        fila0.frente = (byte) 1;
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        ds.Fila fila10 = new ds.Fila();
        fila10.imprime();
        ds.Fila fila12 = new ds.Fila();
        fila12.imprime();
        fila10.enfileira((java.lang.Object) fila12);
        int int15 = fila12.tras;
        java.lang.Object[] objArray16 = fila12.item;
        fila7.item = objArray16;
        fila0.item = objArray16;
        java.lang.Object[] objArray19 = fila0.item;
        ds.Fila fila20 = new ds.Fila();
        fila20.tras = 0;
        fila20.imprime();
        fila20.tras = 97;
        fila0.enfileira((java.lang.Object) fila20);
        ds.Fila fila27 = new ds.Fila();
        fila27.tras = 'a';
        int int30 = fila27.frente;
        boolean boolean31 = fila27.vazia();
        java.lang.Object[] objArray32 = fila27.item;
        fila20.item = objArray32;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        ds.Fila fila3 = new ds.Fila();
        fila3.imprime();
        ds.Fila fila5 = new ds.Fila();
        fila5.imprime();
        fila3.enfileira((java.lang.Object) fila5);
        int int8 = fila5.tras;
        java.lang.Object[] objArray9 = fila5.item;
        fila0.item = objArray9;
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.tras = (-1);
        fila0.frente = (byte) 1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        fila0.enfileira((java.lang.Object) 0.0d);
        boolean boolean7 = fila0.vazia();
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.tras = '4';
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        fila0.enfileira((java.lang.Object) 0);
        int int9 = fila0.frente;
        java.lang.Object[] objArray10 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        fila0.frente = (byte) 1;
        int int8 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        int int3 = fila0.tras;
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        fila0.enfileira((java.lang.Object) fila2);
        fila2.enfileira((java.lang.Object) 1L);
        fila2.enfileira((java.lang.Object) (short) 0);
        ds.Fila fila9 = new ds.Fila();
        fila9.tras = 0;
        fila9.frente = 10;
        java.lang.Object[] objArray14 = fila9.item;
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        ds.Fila fila17 = new ds.Fila();
        fila17.imprime();
        ds.Fila fila19 = new ds.Fila();
        fila19.imprime();
        fila17.enfileira((java.lang.Object) fila19);
        int int22 = fila19.tras;
        java.lang.Object[] objArray23 = fila19.item;
        fila15.item = objArray23;
        java.lang.Object[] objArray25 = fila15.item;
        fila9.item = objArray25;
        fila2.item = objArray25;
        fila2.tras = 32;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = (short) 100;
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.frente;
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.tras = 0;
        fila4.imprime();
        fila4.enfileira((java.lang.Object) (-1));
        boolean boolean10 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 100L);
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.tras;
        java.lang.Object[] objArray16 = fila13.item;
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        java.lang.Class<?> wildcardClass20 = fila17.getClass();
        ds.Fila fila21 = new ds.Fila();
        fila21.tras = 0;
        fila21.frente = 10;
        fila21.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray28 = new java.lang.Object[] { objArray16, fila17, fila21 };
        fila4.item = objArray28;
        fila0.item = objArray28;
        int int31 = fila0.frente;
        int int32 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.frente = 10;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 'a';
        int int10 = fila7.tras;
        java.lang.Object[] objArray11 = fila7.item;
        int int12 = fila7.frente;
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = 0;
        int int16 = fila13.frente;
        boolean boolean17 = fila13.vazia();
        fila7.enfileira((java.lang.Object) fila13);
        java.lang.Object[] objArray19 = fila7.item;
        fila0.item = objArray19;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        fila0.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj5 = fila0.desenfileira();
        fila0.tras = (short) 100;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = 0;
        fila10.frente = 10;
        java.lang.Object[] objArray15 = fila10.item;
        fila10.frente = '#';
        java.lang.Object obj18 = fila10.desenfileira();
        java.lang.Object[] objArray19 = fila10.item;
        fila0.item = objArray19;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        fila7.tras = 0;
        fila7.frente = 10;
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object[] objArray13 = fila7.item;
        fila0.enfileira((java.lang.Object) fila7);
        java.lang.Object obj15 = fila7.desenfileira();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        fila6.frente = 10;
        ds.Fila fila11 = new ds.Fila();
        fila11.tras = 0;
        fila11.frente = 10;
        java.lang.Object[] objArray17 = new java.lang.Object[] { true, fila6, fila11, (-1) };
        fila4.item = objArray17;
        fila0.item = objArray17;
        java.lang.Object obj20 = fila0.desenfileira();
        boolean boolean21 = fila0.vazia();
        fila0.tras = (byte) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) (-1));
        boolean boolean6 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 100L);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        int int11 = fila9.tras;
        java.lang.Object[] objArray12 = fila9.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = 0;
        java.lang.Class<?> wildcardClass16 = fila13.getClass();
        ds.Fila fila17 = new ds.Fila();
        fila17.tras = 0;
        fila17.frente = 10;
        fila17.enfileira((java.lang.Object) 97);
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray12, fila13, fila17 };
        fila0.item = objArray24;
        fila0.imprime();
        java.lang.Object obj27 = fila0.desenfileira();
        java.lang.Object obj28 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 0;
        fila0.imprime();
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = ' ';
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 'a';
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        fila6.tras = 0;
        int int9 = fila6.frente;
        boolean boolean10 = fila6.vazia();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila12 = new ds.Fila();
        fila12.tras = 'a';
        fila12.enfileira((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = fila12.desenfileira();
        java.lang.Object[] objArray18 = fila12.item;
        fila6.item = objArray18;
        ds.Fila fila20 = new ds.Fila();
        ds.Fila fila22 = new ds.Fila();
        fila22.tras = 0;
        fila22.frente = 10;
        ds.Fila fila27 = new ds.Fila();
        fila27.tras = 0;
        fila27.frente = 10;
        java.lang.Object[] objArray33 = new java.lang.Object[] { true, fila22, fila27, (-1) };
        fila20.item = objArray33;
        boolean boolean35 = fila20.vazia();
        int int36 = fila20.frente;
        java.lang.Object[] objArray37 = fila20.item;
        fila6.item = objArray37;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        ds.Fila fila2 = new ds.Fila();
        fila2.imprime();
        ds.Fila fila4 = new ds.Fila();
        fila4.imprime();
        fila2.enfileira((java.lang.Object) fila4);
        int int7 = fila4.tras;
        java.lang.Object[] objArray8 = fila4.item;
        fila0.item = objArray8;
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }
}

