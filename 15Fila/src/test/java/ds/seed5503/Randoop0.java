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
        java.lang.Class<?> wildcardClass1 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila3.item = objArray6;
        fila0.item = objArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        fila12.enfileira((java.lang.Object) 0);
        java.lang.Object obj15 = fila12.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        java.lang.Object obj11 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.tras = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.frente = 'a';
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila0.item = objArray3;
        java.lang.Class<?> wildcardClass5 = objArray3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila3.item = objArray6;
        fila0.item = objArray6;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.imprime();
        fila0.tras = (short) 10;
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.imprime();
        fila0.tras = (-1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        ds.Fila fila11 = new ds.Fila();
        fila11.enfileira((java.lang.Object) 0);
        fila11.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        fila0.frente = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        int int11 = fila0.frente;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        ds.Fila fila16 = new ds.Fila();
        fila16.enfileira((java.lang.Object) 0);
        fila16.frente = 'a';
        java.lang.Object[] objArray22 = new java.lang.Object[] { 'a', fila16, (short) 0 };
        fila13.item = objArray22;
        boolean boolean24 = fila13.vazia();
        fila13.frente = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila0.item = objArray3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        int int14 = fila0.frente;
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.tras = (short) 1;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        java.lang.Object obj24 = null;
        fila21.enfileira(obj24);
        fila21.tras = (short) 0;
        java.lang.Class<?> wildcardClass28 = fila21.getClass();
        fila0.enfileira((java.lang.Object) fila21);
        int int30 = fila21.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (byte) 100;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray16 = fila11.item;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.tras = (byte) 100;
        fila17.enfileira((java.lang.Object) 100);
        fila17.tras = 100;
        java.lang.Object[] objArray28 = fila17.item;
        fila17.tras = (byte) 100;
        java.lang.Class<?> wildcardClass31 = fila17.getClass();
        fila11.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.tras = (byte) 100;
        int int15 = fila8.tras;
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.frente = ' ';
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        java.lang.Object[] objArray21 = fila19.item;
        java.lang.Object[] objArray22 = fila19.item;
        fila8.enfileira((java.lang.Object) fila19);
        java.lang.Object[] objArray24 = fila19.item;
        fila0.enfileira((java.lang.Object) fila19);
        int int26 = fila19.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        fila0.tras = 101;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.tras = '4';
        fila0.tras = (short) 1;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) 0.0f);
        fila0.tras = (-1);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        int int11 = fila0.frente;
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        fila5.enfileira((java.lang.Object) "");
        int int15 = fila5.frente;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        boolean boolean14 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.tras = ' ';
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.tras = '#';
        fila17.tras = (short) 0;
        fila17.tras = (short) 10;
        fila17.enfileira((java.lang.Object) "");
        int int27 = fila17.frente;
        java.lang.Object[] objArray28 = fila17.item;
        fila12.item = objArray28;
        fila0.item = objArray28;
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object obj16 = null;
        fila13.enfileira(obj16);
        fila13.tras = (short) 0;
        int int20 = fila13.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        java.lang.Object obj29 = fila21.desenfileira();
        fila21.frente = ' ';
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        java.lang.Object[] objArray35 = fila32.item;
        fila21.enfileira((java.lang.Object) fila32);
        java.lang.Object[] objArray37 = fila32.item;
        fila13.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        int int40 = fila32.tras;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        fila41.tras = '#';
        fila41.tras = (short) 0;
        fila41.tras = (short) 10;
        int int49 = fila41.tras;
        ds.Fila fila50 = new ds.Fila();
        int int51 = fila50.tras;
        java.lang.Object[] objArray52 = fila50.item;
        fila41.item = objArray52;
        fila41.tras = 'a';
        java.lang.Object[] objArray56 = fila41.item;
        fila32.item = objArray56;
        int int58 = fila32.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila11.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj11 = fila7.desenfileira();
        fila7.tras = (byte) 100;
        fila7.enfileira((java.lang.Object) 100);
        int int16 = fila7.tras;
        java.lang.Object[] objArray17 = fila7.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila21.item = objArray24;
        fila18.item = objArray24;
        java.lang.Object[] objArray27 = fila18.item;
        fila7.item = objArray27;
        fila0.item = objArray27;
        java.lang.Object obj30 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object obj13 = null;
        fila10.enfileira(obj13);
        fila10.tras = (short) 0;
        int int17 = fila10.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj22 = fila18.desenfileira();
        fila18.tras = (byte) 100;
        int int25 = fila18.tras;
        java.lang.Object obj26 = fila18.desenfileira();
        fila18.frente = ' ';
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        java.lang.Object[] objArray32 = fila29.item;
        fila18.enfileira((java.lang.Object) fila29);
        java.lang.Object[] objArray34 = fila29.item;
        fila10.enfileira((java.lang.Object) fila29);
        fila10.tras = ' ';
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        fila38.tras = '#';
        fila38.tras = (short) 0;
        fila38.tras = (short) 10;
        fila38.enfileira((java.lang.Object) "");
        int int48 = fila38.frente;
        java.lang.Object[] objArray49 = fila38.item;
        fila10.item = objArray49;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) -1 + "'", obj22, (short) -1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        boolean boolean14 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object obj12 = null;
        fila9.enfileira(obj12);
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila0.enfileira((java.lang.Object) fila9);
        // The following exception was thrown during execution in test generation
        try {
            fila9.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        boolean boolean3 = fila0.vazia();
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.tras = '#';
        fila4.tras = (short) 0;
        fila4.tras = (short) 10;
        int int12 = fila4.tras;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object[] objArray16 = fila13.item;
        fila4.item = objArray16;
        fila0.item = objArray16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        boolean boolean5 = fila3.vazia();
        int int6 = fila3.tras;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.imprime();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        fila7.item = objArray12;
        fila3.item = objArray12;
        java.lang.Object[] objArray15 = fila3.item;
        fila0.item = objArray15;
        int int17 = fila0.frente;
        fila0.tras = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        java.lang.Object obj19 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.tras = '#';
        fila4.tras = (short) 0;
        fila4.tras = (short) 10;
        int int12 = fila4.tras;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        fila4.item = objArray15;
        fila4.tras = 101;
        fila4.tras = 0;
        fila4.frente = 35;
        fila0.enfileira((java.lang.Object) 35);
        fila0.imprime();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (byte) 100;
        fila0.frente = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.frente = '#';
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object obj11 = null;
        fila0.enfileira(obj11);
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        fila0.frente = '4';
        java.lang.Object[] objArray26 = fila0.item;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.frente;
        fila27.imprime();
        java.lang.Object[] objArray30 = fila27.item;
        fila0.item = objArray30;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        boolean boolean23 = fila12.vazia();
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        ds.Fila fila27 = new ds.Fila();
        fila27.enfileira((java.lang.Object) 0);
        fila27.frente = 'a';
        java.lang.Object[] objArray33 = new java.lang.Object[] { 'a', fila27, (short) 0 };
        fila24.item = objArray33;
        fila12.item = objArray33;
        boolean boolean36 = fila12.vazia();
        fila0.enfileira((java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.tras = '#';
        fila8.tras = (short) 0;
        fila8.tras = (short) 10;
        int int16 = fila8.tras;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        fila8.item = objArray19;
        fila8.tras = 101;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila26.item = objArray29;
        fila23.item = objArray29;
        fila8.item = objArray29;
        fila0.item = objArray29;
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.tras = (byte) 100;
        int int15 = fila8.tras;
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.frente = ' ';
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        java.lang.Object[] objArray21 = fila19.item;
        java.lang.Object[] objArray22 = fila19.item;
        fila8.enfileira((java.lang.Object) fila19);
        java.lang.Object[] objArray24 = fila19.item;
        fila0.enfileira((java.lang.Object) fila19);
        fila0.tras = ' ';
        fila0.tras = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object[] objArray12 = fila9.item;
        fila0.item = objArray12;
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        java.lang.Object[] objArray5 = fila3.item;
        fila0.item = objArray5;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = (short) 1;
        boolean boolean3 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.tras = '#';
        fila8.tras = (short) 0;
        fila8.tras = (short) 10;
        fila8.enfileira((java.lang.Object) "");
        fila8.frente = (byte) 0;
        java.lang.Object[] objArray20 = fila8.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        java.lang.Object obj24 = null;
        fila21.enfileira(obj24);
        fila21.tras = (short) 0;
        int int28 = fila21.frente;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj33 = fila29.desenfileira();
        fila29.tras = (byte) 100;
        int int36 = fila29.tras;
        java.lang.Object obj37 = fila29.desenfileira();
        fila29.frente = ' ';
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        java.lang.Object[] objArray42 = fila40.item;
        java.lang.Object[] objArray43 = fila40.item;
        fila29.enfileira((java.lang.Object) fila40);
        java.lang.Object[] objArray45 = fila40.item;
        fila21.enfileira((java.lang.Object) fila40);
        fila8.enfileira((java.lang.Object) fila40);
        int int48 = fila40.tras;
        ds.Fila fila49 = new ds.Fila();
        int int50 = fila49.tras;
        fila49.tras = '#';
        fila49.tras = (short) 0;
        fila49.tras = (short) 10;
        int int57 = fila49.tras;
        ds.Fila fila58 = new ds.Fila();
        int int59 = fila58.tras;
        java.lang.Object[] objArray60 = fila58.item;
        fila49.item = objArray60;
        fila49.tras = 'a';
        java.lang.Object[] objArray64 = fila49.item;
        fila40.item = objArray64;
        fila0.item = objArray64;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        java.lang.Object[] objArray5 = fila3.item;
        fila0.item = objArray5;
        boolean boolean7 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.tras = 101;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = 2;
        int int9 = fila0.frente;
        fila0.tras = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        int int14 = fila2.frente;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.tras = '#';
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj24 = fila20.desenfileira();
        fila20.tras = (byte) 100;
        fila20.enfileira((java.lang.Object) 100);
        fila20.tras = 100;
        java.lang.Object[] objArray31 = fila20.item;
        fila15.item = objArray31;
        fila2.item = objArray31;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = fila2.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        int int24 = fila0.frente;
        java.lang.Object[] objArray25 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        java.lang.Object[] objArray11 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.tras = '#';
        fila16.tras = (short) 0;
        boolean boolean22 = fila16.vazia();
        fila0.enfileira((java.lang.Object) boolean22);
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        java.lang.Object[] objArray26 = fila24.item;
        java.lang.Object obj27 = null;
        fila24.enfileira(obj27);
        boolean boolean29 = fila24.vazia();
        int int30 = fila24.tras;
        java.lang.Object[] objArray31 = fila24.item;
        fila0.item = objArray31;
        boolean boolean33 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = null;
        fila0.item = objArray1;
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.tras = '#';
        fila11.tras = (short) 0;
        fila11.tras = (short) 10;
        int int19 = fila11.tras;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        java.lang.Object[] objArray22 = fila20.item;
        fila11.item = objArray22;
        fila11.tras = 101;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila29.item = objArray32;
        fila26.item = objArray32;
        fila11.item = objArray32;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (byte) 100;
        int int14 = fila0.tras;
        int int15 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        int int2 = fila1.tras;
        fila1.tras = '#';
        fila1.tras = (short) 0;
        fila1.tras = (short) 10;
        int int9 = fila1.tras;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        fila1.item = objArray12;
        fila1.tras = 'a';
        java.lang.Object[] objArray16 = fila1.item;
        fila0.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        java.lang.Object[] objArray20 = fila18.item;
        fila0.enfileira((java.lang.Object) fila18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        fila5.enfileira((java.lang.Object) "");
        int int15 = fila5.frente;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Object obj10 = fila0.desenfileira();
        int int11 = fila0.frente;
        fila0.tras = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.tras = '#';
        fila8.tras = (short) 0;
        fila8.tras = (short) 10;
        int int16 = fila8.tras;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        fila8.item = objArray19;
        fila8.tras = 101;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila26.item = objArray29;
        fila23.item = objArray29;
        fila8.item = objArray29;
        fila0.item = objArray29;
        boolean boolean34 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.imprime();
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        fila0.frente = 0;
        fila0.tras = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.tras = 2;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.tras = (short) 100;
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        boolean boolean5 = fila3.vazia();
        int int6 = fila3.tras;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.imprime();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        fila7.item = objArray12;
        fila3.item = objArray12;
        java.lang.Object[] objArray15 = fila3.item;
        fila0.item = objArray15;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.tras = '#';
        fila17.tras = (short) 0;
        fila17.tras = (short) 10;
        int int25 = fila17.tras;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        fila17.item = objArray28;
        fila0.item = objArray28;
        int int31 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        fila0.frente = (byte) 1;
        fila0.tras = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object obj16 = null;
        fila13.enfileira(obj16);
        fila13.tras = (short) 0;
        int int20 = fila13.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        java.lang.Object obj29 = fila21.desenfileira();
        fila21.frente = ' ';
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        java.lang.Object[] objArray35 = fila32.item;
        fila21.enfileira((java.lang.Object) fila32);
        java.lang.Object[] objArray37 = fila32.item;
        fila13.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        int int40 = fila32.tras;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        fila41.tras = '#';
        fila41.tras = (short) 0;
        fila41.tras = (short) 10;
        int int49 = fila41.tras;
        ds.Fila fila50 = new ds.Fila();
        int int51 = fila50.tras;
        java.lang.Object[] objArray52 = fila50.item;
        fila41.item = objArray52;
        fila41.tras = 'a';
        java.lang.Object[] objArray56 = fila41.item;
        fila32.item = objArray56;
        fila32.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object obj16 = null;
        fila13.enfileira(obj16);
        fila13.tras = (short) 0;
        int int20 = fila13.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        java.lang.Object obj29 = fila21.desenfileira();
        fila21.frente = ' ';
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        java.lang.Object[] objArray35 = fila32.item;
        fila21.enfileira((java.lang.Object) fila32);
        java.lang.Object[] objArray37 = fila32.item;
        fila13.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.frente;
        java.lang.Class<?> wildcardClass18 = fila11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila0.item = objArray3;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.tras = '#';
        fila4.tras = (short) 0;
        fila4.tras = (short) 10;
        int int12 = fila4.tras;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        fila4.item = objArray15;
        fila4.tras = 101;
        fila4.tras = 0;
        fila4.frente = 35;
        fila0.enfileira((java.lang.Object) 35);
        boolean boolean24 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        int int16 = fila0.frente;
        fila0.enfileira((java.lang.Object) "");
        java.lang.Object[] objArray19 = fila0.item;
        fila0.frente = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object obj16 = null;
        fila13.enfileira(obj16);
        fila13.tras = (short) 0;
        int int20 = fila13.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        java.lang.Object obj29 = fila21.desenfileira();
        fila21.frente = ' ';
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        java.lang.Object[] objArray35 = fila32.item;
        fila21.enfileira((java.lang.Object) fila32);
        java.lang.Object[] objArray37 = fila32.item;
        fila13.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        int int40 = fila32.tras;
        boolean boolean41 = fila32.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = fila32.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.tras = (short) 1;
        fila0.frente = 1;
        java.lang.Object[] objArray23 = fila0.item;
        fila0.frente = 0;
        int int26 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        fila0.frente = 0;
        java.lang.Object obj16 = fila0.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        ds.Fila fila20 = new ds.Fila();
        fila20.enfileira((java.lang.Object) 0);
        fila20.frente = 'a';
        java.lang.Object[] objArray26 = new java.lang.Object[] { 'a', fila20, (short) 0 };
        fila17.item = objArray26;
        boolean boolean28 = fila17.vazia();
        fila17.frente = (byte) 10;
        fila17.frente = (byte) 0;
        int int33 = fila17.frente;
        fila17.enfileira((java.lang.Object) "");
        java.lang.Object[] objArray36 = fila17.item;
        fila0.enfileira((java.lang.Object) objArray36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = 2;
        boolean boolean9 = fila0.vazia();
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        java.lang.Object obj20 = fila12.desenfileira();
        int int21 = fila12.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila22.tras = 101;
        fila22.tras = 0;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        java.lang.Object[] objArray41 = fila39.item;
        java.lang.Object obj42 = null;
        fila39.enfileira(obj42);
        fila39.tras = (short) 0;
        int int46 = fila39.frente;
        java.lang.Object[] objArray47 = fila39.item;
        fila39.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { fila12, 0, fila39 };
        fila0.item = objArray49;
        java.lang.Object[] objArray51 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.frente;
        fila0.tras = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.tras = '#';
        fila8.tras = (short) 0;
        fila8.tras = (short) 10;
        fila8.enfileira((java.lang.Object) "");
        int int18 = fila8.frente;
        java.lang.Object[] objArray19 = fila8.item;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.tras = '#';
        fila25.tras = (short) 0;
        fila25.tras = (short) 10;
        fila25.enfileira((java.lang.Object) "");
        int int35 = fila25.frente;
        java.lang.Object[] objArray36 = fila25.item;
        fila20.item = objArray36;
        fila8.item = objArray36;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        java.lang.Object[] objArray41 = fila39.item;
        ds.Fila fila42 = new ds.Fila();
        int int43 = fila42.tras;
        ds.Fila fila44 = new ds.Fila();
        java.lang.Object[] objArray45 = fila44.item;
        fila42.item = objArray45;
        fila39.item = objArray45;
        java.lang.Object[] objArray48 = fila39.item;
        fila8.enfileira((java.lang.Object) objArray48);
        fila0.item = objArray48;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object obj16 = null;
        fila13.enfileira(obj16);
        fila13.tras = (short) 0;
        int int20 = fila13.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        java.lang.Object obj29 = fila21.desenfileira();
        fila21.frente = ' ';
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        java.lang.Object[] objArray35 = fila32.item;
        fila21.enfileira((java.lang.Object) fila32);
        java.lang.Object[] objArray37 = fila32.item;
        fila13.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        boolean boolean40 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 100);
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila3.item = objArray6;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        fila0.tras = 0;
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 'a';
        int int15 = fila0.frente;
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 100);
        fila0.frente = 0;
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        java.lang.Object obj13 = null;
        fila10.enfileira(obj13);
        fila10.tras = (short) 0;
        int int17 = fila10.frente;
        java.lang.Object[] objArray18 = fila10.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object obj12 = null;
        fila9.enfileira(obj12);
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila0.enfileira((java.lang.Object) fila9);
        int int17 = fila9.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila9.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        int int19 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.frente = 'a';
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        fila0.tras = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.tras = 2;
        java.lang.Object[] objArray8 = fila0.item;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.frente = '#';
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.tras = (byte) 100;
        int int15 = fila8.tras;
        int int16 = fila8.frente;
        java.lang.Object[] objArray17 = fila8.item;
        int int18 = fila8.frente;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.item = objArray19;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.frente = 35;
        int int20 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        fila0.tras = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.tras = '#';
        fila17.tras = (short) 0;
        fila17.tras = (short) 10;
        fila17.enfileira((java.lang.Object) "");
        int int27 = fila17.frente;
        java.lang.Object[] objArray28 = fila17.item;
        fila12.item = objArray28;
        fila0.item = objArray28;
        int int31 = fila0.frente;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj36 = fila32.desenfileira();
        fila32.tras = (byte) 100;
        boolean boolean39 = fila32.vazia();
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        fila40.tras = '#';
        fila40.tras = (short) 0;
        fila40.tras = (short) 10;
        int int48 = fila40.tras;
        ds.Fila fila49 = new ds.Fila();
        int int50 = fila49.tras;
        java.lang.Object[] objArray51 = fila49.item;
        fila40.item = objArray51;
        fila40.tras = 101;
        ds.Fila fila55 = new ds.Fila();
        int int56 = fila55.tras;
        java.lang.Object[] objArray57 = fila55.item;
        ds.Fila fila58 = new ds.Fila();
        int int59 = fila58.tras;
        ds.Fila fila60 = new ds.Fila();
        java.lang.Object[] objArray61 = fila60.item;
        fila58.item = objArray61;
        fila55.item = objArray61;
        fila40.item = objArray61;
        fila32.item = objArray61;
        fila0.item = objArray61;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) -1 + "'", obj36, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object obj16 = null;
        fila13.enfileira(obj16);
        fila13.tras = (short) 0;
        int int20 = fila13.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        java.lang.Object obj29 = fila21.desenfileira();
        fila21.frente = ' ';
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        java.lang.Object[] objArray35 = fila32.item;
        fila21.enfileira((java.lang.Object) fila32);
        java.lang.Object[] objArray37 = fila32.item;
        fila13.enfileira((java.lang.Object) fila32);
        fila13.tras = ' ';
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        fila41.tras = '#';
        fila41.tras = (short) 0;
        fila41.tras = (short) 10;
        fila41.enfileira((java.lang.Object) "");
        int int51 = fila41.frente;
        java.lang.Object[] objArray52 = fila41.item;
        fila13.item = objArray52;
        ds.Fila fila54 = new ds.Fila();
        int int55 = fila54.tras;
        fila54.tras = '#';
        boolean boolean58 = fila54.vazia();
        int int59 = fila54.tras;
        int int60 = fila54.tras;
        ds.Fila fila61 = new ds.Fila();
        java.lang.Object[] objArray62 = fila61.item;
        fila61.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj65 = fila61.desenfileira();
        fila61.tras = (byte) 100;
        fila61.enfileira((java.lang.Object) 100);
        int int70 = fila61.tras;
        java.lang.Object[] objArray71 = fila61.item;
        ds.Fila fila72 = new ds.Fila();
        int int73 = fila72.tras;
        java.lang.Object[] objArray74 = fila72.item;
        ds.Fila fila75 = new ds.Fila();
        int int76 = fila75.tras;
        ds.Fila fila77 = new ds.Fila();
        java.lang.Object[] objArray78 = fila77.item;
        fila75.item = objArray78;
        fila72.item = objArray78;
        java.lang.Object[] objArray81 = fila72.item;
        fila61.item = objArray81;
        fila54.item = objArray81;
        fila13.item = objArray81;
        fila0.enfileira((java.lang.Object) objArray81);
        boolean boolean86 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (short) -1 + "'", obj65, (short) -1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 101 + "'", int70 == 101);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        fila0.frente = 0;
        fila0.tras = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        int int11 = fila0.frente;
        int int12 = fila0.tras;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj17 = fila13.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.tras = '#';
        fila18.tras = (short) 0;
        fila18.tras = (short) 10;
        fila18.enfileira((java.lang.Object) "");
        int int28 = fila18.frente;
        java.lang.Object[] objArray29 = fila18.item;
        fila13.item = objArray29;
        fila0.item = objArray29;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj36 = fila32.desenfileira();
        fila32.tras = (byte) 100;
        int int39 = fila32.tras;
        java.lang.Object obj40 = fila32.desenfileira();
        fila32.frente = ' ';
        fila32.tras = (short) 0;
        int int45 = fila32.tras;
        ds.Fila fila46 = new ds.Fila();
        int int47 = fila46.tras;
        fila46.tras = '#';
        fila46.tras = (short) 0;
        fila46.tras = (short) 10;
        fila46.enfileira((java.lang.Object) "");
        int int56 = fila46.frente;
        java.lang.Object[] objArray57 = fila46.item;
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray59 = fila58.item;
        fila58.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj62 = fila58.desenfileira();
        fila58.tras = (byte) 100;
        int int65 = fila58.tras;
        java.lang.Object obj66 = fila58.desenfileira();
        int int67 = fila58.tras;
        ds.Fila fila68 = new ds.Fila();
        int int69 = fila68.tras;
        fila68.tras = '#';
        fila68.tras = (short) 0;
        fila68.tras = (short) 10;
        int int76 = fila68.tras;
        ds.Fila fila77 = new ds.Fila();
        int int78 = fila77.tras;
        java.lang.Object[] objArray79 = fila77.item;
        fila68.item = objArray79;
        fila68.tras = 101;
        fila68.tras = 0;
        ds.Fila fila85 = new ds.Fila();
        int int86 = fila85.tras;
        java.lang.Object[] objArray87 = fila85.item;
        java.lang.Object obj88 = null;
        fila85.enfileira(obj88);
        fila85.tras = (short) 0;
        int int92 = fila85.frente;
        java.lang.Object[] objArray93 = fila85.item;
        fila85.imprime();
        java.lang.Object[] objArray95 = new java.lang.Object[] { fila58, 0, fila85 };
        fila46.item = objArray95;
        fila32.item = objArray95;
        fila0.item = objArray95;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) -1 + "'", obj36, (short) -1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (short) -1 + "'", obj62, (short) -1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertNotNull(objArray95);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object obj12 = null;
        fila9.enfileira(obj12);
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray17 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.tras = '#';
        fila9.tras = (short) 0;
        fila9.tras = (short) 10;
        int int17 = fila9.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        fila9.item = objArray20;
        fila9.tras = 'a';
        java.lang.Object[] objArray24 = fila9.item;
        fila8.item = objArray24;
        fila0.item = objArray24;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (byte) 100;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.tras = '#';
        fila14.tras = (short) 0;
        fila14.tras = (short) 10;
        int int22 = fila14.tras;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        fila14.item = objArray25;
        fila14.tras = 'a';
        java.lang.Object[] objArray29 = fila14.item;
        fila0.item = objArray29;
        fila0.frente = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        fila0.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.frente = (short) 1;
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) (short) -1);
        fila9.imprime();
        boolean boolean14 = fila9.vazia();
        java.lang.Object[] objArray15 = fila9.item;
        fila9.frente = 2;
        boolean boolean18 = fila9.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        ds.Fila fila6 = new ds.Fila();
        fila6.enfileira((java.lang.Object) 0);
        fila6.frente = 'a';
        java.lang.Object[] objArray12 = new java.lang.Object[] { 'a', fila6, (short) 0 };
        fila3.item = objArray12;
        boolean boolean14 = fila3.vazia();
        fila3.frente = (byte) 10;
        fila3.frente = (byte) 0;
        int int19 = fila3.frente;
        fila3.enfileira((java.lang.Object) "");
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj26 = fila22.desenfileira();
        fila22.tras = (byte) 100;
        fila22.enfileira((java.lang.Object) 100);
        fila22.tras = 100;
        java.lang.Object[] objArray33 = fila22.item;
        fila3.item = objArray33;
        fila0.enfileira((java.lang.Object) objArray33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.tras = ' ';
        java.lang.Object[] objArray11 = fila0.item;
        boolean boolean12 = fila0.vazia();
        fila0.tras = 11;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.tras = 1;
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        int int4 = fila0.tras;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        java.lang.Object[] objArray6 = fila0.item;
        fila0.frente = 2;
        boolean boolean9 = fila0.vazia();
        java.lang.Object[] objArray10 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        int int11 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object obj16 = null;
        fila13.enfileira(obj16);
        fila13.tras = (short) 0;
        int int20 = fila13.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        java.lang.Object obj29 = fila21.desenfileira();
        fila21.frente = ' ';
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        java.lang.Object[] objArray35 = fila32.item;
        fila21.enfileira((java.lang.Object) fila32);
        java.lang.Object[] objArray37 = fila32.item;
        fila13.enfileira((java.lang.Object) fila32);
        fila0.enfileira((java.lang.Object) fila32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = fila32.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        int int16 = fila0.frente;
        fila0.enfileira((java.lang.Object) "");
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.tras = (byte) 100;
        fila19.enfileira((java.lang.Object) 100);
        fila19.tras = 100;
        java.lang.Object[] objArray30 = fila19.item;
        fila0.item = objArray30;
        fila0.tras = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Object obj10 = fila0.desenfileira();
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.tras = (short) 1;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        fila29.tras = '#';
        fila29.tras = (short) 0;
        fila29.tras = (short) 10;
        int int37 = fila29.tras;
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        java.lang.Object[] objArray40 = fila38.item;
        fila29.item = objArray40;
        fila29.tras = 101;
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.tras;
        java.lang.Object[] objArray46 = fila44.item;
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray50 = fila49.item;
        fila47.item = objArray50;
        fila44.item = objArray50;
        fila29.item = objArray50;
        fila21.item = objArray50;
        fila0.enfileira((java.lang.Object) objArray50);
        java.lang.Object[] objArray56 = fila0.item;
        ds.Fila fila57 = new ds.Fila();
        int int58 = fila57.tras;
        java.lang.Object[] objArray59 = fila57.item;
        ds.Fila fila60 = new ds.Fila();
        int int61 = fila60.tras;
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila60.item = objArray63;
        fila57.item = objArray63;
        java.lang.Object[] objArray66 = fila57.item;
        fila0.item = objArray66;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 1.0d);
        int int9 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila3.item = objArray6;
        fila0.item = objArray6;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.frente = 0;
        int int12 = fila0.tras;
        fila0.frente = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        fila0.tras = (byte) 0;
        fila0.tras = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        int int11 = fila0.frente;
        boolean boolean12 = fila0.vazia();
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object obj16 = null;
        fila13.enfileira(obj16);
        fila13.tras = (short) 0;
        int int20 = fila13.frente;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        ds.Fila fila24 = new ds.Fila();
        fila24.enfileira((java.lang.Object) 0);
        fila24.frente = 'a';
        java.lang.Object[] objArray30 = new java.lang.Object[] { 'a', fila24, (short) 0 };
        fila21.item = objArray30;
        boolean boolean32 = fila21.vazia();
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila33.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj37 = fila33.desenfileira();
        fila33.tras = (byte) 100;
        int int40 = fila33.tras;
        java.lang.Object obj41 = fila33.desenfileira();
        int int42 = fila33.tras;
        java.lang.Object[] objArray43 = fila33.item;
        fila21.item = objArray43;
        fila13.item = objArray43;
        fila0.item = objArray43;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) -1 + "'", obj37, (short) -1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.frente = '#';
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.tras = '#';
        fila8.tras = (short) 0;
        fila8.tras = (short) 10;
        fila8.enfileira((java.lang.Object) "");
        int int18 = fila8.frente;
        java.lang.Object[] objArray19 = fila8.item;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.tras = '#';
        fila25.tras = (short) 0;
        fila25.tras = (short) 10;
        fila25.enfileira((java.lang.Object) "");
        int int35 = fila25.frente;
        java.lang.Object[] objArray36 = fila25.item;
        fila20.item = objArray36;
        fila8.item = objArray36;
        fila0.enfileira((java.lang.Object) objArray36);
        int int40 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.tras = (short) 1;
        fila0.frente = 1;
        java.lang.Object[] objArray23 = fila0.item;
        fila0.frente = 0;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        java.lang.Object obj29 = null;
        fila26.enfileira(obj29);
        fila26.tras = (short) 0;
        int int33 = fila26.frente;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        ds.Fila fila37 = new ds.Fila();
        fila37.enfileira((java.lang.Object) 0);
        fila37.frente = 'a';
        java.lang.Object[] objArray43 = new java.lang.Object[] { 'a', fila37, (short) 0 };
        fila34.item = objArray43;
        boolean boolean45 = fila34.vazia();
        ds.Fila fila46 = new ds.Fila();
        java.lang.Object[] objArray47 = fila46.item;
        fila46.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj50 = fila46.desenfileira();
        fila46.tras = (byte) 100;
        int int53 = fila46.tras;
        java.lang.Object obj54 = fila46.desenfileira();
        int int55 = fila46.tras;
        java.lang.Object[] objArray56 = fila46.item;
        fila34.item = objArray56;
        fila26.item = objArray56;
        fila0.item = objArray56;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (short) -1 + "'", obj50, (short) -1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.tras = 100;
        fila0.frente = '#';
        java.lang.Object[] objArray16 = fila0.item;
        java.lang.Object[] objArray17 = fila0.item;
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        int int14 = fila2.frente;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.tras = '#';
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj24 = fila20.desenfileira();
        fila20.tras = (byte) 100;
        fila20.enfileira((java.lang.Object) 100);
        fila20.tras = 100;
        java.lang.Object[] objArray31 = fila20.item;
        fila15.item = objArray31;
        fila2.item = objArray31;
        int int34 = fila2.tras;
        java.lang.Object[] objArray35 = fila2.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        java.lang.Object obj20 = fila12.desenfileira();
        int int21 = fila12.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila22.tras = 101;
        fila22.tras = 0;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        java.lang.Object[] objArray41 = fila39.item;
        java.lang.Object obj42 = null;
        fila39.enfileira(obj42);
        fila39.tras = (short) 0;
        int int46 = fila39.frente;
        java.lang.Object[] objArray47 = fila39.item;
        fila39.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { fila12, 0, fila39 };
        fila0.item = objArray49;
        int int51 = fila0.frente;
        boolean boolean52 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) 0;
        fila0.tras = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.frente = '#';
        fila0.frente = 'a';
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.tras = (byte) 100;
        fila11.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        int int29 = fila21.frente;
        java.lang.Object[] objArray30 = fila21.item;
        fila0.item = objArray30;
        fila0.frente = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj11 = fila7.desenfileira();
        fila7.tras = (byte) 100;
        fila7.enfileira((java.lang.Object) 100);
        int int16 = fila7.tras;
        java.lang.Object[] objArray17 = fila7.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila21.item = objArray24;
        fila18.item = objArray24;
        java.lang.Object[] objArray27 = fila18.item;
        fila7.item = objArray27;
        fila0.item = objArray27;
        int int30 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.tras = (short) 100;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.tras = '#';
        fila20.tras = (short) 0;
        fila20.tras = (short) 10;
        int int28 = fila20.tras;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        fila20.item = objArray31;
        fila20.tras = 101;
        java.lang.Object[] objArray35 = fila20.item;
        fila0.item = objArray35;
        int int37 = fila0.frente;
        java.lang.Object obj38 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        int int16 = fila0.frente;
        fila0.imprime();
        int int18 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        boolean boolean5 = fila3.vazia();
        int int6 = fila3.tras;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.imprime();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        fila7.item = objArray12;
        fila3.item = objArray12;
        java.lang.Object[] objArray15 = fila3.item;
        fila0.item = objArray15;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        boolean boolean5 = fila3.vazia();
        int int6 = fila3.tras;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.imprime();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        fila7.item = objArray12;
        fila3.item = objArray12;
        java.lang.Object[] objArray15 = fila3.item;
        fila0.item = objArray15;
        int int17 = fila0.frente;
        fila0.tras = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = (short) 1;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.imprime();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        java.lang.Object[] objArray8 = fila6.item;
        fila3.item = objArray8;
        fila0.item = objArray8;
        int int11 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj14 = fila10.desenfileira();
        fila10.tras = (byte) 100;
        fila10.enfileira((java.lang.Object) 100);
        fila10.tras = 100;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        boolean boolean23 = fila21.vazia();
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        boolean boolean26 = fila24.vazia();
        int int27 = fila24.tras;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.frente;
        fila28.imprime();
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila28.item = objArray33;
        fila24.item = objArray33;
        java.lang.Object[] objArray36 = fila24.item;
        fila21.item = objArray36;
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        fila38.tras = '#';
        fila38.tras = (short) 0;
        fila38.tras = (short) 10;
        int int46 = fila38.tras;
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        java.lang.Object[] objArray49 = fila47.item;
        fila38.item = objArray49;
        fila21.item = objArray49;
        fila10.item = objArray49;
        fila0.item = objArray49;
        fila0.tras = 11;
        java.lang.Class<?> wildcardClass56 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        fila0.imprime();
        fila0.frente = (byte) 1;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.tras = (byte) 100;
        int int18 = fila11.tras;
        int int19 = fila11.tras;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        java.lang.Object[] objArray22 = fila20.item;
        java.lang.Object obj23 = null;
        fila20.enfileira(obj23);
        boolean boolean25 = fila20.vazia();
        boolean boolean26 = fila20.vazia();
        fila11.enfileira((java.lang.Object) fila20);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.tras = (short) 100;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.tras = '#';
        fila20.tras = (short) 0;
        fila20.tras = (short) 10;
        int int28 = fila20.tras;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        fila20.item = objArray31;
        fila20.tras = 101;
        java.lang.Object[] objArray35 = fila20.item;
        fila0.item = objArray35;
        int int37 = fila0.frente;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.frente = '#';
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.tras = '#';
        fila8.tras = (short) 0;
        fila8.tras = (short) 10;
        fila8.enfileira((java.lang.Object) "");
        int int18 = fila8.frente;
        java.lang.Object[] objArray19 = fila8.item;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj24 = fila20.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.tras = '#';
        fila25.tras = (short) 0;
        fila25.tras = (short) 10;
        fila25.enfileira((java.lang.Object) "");
        int int35 = fila25.frente;
        java.lang.Object[] objArray36 = fila25.item;
        fila20.item = objArray36;
        fila8.item = objArray36;
        fila0.enfileira((java.lang.Object) objArray36);
        java.lang.Class<?> wildcardClass40 = objArray36.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        java.lang.Object[] objArray14 = fila0.item;
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.tras = (short) 100;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.tras = '#';
        fila20.tras = (short) 0;
        fila20.tras = (short) 10;
        int int28 = fila20.tras;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        fila20.item = objArray31;
        fila20.tras = 101;
        java.lang.Object[] objArray35 = fila20.item;
        fila0.item = objArray35;
        java.lang.Object[] objArray37 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.tras = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila0.item = objArray3;
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.enfileira((java.lang.Object) 0);
        fila9.frente = 'a';
        java.lang.Object[] objArray15 = new java.lang.Object[] { 'a', fila9, (short) 0 };
        fila6.item = objArray15;
        boolean boolean17 = fila6.vazia();
        fila6.frente = (byte) 10;
        fila6.frente = (byte) 0;
        int int22 = fila6.frente;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj27 = fila23.desenfileira();
        fila23.tras = (byte) 100;
        fila23.enfileira((java.lang.Object) 100);
        int int32 = fila23.tras;
        java.lang.Object[] objArray33 = fila23.item;
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        java.lang.Object[] objArray36 = fila34.item;
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.tras;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila37.item = objArray40;
        fila34.item = objArray40;
        java.lang.Object[] objArray43 = fila34.item;
        fila23.item = objArray43;
        fila6.item = objArray43;
        fila0.enfileira((java.lang.Object) fila6);
        int int47 = fila6.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) -1 + "'", obj27, (short) -1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 101 + "'", int32 == 101);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        int int14 = fila2.frente;
        java.lang.Class<?> wildcardClass15 = fila2.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        fila0.imprime();
        fila0.imprime();
        fila0.frente = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.tras = '4';
        boolean boolean4 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (byte) 100;
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Object[] objArray10 = fila0.item;
        fila0.frente = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        java.lang.Object obj19 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        fila0.tras = 0;
        int int17 = fila0.tras;
        int int18 = fila0.tras;
        int int19 = fila0.tras;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = 0;
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.frente = (byte) 10;
        java.lang.Object[] objArray21 = fila0.item;
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        fila0.tras = 0;
        int int17 = fila0.tras;
        int int18 = fila0.tras;
        int int19 = fila0.tras;
        boolean boolean20 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int3 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        int int11 = fila0.frente;
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        int int20 = fila12.frente;
        java.lang.Object[] objArray21 = fila12.item;
        int int22 = fila12.frente;
        fila0.enfileira((java.lang.Object) fila12);
        fila12.frente = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila12.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object obj12 = null;
        fila9.enfileira(obj12);
        boolean boolean14 = fila9.vazia();
        boolean boolean15 = fila9.vazia();
        fila0.enfileira((java.lang.Object) fila9);
        int int17 = fila9.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        java.lang.Object obj21 = null;
        fila18.enfileira(obj21);
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.tras = '#';
        fila23.tras = (short) 0;
        fila23.tras = (short) 10;
        int int31 = fila23.tras;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        fila23.item = objArray34;
        fila18.item = objArray34;
        fila18.tras = (short) 1;
        boolean boolean39 = fila18.vazia();
        java.lang.Object[] objArray40 = fila18.item;
        fila9.enfileira((java.lang.Object) objArray40);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.tras = (byte) 100;
        fila11.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        fila11.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray30 = fila21.item;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        fila31.tras = '#';
        fila31.tras = (short) 0;
        fila31.tras = (short) 10;
        fila31.enfileira((java.lang.Object) "");
        int int41 = fila31.frente;
        fila31.tras = (short) 10;
        java.lang.Object[] objArray44 = fila31.item;
        fila21.item = objArray44;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object[] objArray3 = fila0.item;
        fila0.tras = 0;
        boolean boolean6 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.tras = '#';
        fila8.tras = (short) 0;
        fila8.tras = (short) 10;
        int int16 = fila8.tras;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        fila8.item = objArray19;
        fila8.tras = 101;
        java.lang.Object[] objArray23 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.tras = (short) 0;
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.tras = 100;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj18 = fila14.desenfileira();
        fila14.tras = (byte) 100;
        boolean boolean21 = fila14.vazia();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila22.tras = 101;
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.tras;
        java.lang.Object[] objArray39 = fila37.item;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        ds.Fila fila42 = new ds.Fila();
        java.lang.Object[] objArray43 = fila42.item;
        fila40.item = objArray43;
        fila37.item = objArray43;
        fila22.item = objArray43;
        fila14.item = objArray43;
        fila0.item = objArray43;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.tras = (short) 1;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        java.lang.Object obj24 = null;
        fila21.enfileira(obj24);
        fila21.tras = (short) 0;
        java.lang.Class<?> wildcardClass28 = fila21.getClass();
        fila0.enfileira((java.lang.Object) fila21);
        int int30 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        fila11.frente = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        java.lang.Object obj20 = fila12.desenfileira();
        int int21 = fila12.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila22.tras = 101;
        fila22.tras = 0;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        java.lang.Object[] objArray41 = fila39.item;
        java.lang.Object obj42 = null;
        fila39.enfileira(obj42);
        fila39.tras = (short) 0;
        int int46 = fila39.frente;
        java.lang.Object[] objArray47 = fila39.item;
        fila39.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { fila12, 0, fila39 };
        fila0.item = objArray49;
        int int51 = fila0.frente;
        java.lang.Object obj52 = fila0.desenfileira();
        fila0.tras = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        fila0.frente = '4';
        java.lang.Object[] objArray26 = fila0.item;
        fila0.frente = 101;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        int int20 = fila12.frente;
        java.lang.Object[] objArray21 = fila12.item;
        int int22 = fila12.frente;
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj24 = fila12.desenfileira();
        java.lang.Object[] objArray25 = fila12.item;
        ds.Fila fila26 = new ds.Fila();
        fila26.tras = (short) 1;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.imprime();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        java.lang.Object[] objArray34 = fila32.item;
        fila29.item = objArray34;
        fila26.item = objArray34;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        boolean boolean39 = fila37.vazia();
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        boolean boolean42 = fila40.vazia();
        int int43 = fila40.tras;
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.frente;
        fila44.imprime();
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        java.lang.Object[] objArray49 = fila47.item;
        fila44.item = objArray49;
        fila40.item = objArray49;
        java.lang.Object[] objArray52 = fila40.item;
        fila37.item = objArray52;
        fila26.item = objArray52;
        fila12.enfileira((java.lang.Object) objArray52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        fila0.tras = 0;
        int int17 = fila0.tras;
        int int18 = fila0.tras;
        fila0.tras = 0;
        int int21 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        int int20 = fila18.frente;
        fila0.enfileira((java.lang.Object) int20);
        fila0.tras = (byte) -1;
        fila0.tras = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        boolean boolean24 = fila0.vazia();
        int int25 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        fila0.tras = '4';
        fila0.frente = (-1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        fila0.frente = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.frente = 35;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        int int11 = fila0.frente;
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray16 = fila0.item;
        fila0.tras = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        fila11.tras = (-1);
        java.lang.Object obj18 = fila11.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        int int14 = fila2.frente;
        int int15 = fila2.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        java.lang.Object[] objArray2 = fila0.item;
        fila0.tras = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        java.lang.Object[] objArray17 = fila15.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila18.item = objArray21;
        fila15.item = objArray21;
        fila0.item = objArray21;
        int int25 = fila0.frente;
        int int26 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object obj11 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.imprime();
        fila0.imprime();
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object obj14 = null;
        fila11.enfileira(obj14);
        fila11.tras = (short) 0;
        int int18 = fila11.frente;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.tras = (byte) 100;
        int int26 = fila19.tras;
        java.lang.Object obj27 = fila19.desenfileira();
        fila19.frente = ' ';
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        java.lang.Object[] objArray32 = fila30.item;
        java.lang.Object[] objArray33 = fila30.item;
        fila19.enfileira((java.lang.Object) fila30);
        java.lang.Object[] objArray35 = fila30.item;
        fila11.enfileira((java.lang.Object) fila30);
        java.lang.Object[] objArray37 = fila11.item;
        fila0.item = objArray37;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        java.lang.Object obj20 = fila12.desenfileira();
        int int21 = fila12.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila22.tras = 101;
        fila22.tras = 0;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        java.lang.Object[] objArray41 = fila39.item;
        java.lang.Object obj42 = null;
        fila39.enfileira(obj42);
        fila39.tras = (short) 0;
        int int46 = fila39.frente;
        java.lang.Object[] objArray47 = fila39.item;
        fila39.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { fila12, 0, fila39 };
        fila0.item = objArray49;
        fila0.frente = 'a';
        int int53 = fila0.tras;
        int int54 = fila0.tras;
        fila0.tras = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 11 + "'", int53 == 11);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 11 + "'", int54 == 11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Object obj16 = fila0.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.tras = '#';
        fila17.tras = (short) 0;
        fila17.tras = (short) 10;
        int int25 = fila17.tras;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        fila17.item = objArray28;
        fila17.tras = 101;
        fila0.enfileira((java.lang.Object) 101);
        boolean boolean33 = fila0.vazia();
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        fila34.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj38 = fila34.desenfileira();
        fila34.tras = (byte) 100;
        int int41 = fila34.tras;
        int int42 = fila34.frente;
        java.lang.Object obj43 = new java.lang.Object();
        fila34.enfileira(obj43);
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        fila45.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj49 = fila45.desenfileira();
        fila45.tras = (byte) 100;
        fila45.enfileira((java.lang.Object) 1.0d);
        fila34.enfileira((java.lang.Object) fila45);
        java.lang.Class<?> wildcardClass55 = fila45.getClass();
        fila0.enfileira((java.lang.Object) fila45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (short) -1 + "'", obj49, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.frente = 100;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        java.lang.Object[] objArray9 = fila7.item;
        java.lang.Object obj10 = null;
        fila7.enfileira(obj10);
        boolean boolean12 = fila7.vazia();
        int int13 = fila7.tras;
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila0.item = objArray3;
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        int int12 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 102 + "'", int12 == 102);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (byte) 100;
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj20 = fila16.desenfileira();
        fila16.tras = (byte) 100;
        fila16.enfileira((java.lang.Object) 100);
        int int25 = fila16.tras;
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) -1 + "'", obj20, (short) -1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        int int11 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.frente = 35;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila20.item = objArray23;
        fila20.tras = 2;
        fila0.enfileira((java.lang.Object) 2);
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 1;
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.tras = (byte) 100;
        int int15 = fila8.tras;
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.frente = ' ';
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        java.lang.Object[] objArray21 = fila19.item;
        java.lang.Object[] objArray22 = fila19.item;
        fila8.enfileira((java.lang.Object) fila19);
        java.lang.Object[] objArray24 = fila19.item;
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Object[] objArray26 = fila0.item;
        java.lang.Class<?> wildcardClass27 = objArray26.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        int int15 = fila0.frente;
        boolean boolean16 = fila0.vazia();
        int int17 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        fila0.tras = (short) 0;
        int int13 = fila0.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.tras = '#';
        fila14.tras = (short) 0;
        fila14.tras = (short) 10;
        fila14.enfileira((java.lang.Object) "");
        int int24 = fila14.frente;
        java.lang.Object[] objArray25 = fila14.item;
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj30 = fila26.desenfileira();
        fila26.tras = (byte) 100;
        int int33 = fila26.tras;
        java.lang.Object obj34 = fila26.desenfileira();
        int int35 = fila26.tras;
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.tras;
        fila36.tras = '#';
        fila36.tras = (short) 0;
        fila36.tras = (short) 10;
        int int44 = fila36.tras;
        ds.Fila fila45 = new ds.Fila();
        int int46 = fila45.tras;
        java.lang.Object[] objArray47 = fila45.item;
        fila36.item = objArray47;
        fila36.tras = 101;
        fila36.tras = 0;
        ds.Fila fila53 = new ds.Fila();
        int int54 = fila53.tras;
        java.lang.Object[] objArray55 = fila53.item;
        java.lang.Object obj56 = null;
        fila53.enfileira(obj56);
        fila53.tras = (short) 0;
        int int60 = fila53.frente;
        java.lang.Object[] objArray61 = fila53.item;
        fila53.imprime();
        java.lang.Object[] objArray63 = new java.lang.Object[] { fila26, 0, fila53 };
        fila14.item = objArray63;
        fila0.item = objArray63;
        java.lang.Class<?> wildcardClass66 = objArray63.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) -1 + "'", obj30, (short) -1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        int int24 = fila0.frente;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        ds.Fila fila30 = new ds.Fila();
        fila30.enfileira((java.lang.Object) 0);
        fila30.frente = 'a';
        java.lang.Object[] objArray36 = new java.lang.Object[] { 'a', fila30, (short) 0 };
        fila27.item = objArray36;
        fila25.enfileira((java.lang.Object) fila27);
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj43 = fila39.desenfileira();
        fila39.tras = (byte) 100;
        int int46 = fila39.tras;
        java.lang.Object obj47 = fila39.desenfileira();
        int int48 = fila39.tras;
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray50 = fila49.item;
        fila49.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj53 = fila49.desenfileira();
        ds.Fila fila54 = new ds.Fila();
        int int55 = fila54.tras;
        fila54.tras = '#';
        fila54.tras = (short) 0;
        fila54.tras = (short) 10;
        fila54.enfileira((java.lang.Object) "");
        int int64 = fila54.frente;
        java.lang.Object[] objArray65 = fila54.item;
        fila49.item = objArray65;
        fila39.enfileira((java.lang.Object) objArray65);
        fila25.enfileira((java.lang.Object) objArray65);
        fila0.item = objArray65;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) -1 + "'", obj53, (short) -1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        fila0.frente = 0;
        fila0.tras = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = (short) 1;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.imprime();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        java.lang.Object[] objArray8 = fila6.item;
        fila3.item = objArray8;
        fila0.item = objArray8;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        boolean boolean13 = fila11.vazia();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        boolean boolean16 = fila14.vazia();
        int int17 = fila14.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        fila18.item = objArray23;
        fila14.item = objArray23;
        java.lang.Object[] objArray26 = fila14.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        java.lang.Object[] objArray31 = fila29.item;
        java.lang.Object obj32 = null;
        fila29.enfileira(obj32);
        fila29.tras = (short) 0;
        int int36 = fila29.frente;
        java.lang.Object[] objArray37 = fila29.item;
        fila29.frente = 'a';
        int int40 = fila29.tras;
        java.lang.Object obj41 = fila29.desenfileira();
        fila0.enfileira(obj41);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.tras = (short) 1;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        boolean boolean28 = fila21.vazia();
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        fila29.tras = '#';
        fila29.tras = (short) 0;
        fila29.tras = (short) 10;
        int int37 = fila29.tras;
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        java.lang.Object[] objArray40 = fila38.item;
        fila29.item = objArray40;
        fila29.tras = 101;
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.tras;
        java.lang.Object[] objArray46 = fila44.item;
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray50 = fila49.item;
        fila47.item = objArray50;
        fila44.item = objArray50;
        fila29.item = objArray50;
        fila21.item = objArray50;
        fila0.enfileira((java.lang.Object) objArray50);
        int int56 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        boolean boolean7 = fila0.vazia();
        fila0.frente = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        int int16 = fila0.frente;
        fila0.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.enfileira((java.lang.Object) 0);
        java.lang.Object obj21 = fila18.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila22.tras = 101;
        fila22.tras = 0;
        fila22.frente = 35;
        fila18.enfileira((java.lang.Object) 35);
        fila0.enfileira((java.lang.Object) 35);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = (short) 1;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.imprime();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        java.lang.Object[] objArray18 = fila16.item;
        fila13.item = objArray18;
        fila10.item = objArray18;
        fila0.item = objArray18;
        int int22 = fila0.tras;
        int int23 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.enfileira((java.lang.Object) 1);
        java.lang.Object[] objArray16 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.imprime();
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.tras = '#';
        fila7.tras = (short) 0;
        fila7.tras = (short) 10;
        fila7.enfileira((java.lang.Object) "");
        int int17 = fila7.frente;
        java.lang.Object[] objArray18 = fila7.item;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.tras = (byte) 100;
        int int26 = fila19.tras;
        int int27 = fila19.frente;
        java.lang.Object[] objArray28 = fila19.item;
        int int29 = fila19.frente;
        fila7.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 'a';
        java.lang.Object[] objArray15 = fila0.item;
        int int16 = fila0.frente;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.tras = '#';
        fila17.tras = (short) 0;
        fila17.tras = (short) 10;
        fila17.enfileira((java.lang.Object) "");
        fila17.frente = (byte) 0;
        java.lang.Object[] objArray29 = fila17.item;
        fila0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        int int12 = fila0.frente;
        fila0.tras = 101;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.tras;
        java.lang.Object[] objArray13 = fila0.item;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj18 = fila14.desenfileira();
        fila14.tras = (byte) 100;
        int int21 = fila14.tras;
        int int22 = fila14.tras;
        fila14.frente = (byte) 1;
        java.lang.Object obj25 = fila14.desenfileira();
        fila14.tras = (short) -1;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        boolean boolean30 = fila28.vazia();
        int int31 = fila28.tras;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.frente;
        fila32.imprime();
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.tras;
        java.lang.Object[] objArray37 = fila35.item;
        fila32.item = objArray37;
        fila28.item = objArray37;
        java.lang.Object[] objArray40 = fila28.item;
        fila14.item = objArray40;
        fila0.item = objArray40;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        boolean boolean13 = fila11.vazia();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        boolean boolean16 = fila14.vazia();
        int int17 = fila14.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        fila18.item = objArray23;
        fila14.item = objArray23;
        java.lang.Object[] objArray26 = fila14.item;
        fila11.item = objArray26;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.tras = '#';
        fila28.tras = (short) 0;
        fila28.tras = (short) 10;
        int int36 = fila28.tras;
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.tras;
        java.lang.Object[] objArray39 = fila37.item;
        fila28.item = objArray39;
        fila11.item = objArray39;
        fila0.item = objArray39;
        java.lang.Object[] objArray43 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        int int16 = fila0.frente;
        fila0.enfileira((java.lang.Object) "");
        java.lang.Object[] objArray19 = fila0.item;
        fila0.enfileira((java.lang.Object) 11);
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 11, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 11, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 11, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 11, 0]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        fila12.enfileira((java.lang.Object) 100);
        fila12.tras = (-1);
        int int23 = fila12.frente;
        int int24 = fila12.tras;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj29 = fila25.desenfileira();
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.tras = '#';
        fila30.tras = (short) 0;
        fila30.tras = (short) 10;
        fila30.enfileira((java.lang.Object) "");
        int int40 = fila30.frente;
        java.lang.Object[] objArray41 = fila30.item;
        fila25.item = objArray41;
        fila12.item = objArray41;
        fila0.item = objArray41;
        java.lang.Object obj45 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        int int11 = fila0.frente;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        boolean boolean3 = fila0.vazia();
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.tras = (byte) 10;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.tras = (byte) 100;
        java.lang.Object[] objArray15 = fila8.item;
        fila0.item = objArray15;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray16 = fila11.item;
        int int17 = fila11.frente;
        int int18 = fila11.tras;
        fila11.tras = 35;
        int int21 = fila11.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        fila0.frente = 0;
        java.lang.Object obj16 = fila0.desenfileira();
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        fila0.frente = (byte) 1;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        boolean boolean13 = fila11.vazia();
        int int14 = fila11.tras;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        fila15.imprime();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        java.lang.Object[] objArray20 = fila18.item;
        fila15.item = objArray20;
        fila11.item = objArray20;
        java.lang.Object[] objArray23 = fila11.item;
        fila0.enfileira((java.lang.Object) objArray23);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj29 = fila25.desenfileira();
        fila25.tras = (byte) 100;
        fila25.enfileira((java.lang.Object) 100);
        int int34 = fila25.tras;
        java.lang.Object obj35 = fila25.desenfileira();
        java.lang.Object[] objArray36 = fila25.item;
        fila0.item = objArray36;
        boolean boolean38 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        java.lang.Class<?> wildcardClass19 = objArray16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj10 = fila6.desenfileira();
        fila6.tras = (byte) 100;
        int int13 = fila6.tras;
        java.lang.Object obj14 = fila6.desenfileira();
        fila6.frente = ' ';
        java.lang.Object obj17 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        fila6.frente = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (byte) 100;
        int int14 = fila0.tras;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray17 = fila0.item;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray16 = fila11.item;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        java.lang.Object obj20 = null;
        fila17.enfileira(obj20);
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila17.item = objArray33;
        java.lang.Object obj36 = fila17.desenfileira();
        fila11.enfileira(obj36);
        fila11.tras = (short) 100;
        fila11.frente = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = (short) 1;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.imprime();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        java.lang.Object[] objArray8 = fila6.item;
        fila3.item = objArray8;
        fila0.item = objArray8;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        boolean boolean13 = fila11.vazia();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        boolean boolean16 = fila14.vazia();
        int int17 = fila14.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.imprime();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        java.lang.Object[] objArray23 = fila21.item;
        fila18.item = objArray23;
        fila14.item = objArray23;
        java.lang.Object[] objArray26 = fila14.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        fila0.tras = (byte) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.tras = ' ';
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj17 = fila13.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.tras = '#';
        fila18.tras = (short) 0;
        fila18.tras = (short) 10;
        fila18.enfileira((java.lang.Object) "");
        int int28 = fila18.frente;
        java.lang.Object[] objArray29 = fila18.item;
        fila13.item = objArray29;
        java.lang.Object[] objArray31 = fila13.item;
        fila0.item = objArray31;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        java.lang.Object[] objArray5 = fila3.item;
        fila0.item = objArray5;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.tras = '#';
        fila7.tras = (short) 0;
        fila7.tras = (short) 10;
        fila7.enfileira((java.lang.Object) "");
        int int17 = fila7.frente;
        java.lang.Object[] objArray18 = fila7.item;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.tras = (byte) 100;
        int int26 = fila19.tras;
        int int27 = fila19.frente;
        java.lang.Object[] objArray28 = fila19.item;
        int int29 = fila19.frente;
        fila7.enfileira((java.lang.Object) fila19);
        java.lang.Object obj31 = fila19.desenfileira();
        java.lang.Object[] objArray32 = fila19.item;
        fila19.frente = (byte) 10;
        fila0.enfileira((java.lang.Object) fila19);
        boolean boolean36 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.imprime();
        fila0.imprime();
        int int11 = fila0.frente;
        fila0.imprime();
        int int13 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray16 = fila11.item;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        java.lang.Object obj20 = null;
        fila17.enfileira(obj20);
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila17.item = objArray33;
        java.lang.Object obj36 = fila17.desenfileira();
        fila11.enfileira(obj36);
        java.lang.Object[] objArray38 = null;
        fila11.item = objArray38;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        fila0.frente = (byte) 0;
        fila0.tras = (byte) 100;
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        int int20 = fila12.frente;
        java.lang.Object[] objArray21 = fila12.item;
        int int22 = fila12.frente;
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj24 = fila12.desenfileira();
        java.lang.Object[] objArray25 = fila12.item;
        java.lang.Object[] objArray26 = fila12.item;
        boolean boolean27 = fila12.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        java.lang.Object obj3 = fila0.desenfileira();
        int int4 = fila0.frente;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0 + "'", obj3, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.frente = (short) 1;
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        fila0.tras = (short) 100;
        java.lang.Object[] objArray13 = fila0.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.enfileira((java.lang.Object) 0);
        fila14.imprime();
        fila14.frente = (byte) 0;
        java.lang.Class<?> wildcardClass20 = fila14.getClass();
        fila0.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        fila0.imprime();
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.tras;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.tras = (short) 0;
        boolean boolean14 = fila0.vazia();
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        fila0.frente = 0;
        java.lang.Object obj16 = fila0.desenfileira();
        int int17 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        int int13 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        java.lang.Object[] objArray8 = fila6.item;
        java.lang.Object obj9 = null;
        fila6.enfileira(obj9);
        fila6.tras = (short) 0;
        int int13 = fila6.frente;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj18 = fila14.desenfileira();
        fila14.tras = (byte) 100;
        int int21 = fila14.tras;
        java.lang.Object obj22 = fila14.desenfileira();
        fila14.frente = ' ';
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        java.lang.Object[] objArray27 = fila25.item;
        java.lang.Object[] objArray28 = fila25.item;
        fila14.enfileira((java.lang.Object) fila25);
        java.lang.Object[] objArray30 = fila25.item;
        fila6.enfileira((java.lang.Object) fila25);
        fila6.tras = ' ';
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        fila34.tras = '#';
        fila34.tras = (short) 0;
        fila34.tras = (short) 10;
        fila34.enfileira((java.lang.Object) "");
        int int44 = fila34.frente;
        java.lang.Object[] objArray45 = fila34.item;
        fila6.item = objArray45;
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.tras;
        fila47.tras = '#';
        boolean boolean51 = fila47.vazia();
        int int52 = fila47.tras;
        int int53 = fila47.tras;
        ds.Fila fila54 = new ds.Fila();
        java.lang.Object[] objArray55 = fila54.item;
        fila54.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj58 = fila54.desenfileira();
        fila54.tras = (byte) 100;
        fila54.enfileira((java.lang.Object) 100);
        int int63 = fila54.tras;
        java.lang.Object[] objArray64 = fila54.item;
        ds.Fila fila65 = new ds.Fila();
        int int66 = fila65.tras;
        java.lang.Object[] objArray67 = fila65.item;
        ds.Fila fila68 = new ds.Fila();
        int int69 = fila68.tras;
        ds.Fila fila70 = new ds.Fila();
        java.lang.Object[] objArray71 = fila70.item;
        fila68.item = objArray71;
        fila65.item = objArray71;
        java.lang.Object[] objArray74 = fila65.item;
        fila54.item = objArray74;
        fila47.item = objArray74;
        fila6.item = objArray74;
        fila0.enfileira((java.lang.Object) fila6);
        java.lang.Object[] objArray79 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (short) -1 + "'", obj58, (short) -1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 101 + "'", int63 == 101);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray79);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        int int20 = fila18.frente;
        fila0.enfileira((java.lang.Object) int20);
        int int22 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36 + "'", int22 == 36);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.tras = (byte) 100;
        fila11.enfileira((java.lang.Object) 100);
        fila11.tras = 100;
        java.lang.Object[] objArray22 = fila11.item;
        fila11.tras = (byte) 100;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.tras = '#';
        fila25.tras = (short) 0;
        fila25.tras = (short) 10;
        int int33 = fila25.tras;
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        java.lang.Object[] objArray36 = fila34.item;
        fila25.item = objArray36;
        fila25.tras = 'a';
        java.lang.Object[] objArray40 = fila25.item;
        fila11.item = objArray40;
        fila0.item = objArray40;
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.frente;
        java.lang.Object[] objArray45 = fila43.item;
        fila43.frente = 11;
        fila0.enfileira((java.lang.Object) 11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        fila0.tras = (short) 0;
        int int13 = fila0.tras;
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = 100;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (byte) 100;
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        ds.Fila fila21 = new ds.Fila();
        fila21.enfileira((java.lang.Object) 0);
        fila21.frente = 'a';
        java.lang.Object[] objArray27 = new java.lang.Object[] { 'a', fila21, (short) 0 };
        fila18.item = objArray27;
        fila16.enfileira((java.lang.Object) fila18);
        fila0.enfileira((java.lang.Object) fila16);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray16 = fila0.item;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.tras = (byte) 100;
        int int24 = fila17.tras;
        java.lang.Object obj25 = fila17.desenfileira();
        int int26 = fila17.tras;
        java.lang.Object[] objArray27 = fila17.item;
        fila0.item = objArray27;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.tras = (short) 1;
        fila0.frente = 1;
        int int23 = fila0.frente;
        java.lang.Object[] objArray24 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.tras = (short) 0;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        java.lang.Object obj20 = fila12.desenfileira();
        int int21 = fila12.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila22.tras = 101;
        fila22.tras = 0;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        java.lang.Object[] objArray41 = fila39.item;
        java.lang.Object obj42 = null;
        fila39.enfileira(obj42);
        fila39.tras = (short) 0;
        int int46 = fila39.frente;
        java.lang.Object[] objArray47 = fila39.item;
        fila39.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { fila12, 0, fila39 };
        fila0.item = objArray49;
        int int51 = fila0.frente;
        int int52 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.tras = (short) 0;
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        fila0.imprime();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (short) 0;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.tras = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = ' ';
        boolean boolean14 = fila0.vazia();
        fila0.tras = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.tras = (byte) 100;
        fila11.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        fila11.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray30 = fila21.item;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        java.lang.Object obj34 = null;
        fila31.enfileira(obj34);
        fila31.tras = (short) 0;
        int int38 = fila31.frente;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        ds.Fila fila42 = new ds.Fila();
        fila42.enfileira((java.lang.Object) 0);
        fila42.frente = 'a';
        java.lang.Object[] objArray48 = new java.lang.Object[] { 'a', fila42, (short) 0 };
        fila39.item = objArray48;
        boolean boolean50 = fila39.vazia();
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila51.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj55 = fila51.desenfileira();
        fila51.tras = (byte) 100;
        int int58 = fila51.tras;
        java.lang.Object obj59 = fila51.desenfileira();
        int int60 = fila51.tras;
        java.lang.Object[] objArray61 = fila51.item;
        fila39.item = objArray61;
        fila31.item = objArray61;
        fila21.item = objArray61;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (short) -1 + "'", obj55, (short) -1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = (short) 1;
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Object obj4 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        fila0.enfileira((java.lang.Object) 0);
        fila0.imprime();
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        int int14 = fila2.frente;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.tras = '#';
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj24 = fila20.desenfileira();
        fila20.tras = (byte) 100;
        fila20.enfileira((java.lang.Object) 100);
        fila20.tras = 100;
        java.lang.Object[] objArray31 = fila20.item;
        fila15.item = objArray31;
        fila2.item = objArray31;
        int int34 = fila2.tras;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.tras;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila35.item = objArray38;
        fila35.imprime();
        fila2.enfileira((java.lang.Object) fila35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.tras = (byte) 100;
        int int26 = fila19.tras;
        java.lang.Object obj27 = fila19.desenfileira();
        int int28 = fila19.tras;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj33 = fila29.desenfileira();
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        fila34.tras = '#';
        fila34.tras = (short) 0;
        fila34.tras = (short) 10;
        fila34.enfileira((java.lang.Object) "");
        int int44 = fila34.frente;
        java.lang.Object[] objArray45 = fila34.item;
        fila29.item = objArray45;
        fila19.enfileira((java.lang.Object) objArray45);
        fila0.item = objArray45;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        java.lang.Object[] objArray5 = fila3.item;
        fila0.item = objArray5;
        fila0.tras = (short) -1;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        int int9 = fila0.tras;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila14.item = objArray17;
        fila11.item = objArray17;
        java.lang.Object[] objArray20 = fila11.item;
        fila0.item = objArray20;
        fila0.tras = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.frente = '#';
        int int7 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray13 = fila0.item;
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        fila0.tras = (short) 0;
        int int13 = fila0.tras;
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.tras = (byte) 100;
        fila15.enfileira((java.lang.Object) 100);
        fila15.tras = 100;
        java.lang.Object[] objArray26 = fila15.item;
        fila15.tras = (byte) 100;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        fila29.tras = '#';
        fila29.tras = (short) 0;
        fila29.tras = (short) 10;
        int int37 = fila29.tras;
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        java.lang.Object[] objArray40 = fila38.item;
        fila29.item = objArray40;
        fila29.tras = 'a';
        java.lang.Object[] objArray44 = fila29.item;
        fila15.item = objArray44;
        fila0.item = objArray44;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) -1 + "'", obj19, (short) -1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray16 = fila11.item;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        java.lang.Object[] objArray19 = fila17.item;
        java.lang.Object obj20 = null;
        fila17.enfileira(obj20);
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila17.item = objArray33;
        java.lang.Object obj36 = fila17.desenfileira();
        fila11.enfileira(obj36);
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        fila38.tras = '#';
        boolean boolean42 = fila38.vazia();
        boolean boolean43 = fila38.vazia();
        fila38.tras = 2;
        java.lang.Object[] objArray46 = fila38.item;
        java.lang.Object[] objArray47 = fila38.item;
        fila11.item = objArray47;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        java.lang.Object[] objArray12 = fila9.item;
        fila0.item = objArray12;
        java.lang.Class<?> wildcardClass14 = objArray12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.imprime();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        java.lang.Object[] objArray5 = fila3.item;
        fila0.item = objArray5;
        int int7 = fila0.frente;
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        int int14 = fila2.frente;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.tras = '#';
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj24 = fila20.desenfileira();
        fila20.tras = (byte) 100;
        fila20.enfileira((java.lang.Object) 100);
        fila20.tras = 100;
        java.lang.Object[] objArray31 = fila20.item;
        fila15.item = objArray31;
        fila2.item = objArray31;
        int int34 = fila2.tras;
        int int35 = fila2.tras;
        java.lang.Object[] objArray36 = fila2.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        int int20 = fila18.frente;
        fila0.enfileira((java.lang.Object) int20);
        int int22 = fila0.frente;
        boolean boolean23 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        fila0.frente = (short) -1;
        int int13 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        java.lang.Object obj19 = fila0.desenfileira();
        fila0.tras = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        int int11 = fila0.frente;
        int int12 = fila0.frente;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        java.lang.Object[] objArray15 = fila13.item;
        java.lang.Object obj16 = null;
        fila13.enfileira(obj16);
        fila13.tras = (short) 0;
        int int20 = fila13.frente;
        fila13.imprime();
        fila13.imprime();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        java.lang.Object[] objArray25 = fila23.item;
        java.lang.Object obj26 = null;
        fila23.enfileira(obj26);
        fila23.tras = (short) 0;
        int int30 = fila23.frente;
        java.lang.Object[] objArray31 = fila23.item;
        fila13.item = objArray31;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila3.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        int int2 = fila1.tras;
        fila1.tras = '#';
        fila1.tras = (short) 0;
        fila1.tras = (short) 10;
        int int9 = fila1.tras;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        fila1.item = objArray12;
        fila1.tras = 'a';
        java.lang.Object[] objArray16 = fila1.item;
        fila0.item = objArray16;
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.enfileira((java.lang.Object) 0);
        fila5.frente = 'a';
        java.lang.Object[] objArray11 = new java.lang.Object[] { 'a', fila5, (short) 0 };
        fila2.item = objArray11;
        fila0.enfileira((java.lang.Object) fila2);
        int int14 = fila2.frente;
        fila2.tras = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray16 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        fila0.tras = (-1);
        fila0.tras = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        boolean boolean14 = fila0.vazia();
        int int15 = fila0.tras;
        boolean boolean16 = fila0.vazia();
        java.lang.Object[] objArray17 = fila0.item;
        java.lang.Class<?> wildcardClass18 = objArray17.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        fila0.frente = '4';
        int int26 = fila0.frente;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        java.lang.Object[] objArray29 = fila27.item;
        java.lang.Object obj30 = null;
        fila27.enfileira(obj30);
        fila27.frente = 1;
        fila0.enfileira((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        java.lang.Object[] objArray11 = fila0.item;
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj10 = fila6.desenfileira();
        fila6.tras = (byte) 100;
        int int13 = fila6.tras;
        java.lang.Object obj14 = fila6.desenfileira();
        fila6.frente = ' ';
        java.lang.Object obj17 = fila6.desenfileira();
        fila0.enfileira((java.lang.Object) fila6);
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj23 = fila19.desenfileira();
        fila19.tras = (byte) 100;
        fila19.enfileira((java.lang.Object) 100);
        int int28 = fila19.tras;
        java.lang.Object obj29 = fila19.desenfileira();
        java.lang.Object[] objArray30 = fila19.item;
        fila0.enfileira((java.lang.Object) fila19);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        java.lang.Object[] objArray17 = fila15.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila18.item = objArray21;
        fila15.item = objArray21;
        fila0.item = objArray21;
        fila0.frente = 100;
        int int27 = fila0.tras;
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        int int24 = fila0.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila28 = new ds.Fila();
        fila28.enfileira((java.lang.Object) 0);
        fila28.frente = 'a';
        java.lang.Object[] objArray34 = new java.lang.Object[] { 'a', fila28, (short) 0 };
        fila25.item = objArray34;
        boolean boolean36 = fila25.vazia();
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        ds.Fila fila40 = new ds.Fila();
        fila40.enfileira((java.lang.Object) 0);
        fila40.frente = 'a';
        java.lang.Object[] objArray46 = new java.lang.Object[] { 'a', fila40, (short) 0 };
        fila37.item = objArray46;
        fila25.item = objArray46;
        fila0.item = objArray46;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        fila0.tras = 0;
        int int17 = fila0.tras;
        int int18 = fila0.tras;
        fila0.tras = 0;
        ds.Fila fila21 = new ds.Fila();
        fila21.tras = (short) 1;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.imprime();
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        java.lang.Object[] objArray29 = fila27.item;
        fila24.item = objArray29;
        fila21.item = objArray29;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        boolean boolean34 = fila32.vazia();
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        boolean boolean37 = fila35.vazia();
        int int38 = fila35.tras;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.frente;
        fila39.imprime();
        ds.Fila fila42 = new ds.Fila();
        int int43 = fila42.tras;
        java.lang.Object[] objArray44 = fila42.item;
        fila39.item = objArray44;
        fila35.item = objArray44;
        java.lang.Object[] objArray47 = fila35.item;
        fila32.item = objArray47;
        fila21.item = objArray47;
        fila0.item = objArray47;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        fila0.tras = (short) 100;
        int int13 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        int int4 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.tras = (byte) 100;
        fila11.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        int int29 = fila21.frente;
        java.lang.Object[] objArray30 = fila21.item;
        fila0.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.enfileira((java.lang.Object) (short) -1);
        fila32.enfileira((java.lang.Object) 35);
        fila0.enfileira((java.lang.Object) fila32);
        boolean boolean39 = fila32.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        int int13 = fila5.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        fila5.item = objArray16;
        fila0.item = objArray16;
        fila0.tras = (short) 1;
        fila0.frente = 1;
        java.lang.Object[] objArray23 = fila0.item;
        fila0.frente = ' ';
        fila0.frente = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.tras = '#';
        fila17.tras = (short) 0;
        fila17.tras = (short) 10;
        fila17.enfileira((java.lang.Object) "");
        int int27 = fila17.frente;
        java.lang.Object[] objArray28 = fila17.item;
        fila12.item = objArray28;
        fila0.item = objArray28;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila34.item = objArray37;
        fila31.item = objArray37;
        java.lang.Object[] objArray40 = fila31.item;
        fila0.enfileira((java.lang.Object) objArray40);
        fila0.tras = 11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.tras = ' ';
        java.lang.Object[] objArray11 = fila0.item;
        boolean boolean12 = fila0.vazia();
        java.lang.Object[] objArray13 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila0.item = objArray3;
        int int5 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        boolean boolean5 = fila3.vazia();
        int int6 = fila3.tras;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.imprime();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        java.lang.Object[] objArray12 = fila10.item;
        fila7.item = objArray12;
        fila3.item = objArray12;
        java.lang.Object[] objArray15 = fila3.item;
        fila0.item = objArray15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Object obj16 = fila0.desenfileira();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.tras = '#';
        fila17.tras = (short) 0;
        fila17.tras = (short) 10;
        int int25 = fila17.tras;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        fila17.item = objArray28;
        fila17.tras = 101;
        fila0.enfileira((java.lang.Object) 101);
        boolean boolean33 = fila0.vazia();
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        java.lang.Object[] objArray17 = fila15.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila18.item = objArray21;
        fila15.item = objArray21;
        fila0.item = objArray21;
        int int25 = fila0.tras;
        java.lang.Object[] objArray26 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.imprime();
        fila0.imprime();
        int int11 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.tras = (byte) 100;
        fila11.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        fila11.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray30 = fila21.item;
        fila21.frente = (short) 1;
        fila21.frente = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.tras = (byte) 100;
        int int15 = fila8.tras;
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.frente = ' ';
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        java.lang.Object[] objArray21 = fila19.item;
        java.lang.Object[] objArray22 = fila19.item;
        fila8.enfileira((java.lang.Object) fila19);
        java.lang.Object[] objArray24 = fila19.item;
        fila0.enfileira((java.lang.Object) fila19);
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        fila26.tras = '#';
        fila26.tras = (short) 0;
        fila26.tras = (short) 10;
        fila26.enfileira((java.lang.Object) "");
        int int36 = fila26.frente;
        java.lang.Object[] objArray37 = fila26.item;
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray39 = fila38.item;
        fila38.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj42 = fila38.desenfileira();
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.tras;
        fila43.tras = '#';
        fila43.tras = (short) 0;
        fila43.tras = (short) 10;
        fila43.enfileira((java.lang.Object) "");
        int int53 = fila43.frente;
        java.lang.Object[] objArray54 = fila43.item;
        fila38.item = objArray54;
        fila26.item = objArray54;
        ds.Fila fila57 = new ds.Fila();
        int int58 = fila57.tras;
        java.lang.Object[] objArray59 = fila57.item;
        ds.Fila fila60 = new ds.Fila();
        int int61 = fila60.tras;
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila60.item = objArray63;
        fila57.item = objArray63;
        java.lang.Object[] objArray66 = fila57.item;
        fila26.enfileira((java.lang.Object) objArray66);
        fila19.item = objArray66;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj69 = fila19.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) -1 + "'", obj42, (short) -1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.enfileira((java.lang.Object) 1);
        java.lang.Object[] objArray16 = fila0.item;
        java.lang.Object[] objArray17 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj13 = fila9.desenfileira();
        fila9.tras = (byte) 100;
        int int16 = fila9.tras;
        java.lang.Object obj17 = fila9.desenfileira();
        int int18 = fila9.tras;
        java.lang.Object[] objArray19 = fila9.item;
        fila0.enfileira((java.lang.Object) objArray19);
        java.lang.Object obj21 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila3.item = objArray6;
        fila0.item = objArray6;
        java.lang.Object[] objArray9 = fila0.item;
        fila0.frente = 0;
        int int12 = fila0.tras;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.tras = '#';
        boolean boolean17 = fila13.vazia();
        int int18 = fila13.tras;
        int int19 = fila13.tras;
        java.lang.Object[] objArray20 = fila13.item;
        int int21 = fila13.tras;
        fila0.enfileira((java.lang.Object) int21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        fila0.imprime();
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        int int20 = fila12.frente;
        java.lang.Object[] objArray21 = fila12.item;
        fila0.item = objArray21;
        int int23 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        fila0.imprime();
        int int4 = fila0.frente;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila3.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        int int10 = fila0.tras;
        fila0.frente = (byte) 10;
        int int13 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        fila0.tras = 0;
        int int17 = fila0.tras;
        int int18 = fila0.tras;
        int int19 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.tras = '#';
        fila16.tras = (short) 0;
        fila16.tras = (short) 10;
        int int24 = fila16.tras;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        java.lang.Object[] objArray27 = fila25.item;
        fila16.item = objArray27;
        fila16.tras = 101;
        java.lang.Object[] objArray31 = fila16.item;
        fila0.item = objArray31;
        int int33 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        java.lang.Object[] objArray2 = fila1.item;
        ds.Fila fila4 = new ds.Fila();
        fila4.enfileira((java.lang.Object) 0);
        fila4.frente = 'a';
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', fila4, (short) 0 };
        fila1.item = objArray10;
        boolean boolean12 = fila1.vazia();
        fila1.frente = (byte) 10;
        fila1.frente = (byte) 0;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.tras = '#';
        fila17.tras = (short) 0;
        fila17.tras = (short) 10;
        int int25 = fila17.tras;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        java.lang.Object[] objArray28 = fila26.item;
        fila17.item = objArray28;
        fila17.tras = 101;
        java.lang.Object[] objArray32 = fila17.item;
        fila1.item = objArray32;
        fila0.item = objArray32;
        boolean boolean35 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        int int20 = fila18.frente;
        fila0.enfileira((java.lang.Object) int20);
        int int22 = fila0.frente;
        int int23 = fila0.frente;
        java.lang.Object obj24 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        fila0.tras = 2;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Object[] objArray9 = fila0.item;
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.tras = (short) 100;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        java.lang.Object[] objArray16 = fila14.item;
        java.lang.Object obj17 = null;
        fila14.enfileira(obj17);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.tras = '#';
        fila19.tras = (short) 0;
        fila19.tras = (short) 10;
        int int27 = fila19.tras;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        java.lang.Object[] objArray30 = fila28.item;
        fila19.item = objArray30;
        fila14.item = objArray30;
        fila14.frente = (byte) 10;
        java.lang.Object[] objArray35 = fila14.item;
        fila0.enfileira((java.lang.Object) fila14);
        int int37 = fila14.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.frente;
        int int3 = fila0.tras;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.imprime();
        fila0.imprime();
        int int11 = fila0.frente;
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj19 = fila15.desenfileira();
        fila15.tras = (byte) 100;
        fila15.enfileira((java.lang.Object) 100);
        fila15.tras = (-1);
        java.lang.Object[] objArray26 = fila15.item;
        fila13.item = objArray26;
        fila0.enfileira((java.lang.Object) objArray26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) -1 + "'", obj19, (short) -1);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        fila0.tras = (byte) 0;
        int int11 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila3.item = objArray6;
        fila0.item = objArray6;
        int int9 = fila0.frente;
        int int10 = fila0.tras;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = (short) 1;
        java.lang.Object obj3 = fila0.desenfileira();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        boolean boolean18 = fila0.vazia();
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        java.lang.Object[] objArray21 = fila19.item;
        java.lang.Object obj22 = null;
        fila19.enfileira(obj22);
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.tras = '#';
        fila24.tras = (short) 0;
        fila24.tras = (short) 10;
        int int32 = fila24.tras;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        java.lang.Object[] objArray35 = fila33.item;
        fila24.item = objArray35;
        fila19.item = objArray35;
        fila19.tras = (short) 1;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila40.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj44 = fila40.desenfileira();
        fila40.tras = (byte) 100;
        boolean boolean47 = fila40.vazia();
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.tras;
        fila48.tras = '#';
        fila48.tras = (short) 0;
        fila48.tras = (short) 10;
        int int56 = fila48.tras;
        ds.Fila fila57 = new ds.Fila();
        int int58 = fila57.tras;
        java.lang.Object[] objArray59 = fila57.item;
        fila48.item = objArray59;
        fila48.tras = 101;
        ds.Fila fila63 = new ds.Fila();
        int int64 = fila63.tras;
        java.lang.Object[] objArray65 = fila63.item;
        ds.Fila fila66 = new ds.Fila();
        int int67 = fila66.tras;
        ds.Fila fila68 = new ds.Fila();
        java.lang.Object[] objArray69 = fila68.item;
        fila66.item = objArray69;
        fila63.item = objArray69;
        fila48.item = objArray69;
        fila40.item = objArray69;
        fila19.enfileira((java.lang.Object) objArray69);
        java.lang.Object[] objArray75 = fila19.item;
        fila0.item = objArray75;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) -1 + "'", obj44, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.frente = (byte) 10;
        boolean boolean14 = fila0.vazia();
        int int15 = fila0.tras;
        boolean boolean16 = fila0.vazia();
        java.lang.Object[] objArray17 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.tras = (byte) 100;
        int int15 = fila8.tras;
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.frente = ' ';
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        java.lang.Object[] objArray21 = fila19.item;
        java.lang.Object[] objArray22 = fila19.item;
        fila8.enfileira((java.lang.Object) fila19);
        java.lang.Object[] objArray24 = fila19.item;
        fila0.enfileira((java.lang.Object) fila19);
        fila0.tras = ' ';
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.tras = '#';
        fila28.tras = (short) 0;
        fila28.tras = (short) 10;
        fila28.enfileira((java.lang.Object) "");
        int int38 = fila28.frente;
        java.lang.Object[] objArray39 = fila28.item;
        fila0.item = objArray39;
        java.lang.Class<?> wildcardClass41 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila3.item = objArray6;
        fila0.item = objArray6;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        java.lang.Object[] objArray11 = fila9.item;
        fila0.item = objArray11;
        fila0.tras = 101;
        int int15 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj9 = fila5.desenfileira();
        fila5.tras = (byte) 100;
        fila5.enfileira((java.lang.Object) 100);
        fila5.tras = 100;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        int int20 = fila18.frente;
        fila0.enfileira((java.lang.Object) int20);
        int int22 = fila0.frente;
        java.lang.Object[] objArray23 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.tras = '#';
        fila5.tras = (short) 0;
        fila5.tras = (short) 10;
        fila5.enfileira((java.lang.Object) "");
        int int15 = fila5.frente;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        int int18 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.tras;
        fila0.frente = (byte) 1;
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.tras = 100;
        fila0.frente = '#';
        java.lang.Object[] objArray16 = fila0.item;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        java.lang.Object obj20 = fila12.desenfileira();
        int int21 = fila12.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.tras = '#';
        fila22.tras = (short) 0;
        fila22.tras = (short) 10;
        int int30 = fila22.tras;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        java.lang.Object[] objArray33 = fila31.item;
        fila22.item = objArray33;
        fila22.tras = 101;
        fila22.tras = 0;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        java.lang.Object[] objArray41 = fila39.item;
        java.lang.Object obj42 = null;
        fila39.enfileira(obj42);
        fila39.tras = (short) 0;
        int int46 = fila39.frente;
        java.lang.Object[] objArray47 = fila39.item;
        fila39.imprime();
        java.lang.Object[] objArray49 = new java.lang.Object[] { fila12, 0, fila39 };
        fila0.item = objArray49;
        boolean boolean51 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        java.lang.Object[] objArray2 = fila0.item;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        fila0.tras = (short) 0;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj12 = fila8.desenfileira();
        fila8.tras = (byte) 100;
        int int15 = fila8.tras;
        java.lang.Object obj16 = fila8.desenfileira();
        fila8.frente = ' ';
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        java.lang.Object[] objArray21 = fila19.item;
        java.lang.Object[] objArray22 = fila19.item;
        fila8.enfileira((java.lang.Object) fila19);
        java.lang.Object[] objArray24 = fila19.item;
        fila0.enfileira((java.lang.Object) fila19);
        int int26 = fila19.tras;
        fila19.tras = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        java.lang.Object obj9 = new java.lang.Object();
        fila0.enfileira(obj9);
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj15 = fila11.desenfileira();
        fila11.tras = (byte) 100;
        fila11.enfileira((java.lang.Object) 1.0d);
        fila0.enfileira((java.lang.Object) fila11);
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.tras = (byte) 100;
        int int28 = fila21.tras;
        fila11.enfileira((java.lang.Object) fila21);
        fila11.tras = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        fila0.enfileira((java.lang.Object) 100);
        boolean boolean9 = fila0.vazia();
        int int10 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.tras = '#';
        fila0.tras = (short) 0;
        fila0.tras = (short) 10;
        fila0.enfileira((java.lang.Object) "");
        int int10 = fila0.frente;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj16 = fila12.desenfileira();
        fila12.tras = (byte) 100;
        int int19 = fila12.tras;
        int int20 = fila12.frente;
        java.lang.Object[] objArray21 = fila12.item;
        int int22 = fila12.frente;
        fila0.enfileira((java.lang.Object) fila12);
        java.lang.Object obj24 = fila12.desenfileira();
        int int25 = fila12.tras;
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj30 = fila26.desenfileira();
        fila26.tras = (byte) 100;
        int int33 = fila26.tras;
        java.lang.Object obj34 = fila26.desenfileira();
        int int35 = fila26.tras;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila36.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj40 = fila36.desenfileira();
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        fila41.tras = '#';
        fila41.tras = (short) 0;
        fila41.tras = (short) 10;
        fila41.enfileira((java.lang.Object) "");
        int int51 = fila41.frente;
        java.lang.Object[] objArray52 = fila41.item;
        fila36.item = objArray52;
        fila26.enfileira((java.lang.Object) objArray52);
        fila12.item = objArray52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) -1 + "'", obj30, (short) -1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) -1 + "'", obj40, (short) -1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila15 = new ds.Fila();
        fila15.enfileira((java.lang.Object) 0);
        fila15.frente = 'a';
        java.lang.Object[] objArray21 = new java.lang.Object[] { 'a', fila15, (short) 0 };
        fila12.item = objArray21;
        fila0.item = objArray21;
        boolean boolean24 = fila0.vazia();
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj29 = fila25.desenfileira();
        fila25.tras = (byte) 100;
        fila25.enfileira((java.lang.Object) 100);
        int int34 = fila25.tras;
        java.lang.Object obj35 = fila25.desenfileira();
        int int36 = fila25.frente;
        java.lang.Object obj37 = null;
        fila25.enfileira(obj37);
        java.lang.Object[] objArray39 = fila25.item;
        fila0.item = objArray39;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray16 = fila11.item;
        java.lang.Object[] objArray17 = fila11.item;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj22 = fila18.desenfileira();
        fila18.tras = (byte) 100;
        int int25 = fila18.tras;
        int int26 = fila18.tras;
        fila18.frente = (byte) 1;
        java.lang.Object obj29 = fila18.desenfileira();
        fila18.tras = 100;
        fila18.frente = '#';
        java.lang.Object[] objArray34 = fila18.item;
        java.lang.Object[] objArray35 = fila18.item;
        fila11.enfileira((java.lang.Object) objArray35);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) -1 + "'", obj22, (short) -1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        fila3.enfileira((java.lang.Object) 0);
        fila3.frente = 'a';
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', fila3, (short) 0 };
        fila0.item = objArray9;
        boolean boolean11 = fila0.vazia();
        fila0.imprime();
        java.lang.Object[] objArray13 = fila0.item;
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (short) -1);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) 100;
        int int7 = fila0.tras;
        java.lang.Object obj8 = fila0.desenfileira();
        fila0.frente = ' ';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        java.lang.Object[] objArray13 = fila11.item;
        java.lang.Object[] objArray14 = fila11.item;
        fila0.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray16 = fila11.item;
        java.lang.Object[] objArray17 = fila11.item;
        int int18 = fila11.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) -1 + "'", obj4, (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }
}

