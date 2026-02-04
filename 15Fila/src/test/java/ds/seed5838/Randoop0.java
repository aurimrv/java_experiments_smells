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
        fila0.frente = (short) 1;
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        java.lang.Object[] objArray11 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.frente = (-1);
        java.lang.Object[] objArray13 = fila9.item;
        fila9.tras = (short) 10;
        java.lang.Object[] objArray16 = fila9.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        java.lang.Object[] objArray23 = fila18.item;
        fila5.item = objArray23;
        fila0.item = objArray23;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        java.lang.Object[] objArray11 = fila0.item;
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        java.lang.Object[] objArray11 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Object[] objArray4 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        int int10 = fila4.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.frente;
        boolean boolean3 = fila0.vazia();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Class<?> wildcardClass2 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        fila0.tras = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        int int10 = fila0.frente;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        fila0.tras = 0;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.frente = (-1);
        java.lang.Object[] objArray15 = fila11.item;
        fila11.tras = (short) 10;
        java.lang.Object[] objArray18 = fila11.item;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray23 = fila19.item;
        fila11.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.frente = (-1);
        java.lang.Object[] objArray33 = fila29.item;
        fila29.tras = (short) 10;
        java.lang.Object[] objArray36 = fila29.item;
        fila25.item = objArray36;
        fila11.item = objArray36;
        fila0.item = objArray36;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int11 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.tras = 0;
        fila0.tras = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.tras;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        int int7 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        java.lang.Object[] objArray20 = fila0.item;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.frente = (-1);
        java.lang.Object[] objArray25 = fila21.item;
        fila21.tras = (short) 10;
        java.lang.Object[] objArray28 = fila21.item;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray33 = fila29.item;
        fila21.item = objArray33;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila35.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.frente = (-1);
        java.lang.Object[] objArray43 = fila39.item;
        fila39.tras = (short) 10;
        java.lang.Object[] objArray46 = fila39.item;
        fila35.item = objArray46;
        fila21.item = objArray46;
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray50 = fila49.item;
        fila49.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila53 = new ds.Fila();
        java.lang.Object[] objArray54 = fila53.item;
        fila53.frente = (-1);
        java.lang.Object[] objArray57 = fila53.item;
        fila53.tras = (short) 10;
        java.lang.Object[] objArray60 = fila53.item;
        fila49.item = objArray60;
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila62.frente = (-1);
        java.lang.Object[] objArray66 = fila62.item;
        java.lang.Object[] objArray67 = fila62.item;
        fila49.item = objArray67;
        java.lang.Object[] objArray69 = fila49.item;
        fila21.item = objArray69;
        fila0.item = objArray69;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila11.item = objArray17;
        fila11.tras = (short) 0;
        int int21 = fila11.frente;
        fila4.enfileira((java.lang.Object) fila11);
        fila11.frente = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.frente;
        fila0.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        fila0.tras = 0;
        java.lang.Object[] objArray11 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass16 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        int int14 = fila8.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.frente = (-1);
        java.lang.Object[] objArray20 = fila16.item;
        fila16.tras = (short) 10;
        java.lang.Object[] objArray23 = fila16.item;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray28 = fila24.item;
        fila16.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        fila34.frente = (-1);
        java.lang.Object[] objArray38 = fila34.item;
        fila34.tras = (short) 10;
        java.lang.Object[] objArray41 = fila34.item;
        fila30.item = objArray41;
        fila16.item = objArray41;
        int int44 = fila16.tras;
        int int45 = fila16.tras;
        fila16.frente = (-1);
        fila9.enfileira((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray8 = fila4.item;
        fila0.item = objArray8;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        int int20 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Class<?> wildcardClass14 = fila8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.tras = '4';
        int int5 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int11 = fila0.tras;
        int int12 = fila0.tras;
        ds.Fila fila13 = new ds.Fila();
        fila13.frente = (short) 1;
        java.lang.Object[] objArray16 = fila13.item;
        fila0.item = objArray16;
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.imprime();
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object[] objArray5 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        java.lang.Object obj13 = fila0.desenfileira();
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int11 = fila0.tras;
        int int12 = fila0.tras;
        ds.Fila fila13 = new ds.Fila();
        fila13.frente = (short) 1;
        java.lang.Object[] objArray16 = fila13.item;
        fila0.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = (short) 1;
        java.lang.Object[] objArray21 = fila18.item;
        fila0.item = objArray21;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila0.item = objArray19;
        int int21 = fila0.tras;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.frente = (-1);
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.frente = (-1);
        java.lang.Object[] objArray35 = fila31.item;
        fila31.tras = (short) 10;
        fila31.tras = (short) -1;
        java.lang.Object[] objArray40 = fila31.item;
        fila0.item = objArray40;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Object[] objArray14 = null;
        fila0.item = objArray14;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.imprime();
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.frente;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        fila0.tras = 0;
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila11.item = objArray17;
        fila11.tras = (short) 0;
        int int21 = fila11.frente;
        fila0.enfileira((java.lang.Object) int21);
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        java.lang.Object[] objArray3 = fila0.item;
        int int4 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.frente = (-1);
        java.lang.Object[] objArray12 = fila8.item;
        fila8.tras = (short) 10;
        fila8.tras = (short) -1;
        java.lang.Object[] objArray17 = fila8.item;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray22 = fila18.item;
        fila8.item = objArray22;
        fila0.item = objArray22;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        fila0.tras = 0;
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        boolean boolean6 = fila0.vazia();
        fila0.tras = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        boolean boolean15 = fila0.vazia();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.frente = (-1);
        java.lang.Object[] objArray24 = fila20.item;
        fila20.tras = (short) 10;
        java.lang.Object[] objArray27 = fila20.item;
        fila16.item = objArray27;
        fila16.tras = (byte) 100;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.frente = (-1);
        java.lang.Object[] objArray35 = fila31.item;
        fila31.tras = (short) 10;
        java.lang.Object[] objArray38 = fila31.item;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray43 = fila39.item;
        fila31.item = objArray43;
        fila16.enfileira((java.lang.Object) fila31);
        java.lang.Object[] objArray46 = fila16.item;
        fila0.item = objArray46;
        fila0.tras = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.frente = (-1);
        java.lang.Object[] objArray13 = fila9.item;
        fila9.tras = (short) 10;
        java.lang.Object[] objArray16 = fila9.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        java.lang.Object[] objArray23 = fila18.item;
        fila5.item = objArray23;
        fila0.item = objArray23;
        int int26 = fila0.frente;
        int int27 = fila0.frente;
        fila0.tras = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        fila0.tras = 0;
        boolean boolean5 = fila0.vazia();
        fila0.tras = 'a';
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.frente = (-1);
        java.lang.Object[] objArray16 = fila12.item;
        fila12.tras = (short) 10;
        java.lang.Object[] objArray19 = fila12.item;
        fila8.item = objArray19;
        fila8.tras = (byte) 100;
        boolean boolean23 = fila8.vazia();
        fila8.tras = (byte) -1;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray27 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (short) 1;
        int int10 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass22 = fila14.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        boolean boolean10 = fila0.vazia();
        fila0.frente = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.frente = (-1);
        java.lang.Object[] objArray11 = fila7.item;
        fila7.tras = (short) 10;
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila7.item = objArray19;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.frente = (-1);
        java.lang.Object[] objArray29 = fila25.item;
        fila25.tras = (short) 10;
        java.lang.Object[] objArray32 = fila25.item;
        fila21.item = objArray32;
        fila7.item = objArray32;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila35.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.frente = (-1);
        java.lang.Object[] objArray43 = fila39.item;
        fila39.tras = (short) 10;
        java.lang.Object[] objArray46 = fila39.item;
        fila35.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        fila48.frente = (-1);
        java.lang.Object[] objArray52 = fila48.item;
        java.lang.Object[] objArray53 = fila48.item;
        fila35.item = objArray53;
        java.lang.Object[] objArray55 = fila35.item;
        fila7.item = objArray55;
        fila0.enfileira((java.lang.Object) objArray55);
        java.lang.Class<?> wildcardClass58 = objArray55.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = null;
        fila0.item = objArray5;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        fila0.tras = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        int int7 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        fila0.frente = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        int int21 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila0.item = objArray19;
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.frente = (-1);
        java.lang.Object[] objArray13 = fila9.item;
        fila9.tras = (short) 10;
        java.lang.Object[] objArray16 = fila9.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        java.lang.Object[] objArray23 = fila18.item;
        fila5.item = objArray23;
        fila0.item = objArray23;
        int int26 = fila0.frente;
        boolean boolean27 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        fila0.tras = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila9);
        fila9.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.tras = 0;
        int int12 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        fila0.tras = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        boolean boolean15 = fila0.vazia();
        fila0.tras = (byte) -1;
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.frente;
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        java.lang.Object[] objArray9 = fila0.item;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila10.item;
        fila0.item = objArray14;
        fila0.frente = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.frente = 0;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        int int15 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila0.item = objArray19;
        int int21 = fila0.tras;
        int int22 = fila0.tras;
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.imprime();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.frente = (-1);
        java.lang.Object[] objArray13 = fila9.item;
        fila9.tras = (short) 10;
        java.lang.Object[] objArray16 = fila9.item;
        fila9.tras = (short) 1;
        int int19 = fila9.frente;
        fila0.enfileira((java.lang.Object) int19);
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = fila14.item;
        fila14.tras = (short) 10;
        java.lang.Object[] objArray21 = fila14.item;
        int int22 = fila14.frente;
        fila0.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass24 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray16 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        boolean boolean15 = fila0.vazia();
        int int16 = fila0.frente;
        int int17 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = fila14.item;
        fila14.tras = (short) 10;
        java.lang.Object[] objArray21 = fila14.item;
        int int22 = fila14.frente;
        fila0.enfileira((java.lang.Object) fila14);
        // The following exception was thrown during execution in test generation
        try {
            fila14.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila28.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.frente = (-1);
        java.lang.Object[] objArray36 = fila32.item;
        fila32.tras = (short) 10;
        java.lang.Object[] objArray39 = fila32.item;
        fila28.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila41.frente = (-1);
        java.lang.Object[] objArray45 = fila41.item;
        java.lang.Object[] objArray46 = fila41.item;
        fila28.item = objArray46;
        java.lang.Object[] objArray48 = fila28.item;
        fila0.item = objArray48;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray15 = fila5.item;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.frente = 0;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.tras = (byte) 10;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.enfileira((java.lang.Object) (byte) 10);
        fila3.frente = 0;
        fila3.enfileira((java.lang.Object) 10);
        fila3.frente = (short) 0;
        fila3.imprime();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila3.enfileira((java.lang.Object) fila14);
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        fila0.imprime();
        fila0.frente = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        java.lang.Object[] objArray22 = fila14.item;
        boolean boolean23 = fila14.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.imprime();
        fila0.frente = '4';
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 1;
        fila0.tras = (byte) 0;
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray15 = fila5.item;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        fila0.frente = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        boolean boolean15 = fila0.vazia();
        fila0.tras = (byte) -1;
        int int18 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        int int29 = fila0.tras;
        int int30 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.frente = (-1);
        java.lang.Object[] objArray11 = fila7.item;
        fila7.tras = (short) 10;
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila7.item = objArray19;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.frente = (-1);
        java.lang.Object[] objArray29 = fila25.item;
        fila25.tras = (short) 10;
        java.lang.Object[] objArray32 = fila25.item;
        fila21.item = objArray32;
        fila7.item = objArray32;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila35.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.frente = (-1);
        java.lang.Object[] objArray43 = fila39.item;
        fila39.tras = (short) 10;
        java.lang.Object[] objArray46 = fila39.item;
        fila35.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        fila48.frente = (-1);
        java.lang.Object[] objArray52 = fila48.item;
        java.lang.Object[] objArray53 = fila48.item;
        fila35.item = objArray53;
        java.lang.Object[] objArray55 = fila35.item;
        fila7.item = objArray55;
        fila0.enfileira((java.lang.Object) objArray55);
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray59 = fila58.item;
        fila58.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila62.frente = (-1);
        java.lang.Object[] objArray66 = fila62.item;
        fila62.tras = (short) 10;
        java.lang.Object[] objArray69 = fila62.item;
        fila58.item = objArray69;
        ds.Fila fila71 = new ds.Fila();
        java.lang.Object[] objArray72 = fila71.item;
        fila71.frente = (-1);
        java.lang.Object[] objArray75 = fila71.item;
        java.lang.Object[] objArray76 = fila71.item;
        fila58.item = objArray76;
        fila0.item = objArray76;
        fila0.tras = (-1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        java.lang.Object obj7 = fila0.desenfileira();
        int int8 = fila0.tras;
        int int9 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.frente = 1;
        fila0.enfileira((java.lang.Object) fila21);
        int int29 = fila21.tras;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 10);
        boolean boolean34 = fila30.vazia();
        java.lang.Object obj35 = fila30.desenfileira();
        int int36 = fila30.frente;
        java.lang.Class<?> wildcardClass37 = fila30.getClass();
        fila21.enfileira((java.lang.Object) fila30);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 10 + "'", obj35, (byte) 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.frente = (-1);
        java.lang.Object[] objArray13 = fila9.item;
        fila9.frente = ' ';
        java.lang.Object[] objArray16 = fila9.item;
        fila0.item = objArray16;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        fila0.enfileira((java.lang.Object) fila15);
        int int30 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 101 + "'", int30 == 101);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila11.item = objArray17;
        fila11.tras = (short) 0;
        int int21 = fila11.frente;
        fila4.enfileira((java.lang.Object) fila11);
        java.lang.Class<?> wildcardClass23 = fila4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.frente = 0;
        java.lang.Object[] objArray13 = fila0.item;
        fila0.tras = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        int int22 = fila14.frente;
        boolean boolean23 = fila14.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila28.frente = (-1);
        java.lang.Object[] objArray32 = fila28.item;
        fila28.tras = (short) 10;
        fila28.tras = (short) -1;
        java.lang.Object[] objArray37 = fila28.item;
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray39 = fila38.item;
        fila38.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray42 = fila38.item;
        fila28.item = objArray42;
        fila0.enfileira((java.lang.Object) fila28);
        fila28.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        fila0.imprime();
        int int7 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila0.item = objArray19;
        java.lang.Object obj21 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.frente = 1;
        fila0.enfileira((java.lang.Object) fila21);
        int int29 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = ' ';
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.tras = 2;
        fila0.frente = 101;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.frente = 0;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        boolean boolean15 = fila0.vazia();
        java.lang.Object[] objArray16 = fila0.item;
        int int17 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.frente = 0;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.frente = (byte) 10;
        fila0.frente = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila28.frente = (-1);
        java.lang.Object[] objArray32 = fila28.item;
        fila28.tras = (short) 10;
        fila28.tras = (short) -1;
        java.lang.Object[] objArray37 = fila28.item;
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray39 = fila38.item;
        fila38.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray42 = fila38.item;
        fila28.item = objArray42;
        fila0.enfileira((java.lang.Object) fila28);
        boolean boolean45 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 0.0d);
        boolean boolean23 = fila19.vazia();
        fila15.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray26 = fila0.item;
        java.lang.Class<?> wildcardClass27 = objArray26.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila11.item = objArray17;
        fila11.tras = (short) 0;
        int int21 = fila11.frente;
        fila4.enfileira((java.lang.Object) fila11);
        fila4.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        fila0.tras = 0;
        boolean boolean5 = fila0.vazia();
        fila0.tras = 'a';
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        boolean boolean15 = fila0.vazia();
        fila0.tras = (byte) -1;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.enfileira((java.lang.Object) 0.0d);
        boolean boolean23 = fila19.vazia();
        fila15.enfileira((java.lang.Object) fila19);
        fila0.enfileira((java.lang.Object) fila15);
        fila15.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) 100.0d);
        fila4.tras = 0;
        int int15 = fila4.frente;
        java.lang.Object obj16 = fila4.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila11.item = objArray17;
        fila11.tras = (short) 0;
        int int21 = fila11.frente;
        fila4.enfileira((java.lang.Object) fila11);
        fila11.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.enfileira((java.lang.Object) (byte) 10);
        boolean boolean20 = fila16.vazia();
        java.lang.Object obj21 = fila16.desenfileira();
        int int22 = fila16.frente;
        java.lang.Class<?> wildcardClass23 = fila16.getClass();
        fila9.enfileira((java.lang.Object) wildcardClass23);
        fila9.frente = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = 1;
        ds.Fila fila3 = new ds.Fila();
        fila3.frente = (short) 1;
        fila3.tras = 0;
        boolean boolean8 = fila3.vazia();
        int int9 = fila3.tras;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        boolean boolean6 = fila4.vazia();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.frente = (-1);
        java.lang.Object[] objArray11 = fila7.item;
        java.lang.Object[] objArray12 = fila7.item;
        fila4.item = objArray12;
        fila0.item = objArray12;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        int int22 = fila14.tras;
        int int23 = fila14.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila11.item = objArray17;
        fila11.tras = (short) 0;
        int int21 = fila11.frente;
        fila4.enfileira((java.lang.Object) fila11);
        fila11.tras = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0.0d + "'", obj5, 0.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = '#';
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
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
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.frente;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.enfileira((java.lang.Object) (byte) 10);
        boolean boolean20 = fila16.vazia();
        java.lang.Object obj21 = fila16.desenfileira();
        int int22 = fila16.frente;
        java.lang.Class<?> wildcardClass23 = fila16.getClass();
        fila9.enfileira((java.lang.Object) wildcardClass23);
        int int25 = fila9.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        fila0.frente = (short) 1;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) (byte) 10);
        fila17.frente = 0;
        fila17.enfileira((java.lang.Object) 10);
        fila17.frente = (short) 0;
        fila17.imprime();
        java.lang.Object obj28 = fila17.desenfileira();
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.frente = (-1);
        java.lang.Object[] objArray33 = fila29.item;
        fila29.tras = (short) 10;
        java.lang.Object[] objArray36 = fila29.item;
        int int37 = fila29.frente;
        java.lang.Object[] objArray38 = fila29.item;
        fila17.enfileira((java.lang.Object) objArray38);
        fila0.item = objArray38;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 10 + "'", obj28, (byte) 10);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.frente = (-1);
        java.lang.Object[] objArray27 = fila23.item;
        fila21.item = objArray27;
        fila21.tras = (short) 0;
        fila21.imprime();
        int int32 = fila21.tras;
        int int33 = fila21.tras;
        fila21.imprime();
        int int35 = fila21.frente;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila36.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj40 = fila36.desenfileira();
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila41.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        fila45.frente = (-1);
        java.lang.Object[] objArray49 = fila45.item;
        fila45.tras = (short) 10;
        java.lang.Object[] objArray52 = fila45.item;
        fila41.item = objArray52;
        ds.Fila fila54 = new ds.Fila();
        java.lang.Object[] objArray55 = fila54.item;
        fila54.frente = (-1);
        java.lang.Object[] objArray58 = fila54.item;
        java.lang.Object[] objArray59 = fila54.item;
        fila41.item = objArray59;
        fila36.item = objArray59;
        fila21.item = objArray59;
        fila0.item = objArray59;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 10 + "'", obj40, (byte) 10);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 10);
        boolean boolean34 = fila30.vazia();
        int int35 = fila30.tras;
        java.lang.Object[] objArray36 = fila30.item;
        fila15.enfileira((java.lang.Object) fila30);
        boolean boolean38 = fila15.vazia();
        java.lang.Class<?> wildcardClass39 = fila15.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int11 = fila0.tras;
        int int12 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        fila0.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila0.item = objArray19;
        int int21 = fila0.tras;
        int int22 = fila0.tras;
        fila0.frente = (short) -1;
        int int25 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int11 = fila0.tras;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        fila0.frente = 0;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.frente = (-1);
        java.lang.Object[] objArray11 = fila7.item;
        fila7.tras = (short) 10;
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila7.item = objArray19;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.frente = (-1);
        java.lang.Object[] objArray29 = fila25.item;
        fila25.tras = (short) 10;
        java.lang.Object[] objArray32 = fila25.item;
        fila21.item = objArray32;
        fila7.item = objArray32;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila35.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.frente = (-1);
        java.lang.Object[] objArray43 = fila39.item;
        fila39.tras = (short) 10;
        java.lang.Object[] objArray46 = fila39.item;
        fila35.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        fila48.frente = (-1);
        java.lang.Object[] objArray52 = fila48.item;
        java.lang.Object[] objArray53 = fila48.item;
        fila35.item = objArray53;
        java.lang.Object[] objArray55 = fila35.item;
        fila7.item = objArray55;
        fila0.enfileira((java.lang.Object) objArray55);
        java.lang.Object[] objArray58 = fila0.item;
        int int59 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        java.lang.Object[] objArray22 = fila14.item;
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = (short) 1;
        boolean boolean26 = fila23.vazia();
        fila14.enfileira((java.lang.Object) fila23);
        fila14.tras = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            fila14.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.frente = 'a';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        fila11.frente = (-1);
        java.lang.Object[] objArray15 = fila11.item;
        fila11.tras = (short) 10;
        java.lang.Object[] objArray18 = fila11.item;
        fila7.item = objArray18;
        fila7.tras = (byte) 100;
        boolean boolean22 = fila7.vazia();
        fila7.tras = (byte) -1;
        fila0.enfileira((java.lang.Object) (byte) -1);
        boolean boolean26 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = fila8.desenfileira();
        int int13 = fila8.frente;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        ds.Fila fila29 = new ds.Fila();
        java.lang.Object[] objArray30 = fila29.item;
        fila29.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila33.frente = (-1);
        java.lang.Object[] objArray37 = fila33.item;
        fila33.tras = (short) 10;
        java.lang.Object[] objArray40 = fila33.item;
        fila29.item = objArray40;
        fila15.item = objArray40;
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object[] objArray44 = fila43.item;
        fila43.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila47 = new ds.Fila();
        java.lang.Object[] objArray48 = fila47.item;
        fila47.frente = (-1);
        java.lang.Object[] objArray51 = fila47.item;
        fila47.tras = (short) 10;
        java.lang.Object[] objArray54 = fila47.item;
        fila43.item = objArray54;
        ds.Fila fila56 = new ds.Fila();
        java.lang.Object[] objArray57 = fila56.item;
        fila56.frente = (-1);
        java.lang.Object[] objArray60 = fila56.item;
        java.lang.Object[] objArray61 = fila56.item;
        fila43.item = objArray61;
        java.lang.Object[] objArray63 = fila43.item;
        fila15.item = objArray63;
        fila8.enfileira((java.lang.Object) objArray63);
        java.lang.Object[] objArray66 = fila8.item;
        fila0.item = objArray66;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        java.lang.Object[] objArray22 = fila14.item;
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = (short) 1;
        boolean boolean26 = fila23.vazia();
        fila14.enfileira((java.lang.Object) fila23);
        fila14.tras = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.frente;
        boolean boolean3 = fila0.vazia();
        fila0.imprime();
        java.lang.Object[] objArray5 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        boolean boolean15 = fila0.vazia();
        fila0.tras = (byte) 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.frente = (-1);
        java.lang.Object[] objArray26 = fila22.item;
        fila22.tras = (short) 10;
        java.lang.Object[] objArray29 = fila22.item;
        fila18.item = objArray29;
        fila18.tras = (byte) 100;
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        int int35 = fila33.frente;
        boolean boolean36 = fila33.vazia();
        int int37 = fila33.tras;
        boolean boolean38 = fila33.vazia();
        fila33.imprime();
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila40.enfileira((java.lang.Object) (byte) 10);
        boolean boolean44 = fila40.vazia();
        java.lang.Object obj45 = fila40.desenfileira();
        ds.Fila fila46 = new ds.Fila();
        fila46.frente = (short) 1;
        java.lang.Object[] objArray49 = fila46.item;
        fila40.item = objArray49;
        fila33.item = objArray49;
        fila18.item = objArray49;
        fila0.item = objArray49;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 10 + "'", obj45, (byte) 10);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = '#';
        java.lang.Object[] objArray6 = null;
        fila0.item = objArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        fila0.frente = (short) 1;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        fila0.tras = 0;
        boolean boolean5 = fila0.vazia();
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.tras = 2;
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        java.lang.Object obj13 = fila0.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = fila14.item;
        fila14.tras = (short) 10;
        java.lang.Object[] objArray21 = fila14.item;
        int int22 = fila14.frente;
        java.lang.Object[] objArray23 = fila14.item;
        fila0.item = objArray23;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        java.lang.Object[] objArray2 = fila1.item;
        fila1.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.frente = (-1);
        java.lang.Object[] objArray9 = fila5.item;
        fila5.tras = (short) 10;
        java.lang.Object[] objArray12 = fila5.item;
        fila1.item = objArray12;
        fila1.tras = (byte) 100;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.frente = (-1);
        java.lang.Object[] objArray20 = fila16.item;
        fila16.tras = (short) 10;
        java.lang.Object[] objArray23 = fila16.item;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray28 = fila24.item;
        fila16.item = objArray28;
        fila1.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila1);
        int int32 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.frente;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        fila0.frente = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = (short) 1;
        java.lang.Object[] objArray9 = fila6.item;
        fila0.item = objArray9;
        fila0.frente = 32;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = fila13.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.frente = (-1);
        java.lang.Object[] objArray26 = fila22.item;
        fila22.tras = (short) 10;
        java.lang.Object[] objArray29 = fila22.item;
        fila18.item = objArray29;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.frente = (-1);
        java.lang.Object[] objArray35 = fila31.item;
        java.lang.Object[] objArray36 = fila31.item;
        fila18.item = objArray36;
        fila13.item = objArray36;
        java.lang.Object[] objArray39 = fila13.item;
        fila0.item = objArray39;
        int int41 = fila0.tras;
        int int42 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) 0;
        fila0.tras = (short) 10;
        java.lang.Object obj35 = fila0.desenfileira();
        boolean boolean36 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        java.lang.Object[] objArray9 = fila7.item;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.enfileira((java.lang.Object) 0.0d);
        boolean boolean18 = fila14.vazia();
        fila10.enfileira((java.lang.Object) fila14);
        java.lang.Object[] objArray20 = fila10.item;
        java.lang.Object[] objArray21 = fila10.item;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.frente = (-1);
        java.lang.Object[] objArray28 = fila24.item;
        fila22.item = objArray28;
        fila22.tras = (short) 0;
        fila22.imprime();
        int int33 = fila22.tras;
        int int34 = fila22.tras;
        fila22.imprime();
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila36.enfileira((java.lang.Object) (byte) 10);
        fila36.frente = 0;
        fila36.enfileira((java.lang.Object) 10);
        fila36.frente = (short) 0;
        fila36.imprime();
        fila36.frente = 0;
        java.lang.Object[] objArray49 = fila36.item;
        fila22.item = objArray49;
        fila10.item = objArray49;
        fila7.item = objArray49;
        fila0.enfileira((java.lang.Object) fila7);
        fila0.frente = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.frente = (-1);
        java.lang.Object[] objArray16 = fila12.item;
        fila12.tras = (short) 10;
        java.lang.Object[] objArray19 = fila12.item;
        int int20 = fila12.frente;
        java.lang.Object[] objArray21 = fila12.item;
        fila0.enfileira((java.lang.Object) objArray21);
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        boolean boolean25 = fila23.vazia();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.frente = (-1);
        java.lang.Object[] objArray30 = fila26.item;
        java.lang.Object[] objArray31 = fila26.item;
        fila23.item = objArray31;
        fila23.frente = ' ';
        int int35 = fila23.tras;
        fila23.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) (short) 1);
        int int39 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.frente = (-1);
        java.lang.Object[] objArray13 = fila9.item;
        fila9.tras = (short) 10;
        java.lang.Object[] objArray16 = fila9.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        java.lang.Object[] objArray23 = fila18.item;
        fila5.item = objArray23;
        fila0.item = objArray23;
        int int26 = fila0.frente;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila27.frente = (-1);
        java.lang.Object[] objArray31 = fila27.item;
        fila27.tras = (short) 10;
        fila27.tras = (short) -1;
        fila27.imprime();
        boolean boolean37 = fila27.vazia();
        java.lang.Object[] objArray38 = fila27.item;
        fila0.enfileira((java.lang.Object) objArray38);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        fila0.enfileira((java.lang.Object) fila15);
        int int30 = fila0.frente;
        java.lang.Object obj31 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.frente = 100;
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        fila0.tras = (short) -1;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.tras = 100;
        int int6 = fila0.tras;
        fila0.frente = 100;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        java.lang.Object[] objArray23 = fila21.item;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.enfileira((java.lang.Object) 0.0d);
        boolean boolean32 = fila28.vazia();
        fila24.enfileira((java.lang.Object) fila28);
        java.lang.Object[] objArray34 = fila24.item;
        java.lang.Object[] objArray35 = fila24.item;
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray39 = fila38.item;
        fila38.frente = (-1);
        java.lang.Object[] objArray42 = fila38.item;
        fila36.item = objArray42;
        fila36.tras = (short) 0;
        fila36.imprime();
        int int47 = fila36.tras;
        int int48 = fila36.tras;
        fila36.imprime();
        ds.Fila fila50 = new ds.Fila();
        java.lang.Object[] objArray51 = fila50.item;
        fila50.enfileira((java.lang.Object) (byte) 10);
        fila50.frente = 0;
        fila50.enfileira((java.lang.Object) 10);
        fila50.frente = (short) 0;
        fila50.imprime();
        fila50.frente = 0;
        java.lang.Object[] objArray63 = fila50.item;
        fila36.item = objArray63;
        fila24.item = objArray63;
        fila21.item = objArray63;
        fila0.item = objArray63;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        int int12 = fila0.tras;
        java.lang.Object obj13 = fila0.desenfileira();
        int int14 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = (short) 1;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.frente = (-1);
        java.lang.Object[] objArray21 = fila17.item;
        fila17.tras = (short) 10;
        java.lang.Object[] objArray24 = fila17.item;
        fila13.item = objArray24;
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.frente = (-1);
        java.lang.Object[] objArray30 = fila26.item;
        java.lang.Object[] objArray31 = fila26.item;
        fila13.item = objArray31;
        fila10.item = objArray31;
        fila0.item = objArray31;
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila28.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.frente = (-1);
        java.lang.Object[] objArray36 = fila32.item;
        fila32.tras = (short) 10;
        java.lang.Object[] objArray39 = fila32.item;
        fila28.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        java.lang.Object[] objArray42 = fila41.item;
        fila41.frente = (-1);
        java.lang.Object[] objArray45 = fila41.item;
        java.lang.Object[] objArray46 = fila41.item;
        fila28.item = objArray46;
        java.lang.Object[] objArray48 = fila28.item;
        fila0.item = objArray48;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.frente = (-1);
        java.lang.Object[] objArray14 = fila10.item;
        fila8.item = objArray14;
        fila0.item = objArray14;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = fila17.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.frente = (-1);
        java.lang.Object[] objArray30 = fila26.item;
        fila26.tras = (short) 10;
        java.lang.Object[] objArray33 = fila26.item;
        fila22.item = objArray33;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila35.frente = (-1);
        java.lang.Object[] objArray39 = fila35.item;
        java.lang.Object[] objArray40 = fila35.item;
        fila22.item = objArray40;
        fila17.item = objArray40;
        java.lang.Object[] objArray43 = fila17.item;
        ds.Fila fila44 = new ds.Fila();
        java.lang.Object[] objArray45 = fila44.item;
        fila44.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj48 = fila44.desenfileira();
        ds.Fila fila49 = new ds.Fila();
        java.lang.Object[] objArray50 = fila49.item;
        fila49.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila53 = new ds.Fila();
        java.lang.Object[] objArray54 = fila53.item;
        fila53.frente = (-1);
        java.lang.Object[] objArray57 = fila53.item;
        fila53.tras = (short) 10;
        java.lang.Object[] objArray60 = fila53.item;
        fila49.item = objArray60;
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila62.frente = (-1);
        java.lang.Object[] objArray66 = fila62.item;
        java.lang.Object[] objArray67 = fila62.item;
        fila49.item = objArray67;
        fila44.item = objArray67;
        int int70 = fila44.frente;
        fila17.enfileira((java.lang.Object) fila44);
        fila0.enfileira((java.lang.Object) fila44);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 10 + "'", obj48, (byte) 10);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        fila0.tras = 0;
        boolean boolean5 = fila0.vazia();
        fila0.tras = 'a';
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.frente = (-1);
        java.lang.Object[] objArray16 = fila12.item;
        fila12.tras = (short) 10;
        java.lang.Object[] objArray19 = fila12.item;
        fila8.item = objArray19;
        fila8.tras = (byte) 100;
        boolean boolean23 = fila8.vazia();
        fila8.tras = (byte) -1;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj27 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 10);
        boolean boolean34 = fila30.vazia();
        int int35 = fila30.tras;
        java.lang.Object[] objArray36 = fila30.item;
        fila15.enfileira((java.lang.Object) fila30);
        boolean boolean38 = fila15.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.tras;
        int int13 = fila0.tras;
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.enfileira((java.lang.Object) (byte) 10);
        fila6.tras = (byte) 10;
        java.lang.Object[] objArray12 = fila6.item;
        fila0.item = objArray12;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.frente = (-1);
        java.lang.Object[] objArray14 = fila10.item;
        fila8.item = objArray14;
        fila0.item = objArray14;
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        int int20 = fila0.tras;
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        fila21.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj25 = fila21.desenfileira();
        fila21.frente = 1;
        fila0.enfileira((java.lang.Object) fila21);
        int int29 = fila21.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = fila21.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0d + "'", obj25, 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.frente = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.tras = 0;
        fila0.imprime();
        java.lang.Object[] objArray13 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = ' ';
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = fila6.item;
        fila6.frente = ' ';
        java.lang.Object[] objArray13 = fila6.item;
        fila0.item = objArray13;
        fila0.tras = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        int int15 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = null;
        fila0.enfileira(obj5);
        java.lang.Object obj7 = fila0.desenfileira();
        int int8 = fila0.tras;
        fila0.tras = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        boolean boolean14 = fila0.vazia();
        int int15 = fila0.frente;
        fila0.frente = (short) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass22 = fila8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila11.item = objArray17;
        fila11.tras = (short) 0;
        int int21 = fila11.frente;
        fila4.enfileira((java.lang.Object) fila11);
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.frente = (-1);
        java.lang.Object[] objArray29 = fila25.item;
        fila23.item = objArray29;
        fila23.tras = (short) 0;
        fila23.imprime();
        int int34 = fila23.tras;
        int int35 = fila23.tras;
        fila23.imprime();
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.enfileira((java.lang.Object) (byte) 10);
        fila37.frente = 0;
        fila37.enfileira((java.lang.Object) 10);
        fila37.frente = (short) 0;
        fila37.imprime();
        fila37.frente = 0;
        java.lang.Object[] objArray50 = fila37.item;
        fila23.item = objArray50;
        fila11.item = objArray50;
        boolean boolean53 = fila11.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object[] objArray11 = fila0.item;
        int int12 = fila0.tras;
        int int13 = fila0.tras;
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 10);
        boolean boolean34 = fila30.vazia();
        int int35 = fila30.tras;
        java.lang.Object[] objArray36 = fila30.item;
        fila15.enfileira((java.lang.Object) fila30);
        boolean boolean38 = fila30.vazia();
        java.lang.Object obj39 = fila30.desenfileira();
        fila30.frente = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 10 + "'", obj39, (byte) 10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray13 = fila9.item;
        java.lang.Object obj14 = null;
        fila9.enfileira(obj14);
        java.lang.Object obj16 = fila9.desenfileira();
        java.lang.Object[] objArray17 = fila9.item;
        fila0.item = objArray17;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.tras = 0;
        int int12 = fila0.frente;
        fila0.imprime();
        java.lang.Object[] objArray14 = fila0.item;
        fila0.frente = '4';
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) 0;
        fila0.tras = (short) 10;
        java.lang.Object obj35 = fila0.desenfileira();
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila36.enfileira((java.lang.Object) (byte) 10);
        fila36.frente = (byte) 10;
        java.lang.Object[] objArray42 = fila36.item;
        java.lang.Object[] objArray43 = fila36.item;
        fila0.item = objArray43;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        java.lang.Object[] objArray4 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = fila14.item;
        fila12.item = objArray18;
        fila12.tras = (short) 0;
        fila12.imprime();
        int int23 = fila12.tras;
        int int24 = fila12.tras;
        fila12.imprime();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.enfileira((java.lang.Object) (byte) 10);
        fila26.frente = 0;
        fila26.enfileira((java.lang.Object) 10);
        fila26.frente = (short) 0;
        fila26.imprime();
        fila26.frente = 0;
        java.lang.Object[] objArray39 = fila26.item;
        fila12.item = objArray39;
        fila0.item = objArray39;
        fila0.frente = (byte) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        fila0.imprime();
        int int11 = fila0.tras;
        int int12 = fila0.tras;
        fila0.imprime();
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        fila14.frente = 0;
        fila14.enfileira((java.lang.Object) 10);
        fila14.frente = (short) 0;
        fila14.imprime();
        fila14.frente = 0;
        java.lang.Object[] objArray27 = fila14.item;
        fila0.item = objArray27;
        java.lang.Object[] objArray29 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        boolean boolean15 = fila0.vazia();
        int int16 = fila0.frente;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray21 = fila17.item;
        fila0.enfileira((java.lang.Object) objArray21);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = fila6.item;
        fila4.item = objArray10;
        fila4.tras = (short) 0;
        fila4.imprime();
        int int15 = fila4.tras;
        int int16 = fila4.tras;
        fila4.imprime();
        fila4.tras = (short) 0;
        fila0.enfileira((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        boolean boolean22 = fila8.vazia();
        fila8.tras = 1;
        boolean boolean25 = fila8.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = ' ';
        int int7 = fila0.frente;
        fila0.frente = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 10);
        boolean boolean34 = fila30.vazia();
        int int35 = fila30.tras;
        java.lang.Object[] objArray36 = fila30.item;
        fila15.enfileira((java.lang.Object) fila30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = fila15.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object[] objArray11 = fila0.item;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        int int29 = fila0.tras;
        int int30 = fila0.frente;
        java.lang.Object[] objArray31 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = (short) 1;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.frente = (-1);
        java.lang.Object[] objArray21 = fila17.item;
        fila17.tras = (short) 10;
        java.lang.Object[] objArray24 = fila17.item;
        fila13.item = objArray24;
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.frente = (-1);
        java.lang.Object[] objArray30 = fila26.item;
        java.lang.Object[] objArray31 = fila26.item;
        fila13.item = objArray31;
        fila10.item = objArray31;
        fila0.item = objArray31;
        fila0.tras = (short) 1;
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.frente = (-1);
        java.lang.Object[] objArray41 = fila37.item;
        fila37.tras = (short) 10;
        java.lang.Object[] objArray44 = fila37.item;
        fila0.item = objArray44;
        java.lang.Object obj46 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.tras = 2;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        java.lang.Object[] objArray22 = fila14.item;
        java.lang.Object[] objArray23 = fila14.item;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.frente = (-1);
        java.lang.Object[] objArray28 = fila24.item;
        java.lang.Object[] objArray29 = fila24.item;
        java.lang.Object[] objArray30 = fila24.item;
        fila14.item = objArray30;
        int int32 = fila14.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        boolean boolean15 = fila0.vazia();
        fila0.tras = (byte) 0;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.frente = (-1);
        java.lang.Object[] objArray24 = fila20.item;
        fila18.item = objArray24;
        fila18.tras = (short) 0;
        fila18.imprime();
        int int29 = fila18.tras;
        int int30 = fila18.tras;
        fila18.imprime();
        int int32 = fila18.frente;
        ds.Fila fila33 = new ds.Fila();
        java.lang.Object[] objArray34 = fila33.item;
        fila33.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = fila33.desenfileira();
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray39 = fila38.item;
        fila38.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila42 = new ds.Fila();
        java.lang.Object[] objArray43 = fila42.item;
        fila42.frente = (-1);
        java.lang.Object[] objArray46 = fila42.item;
        fila42.tras = (short) 10;
        java.lang.Object[] objArray49 = fila42.item;
        fila38.item = objArray49;
        ds.Fila fila51 = new ds.Fila();
        java.lang.Object[] objArray52 = fila51.item;
        fila51.frente = (-1);
        java.lang.Object[] objArray55 = fila51.item;
        java.lang.Object[] objArray56 = fila51.item;
        fila38.item = objArray56;
        fila33.item = objArray56;
        fila18.item = objArray56;
        fila0.item = objArray56;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.frente = (-1);
        java.lang.Object[] objArray9 = fila5.item;
        fila5.tras = (short) 10;
        java.lang.Object[] objArray12 = fila5.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray17 = fila13.item;
        fila5.item = objArray17;
        fila0.item = objArray17;
        fila0.imprime();
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        fila0.tras = 100;
        int int6 = fila0.tras;
        fila0.frente = 100;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.frente = (-1);
        java.lang.Object[] objArray13 = fila9.item;
        fila9.tras = (short) 10;
        java.lang.Object[] objArray16 = fila9.item;
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray21 = fila17.item;
        fila9.item = objArray21;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila27.frente = (-1);
        java.lang.Object[] objArray31 = fila27.item;
        fila27.tras = (short) 10;
        java.lang.Object[] objArray34 = fila27.item;
        fila23.item = objArray34;
        fila9.item = objArray34;
        fila0.item = objArray34;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.enfileira((java.lang.Object) (byte) 10);
        boolean boolean20 = fila16.vazia();
        java.lang.Object obj21 = fila16.desenfileira();
        int int22 = fila16.frente;
        java.lang.Class<?> wildcardClass23 = fila16.getClass();
        fila9.enfileira((java.lang.Object) wildcardClass23);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila27.frente = (-1);
        java.lang.Object[] objArray31 = fila27.item;
        fila25.item = objArray31;
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        fila33.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj37 = fila33.desenfileira();
        fila25.enfileira((java.lang.Object) fila33);
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray43 = fila39.item;
        java.lang.Object obj44 = null;
        fila39.enfileira(obj44);
        fila33.enfileira((java.lang.Object) fila39);
        java.lang.Object[] objArray47 = fila39.item;
        ds.Fila fila48 = new ds.Fila();
        fila48.frente = (short) 1;
        boolean boolean51 = fila48.vazia();
        fila39.enfileira((java.lang.Object) fila48);
        fila9.enfileira((java.lang.Object) fila48);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0d + "'", obj37, 0.0d);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object[] objArray7 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        int int11 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.tras = '4';
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        fila0.tras = 0;
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.tras;
        boolean boolean8 = fila0.vazia();
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.tras = 0;
        int int12 = fila0.frente;
        fila0.imprime();
        int int14 = fila0.frente;
        java.lang.Object[] objArray15 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 10);
        boolean boolean34 = fila30.vazia();
        int int35 = fila30.tras;
        java.lang.Object[] objArray36 = fila30.item;
        fila15.enfileira((java.lang.Object) fila30);
        fila30.tras = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        int int9 = fila0.tras;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.frente = (-1);
        java.lang.Object[] objArray14 = fila10.item;
        fila10.tras = (short) 10;
        java.lang.Object[] objArray17 = fila10.item;
        java.lang.Object[] objArray18 = fila10.item;
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = (short) 1;
        boolean boolean22 = fila19.vazia();
        java.lang.Object obj23 = fila19.desenfileira();
        int int24 = fila19.frente;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila27.frente = (-1);
        java.lang.Object[] objArray31 = fila27.item;
        fila25.item = objArray31;
        fila25.tras = (short) 0;
        fila25.imprime();
        int int36 = fila25.tras;
        int int37 = fila25.tras;
        ds.Fila fila38 = new ds.Fila();
        fila38.frente = (short) 1;
        java.lang.Object[] objArray41 = fila38.item;
        fila25.item = objArray41;
        fila19.item = objArray41;
        fila10.item = objArray41;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.tras;
        boolean boolean9 = fila0.vazia();
        int int10 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.frente;
        int int7 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        java.lang.Object[] objArray11 = fila4.item;
        java.lang.Class<?> wildcardClass12 = fila4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila11.item = objArray17;
        fila11.tras = (short) 0;
        int int21 = fila11.frente;
        fila4.enfileira((java.lang.Object) fila11);
        boolean boolean23 = fila11.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        fila0.imprime();
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        boolean boolean11 = fila9.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.frente = (-1);
        java.lang.Object[] objArray16 = fila12.item;
        java.lang.Object[] objArray17 = fila12.item;
        fila9.item = objArray17;
        fila9.frente = 0;
        fila0.enfileira((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        fila0.tras = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.frente = (-1);
        java.lang.Object[] objArray11 = fila7.item;
        fila7.tras = (short) 10;
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila7.item = objArray19;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.frente = (-1);
        java.lang.Object[] objArray29 = fila25.item;
        fila25.tras = (short) 10;
        java.lang.Object[] objArray32 = fila25.item;
        fila21.item = objArray32;
        fila7.item = objArray32;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila35.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.frente = (-1);
        java.lang.Object[] objArray43 = fila39.item;
        fila39.tras = (short) 10;
        java.lang.Object[] objArray46 = fila39.item;
        fila35.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        fila48.frente = (-1);
        java.lang.Object[] objArray52 = fila48.item;
        java.lang.Object[] objArray53 = fila48.item;
        fila35.item = objArray53;
        java.lang.Object[] objArray55 = fila35.item;
        fila7.item = objArray55;
        fila0.enfileira((java.lang.Object) objArray55);
        java.lang.Object[] objArray58 = fila0.item;
        fila0.tras = (byte) 0;
        boolean boolean61 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.frente = (-1);
        java.lang.Object[] objArray14 = fila10.item;
        fila8.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj20 = fila16.desenfileira();
        fila8.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        java.lang.Object[] objArray23 = fila16.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0d + "'", obj20, 0.0d);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        fila4.enfileira((java.lang.Object) 100.0d);
        fila4.tras = 0;
        int int15 = fila4.frente;
        fila4.frente = (byte) 0;
        fila4.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        java.lang.Object obj19 = null;
        fila14.enfileira(obj19);
        fila8.enfileira((java.lang.Object) fila14);
        java.lang.Object[] objArray22 = fila14.item;
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = (short) 1;
        boolean boolean26 = fila23.vazia();
        fila14.enfileira((java.lang.Object) fila23);
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        fila28.enfileira((java.lang.Object) (byte) 10);
        fila28.frente = 0;
        fila28.enfileira((java.lang.Object) 10);
        fila28.frente = (short) 0;
        fila28.imprime();
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila43 = new ds.Fila();
        java.lang.Object[] objArray44 = fila43.item;
        fila43.frente = (-1);
        java.lang.Object[] objArray47 = fila43.item;
        fila43.tras = (short) 10;
        java.lang.Object[] objArray50 = fila43.item;
        fila39.item = objArray50;
        fila28.enfileira((java.lang.Object) fila39);
        boolean boolean53 = fila28.vazia();
        fila14.enfileira((java.lang.Object) boolean53);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray14 = fila8.item;
        java.lang.Class<?> wildcardClass15 = fila8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        fila0.tras = 0;
        int int11 = fila0.frente;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.frente = (-1);
        java.lang.Object[] objArray20 = fila16.item;
        fila16.tras = (short) 10;
        java.lang.Object[] objArray23 = fila16.item;
        fila12.item = objArray23;
        java.lang.Class<?> wildcardClass25 = objArray23.getClass();
        fila0.enfileira((java.lang.Object) objArray23);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray12 = fila8.item;
        fila0.item = objArray12;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        fila18.tras = (short) 10;
        java.lang.Object[] objArray25 = fila18.item;
        fila14.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.frente = (short) 10;
        boolean boolean31 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.frente;
        fila0.tras = 1;
        fila0.tras = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        java.lang.Object[] objArray2 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.frente = 0;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        fila0.tras = (byte) 10;
        fila0.frente = (short) 1;
        int int19 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.tras = 0;
        int int12 = fila0.frente;
        fila0.imprime();
        int int14 = fila0.tras;
        fila0.frente = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        boolean boolean3 = fila0.vazia();
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = (short) 1;
        java.lang.Object[] objArray9 = fila6.item;
        fila0.item = objArray9;
        fila0.frente = 32;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = fila13.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila22.frente = (-1);
        java.lang.Object[] objArray26 = fila22.item;
        fila22.tras = (short) 10;
        java.lang.Object[] objArray29 = fila22.item;
        fila18.item = objArray29;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.frente = (-1);
        java.lang.Object[] objArray35 = fila31.item;
        java.lang.Object[] objArray36 = fila31.item;
        fila18.item = objArray36;
        fila13.item = objArray36;
        java.lang.Object[] objArray39 = fila13.item;
        fila0.item = objArray39;
        int int41 = fila0.tras;
        fila0.frente = (byte) 10;
        ds.Fila fila44 = new ds.Fila();
        java.lang.Object[] objArray45 = fila44.item;
        ds.Fila fila46 = new ds.Fila();
        java.lang.Object[] objArray47 = fila46.item;
        fila46.frente = (-1);
        java.lang.Object[] objArray50 = fila46.item;
        fila44.item = objArray50;
        fila44.tras = (short) 0;
        fila44.imprime();
        int int55 = fila44.tras;
        int int56 = fila44.tras;
        fila44.imprime();
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray59 = fila58.item;
        fila58.enfileira((java.lang.Object) (byte) 10);
        fila58.frente = 0;
        fila58.enfileira((java.lang.Object) 10);
        fila58.frente = (short) 0;
        fila58.imprime();
        fila58.frente = 0;
        java.lang.Object[] objArray71 = fila58.item;
        fila44.item = objArray71;
        fila0.item = objArray71;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        fila0.enfileira((java.lang.Object) fila15);
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.enfileira((java.lang.Object) (byte) 10);
        boolean boolean34 = fila30.vazia();
        int int35 = fila30.tras;
        java.lang.Object[] objArray36 = fila30.item;
        fila15.enfileira((java.lang.Object) fila30);
        boolean boolean38 = fila30.vazia();
        java.lang.Object obj39 = fila30.desenfileira();
        int int40 = fila30.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 10 + "'", obj39, (byte) 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        fila9.frente = (-1);
        java.lang.Object[] objArray13 = fila9.item;
        fila9.tras = (short) 10;
        java.lang.Object[] objArray16 = fila9.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        java.lang.Object[] objArray19 = fila18.item;
        fila18.frente = (-1);
        java.lang.Object[] objArray22 = fila18.item;
        java.lang.Object[] objArray23 = fila18.item;
        fila5.item = objArray23;
        fila0.item = objArray23;
        int int26 = fila0.frente;
        int int27 = fila0.frente;
        ds.Fila fila28 = new ds.Fila();
        java.lang.Object[] objArray29 = fila28.item;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.frente = (-1);
        java.lang.Object[] objArray34 = fila30.item;
        fila28.item = objArray34;
        fila28.tras = (short) 0;
        fila28.imprime();
        int int39 = fila28.tras;
        int int40 = fila28.tras;
        fila28.imprime();
        fila0.enfileira((java.lang.Object) fila28);
        fila0.imprime();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.tras = 0;
        int int12 = fila0.frente;
        fila0.imprime();
        java.lang.Object[] objArray14 = fila0.item;
        fila0.frente = '4';
        fila0.tras = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.imprime();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        boolean boolean7 = fila5.vazia();
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.frente = (-1);
        java.lang.Object[] objArray12 = fila8.item;
        java.lang.Object[] objArray13 = fila8.item;
        fila5.item = objArray13;
        fila5.frente = ' ';
        int int17 = fila5.tras;
        fila5.enfileira((java.lang.Object) (short) 1);
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray24 = fila20.item;
        fila5.item = objArray24;
        int int26 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        fila0.tras = 3;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.frente = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) 10);
        int int4 = fila0.frente;
        fila0.frente = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.enfileira((java.lang.Object) (byte) 10);
        fila6.frente = 0;
        fila6.enfileira((java.lang.Object) 10);
        fila6.frente = (short) 0;
        fila6.imprime();
        fila6.tras = 3;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = fila19.desenfileira();
        int int24 = fila19.frente;
        boolean boolean25 = fila19.vazia();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.frente = (-1);
        java.lang.Object[] objArray30 = fila26.item;
        fila26.tras = (short) 10;
        java.lang.Object[] objArray33 = fila26.item;
        ds.Fila fila34 = new ds.Fila();
        java.lang.Object[] objArray35 = fila34.item;
        fila34.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray38 = fila34.item;
        fila26.item = objArray38;
        ds.Fila fila40 = new ds.Fila();
        java.lang.Object[] objArray41 = fila40.item;
        fila40.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila44 = new ds.Fila();
        java.lang.Object[] objArray45 = fila44.item;
        fila44.frente = (-1);
        java.lang.Object[] objArray48 = fila44.item;
        fila44.tras = (short) 10;
        java.lang.Object[] objArray51 = fila44.item;
        fila40.item = objArray51;
        fila26.item = objArray51;
        ds.Fila fila54 = new ds.Fila();
        java.lang.Object[] objArray55 = fila54.item;
        fila54.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray59 = fila58.item;
        fila58.frente = (-1);
        java.lang.Object[] objArray62 = fila58.item;
        fila58.tras = (short) 10;
        java.lang.Object[] objArray65 = fila58.item;
        fila54.item = objArray65;
        ds.Fila fila67 = new ds.Fila();
        java.lang.Object[] objArray68 = fila67.item;
        fila67.frente = (-1);
        java.lang.Object[] objArray71 = fila67.item;
        java.lang.Object[] objArray72 = fila67.item;
        fila54.item = objArray72;
        java.lang.Object[] objArray74 = fila54.item;
        fila26.item = objArray74;
        fila19.enfileira((java.lang.Object) objArray74);
        ds.Fila fila77 = new ds.Fila();
        java.lang.Object[] objArray78 = fila77.item;
        fila77.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila81 = new ds.Fila();
        java.lang.Object[] objArray82 = fila81.item;
        fila81.frente = (-1);
        java.lang.Object[] objArray85 = fila81.item;
        fila81.tras = (short) 10;
        java.lang.Object[] objArray88 = fila81.item;
        fila77.item = objArray88;
        ds.Fila fila90 = new ds.Fila();
        java.lang.Object[] objArray91 = fila90.item;
        fila90.frente = (-1);
        java.lang.Object[] objArray94 = fila90.item;
        java.lang.Object[] objArray95 = fila90.item;
        fila77.item = objArray95;
        fila19.item = objArray95;
        fila6.enfileira((java.lang.Object) objArray95);
        fila0.item = objArray95;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertNotNull(objArray95);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        java.lang.Object[] objArray9 = fila0.item;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = fila10.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.enfileira((java.lang.Object) (byte) 10);
        boolean boolean20 = fila16.vazia();
        java.lang.Object obj21 = fila16.desenfileira();
        ds.Fila fila22 = new ds.Fila();
        fila22.frente = (short) 1;
        java.lang.Object[] objArray25 = fila22.item;
        fila16.item = objArray25;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        boolean boolean11 = fila0.vazia();
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.frente = (-1);
        java.lang.Object[] objArray20 = fila16.item;
        fila16.tras = (short) 10;
        java.lang.Object[] objArray23 = fila16.item;
        fila12.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.frente = (-1);
        java.lang.Object[] objArray29 = fila25.item;
        java.lang.Object[] objArray30 = fila25.item;
        fila12.item = objArray30;
        fila0.enfileira((java.lang.Object) fila12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray15 = fila5.item;
        java.lang.Object[] objArray16 = fila5.item;
        fila0.item = objArray16;
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        java.lang.Object[] objArray9 = fila7.item;
        ds.Fila fila10 = new ds.Fila();
        java.lang.Object[] objArray11 = fila10.item;
        fila10.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.enfileira((java.lang.Object) 0.0d);
        boolean boolean18 = fila14.vazia();
        fila10.enfileira((java.lang.Object) fila14);
        java.lang.Object[] objArray20 = fila10.item;
        java.lang.Object[] objArray21 = fila10.item;
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        ds.Fila fila24 = new ds.Fila();
        java.lang.Object[] objArray25 = fila24.item;
        fila24.frente = (-1);
        java.lang.Object[] objArray28 = fila24.item;
        fila22.item = objArray28;
        fila22.tras = (short) 0;
        fila22.imprime();
        int int33 = fila22.tras;
        int int34 = fila22.tras;
        fila22.imprime();
        ds.Fila fila36 = new ds.Fila();
        java.lang.Object[] objArray37 = fila36.item;
        fila36.enfileira((java.lang.Object) (byte) 10);
        fila36.frente = 0;
        fila36.enfileira((java.lang.Object) 10);
        fila36.frente = (short) 0;
        fila36.imprime();
        fila36.frente = 0;
        java.lang.Object[] objArray49 = fila36.item;
        fila22.item = objArray49;
        fila10.item = objArray49;
        fila7.item = objArray49;
        fila0.item = objArray49;
        java.lang.Class<?> wildcardClass54 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        boolean boolean6 = fila4.vazia();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.frente = (-1);
        java.lang.Object[] objArray11 = fila7.item;
        java.lang.Object[] objArray12 = fila7.item;
        fila4.item = objArray12;
        fila0.item = objArray12;
        java.lang.Object[] objArray15 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.imprime();
        fila0.tras = '4';
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = fila6.item;
        fila6.tras = (short) 10;
        java.lang.Object[] objArray13 = fila6.item;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray18 = fila14.item;
        fila6.item = objArray18;
        fila0.item = objArray18;
        boolean boolean21 = fila0.vazia();
        java.lang.Object obj22 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.frente = (short) 0;
        fila0.imprime();
        fila0.tras = 2;
        boolean boolean13 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        fila0.tras = 32;
        ds.Fila fila9 = new ds.Fila();
        java.lang.Object[] objArray10 = fila9.item;
        int int11 = fila9.frente;
        boolean boolean12 = fila9.vazia();
        int int13 = fila9.tras;
        boolean boolean14 = fila9.vazia();
        java.lang.Object[] objArray15 = fila9.item;
        fila0.item = objArray15;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        java.lang.Object[] objArray7 = fila6.item;
        fila6.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.enfileira((java.lang.Object) 0.0d);
        boolean boolean14 = fila10.vazia();
        fila6.enfileira((java.lang.Object) fila10);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = (short) 1;
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.frente = (-1);
        java.lang.Object[] objArray27 = fila23.item;
        fila23.tras = (short) 10;
        java.lang.Object[] objArray30 = fila23.item;
        fila19.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        java.lang.Object[] objArray33 = fila32.item;
        fila32.frente = (-1);
        java.lang.Object[] objArray36 = fila32.item;
        java.lang.Object[] objArray37 = fila32.item;
        fila19.item = objArray37;
        fila16.item = objArray37;
        fila6.item = objArray37;
        java.lang.Object[] objArray41 = fila6.item;
        fila0.item = objArray41;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.tras = (short) 10;
        fila0.tras = (short) -1;
        fila0.imprime();
        java.lang.Object[] objArray10 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        fila0.tras = 0;
        boolean boolean5 = fila0.vazia();
        fila0.tras = 'a';
        ds.Fila fila8 = new ds.Fila();
        java.lang.Object[] objArray9 = fila8.item;
        fila8.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        fila12.frente = (-1);
        java.lang.Object[] objArray16 = fila12.item;
        fila12.tras = (short) 10;
        java.lang.Object[] objArray19 = fila12.item;
        fila8.item = objArray19;
        fila8.tras = (byte) 100;
        boolean boolean23 = fila8.vazia();
        fila8.tras = (byte) -1;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray27 = fila8.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = (short) 1;
        fila0.tras = 0;
        boolean boolean5 = fila0.vazia();
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.tras;
        int int8 = fila0.frente;
        fila0.frente = 1;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.enfileira((java.lang.Object) (byte) 10);
        fila3.frente = 0;
        fila3.enfileira((java.lang.Object) 10);
        fila3.frente = (short) 0;
        fila3.imprime();
        fila3.frente = 0;
        fila0.enfileira((java.lang.Object) fila3);
        fila0.frente = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        boolean boolean15 = fila0.vazia();
        ds.Fila fila16 = new ds.Fila();
        java.lang.Object[] objArray17 = fila16.item;
        fila16.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila20.frente = (-1);
        java.lang.Object[] objArray24 = fila20.item;
        fila20.tras = (short) 10;
        java.lang.Object[] objArray27 = fila20.item;
        fila16.item = objArray27;
        fila16.tras = (byte) 100;
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.frente = (-1);
        java.lang.Object[] objArray35 = fila31.item;
        fila31.tras = (short) 10;
        java.lang.Object[] objArray38 = fila31.item;
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray43 = fila39.item;
        fila31.item = objArray43;
        fila16.enfileira((java.lang.Object) fila31);
        java.lang.Object[] objArray46 = fila16.item;
        fila0.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        fila48.frente = (-1);
        java.lang.Object[] objArray52 = fila48.item;
        fila48.tras = (short) 10;
        java.lang.Object[] objArray55 = fila48.item;
        ds.Fila fila56 = new ds.Fila();
        java.lang.Object[] objArray57 = fila56.item;
        fila56.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray60 = fila56.item;
        fila48.item = objArray60;
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila62.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila66 = new ds.Fila();
        java.lang.Object[] objArray67 = fila66.item;
        fila66.frente = (-1);
        java.lang.Object[] objArray70 = fila66.item;
        fila66.tras = (short) 10;
        java.lang.Object[] objArray73 = fila66.item;
        fila62.item = objArray73;
        fila48.item = objArray73;
        ds.Fila fila76 = new ds.Fila();
        java.lang.Object[] objArray77 = fila76.item;
        fila76.frente = (-1);
        java.lang.Object[] objArray80 = fila76.item;
        fila76.tras = (short) 10;
        fila76.tras = (short) -1;
        java.lang.Object[] objArray85 = fila76.item;
        ds.Fila fila86 = new ds.Fila();
        java.lang.Object[] objArray87 = fila86.item;
        fila86.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray90 = fila86.item;
        fila76.item = objArray90;
        fila48.enfileira((java.lang.Object) fila76);
        fila48.tras = 32;
        fila0.enfileira((java.lang.Object) 32);
        java.lang.Object[] objArray96 = fila0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray96);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = (short) 1;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila17 = new ds.Fila();
        java.lang.Object[] objArray18 = fila17.item;
        fila17.frente = (-1);
        java.lang.Object[] objArray21 = fila17.item;
        fila17.tras = (short) 10;
        java.lang.Object[] objArray24 = fila17.item;
        fila13.item = objArray24;
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.frente = (-1);
        java.lang.Object[] objArray30 = fila26.item;
        java.lang.Object[] objArray31 = fila26.item;
        fila13.item = objArray31;
        fila10.item = objArray31;
        fila0.item = objArray31;
        java.lang.Object[] objArray35 = fila0.item;
        java.lang.Object obj36 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.frente = ' ';
        fila0.tras = (short) -1;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj12 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = fila14.item;
        fila14.tras = (short) 10;
        java.lang.Object[] objArray21 = fila14.item;
        int int22 = fila14.frente;
        fila0.enfileira((java.lang.Object) fila14);
        boolean boolean24 = fila14.vazia();
        int int25 = fila14.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0d + "'", obj12, 0.0d);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        java.lang.Object[] objArray4 = fila3.item;
        fila3.frente = (-1);
        java.lang.Object[] objArray7 = fila3.item;
        java.lang.Object[] objArray8 = fila3.item;
        fila0.item = objArray8;
        fila0.tras = 0;
        boolean boolean12 = fila0.vazia();
        int int13 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = ' ';
        int int7 = fila0.frente;
        int int8 = fila0.frente;
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        java.lang.Object[] objArray6 = fila5.item;
        fila5.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.enfileira((java.lang.Object) 0.0d);
        boolean boolean13 = fila9.vazia();
        fila5.enfileira((java.lang.Object) fila9);
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray16 = fila9.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = fila0.desenfileira();
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.frente = (-1);
        java.lang.Object[] objArray11 = fila7.item;
        fila7.tras = (short) 10;
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray19 = fila15.item;
        fila7.item = objArray19;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.frente = (-1);
        java.lang.Object[] objArray29 = fila25.item;
        fila25.tras = (short) 10;
        java.lang.Object[] objArray32 = fila25.item;
        fila21.item = objArray32;
        fila7.item = objArray32;
        ds.Fila fila35 = new ds.Fila();
        java.lang.Object[] objArray36 = fila35.item;
        fila35.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila39 = new ds.Fila();
        java.lang.Object[] objArray40 = fila39.item;
        fila39.frente = (-1);
        java.lang.Object[] objArray43 = fila39.item;
        fila39.tras = (short) 10;
        java.lang.Object[] objArray46 = fila39.item;
        fila35.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        java.lang.Object[] objArray49 = fila48.item;
        fila48.frente = (-1);
        java.lang.Object[] objArray52 = fila48.item;
        java.lang.Object[] objArray53 = fila48.item;
        fila35.item = objArray53;
        java.lang.Object[] objArray55 = fila35.item;
        fila7.item = objArray55;
        fila0.enfileira((java.lang.Object) objArray55);
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray59 = fila58.item;
        fila58.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila62.frente = (-1);
        java.lang.Object[] objArray66 = fila62.item;
        fila62.tras = (short) 10;
        java.lang.Object[] objArray69 = fila62.item;
        fila58.item = objArray69;
        ds.Fila fila71 = new ds.Fila();
        java.lang.Object[] objArray72 = fila71.item;
        fila71.frente = (-1);
        java.lang.Object[] objArray75 = fila71.item;
        java.lang.Object[] objArray76 = fila71.item;
        fila58.item = objArray76;
        fila0.item = objArray76;
        ds.Fila fila79 = new ds.Fila();
        java.lang.Object[] objArray80 = fila79.item;
        fila79.enfileira((java.lang.Object) (byte) 10);
        boolean boolean83 = fila79.vazia();
        java.lang.Object obj84 = fila79.desenfileira();
        java.lang.Object[] objArray85 = fila79.item;
        fila0.enfileira((java.lang.Object) fila79);
        int int87 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (byte) 10 + "'", obj84, (byte) 10);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 3 + "'", int87 == 3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        int int2 = fila0.frente;
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        java.lang.Object[] objArray8 = fila7.item;
        fila7.enfileira((java.lang.Object) (byte) 10);
        boolean boolean11 = fila7.vazia();
        java.lang.Object obj12 = fila7.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        fila13.frente = (short) 1;
        java.lang.Object[] objArray16 = fila13.item;
        fila7.item = objArray16;
        fila0.item = objArray16;
        int int19 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        fila0.tras = 2;
        int int8 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        java.lang.Object[] objArray5 = fila4.item;
        fila4.frente = (-1);
        java.lang.Object[] objArray8 = fila4.item;
        fila4.tras = (short) 10;
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.tras = (byte) 100;
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.frente = (-1);
        java.lang.Object[] objArray19 = fila15.item;
        fila15.tras = (short) 10;
        java.lang.Object[] objArray22 = fila15.item;
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        fila23.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray27 = fila23.item;
        fila15.item = objArray27;
        fila0.enfileira((java.lang.Object) fila15);
        int int30 = fila0.frente;
        int int31 = fila0.frente;
        fila0.tras = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        java.lang.Object[] objArray13 = fila12.item;
        ds.Fila fila14 = new ds.Fila();
        java.lang.Object[] objArray15 = fila14.item;
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = fila14.item;
        fila12.item = objArray18;
        fila12.tras = (short) 0;
        fila12.imprime();
        int int23 = fila12.tras;
        int int24 = fila12.tras;
        fila12.imprime();
        ds.Fila fila26 = new ds.Fila();
        java.lang.Object[] objArray27 = fila26.item;
        fila26.enfileira((java.lang.Object) (byte) 10);
        fila26.frente = 0;
        fila26.enfileira((java.lang.Object) 10);
        fila26.frente = (short) 0;
        fila26.imprime();
        fila26.frente = 0;
        java.lang.Object[] objArray39 = fila26.item;
        fila12.item = objArray39;
        fila0.item = objArray39;
        fila0.imprime();
        fila0.frente = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj10 = fila4.desenfileira();
        ds.Fila fila11 = new ds.Fila();
        java.lang.Object[] objArray12 = fila11.item;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila11.item = objArray17;
        fila11.tras = (short) 0;
        int int21 = fila11.frente;
        fila4.enfileira((java.lang.Object) fila11);
        ds.Fila fila23 = new ds.Fila();
        java.lang.Object[] objArray24 = fila23.item;
        ds.Fila fila25 = new ds.Fila();
        java.lang.Object[] objArray26 = fila25.item;
        fila25.frente = (-1);
        java.lang.Object[] objArray29 = fila25.item;
        fila23.item = objArray29;
        fila23.tras = (short) 0;
        fila23.imprime();
        int int34 = fila23.tras;
        int int35 = fila23.tras;
        fila23.imprime();
        ds.Fila fila37 = new ds.Fila();
        java.lang.Object[] objArray38 = fila37.item;
        fila37.enfileira((java.lang.Object) (byte) 10);
        fila37.frente = 0;
        fila37.enfileira((java.lang.Object) 10);
        fila37.frente = (short) 0;
        fila37.imprime();
        fila37.frente = 0;
        java.lang.Object[] objArray50 = fila37.item;
        fila23.item = objArray50;
        fila11.item = objArray50;
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        fila53.imprime();
        fila53.tras = '4';
        java.lang.Object[] objArray58 = fila53.item;
        ds.Fila fila59 = new ds.Fila();
        java.lang.Object[] objArray60 = fila59.item;
        fila59.frente = (-1);
        java.lang.Object[] objArray63 = fila59.item;
        fila59.tras = (short) 10;
        java.lang.Object[] objArray66 = fila59.item;
        ds.Fila fila67 = new ds.Fila();
        java.lang.Object[] objArray68 = fila67.item;
        fila67.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray71 = fila67.item;
        fila59.item = objArray71;
        fila53.item = objArray71;
        fila11.item = objArray71;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0d + "'", obj10, 0.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        ds.Fila fila2 = new ds.Fila();
        java.lang.Object[] objArray3 = fila2.item;
        fila2.frente = (-1);
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        fila0.tras = (short) 0;
        int int10 = fila0.frente;
        fila0.frente = 32;
        ds.Fila fila13 = new ds.Fila();
        java.lang.Object[] objArray14 = fila13.item;
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = fila13.item;
        fila13.tras = (short) 10;
        java.lang.Object[] objArray20 = fila13.item;
        ds.Fila fila21 = new ds.Fila();
        java.lang.Object[] objArray22 = fila21.item;
        fila21.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray25 = fila21.item;
        fila13.item = objArray25;
        ds.Fila fila27 = new ds.Fila();
        java.lang.Object[] objArray28 = fila27.item;
        fila27.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila31 = new ds.Fila();
        java.lang.Object[] objArray32 = fila31.item;
        fila31.frente = (-1);
        java.lang.Object[] objArray35 = fila31.item;
        fila31.tras = (short) 10;
        java.lang.Object[] objArray38 = fila31.item;
        fila27.item = objArray38;
        fila13.item = objArray38;
        java.lang.Class<?> wildcardClass41 = fila13.getClass();
        fila0.enfileira((java.lang.Object) fila13);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        fila0.frente = 0;
        fila0.enfileira((java.lang.Object) 10);
        fila0.enfileira((java.lang.Object) "hi!");
        fila0.tras = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.imprime();
        boolean boolean3 = fila0.vazia();
        int int4 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.enfileira((java.lang.Object) 0.0d);
        boolean boolean8 = fila4.vazia();
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        java.lang.Object[] objArray11 = fila0.item;
        fila0.tras = (short) -1;
        boolean boolean14 = fila0.vazia();
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.enfileira((java.lang.Object) 0.0d);
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (short) 1;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = (short) 1;
        boolean boolean11 = fila8.vazia();
        java.lang.Object obj12 = fila8.desenfileira();
        java.lang.Object obj13 = fila8.desenfileira();
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila15.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila19 = new ds.Fila();
        java.lang.Object[] objArray20 = fila19.item;
        fila19.frente = (-1);
        java.lang.Object[] objArray23 = fila19.item;
        fila19.tras = (short) 10;
        java.lang.Object[] objArray26 = fila19.item;
        fila15.item = objArray26;
        fila15.tras = (byte) 100;
        ds.Fila fila30 = new ds.Fila();
        java.lang.Object[] objArray31 = fila30.item;
        fila30.frente = (-1);
        java.lang.Object[] objArray34 = fila30.item;
        fila30.tras = (short) 10;
        java.lang.Object[] objArray37 = fila30.item;
        ds.Fila fila38 = new ds.Fila();
        java.lang.Object[] objArray39 = fila38.item;
        fila38.enfileira((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray42 = fila38.item;
        fila30.item = objArray42;
        fila15.enfileira((java.lang.Object) fila30);
        ds.Fila fila45 = new ds.Fila();
        java.lang.Object[] objArray46 = fila45.item;
        fila45.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila49 = new ds.Fila();
        boolean boolean50 = fila49.vazia();
        fila49.enfileira((java.lang.Object) 0.0d);
        boolean boolean53 = fila49.vazia();
        fila45.enfileira((java.lang.Object) fila49);
        ds.Fila fila55 = new ds.Fila();
        fila55.frente = (short) 1;
        ds.Fila fila58 = new ds.Fila();
        java.lang.Object[] objArray59 = fila58.item;
        fila58.enfileira((java.lang.Object) (byte) 10);
        ds.Fila fila62 = new ds.Fila();
        java.lang.Object[] objArray63 = fila62.item;
        fila62.frente = (-1);
        java.lang.Object[] objArray66 = fila62.item;
        fila62.tras = (short) 10;
        java.lang.Object[] objArray69 = fila62.item;
        fila58.item = objArray69;
        ds.Fila fila71 = new ds.Fila();
        java.lang.Object[] objArray72 = fila71.item;
        fila71.frente = (-1);
        java.lang.Object[] objArray75 = fila71.item;
        java.lang.Object[] objArray76 = fila71.item;
        fila58.item = objArray76;
        fila55.item = objArray76;
        fila45.item = objArray76;
        fila30.item = objArray76;
        fila0.item = objArray76;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0.0d + "'", obj4, 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
    }
}

