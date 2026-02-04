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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.tras;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.enfileira((java.lang.Object) objArray11);
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Class<?> wildcardClass1 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        fila0.frente = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        fila8.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila8.item = objArray19;
        fila0.item = objArray19;
        java.lang.Class<?> wildcardClass22 = objArray19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = fila0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.enfileira((java.lang.Object) objArray11);
        java.lang.Class<?> wildcardClass13 = objArray11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray25 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        java.lang.Class<?> wildcardClass36 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        java.lang.Class<?> wildcardClass18 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        boolean boolean28 = fila22.vazia();
        java.lang.Object[] objArray29 = fila22.item;
        fila15.item = objArray29;
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray32 = fila7.item;
        fila0.enfileira((java.lang.Object) objArray32);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.frente = '4';
        boolean boolean7 = fila3.vazia();
        java.lang.Object[] objArray8 = fila3.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        fila9.frente = '4';
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila3.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        java.lang.Object[] objArray30 = fila23.item;
        fila16.item = objArray30;
        fila3.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        fila0.frente = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        fila0.tras = '#';
        int int27 = fila0.frente;
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila3.item = objArray17;
        fila0.item = objArray17;
        fila0.imprime();
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        fila0.frente = (short) 1;
        fila0.tras = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila0.item = objArray23;
        java.lang.Class<?> wildcardClass25 = objArray23.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila3.item = objArray17;
        fila0.item = objArray17;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.frente;
        fila20.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        fila24.frente = (short) 10;
        fila24.frente = (short) -1;
        boolean boolean30 = fila24.vazia();
        java.lang.Object[] objArray31 = fila24.item;
        fila20.item = objArray31;
        java.lang.Object[] objArray33 = fila20.item;
        fila0.enfileira((java.lang.Object) objArray33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        int int12 = fila5.frente;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.frente = '4';
        boolean boolean17 = fila13.vazia();
        java.lang.Object[] objArray18 = fila13.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        fila13.item = objArray24;
        fila5.item = objArray24;
        fila0.item = objArray24;
        java.lang.Class<?> wildcardClass28 = objArray24.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        fila0.tras = 1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (short) 0;
        int int7 = fila0.tras;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.frente = (short) 10;
        fila20.frente = (short) -1;
        boolean boolean26 = fila20.vazia();
        java.lang.Object[] objArray27 = fila20.item;
        fila13.item = objArray27;
        fila0.enfileira((java.lang.Object) objArray27);
        java.lang.Class<?> wildcardClass30 = objArray27.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray25 = fila0.item;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.frente;
        fila26.tras = (byte) 0;
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.frente;
        fila31.frente = '4';
        fila26.enfileira((java.lang.Object) fila31);
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.frente;
        fila36.frente = '4';
        boolean boolean40 = fila36.vazia();
        java.lang.Object[] objArray41 = fila36.item;
        fila26.item = objArray41;
        fila0.item = objArray41;
        java.lang.Class<?> wildcardClass44 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        int int14 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray25 = fila0.item;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.frente;
        fila26.tras = (byte) 0;
        boolean boolean30 = fila26.vazia();
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.frente;
        fila31.frente = '4';
        fila26.enfileira((java.lang.Object) fila31);
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.frente;
        fila36.frente = '4';
        boolean boolean40 = fila36.vazia();
        java.lang.Object[] objArray41 = fila36.item;
        fila26.item = objArray41;
        fila0.item = objArray41;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        fila0.frente = (short) 1;
        fila0.frente = '4';
        int int10 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.tras = (short) -1;
        int int21 = fila17.tras;
        int int22 = fila17.tras;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.frente = (short) 10;
        fila30.frente = (short) -1;
        boolean boolean36 = fila30.vazia();
        java.lang.Object[] objArray37 = fila30.item;
        fila23.item = objArray37;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.frente;
        fila41.tras = (byte) 0;
        java.lang.Object[] objArray45 = fila41.item;
        fila39.item = objArray45;
        fila23.item = objArray45;
        fila17.item = objArray45;
        fila0.item = objArray45;
        java.lang.Class<?> wildcardClass50 = objArray45.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        fila6.frente = 0;
        java.lang.Object[] objArray12 = fila6.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 10;
        fila28.frente = (short) -1;
        boolean boolean34 = fila28.vazia();
        java.lang.Object[] objArray35 = fila28.item;
        fila21.item = objArray35;
        fila13.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray38 = fila13.item;
        fila6.enfileira((java.lang.Object) objArray38);
        fila0.item = objArray38;
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        fila8.enfileira((java.lang.Object) (byte) 0);
        int int12 = fila8.frente;
        java.lang.Object obj13 = fila8.desenfileira();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.frente;
        fila14.tras = (byte) 0;
        fila14.frente = 0;
        java.lang.Object[] objArray20 = fila14.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        java.lang.Object[] objArray28 = fila21.item;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.tras;
        fila29.frente = (short) 10;
        fila29.frente = (short) -1;
        boolean boolean35 = fila29.vazia();
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.tras;
        fila36.frente = (short) 10;
        fila36.frente = (short) -1;
        boolean boolean42 = fila36.vazia();
        java.lang.Object[] objArray43 = fila36.item;
        fila29.item = objArray43;
        fila21.enfileira((java.lang.Object) fila29);
        java.lang.Object[] objArray46 = fila21.item;
        fila14.enfileira((java.lang.Object) objArray46);
        fila8.item = objArray46;
        fila0.item = objArray46;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.imprime();
        fila0.tras = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        fila6.frente = 0;
        java.lang.Object[] objArray12 = fila6.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 10;
        fila28.frente = (short) -1;
        boolean boolean34 = fila28.vazia();
        java.lang.Object[] objArray35 = fila28.item;
        fila21.item = objArray35;
        fila13.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray38 = fila13.item;
        fila6.enfileira((java.lang.Object) objArray38);
        fila0.item = objArray38;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.tras;
        fila36.frente = (short) 10;
        fila36.frente = (short) -1;
        boolean boolean42 = fila36.vazia();
        java.lang.Object[] objArray43 = fila36.item;
        fila36.tras = (byte) 10;
        java.lang.Object[] objArray46 = fila36.item;
        ds.Fila fila47 = new ds.Fila();
        int int48 = fila47.frente;
        fila47.frente = '4';
        boolean boolean51 = fila47.vazia();
        java.lang.Class<?> wildcardClass52 = fila47.getClass();
        fila36.enfileira((java.lang.Object) wildcardClass52);
        fila36.frente = '#';
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        int int11 = fila9.tras;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        java.lang.Object[] objArray16 = fila12.item;
        fila9.enfileira((java.lang.Object) objArray16);
        fila0.enfileira((java.lang.Object) objArray16);
        java.lang.Object[] objArray19 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        java.lang.Object obj18 = fila0.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        int int21 = fila19.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.frente;
        fila22.tras = (byte) 0;
        java.lang.Object[] objArray26 = fila22.item;
        fila19.enfileira((java.lang.Object) objArray26);
        fila0.enfileira((java.lang.Object) objArray26);
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        java.lang.Object[] objArray36 = fila0.item;
        java.lang.Class<?> wildcardClass37 = objArray36.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.frente = 52;
        java.lang.Object[] objArray18 = fila0.item;
        int int19 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.frente;
        java.lang.Class<?> wildcardClass13 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (short) 0;
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        java.lang.Object[] objArray10 = fila8.item;
        fila0.item = objArray10;
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.frente;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray25 = fila0.item;
        java.lang.Object obj26 = null;
        fila0.enfileira(obj26);
        fila0.frente = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        java.lang.Object[] objArray36 = fila0.item;
        java.lang.Class<?> wildcardClass37 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        int int25 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int4 = fila0.frente;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (short) -1;
        int int15 = fila11.tras;
        boolean boolean16 = fila11.vazia();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        java.lang.Object[] objArray28 = fila21.item;
        fila17.item = objArray28;
        fila11.item = objArray28;
        int int31 = fila11.frente;
        java.lang.Object[] objArray32 = fila11.item;
        fila0.item = objArray32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        java.lang.Object[] objArray18 = fila0.item;
        fila0.frente = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        int int8 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        java.lang.Object[] objArray5 = fila0.item;
        fila0.frente = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        fila12.frente = 0;
        java.lang.Object[] objArray18 = fila12.item;
        fila10.item = objArray18;
        boolean boolean20 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.frente = '4';
        boolean boolean14 = fila10.vazia();
        java.lang.Object[] objArray15 = fila10.item;
        fila0.item = objArray15;
        int int17 = fila0.tras;
        java.lang.Object obj18 = null;
        fila0.enfileira(obj18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object obj8 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.frente = '4';
        boolean boolean14 = fila10.vazia();
        java.lang.Object[] objArray15 = fila10.item;
        fila0.item = objArray15;
        fila0.tras = 0;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        int int21 = fila19.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        boolean boolean28 = fila22.vazia();
        int int29 = fila22.frente;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.frente;
        fila30.frente = '4';
        boolean boolean34 = fila30.vazia();
        java.lang.Object[] objArray35 = fila30.item;
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.frente;
        fila36.frente = '4';
        boolean boolean40 = fila36.vazia();
        java.lang.Object[] objArray41 = fila36.item;
        fila30.item = objArray41;
        fila22.item = objArray41;
        fila19.enfileira((java.lang.Object) objArray41);
        java.lang.Object[] objArray45 = fila19.item;
        fila0.item = objArray45;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        fila0.frente = (short) 1;
        fila0.frente = '4';
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.tras = (short) -1;
        int int14 = fila10.tras;
        boolean boolean15 = fila10.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.frente = (short) 10;
        fila20.frente = (short) -1;
        boolean boolean26 = fila20.vazia();
        java.lang.Object[] objArray27 = fila20.item;
        fila16.item = objArray27;
        fila10.item = objArray27;
        fila0.item = objArray27;
        java.lang.Class<?> wildcardClass31 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        boolean boolean12 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (short) 0;
        int int7 = fila0.tras;
        fila0.frente = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.tras = 53;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        fila0.tras = 1;
        fila0.frente = (short) 0;
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila0.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.frente;
        fila43.tras = (byte) 0;
        java.lang.Object[] objArray47 = fila43.item;
        fila41.item = objArray47;
        fila25.item = objArray47;
        fila0.item = objArray47;
        java.lang.Class<?> wildcardClass51 = objArray47.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (short) 0;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        int int11 = fila9.tras;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        java.lang.Object[] objArray16 = fila12.item;
        fila9.enfileira((java.lang.Object) objArray16);
        fila0.enfileira((java.lang.Object) objArray16);
        java.lang.Object[] objArray19 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.imprime();
        int int5 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.frente = '4';
        boolean boolean7 = fila3.vazia();
        fila3.tras = (short) -1;
        fila3.frente = (short) 10;
        java.lang.Object obj12 = fila3.desenfileira();
        fila3.frente = (byte) 100;
        fila0.enfileira((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (short) 0;
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        fila0.frente = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        boolean boolean28 = fila22.vazia();
        java.lang.Object[] objArray29 = fila22.item;
        fila15.item = objArray29;
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray32 = fila7.item;
        fila0.enfileira((java.lang.Object) objArray32);
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.frente;
        fila34.frente = '4';
        boolean boolean38 = fila34.vazia();
        java.lang.Object[] objArray39 = fila34.item;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.frente;
        fila40.frente = '4';
        boolean boolean44 = fila40.vazia();
        fila40.tras = (short) -1;
        fila40.frente = (short) 10;
        fila40.frente = '4';
        java.lang.Object[] objArray51 = fila40.item;
        fila34.enfileira((java.lang.Object) objArray51);
        fila0.enfileira((java.lang.Object) fila34);
        java.lang.Object[] objArray54 = fila34.item;
        java.lang.Class<?> wildcardClass55 = objArray54.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        fila8.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila8.item = objArray19;
        fila0.item = objArray19;
        java.lang.Object[] objArray22 = fila0.item;
        java.lang.Object obj23 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        int int11 = fila9.tras;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        java.lang.Object[] objArray16 = fila12.item;
        fila9.enfileira((java.lang.Object) objArray16);
        fila0.enfileira((java.lang.Object) objArray16);
        int int19 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        boolean boolean28 = fila22.vazia();
        java.lang.Object[] objArray29 = fila22.item;
        fila15.item = objArray29;
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray32 = fila7.item;
        fila0.enfileira((java.lang.Object) objArray32);
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.frente;
        fila34.frente = '4';
        boolean boolean38 = fila34.vazia();
        java.lang.Object[] objArray39 = fila34.item;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.frente;
        fila40.frente = '4';
        boolean boolean44 = fila40.vazia();
        fila40.tras = (short) -1;
        fila40.frente = (short) 10;
        fila40.frente = '4';
        java.lang.Object[] objArray51 = fila40.item;
        fila34.enfileira((java.lang.Object) objArray51);
        fila0.enfileira((java.lang.Object) fila34);
        int int54 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        fila6.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.tras = (byte) 0;
        java.lang.Object[] objArray28 = fila24.item;
        fila22.item = objArray28;
        fila6.item = objArray28;
        fila0.item = objArray28;
        fila0.frente = (short) 100;
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        boolean boolean4 = fila0.vazia();
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila5.item = objArray19;
        fila5.tras = 0;
        fila0.enfileira((java.lang.Object) 0);
        int int24 = fila0.frente;
        int int25 = fila0.tras;
        boolean boolean26 = fila0.vazia();
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 10;
        fila27.frente = (short) -1;
        boolean boolean33 = fila27.vazia();
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        fila34.frente = (short) 10;
        fila34.frente = (short) -1;
        boolean boolean40 = fila34.vazia();
        java.lang.Object[] objArray41 = fila34.item;
        fila27.item = objArray41;
        fila27.frente = 52;
        java.lang.Object[] objArray45 = fila27.item;
        fila0.item = objArray45;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.frente;
        fila14.tras = (byte) 0;
        fila14.frente = 0;
        fila14.frente = (short) 1;
        fila14.frente = '4';
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.tras = (short) -1;
        int int28 = fila24.tras;
        boolean boolean29 = fila24.vazia();
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.frente;
        fila30.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        fila34.frente = (short) 10;
        fila34.frente = (short) -1;
        boolean boolean40 = fila34.vazia();
        java.lang.Object[] objArray41 = fila34.item;
        fila30.item = objArray41;
        fila24.item = objArray41;
        fila14.item = objArray41;
        fila0.item = objArray41;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        boolean boolean28 = fila22.vazia();
        java.lang.Object[] objArray29 = fila22.item;
        fila15.item = objArray29;
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray32 = fila7.item;
        fila0.enfileira((java.lang.Object) objArray32);
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.frente;
        fila34.frente = '4';
        boolean boolean38 = fila34.vazia();
        java.lang.Object[] objArray39 = fila34.item;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.frente;
        fila40.frente = '4';
        boolean boolean44 = fila40.vazia();
        fila40.tras = (short) -1;
        fila40.frente = (short) 10;
        fila40.frente = '4';
        java.lang.Object[] objArray51 = fila40.item;
        fila34.enfileira((java.lang.Object) objArray51);
        fila0.enfileira((java.lang.Object) fila34);
        boolean boolean54 = fila34.vazia();
        java.lang.Class<?> wildcardClass55 = fila34.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        int int20 = fila0.frente;
        fila0.frente = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        int int6 = fila0.frente;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        fila0.tras = 100;
        boolean boolean8 = fila0.vazia();
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.imprime();
        fila0.frente = '#';
        fila0.enfileira((java.lang.Object) 0.0f);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.frente = (short) 10;
        fila10.frente = (byte) 10;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        int int23 = fila16.frente;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.frente = '4';
        boolean boolean28 = fila24.vazia();
        java.lang.Object[] objArray29 = fila24.item;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.frente;
        fila30.frente = '4';
        boolean boolean34 = fila30.vazia();
        java.lang.Object[] objArray35 = fila30.item;
        fila24.item = objArray35;
        fila16.item = objArray35;
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.frente;
        fila38.frente = '4';
        boolean boolean42 = fila38.vazia();
        java.lang.Object[] objArray43 = fila38.item;
        java.lang.Object obj44 = fila38.desenfileira();
        java.lang.Object[] objArray45 = fila38.item;
        fila16.item = objArray45;
        fila10.item = objArray45;
        fila0.item = objArray45;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        fila0.frente = (short) 0;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.frente;
        fila22.frente = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.tras;
        int int9 = fila0.tras;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.enfileira((java.lang.Object) objArray11);
        fila0.frente = 2;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        boolean boolean17 = fila15.vazia();
        int int18 = fila15.tras;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        int int23 = fila19.tras;
        int int24 = fila19.frente;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        fila26.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray30 = null;
        fila26.item = objArray30;
        java.lang.Object[] objArray32 = new java.lang.Object[] { int24, '4', objArray30 };
        fila15.item = objArray30;
        fila15.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila15);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[52, 4, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[52, 4, null]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.frente = 0;
        fila0.frente = (short) 1;
        boolean boolean11 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        fila0.enfileira((java.lang.Object) fila8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        int int6 = fila0.frente;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        java.lang.Object obj9 = fila0.desenfileira();
        int int10 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        int int9 = fila0.tras;
        int int10 = fila0.frente;
        java.lang.Object obj11 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.frente = 0;
        fila0.frente = (short) 1;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila3.item = objArray17;
        fila0.item = objArray17;
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        int int8 = fila0.tras;
        fila0.frente = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.tras = (short) -1;
        int int9 = fila5.tras;
        boolean boolean10 = fila5.vazia();
        int int11 = fila5.tras;
        fila0.enfileira((java.lang.Object) fila5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        fila0.frente = 0;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        boolean boolean28 = fila22.vazia();
        java.lang.Object[] objArray29 = fila22.item;
        fila0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        fila6.frente = 0;
        java.lang.Object[] objArray12 = fila6.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 10;
        fila28.frente = (short) -1;
        boolean boolean34 = fila28.vazia();
        java.lang.Object[] objArray35 = fila28.item;
        fila21.item = objArray35;
        fila13.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray38 = fila13.item;
        fila6.enfileira((java.lang.Object) objArray38);
        fila0.item = objArray38;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.frente;
        fila41.tras = (byte) 0;
        java.lang.Object[] objArray45 = fila41.item;
        java.lang.Object[] objArray46 = fila41.item;
        fila0.enfileira((java.lang.Object) fila41);
        fila41.frente = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        int int36 = fila0.tras;
        java.lang.Object[] objArray37 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 100;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        java.lang.Object[] objArray13 = fila6.item;
        fila6.tras = (byte) 10;
        java.lang.Object[] objArray16 = fila6.item;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.frente = '4';
        boolean boolean21 = fila17.vazia();
        java.lang.Class<?> wildcardClass22 = fila17.getClass();
        fila6.enfileira((java.lang.Object) wildcardClass22);
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.frente = '4';
        boolean boolean28 = fila24.vazia();
        java.lang.Object[] objArray29 = fila24.item;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.frente;
        fila30.frente = '4';
        boolean boolean34 = fila30.vazia();
        java.lang.Object[] objArray35 = fila30.item;
        fila24.item = objArray35;
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.tras;
        fila37.frente = (short) 10;
        fila37.frente = (short) -1;
        boolean boolean43 = fila37.vazia();
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.tras;
        fila44.frente = (short) 10;
        fila44.frente = (short) -1;
        boolean boolean50 = fila44.vazia();
        java.lang.Object[] objArray51 = fila44.item;
        fila37.item = objArray51;
        fila24.enfileira((java.lang.Object) objArray51);
        fila6.item = objArray51;
        int int55 = fila6.frente;
        ds.Fila fila56 = new ds.Fila();
        int int57 = fila56.frente;
        fila56.frente = (short) 10;
        java.lang.Object[] objArray60 = new java.lang.Object[] { fila6, (short) 10 };
        fila0.item = objArray60;
        int int62 = fila0.frente;
        boolean boolean63 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.frente = 1;
        boolean boolean14 = fila0.vazia();
        int int15 = fila0.tras;
        int int16 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = '4';
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 10;
        fila14.frente = (short) -1;
        boolean boolean20 = fila14.vazia();
        int int21 = fila14.frente;
        int int22 = fila14.tras;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.frente;
        fila23.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 10;
        fila27.frente = (short) -1;
        boolean boolean33 = fila27.vazia();
        java.lang.Object[] objArray34 = fila27.item;
        fila23.item = objArray34;
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.frente;
        boolean boolean38 = fila36.vazia();
        fila23.enfileira((java.lang.Object) boolean38);
        int int40 = fila23.tras;
        java.lang.Object obj41 = fila23.desenfileira();
        ds.Fila fila42 = new ds.Fila();
        int int43 = fila42.frente;
        int int44 = fila42.tras;
        ds.Fila fila45 = new ds.Fila();
        int int46 = fila45.frente;
        fila45.tras = (byte) 0;
        java.lang.Object[] objArray49 = fila45.item;
        fila42.enfileira((java.lang.Object) objArray49);
        fila23.enfileira((java.lang.Object) objArray49);
        fila14.item = objArray49;
        fila0.item = objArray49;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        fila13.tras = (byte) 10;
        java.lang.Object[] objArray23 = fila13.item;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.frente = '4';
        boolean boolean28 = fila24.vazia();
        java.lang.Class<?> wildcardClass29 = fila24.getClass();
        fila13.enfileira((java.lang.Object) wildcardClass29);
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.frente;
        fila31.frente = '4';
        boolean boolean35 = fila31.vazia();
        java.lang.Object[] objArray36 = fila31.item;
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.frente;
        fila37.frente = '4';
        boolean boolean41 = fila37.vazia();
        java.lang.Object[] objArray42 = fila37.item;
        fila31.item = objArray42;
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.tras;
        fila44.frente = (short) 10;
        fila44.frente = (short) -1;
        boolean boolean50 = fila44.vazia();
        ds.Fila fila51 = new ds.Fila();
        int int52 = fila51.tras;
        fila51.frente = (short) 10;
        fila51.frente = (short) -1;
        boolean boolean57 = fila51.vazia();
        java.lang.Object[] objArray58 = fila51.item;
        fila44.item = objArray58;
        fila31.enfileira((java.lang.Object) objArray58);
        fila13.item = objArray58;
        fila0.item = objArray58;
        java.lang.Class<?> wildcardClass63 = objArray58.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 10;
        fila14.frente = (short) -1;
        boolean boolean20 = fila14.vazia();
        java.lang.Object[] objArray21 = fila14.item;
        fila7.item = objArray21;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        java.lang.Object[] objArray30 = fila23.item;
        fila7.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 10;
        fila39.frente = (short) -1;
        boolean boolean45 = fila39.vazia();
        java.lang.Object[] objArray46 = fila39.item;
        fila32.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.tras;
        ds.Fila fila50 = new ds.Fila();
        int int51 = fila50.frente;
        fila50.tras = (byte) 0;
        java.lang.Object[] objArray54 = fila50.item;
        fila48.item = objArray54;
        fila32.item = objArray54;
        fila7.item = objArray54;
        fila0.item = objArray54;
        int int59 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.frente = '4';
        boolean boolean14 = fila10.vazia();
        java.lang.Object[] objArray15 = fila10.item;
        fila0.item = objArray15;
        java.lang.Object obj17 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        java.lang.Object[] objArray18 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (short) 0;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.frente = '4';
        boolean boolean11 = fila7.vazia();
        fila7.tras = (short) -1;
        fila7.frente = (short) 10;
        int int16 = fila7.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        int int2 = fila1.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.tras = (byte) 0;
        java.lang.Object[] objArray7 = fila3.item;
        fila1.item = objArray7;
        int int9 = fila1.tras;
        fila1.tras = (short) 100;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        boolean boolean16 = fila12.vazia();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.frente = '4';
        fila12.enfileira((java.lang.Object) fila17);
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.frente;
        fila22.frente = '4';
        boolean boolean26 = fila22.vazia();
        java.lang.Object[] objArray27 = fila22.item;
        fila12.item = objArray27;
        fila1.item = objArray27;
        java.lang.Object obj30 = fila1.desenfileira();
        fila1.tras = 'a';
        fila0.enfileira((java.lang.Object) 'a');
        fila0.frente = 97;
        java.lang.Class<?> wildcardClass36 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        int int20 = fila0.frente;
        java.lang.Object[] objArray21 = fila0.item;
        java.lang.Object[] objArray22 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        java.lang.Object[] objArray10 = fila6.item;
        int int11 = fila6.frente;
        java.lang.Object[] objArray12 = fila6.item;
        fila0.item = objArray12;
        int int14 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        fila6.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.tras = (byte) 0;
        java.lang.Object[] objArray28 = fila24.item;
        fila22.item = objArray28;
        fila6.item = objArray28;
        fila0.item = objArray28;
        int int32 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        int int14 = fila12.tras;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        int int22 = fila15.frente;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.frente;
        fila23.frente = '4';
        boolean boolean27 = fila23.vazia();
        java.lang.Object[] objArray28 = fila23.item;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.frente = '4';
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila23.item = objArray34;
        fila15.item = objArray34;
        fila12.enfileira((java.lang.Object) objArray34);
        fila0.item = objArray34;
        int int39 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray13 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 10;
        fila11.frente = (short) -1;
        boolean boolean17 = fila11.vazia();
        int int18 = fila11.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila19.item = objArray30;
        fila11.item = objArray30;
        fila0.item = objArray30;
        java.lang.Object obj34 = fila0.desenfileira();
        java.lang.Object[] objArray35 = fila0.item;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        java.lang.Object[] objArray10 = fila8.item;
        fila0.item = objArray10;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (short) -1;
        fila12.tras = 0;
        fila12.imprime();
        int int19 = fila12.tras;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.frente;
        fila20.tras = (short) -1;
        int int24 = fila20.tras;
        int int25 = fila20.tras;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        fila26.frente = (short) 10;
        fila26.frente = (short) -1;
        boolean boolean32 = fila26.vazia();
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        fila33.frente = (short) 10;
        fila33.frente = (short) -1;
        boolean boolean39 = fila33.vazia();
        java.lang.Object[] objArray40 = fila33.item;
        fila26.item = objArray40;
        ds.Fila fila42 = new ds.Fila();
        int int43 = fila42.tras;
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.frente;
        fila44.tras = (byte) 0;
        java.lang.Object[] objArray48 = fila44.item;
        fila42.item = objArray48;
        fila26.item = objArray48;
        fila20.item = objArray48;
        fila12.item = objArray48;
        fila0.item = objArray48;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        fila0.frente = 0;
        boolean boolean22 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        int int6 = fila0.frente;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        boolean boolean28 = fila22.vazia();
        java.lang.Object[] objArray29 = fila22.item;
        fila15.item = objArray29;
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray32 = fila7.item;
        fila0.enfileira((java.lang.Object) objArray32);
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Object obj10 = fila5.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (byte) 10;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        boolean boolean21 = fila19.vazia();
        fila6.enfileira((java.lang.Object) boolean21);
        int int23 = fila6.tras;
        boolean boolean24 = fila6.vazia();
        boolean boolean25 = fila6.vazia();
        java.lang.Object[] objArray26 = fila6.item;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 10;
        fila27.frente = (short) -1;
        boolean boolean33 = fila27.vazia();
        java.lang.Object[] objArray34 = fila27.item;
        fila6.item = objArray34;
        fila0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.frente = '4';
        boolean boolean22 = fila18.vazia();
        java.lang.Object[] objArray23 = fila18.item;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.frente = '4';
        boolean boolean28 = fila24.vazia();
        java.lang.Object[] objArray29 = fila24.item;
        fila18.item = objArray29;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        fila31.frente = (short) 10;
        fila31.frente = (short) -1;
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        fila38.frente = (short) 10;
        fila38.frente = (short) -1;
        boolean boolean44 = fila38.vazia();
        java.lang.Object[] objArray45 = fila38.item;
        fila31.item = objArray45;
        fila18.enfileira((java.lang.Object) objArray45);
        fila0.item = objArray45;
        fila0.frente = (byte) -1;
        java.lang.Class<?> wildcardClass51 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        fila0.tras = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        fila0.frente = (short) 1;
        fila0.frente = '4';
        fila0.frente = 97;
        boolean boolean12 = fila0.vazia();
        boolean boolean13 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.frente = 0;
        fila0.frente = (short) 1;
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.tras = (byte) 1;
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila0.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.frente;
        fila43.tras = (byte) 0;
        java.lang.Object[] objArray47 = fila43.item;
        fila41.item = objArray47;
        fila25.item = objArray47;
        fila0.item = objArray47;
        boolean boolean51 = fila0.vazia();
        ds.Fila fila52 = new ds.Fila();
        int int53 = fila52.frente;
        fila52.tras = (byte) 0;
        fila52.frente = (byte) 10;
        boolean boolean58 = fila52.vazia();
        fila52.frente = 100;
        fila52.tras = (short) 0;
        fila0.enfileira((java.lang.Object) fila52);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        fila0.frente = 'a';
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.frente = '4';
        boolean boolean14 = fila10.vazia();
        java.lang.Object[] objArray15 = fila10.item;
        fila0.item = objArray15;
        int int17 = fila0.tras;
        java.lang.Object obj18 = fila0.desenfileira();
        fila0.tras = 53;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        int int10 = fila3.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.frente = '4';
        boolean boolean21 = fila17.vazia();
        java.lang.Object[] objArray22 = fila17.item;
        fila11.item = objArray22;
        fila3.item = objArray22;
        fila0.enfileira((java.lang.Object) objArray22);
        java.lang.Class<?> wildcardClass26 = objArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        java.lang.Object[] objArray18 = fila0.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 10;
        fila19.frente = (short) -1;
        boolean boolean25 = fila19.vazia();
        int int26 = fila19.frente;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.frente;
        fila27.frente = '4';
        boolean boolean31 = fila27.vazia();
        java.lang.Object[] objArray32 = fila27.item;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.frente;
        fila33.frente = '4';
        boolean boolean37 = fila33.vazia();
        java.lang.Object[] objArray38 = fila33.item;
        fila27.item = objArray38;
        fila19.item = objArray38;
        fila0.item = objArray38;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        java.lang.Object[] objArray13 = fila6.item;
        fila2.item = objArray13;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        boolean boolean17 = fila15.vazia();
        fila2.enfileira((java.lang.Object) boolean17);
        int int19 = fila2.tras;
        fila0.enfileira((java.lang.Object) fila2);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        java.lang.Object[] objArray28 = fila21.item;
        fila0.enfileira((java.lang.Object) fila21);
        fila21.frente = 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.frente;
        int int22 = fila20.tras;
        fila20.tras = 'a';
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object[] objArray13 = fila0.item;
        fila0.tras = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        java.lang.Object[] objArray13 = fila6.item;
        fila2.item = objArray13;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        boolean boolean17 = fila15.vazia();
        fila2.enfileira((java.lang.Object) boolean17);
        int int19 = fila2.tras;
        fila0.enfileira((java.lang.Object) fila2);
        fila0.tras = 2;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        int int14 = fila12.tras;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        int int22 = fila15.frente;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.frente;
        fila23.frente = '4';
        boolean boolean27 = fila23.vazia();
        java.lang.Object[] objArray28 = fila23.item;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.frente = '4';
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila23.item = objArray34;
        fila15.item = objArray34;
        fila12.enfileira((java.lang.Object) objArray34);
        fila0.item = objArray34;
        java.lang.Class<?> wildcardClass39 = objArray34.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila5.item = objArray19;
        fila5.tras = 0;
        fila0.enfileira((java.lang.Object) 0);
        int int24 = fila0.frente;
        int int25 = fila0.tras;
        java.lang.Object obj26 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray25 = fila0.item;
        java.lang.Object obj26 = null;
        fila0.enfileira(obj26);
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        fila0.frente = 'a';
        fila0.tras = (short) 0;
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila3.item = objArray17;
        fila0.item = objArray17;
        fila0.imprime();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (byte) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila0.enfileira((java.lang.Object) fila21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        int int8 = fila6.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        fila9.tras = (byte) 0;
        java.lang.Object[] objArray13 = fila9.item;
        fila6.enfileira((java.lang.Object) objArray13);
        fila6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.frente = 1;
        boolean boolean14 = fila0.vazia();
        java.lang.Object[] objArray15 = fila0.item;
        java.lang.Object[] objArray16 = null;
        fila0.item = objArray16;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.frente;
        boolean boolean9 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 10;
        fila14.frente = (short) -1;
        boolean boolean20 = fila14.vazia();
        java.lang.Object[] objArray21 = fila14.item;
        fila7.item = objArray21;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        java.lang.Object[] objArray30 = fila23.item;
        fila7.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 10;
        fila39.frente = (short) -1;
        boolean boolean45 = fila39.vazia();
        java.lang.Object[] objArray46 = fila39.item;
        fila32.item = objArray46;
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.tras;
        ds.Fila fila50 = new ds.Fila();
        int int51 = fila50.frente;
        fila50.tras = (byte) 0;
        java.lang.Object[] objArray54 = fila50.item;
        fila48.item = objArray54;
        fila32.item = objArray54;
        fila7.item = objArray54;
        fila0.item = objArray54;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        fila0.frente = 'a';
        fila0.tras = (short) 0;
        int int9 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        int int7 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.tras = 100;
        int int5 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        java.lang.Object obj29 = fila0.desenfileira();
        fila0.tras = 'a';
        int int32 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        java.lang.Object[] objArray20 = fila0.item;
        boolean boolean21 = fila0.vazia();
        java.lang.Object obj22 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        java.lang.Object obj29 = fila0.desenfileira();
        boolean boolean30 = fila0.vazia();
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.frente;
        fila31.tras = (byte) 0;
        fila31.frente = (byte) 10;
        boolean boolean37 = fila31.vazia();
        fila31.frente = 100;
        fila31.tras = (short) 0;
        fila0.enfileira((java.lang.Object) fila31);
        java.lang.Object obj43 = fila31.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.frente;
        java.lang.Object obj13 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila5.item = objArray19;
        fila5.tras = 0;
        fila0.enfileira((java.lang.Object) 0);
        int int24 = fila0.frente;
        int int25 = fila0.tras;
        int int26 = fila0.frente;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.frente;
        fila27.tras = (short) -1;
        int int31 = fila27.tras;
        boolean boolean32 = fila27.vazia();
        int int33 = fila27.tras;
        fila27.frente = 'a';
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.tras;
        fila36.frente = (short) 10;
        fila36.frente = (short) -1;
        boolean boolean42 = fila36.vazia();
        int int43 = fila36.frente;
        boolean boolean44 = fila36.vazia();
        ds.Fila fila45 = new ds.Fila();
        int int46 = fila45.frente;
        int int47 = fila45.tras;
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.frente;
        fila48.tras = (byte) 0;
        java.lang.Object[] objArray52 = fila48.item;
        fila45.enfileira((java.lang.Object) objArray52);
        fila36.enfileira((java.lang.Object) objArray52);
        fila27.item = objArray52;
        boolean boolean56 = fila27.vazia();
        java.lang.Object[] objArray57 = fila27.item;
        fila0.item = objArray57;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        int int5 = fila0.tras;
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        fila0.tras = 'a';
        int int5 = fila0.tras;
        fila0.frente = (-1);
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        int int9 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.tras = (byte) 0;
        java.lang.Object[] objArray7 = fila3.item;
        fila0.enfileira((java.lang.Object) objArray7);
        int int9 = fila0.frente;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) ' ');
        boolean boolean8 = fila0.vazia();
        fila0.tras = 53;
        int int11 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 10;
        fila11.frente = (short) -1;
        boolean boolean17 = fila11.vazia();
        int int18 = fila11.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila19.item = objArray30;
        fila11.item = objArray30;
        fila0.item = objArray30;
        java.lang.Object obj34 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass35 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        fila6.frente = 0;
        java.lang.Object[] objArray12 = fila6.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 10;
        fila28.frente = (short) -1;
        boolean boolean34 = fila28.vazia();
        java.lang.Object[] objArray35 = fila28.item;
        fila21.item = objArray35;
        fila13.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray38 = fila13.item;
        fila6.enfileira((java.lang.Object) objArray38);
        fila0.item = objArray38;
        fila0.tras = '4';
        java.lang.Object obj43 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        fila0.frente = 52;
        java.lang.Object[] objArray15 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.frente;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.tras = (short) -1;
        java.lang.Object obj7 = fila3.desenfileira();
        fila3.tras = (short) 0;
        java.lang.Object[] objArray10 = fila3.item;
        fila0.item = objArray10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        java.lang.Object obj18 = fila0.desenfileira();
        java.lang.Object[] objArray19 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.frente = '4';
        boolean boolean7 = fila3.vazia();
        java.lang.Object[] objArray8 = fila3.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        fila9.frente = '4';
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila3.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        java.lang.Object[] objArray30 = fila23.item;
        fila16.item = objArray30;
        fila3.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        fila0.imprime();
        int int35 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        fila0.frente = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        fila0.frente = 53;
        fila0.frente = (byte) 100;
        fila0.frente = (short) -1;
        int int19 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        int int13 = fila0.frente;
        boolean boolean14 = fila0.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        java.lang.Object[] objArray17 = fila15.item;
        fila0.item = objArray17;
        int int19 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        java.lang.Object[] objArray13 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        fila0.frente = (short) -1;
        int int13 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        fila0.tras = (byte) -1;
        fila0.frente = 2;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.enfileira((java.lang.Object) (byte) 0);
        int int16 = fila12.frente;
        java.lang.Object obj17 = fila12.desenfileira();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        fila18.frente = 0;
        java.lang.Object[] objArray24 = fila18.item;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        fila33.frente = (short) 10;
        fila33.frente = (short) -1;
        boolean boolean39 = fila33.vazia();
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        fila40.frente = (short) 10;
        fila40.frente = (short) -1;
        boolean boolean46 = fila40.vazia();
        java.lang.Object[] objArray47 = fila40.item;
        fila33.item = objArray47;
        fila25.enfileira((java.lang.Object) fila33);
        java.lang.Object[] objArray50 = fila25.item;
        fila18.enfileira((java.lang.Object) objArray50);
        fila12.item = objArray50;
        fila0.item = objArray50;
        java.lang.Object obj54 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        fila8.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila8.item = objArray19;
        fila0.item = objArray19;
        java.lang.Object obj22 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        boolean boolean8 = fila0.vazia();
        fila0.tras = 0;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        boolean boolean8 = fila0.vazia();
        int int9 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        fila0.tras = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.frente = '4';
        boolean boolean22 = fila18.vazia();
        java.lang.Object[] objArray23 = fila18.item;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.frente = '4';
        boolean boolean28 = fila24.vazia();
        java.lang.Object[] objArray29 = fila24.item;
        fila18.item = objArray29;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        fila31.frente = (short) 10;
        fila31.frente = (short) -1;
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        fila38.frente = (short) 10;
        fila38.frente = (short) -1;
        boolean boolean44 = fila38.vazia();
        java.lang.Object[] objArray45 = fila38.item;
        fila31.item = objArray45;
        fila18.enfileira((java.lang.Object) objArray45);
        fila0.item = objArray45;
        int int49 = fila0.frente;
        java.lang.Object[] objArray50 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        java.lang.Object[] objArray20 = fila0.item;
        boolean boolean21 = fila0.vazia();
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.tras = 53;
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        java.lang.Object[] objArray15 = fila11.item;
        fila9.item = objArray15;
        int int17 = fila9.tras;
        fila9.tras = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.frente = 0;
        fila0.frente = (short) 1;
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        boolean boolean15 = fila9.vazia();
        int int16 = fila9.frente;
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        int int20 = fila18.tras;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (byte) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila18.enfileira((java.lang.Object) objArray25);
        fila9.enfileira((java.lang.Object) objArray25);
        fila0.item = objArray25;
        boolean boolean29 = fila0.vazia();
        int int30 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        fila0.frente = (short) -1;
        fila0.tras = 11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) "hi!");
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.frente;
        fila4.tras = (byte) 0;
        fila4.frente = 0;
        int int10 = fila4.tras;
        fila4.tras = 0;
        fila4.imprime();
        java.lang.Object[] objArray14 = fila4.item;
        fila0.item = objArray14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila7.tras = (byte) 10;
        java.lang.Object[] objArray17 = fila7.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.frente = '4';
        boolean boolean22 = fila18.vazia();
        java.lang.Class<?> wildcardClass23 = fila18.getClass();
        fila7.enfileira((java.lang.Object) wildcardClass23);
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.frente;
        fila31.frente = '4';
        boolean boolean35 = fila31.vazia();
        java.lang.Object[] objArray36 = fila31.item;
        fila25.item = objArray36;
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        fila38.frente = (short) 10;
        fila38.frente = (short) -1;
        boolean boolean44 = fila38.vazia();
        ds.Fila fila45 = new ds.Fila();
        int int46 = fila45.tras;
        fila45.frente = (short) 10;
        fila45.frente = (short) -1;
        boolean boolean51 = fila45.vazia();
        java.lang.Object[] objArray52 = fila45.item;
        fila38.item = objArray52;
        fila25.enfileira((java.lang.Object) objArray52);
        fila7.item = objArray52;
        fila0.item = objArray52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (byte) 10;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        int int13 = fila6.frente;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.frente;
        fila14.frente = '4';
        boolean boolean18 = fila14.vazia();
        java.lang.Object[] objArray19 = fila14.item;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.frente;
        fila20.frente = '4';
        boolean boolean24 = fila20.vazia();
        java.lang.Object[] objArray25 = fila20.item;
        fila14.item = objArray25;
        fila6.item = objArray25;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.frente;
        fila28.frente = '4';
        boolean boolean32 = fila28.vazia();
        java.lang.Object[] objArray33 = fila28.item;
        java.lang.Object obj34 = fila28.desenfileira();
        java.lang.Object[] objArray35 = fila28.item;
        fila6.item = objArray35;
        fila0.item = objArray35;
        java.lang.Object obj38 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        int int25 = fila0.frente;
        java.lang.Object[] objArray26 = fila0.item;
        fila0.frente = (short) 10;
        java.lang.Class<?> wildcardClass29 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.frente = (short) 0;
        fila0.tras = (short) 0;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.frente = '4';
        int int17 = fila13.tras;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        int int13 = fila0.frente;
        fila0.frente = 53;
        fila0.tras = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 10;
        fila11.frente = (short) -1;
        boolean boolean17 = fila11.vazia();
        int int18 = fila11.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila19.item = objArray30;
        fila11.item = objArray30;
        fila0.item = objArray30;
        java.lang.Object obj34 = fila0.desenfileira();
        int int35 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.tras = (byte) 0;
        java.lang.Object[] objArray7 = fila3.item;
        fila0.enfileira((java.lang.Object) objArray7);
        int int9 = fila0.frente;
        java.lang.Object obj10 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.frente = '4';
        boolean boolean14 = fila10.vazia();
        java.lang.Object[] objArray15 = fila10.item;
        fila0.item = objArray15;
        fila0.tras = 0;
        fila0.frente = (byte) 10;
        java.lang.Object obj21 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        boolean boolean15 = fila9.vazia();
        int int16 = fila9.frente;
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        int int20 = fila18.tras;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (byte) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila18.enfileira((java.lang.Object) objArray25);
        fila9.enfileira((java.lang.Object) objArray25);
        fila0.item = objArray25;
        boolean boolean29 = fila0.vazia();
        java.lang.Class<?> wildcardClass30 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        fila0.frente = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object[] objArray8 = fila0.item;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        int int25 = fila18.frente;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.frente;
        fila26.frente = '4';
        boolean boolean30 = fila26.vazia();
        java.lang.Object[] objArray31 = fila26.item;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.frente;
        fila32.frente = '4';
        boolean boolean36 = fila32.vazia();
        java.lang.Object[] objArray37 = fila32.item;
        fila26.item = objArray37;
        fila18.item = objArray37;
        fila0.item = objArray37;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.frente;
        fila41.frente = '4';
        boolean boolean45 = fila41.vazia();
        java.lang.Object[] objArray46 = fila41.item;
        java.lang.Object obj47 = fila41.desenfileira();
        java.lang.Object[] objArray48 = fila41.item;
        fila0.item = objArray48;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        java.lang.Object[] objArray10 = fila8.item;
        fila0.item = objArray10;
        java.lang.Object[] objArray12 = fila0.item;
        fila0.frente = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        fila0.frente = (short) -1;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.tras = (byte) 0;
        java.lang.Object[] objArray14 = fila10.item;
        fila8.item = objArray14;
        int int16 = fila8.frente;
        fila8.frente = (short) 0;
        fila8.tras = (short) 0;
        fila0.enfileira((java.lang.Object) fila8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.frente = ' ';
        int int11 = fila0.tras;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        java.lang.Object obj29 = fila0.desenfileira();
        java.lang.Object obj30 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.frente = '4';
        boolean boolean7 = fila3.vazia();
        java.lang.Object[] objArray8 = fila3.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        fila9.frente = '4';
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila3.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        java.lang.Object[] objArray30 = fila23.item;
        fila16.item = objArray30;
        fila3.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        fila0.imprime();
        java.lang.Object[] objArray35 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        int int13 = fila0.tras;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila5.item = objArray19;
        fila5.tras = 0;
        fila0.enfileira((java.lang.Object) 0);
        int int24 = fila0.frente;
        int int25 = fila0.tras;
        boolean boolean26 = fila0.vazia();
        boolean boolean27 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        fila6.tras = (short) -1;
        fila6.frente = (short) 10;
        fila6.frente = '4';
        java.lang.Object[] objArray17 = fila6.item;
        fila0.enfileira((java.lang.Object) objArray17);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila19.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 10;
        fila39.frente = (short) -1;
        boolean boolean45 = fila39.vazia();
        java.lang.Object[] objArray46 = fila39.item;
        fila32.item = objArray46;
        fila19.enfileira((java.lang.Object) objArray46);
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Object[] objArray50 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.frente;
        int int9 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        boolean boolean15 = fila9.vazia();
        int int16 = fila9.frente;
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        int int20 = fila18.tras;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (byte) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila18.enfileira((java.lang.Object) objArray25);
        fila9.enfileira((java.lang.Object) objArray25);
        fila0.item = objArray25;
        boolean boolean29 = fila0.vazia();
        boolean boolean30 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.enfileira((java.lang.Object) (byte) 0);
        fila7.frente = (short) 10;
        fila0.enfileira((java.lang.Object) fila7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        java.lang.Class<?> wildcardClass13 = objArray11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        fila12.frente = 0;
        java.lang.Object[] objArray18 = fila12.item;
        fila10.item = objArray18;
        java.lang.Object[] objArray20 = fila10.item;
        boolean boolean21 = fila10.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.imprime();
        fila0.frente = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.frente;
        fila36.tras = (byte) 0;
        java.lang.Object[] objArray40 = fila36.item;
        fila0.item = objArray40;
        int int42 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        boolean boolean28 = fila22.vazia();
        java.lang.Object[] objArray29 = fila22.item;
        fila15.item = objArray29;
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray32 = fila7.item;
        fila0.enfileira((java.lang.Object) objArray32);
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.frente;
        fila34.frente = '4';
        boolean boolean38 = fila34.vazia();
        java.lang.Object[] objArray39 = fila34.item;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.frente;
        fila40.frente = '4';
        boolean boolean44 = fila40.vazia();
        fila40.tras = (short) -1;
        fila40.frente = (short) 10;
        fila40.frente = '4';
        java.lang.Object[] objArray51 = fila40.item;
        fila34.enfileira((java.lang.Object) objArray51);
        fila0.enfileira((java.lang.Object) fila34);
        java.lang.Object[] objArray54 = fila34.item;
        fila34.frente = 11;
        ds.Fila fila57 = new ds.Fila();
        int int58 = fila57.frente;
        fila57.tras = (byte) 0;
        java.lang.Object[] objArray61 = fila57.item;
        ds.Fila fila62 = new ds.Fila();
        int int63 = fila62.frente;
        fila62.frente = '4';
        boolean boolean66 = fila62.vazia();
        java.lang.Object[] objArray67 = fila62.item;
        fila57.item = objArray67;
        boolean boolean69 = fila57.vazia();
        java.lang.Object[] objArray70 = fila57.item;
        fila34.item = objArray70;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        fila0.tras = 100;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        int int10 = fila0.tras;
        fila0.imprime();
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.tras = (byte) 0;
        java.lang.Object[] objArray9 = fila5.item;
        fila3.item = objArray9;
        int int11 = fila3.tras;
        fila3.tras = (short) 100;
        java.lang.Object obj14 = fila3.desenfileira();
        boolean boolean15 = fila3.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        boolean boolean17 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        java.lang.Object[] objArray13 = fila6.item;
        fila2.item = objArray13;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        boolean boolean17 = fila15.vazia();
        fila2.enfileira((java.lang.Object) boolean17);
        int int19 = fila2.tras;
        fila0.enfileira((java.lang.Object) fila2);
        int int21 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila5.item = objArray19;
        fila5.tras = 0;
        fila0.enfileira((java.lang.Object) 0);
        int int24 = fila0.frente;
        boolean boolean25 = fila0.vazia();
        boolean boolean26 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        java.lang.Object[] objArray20 = fila0.item;
        boolean boolean21 = fila0.vazia();
        int int22 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        fila0.tras = 0;
        fila0.imprime();
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        fila8.tras = (short) -1;
        int int12 = fila8.tras;
        int int13 = fila8.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 10;
        fila14.frente = (short) -1;
        boolean boolean20 = fila14.vazia();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        java.lang.Object[] objArray28 = fila21.item;
        fila14.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.frente;
        fila32.tras = (byte) 0;
        java.lang.Object[] objArray36 = fila32.item;
        fila30.item = objArray36;
        fila14.item = objArray36;
        fila8.item = objArray36;
        fila0.item = objArray36;
        java.lang.Object obj41 = null;
        fila0.enfileira(obj41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        java.lang.Object[] objArray20 = fila0.item;
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        fila0.tras = '#';
        fila0.tras = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        fila0.frente = (-1);
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.frente = '4';
        boolean boolean14 = fila10.vazia();
        java.lang.Object[] objArray15 = fila10.item;
        fila0.item = objArray15;
        int int17 = fila0.tras;
        java.lang.Object obj18 = fila0.desenfileira();
        int int19 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object[] objArray25 = fila0.item;
        java.lang.Class<?> wildcardClass26 = objArray25.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        boolean boolean12 = fila0.vazia();
        java.lang.Object obj13 = fila0.desenfileira();
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        int int14 = fila12.tras;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        int int22 = fila15.frente;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.frente;
        fila23.frente = '4';
        boolean boolean27 = fila23.vazia();
        java.lang.Object[] objArray28 = fila23.item;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.frente = '4';
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila23.item = objArray34;
        fila15.item = objArray34;
        fila12.enfileira((java.lang.Object) objArray34);
        fila0.item = objArray34;
        int int39 = fila0.tras;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.frente;
        fila40.tras = (short) -1;
        int int44 = fila40.tras;
        boolean boolean45 = fila40.vazia();
        int int46 = fila40.tras;
        fila40.frente = 'a';
        java.lang.Object obj49 = fila40.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira(obj49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.frente = (short) 10;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila0.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.frente;
        fila43.tras = (byte) 0;
        java.lang.Object[] objArray47 = fila43.item;
        fila41.item = objArray47;
        fila25.item = objArray47;
        fila0.item = objArray47;
        boolean boolean51 = fila0.vazia();
        ds.Fila fila52 = new ds.Fila();
        int int53 = fila52.frente;
        fila52.tras = (short) -1;
        fila52.tras = 0;
        fila52.imprime();
        int int59 = fila52.tras;
        ds.Fila fila60 = new ds.Fila();
        int int61 = fila60.frente;
        fila60.tras = (short) -1;
        int int64 = fila60.tras;
        int int65 = fila60.tras;
        ds.Fila fila66 = new ds.Fila();
        int int67 = fila66.tras;
        fila66.frente = (short) 10;
        fila66.frente = (short) -1;
        boolean boolean72 = fila66.vazia();
        ds.Fila fila73 = new ds.Fila();
        int int74 = fila73.tras;
        fila73.frente = (short) 10;
        fila73.frente = (short) -1;
        boolean boolean79 = fila73.vazia();
        java.lang.Object[] objArray80 = fila73.item;
        fila66.item = objArray80;
        ds.Fila fila82 = new ds.Fila();
        int int83 = fila82.tras;
        ds.Fila fila84 = new ds.Fila();
        int int85 = fila84.frente;
        fila84.tras = (byte) 0;
        java.lang.Object[] objArray88 = fila84.item;
        fila82.item = objArray88;
        fila66.item = objArray88;
        fila60.item = objArray88;
        fila52.item = objArray88;
        fila0.item = objArray88;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        int int13 = fila0.frente;
        boolean boolean14 = fila0.vazia();
        java.lang.Object obj15 = fila0.desenfileira();
        boolean boolean16 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.frente;
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        boolean boolean15 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        fila0.tras = (byte) -1;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.tras;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.frente;
        fila0.frente = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        int int8 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        fila0.tras = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        int int12 = fila10.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.tras = (byte) 1;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        boolean boolean15 = fila9.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila9.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.frente;
        fila27.tras = (byte) 0;
        java.lang.Object[] objArray31 = fila27.item;
        fila25.item = objArray31;
        fila9.item = objArray31;
        int int34 = fila9.frente;
        java.lang.Object[] objArray35 = fila9.item;
        fila9.frente = (short) 10;
        boolean boolean38 = fila9.vazia();
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        fila0.frente = (short) 100;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        fila9.tras = (byte) 0;
        java.lang.Object[] objArray13 = fila9.item;
        fila7.item = objArray13;
        int int15 = fila7.frente;
        fila7.frente = ' ';
        int int18 = fila7.tras;
        fila0.enfileira((java.lang.Object) int18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        fila0.frente = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.imprime();
        fila0.frente = '#';
        fila0.enfileira((java.lang.Object) 0.0f);
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        fila0.frente = (short) -1;
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        boolean boolean15 = fila9.vazia();
        java.lang.Object[] objArray16 = fila9.item;
        fila9.tras = (byte) 10;
        ds.Fila fila19 = new ds.Fila();
        fila9.enfileira((java.lang.Object) fila19);
        fila9.frente = 1;
        boolean boolean23 = fila9.vazia();
        java.lang.Object[] objArray24 = fila9.item;
        fila0.item = objArray24;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        int int6 = fila0.tras;
        fila0.tras = 0;
        fila0.imprime();
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.frente;
        fila14.tras = (byte) 0;
        java.lang.Object[] objArray18 = fila14.item;
        fila12.item = objArray18;
        int int20 = fila12.tras;
        fila12.tras = (short) 100;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.frente;
        fila23.tras = (byte) 0;
        boolean boolean27 = fila23.vazia();
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.frente;
        fila28.frente = '4';
        fila23.enfileira((java.lang.Object) fila28);
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.frente;
        fila33.frente = '4';
        boolean boolean37 = fila33.vazia();
        java.lang.Object[] objArray38 = fila33.item;
        fila23.item = objArray38;
        fila12.item = objArray38;
        java.lang.Object obj41 = fila12.desenfileira();
        fila12.tras = 'a';
        fila11.enfileira((java.lang.Object) 'a');
        java.lang.Object[] objArray45 = fila11.item;
        fila0.item = objArray45;
        boolean boolean47 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        int int25 = fila0.frente;
        java.lang.Object[] objArray26 = fila0.item;
        int int27 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        java.lang.Object[] objArray10 = fila8.item;
        fila0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = objArray10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        java.lang.Object[] objArray18 = fila0.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 10;
        fila19.frente = (short) -1;
        boolean boolean25 = fila19.vazia();
        int int26 = fila19.frente;
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.frente;
        fila27.frente = '4';
        boolean boolean31 = fila27.vazia();
        java.lang.Object[] objArray32 = fila27.item;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.frente;
        fila33.frente = '4';
        boolean boolean37 = fila33.vazia();
        java.lang.Object[] objArray38 = fila33.item;
        fila27.item = objArray38;
        fila19.item = objArray38;
        fila0.item = objArray38;
        java.lang.Class<?> wildcardClass42 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila5.item = objArray19;
        fila5.tras = 0;
        fila0.enfileira((java.lang.Object) 0);
        int int24 = fila0.frente;
        int int25 = fila0.tras;
        boolean boolean26 = fila0.vazia();
        java.lang.Object obj27 = fila0.desenfileira();
        fila0.frente = (short) 100;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.frente;
        fila32.tras = (byte) 0;
        java.lang.Object[] objArray36 = fila32.item;
        fila30.item = objArray36;
        int int38 = fila30.tras;
        fila30.tras = (short) 100;
        java.lang.Object obj41 = fila30.desenfileira();
        int int42 = fila30.frente;
        boolean boolean43 = fila30.vazia();
        java.lang.Object obj44 = fila30.desenfileira();
        java.lang.Object[] objArray45 = fila30.item;
        fila0.enfileira((java.lang.Object) objArray45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = (-1);
        java.lang.Object[] objArray18 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.frente;
        int int7 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila5.item = objArray19;
        fila5.tras = 0;
        fila0.enfileira((java.lang.Object) 0);
        int int24 = fila0.frente;
        int int25 = fila0.tras;
        int int26 = fila0.frente;
        java.lang.Class<?> wildcardClass27 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        boolean boolean20 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        java.lang.Object obj9 = fila0.desenfileira();
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        fila6.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.tras = (byte) 0;
        java.lang.Object[] objArray28 = fila24.item;
        fila22.item = objArray28;
        fila6.item = objArray28;
        fila0.item = objArray28;
        fila0.tras = (byte) 0;
        boolean boolean34 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        java.lang.Object obj8 = null;
        fila0.enfileira(obj8);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        boolean boolean29 = fila0.vazia();
        java.lang.Object[] objArray30 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        fila0.frente = '#';
        java.lang.Object[] objArray20 = fila0.item;
        fila0.tras = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        int int11 = fila9.tras;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        int int19 = fila12.frente;
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.frente;
        fila20.frente = '4';
        boolean boolean24 = fila20.vazia();
        java.lang.Object[] objArray25 = fila20.item;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.frente;
        fila26.frente = '4';
        boolean boolean30 = fila26.vazia();
        java.lang.Object[] objArray31 = fila26.item;
        fila20.item = objArray31;
        fila12.item = objArray31;
        fila9.enfileira((java.lang.Object) objArray31);
        java.lang.Object[] objArray35 = fila9.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        int int9 = fila0.tras;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        fila6.frente = 0;
        java.lang.Object[] objArray12 = fila6.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 10;
        fila28.frente = (short) -1;
        boolean boolean34 = fila28.vazia();
        java.lang.Object[] objArray35 = fila28.item;
        fila21.item = objArray35;
        fila13.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray38 = fila13.item;
        fila6.enfileira((java.lang.Object) objArray38);
        fila0.item = objArray38;
        int int41 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila3.item = objArray17;
        fila0.item = objArray17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        fila6.tras = (short) -1;
        fila6.frente = (short) 10;
        fila6.frente = '4';
        java.lang.Object[] objArray17 = fila6.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        int int20 = fila18.tras;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        int int28 = fila21.frente;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.frente = '4';
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.frente;
        fila35.frente = '4';
        boolean boolean39 = fila35.vazia();
        java.lang.Object[] objArray40 = fila35.item;
        fila29.item = objArray40;
        fila21.item = objArray40;
        fila18.enfileira((java.lang.Object) objArray40);
        fila6.item = objArray40;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        boolean boolean7 = fila0.vazia();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.tras;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.frente;
        fila26.tras = (byte) 0;
        java.lang.Object[] objArray30 = fila26.item;
        fila24.item = objArray30;
        fila8.item = objArray30;
        int int33 = fila8.frente;
        java.lang.Object[] objArray34 = fila8.item;
        fila0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila0.item = objArray23;
        int int25 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object[] objArray5 = fila0.item;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        fila0.tras = (short) 1;
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = '4';
        fila0.frente = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        fila0.tras = (-1);
        fila0.imprime();
        int int13 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        int int20 = fila0.frente;
        int int21 = fila0.frente;
        fila0.frente = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 53;
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objArray9);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        fila0.tras = 1;
        java.lang.Object[] objArray13 = fila0.item;
        boolean boolean14 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.frente;
        fila36.tras = (byte) 0;
        java.lang.Object[] objArray40 = fila36.item;
        fila0.item = objArray40;
        java.lang.Object[] objArray42 = null;
        fila0.item = objArray42;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.frente = ' ';
        fila0.frente = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        boolean boolean15 = fila9.vazia();
        int int16 = fila9.frente;
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        int int20 = fila18.tras;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (byte) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila18.enfileira((java.lang.Object) objArray25);
        fila9.enfileira((java.lang.Object) objArray25);
        fila0.item = objArray25;
        boolean boolean29 = fila0.vazia();
        java.lang.Object[] objArray30 = fila0.item;
        int int31 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.frente = (short) 10;
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.frente = '4';
        boolean boolean11 = fila7.vazia();
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object obj13 = fila7.desenfileira();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.frente = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Object obj14 = fila0.desenfileira();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        fila15.enfileira((java.lang.Object) (byte) 0);
        boolean boolean19 = fila15.vazia();
        java.lang.Object[] objArray20 = fila15.item;
        fila0.enfileira((java.lang.Object) objArray20);
        fila0.frente = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        boolean boolean8 = fila0.vazia();
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        int int11 = fila9.tras;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        java.lang.Object[] objArray16 = fila12.item;
        fila9.enfileira((java.lang.Object) objArray16);
        fila0.enfileira((java.lang.Object) objArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila0.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.frente;
        fila43.tras = (byte) 0;
        java.lang.Object[] objArray47 = fila43.item;
        fila41.item = objArray47;
        fila25.item = objArray47;
        fila0.item = objArray47;
        int int51 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        fila0.tras = 10;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        java.lang.Object obj18 = fila0.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        java.lang.Object obj25 = fila19.desenfileira();
        java.lang.Object[] objArray26 = fila19.item;
        fila0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        int int25 = fila0.frente;
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        int int25 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        fila0.item = objArray8;
        java.lang.Class<?> wildcardClass10 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        fila8.frente = '4';
        boolean boolean12 = fila8.vazia();
        java.lang.Object[] objArray13 = fila8.item;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.frente;
        fila14.frente = '4';
        boolean boolean18 = fila14.vazia();
        java.lang.Object[] objArray19 = fila14.item;
        fila8.item = objArray19;
        fila0.item = objArray19;
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        int int4 = fila0.frente;
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        fila6.frente = 0;
        java.lang.Object[] objArray12 = fila6.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.tras;
        fila28.frente = (short) 10;
        fila28.frente = (short) -1;
        boolean boolean34 = fila28.vazia();
        java.lang.Object[] objArray35 = fila28.item;
        fila21.item = objArray35;
        fila13.enfileira((java.lang.Object) fila21);
        java.lang.Object[] objArray38 = fila13.item;
        fila6.enfileira((java.lang.Object) objArray38);
        fila0.item = objArray38;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.frente;
        fila41.tras = (byte) 0;
        java.lang.Object[] objArray45 = fila41.item;
        java.lang.Object[] objArray46 = fila41.item;
        fila0.enfileira((java.lang.Object) fila41);
        java.lang.Object obj48 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        java.lang.Object[] objArray6 = fila0.item;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        boolean boolean28 = fila22.vazia();
        java.lang.Object[] objArray29 = fila22.item;
        fila15.item = objArray29;
        fila7.enfileira((java.lang.Object) fila15);
        java.lang.Object[] objArray32 = fila7.item;
        fila0.enfileira((java.lang.Object) objArray32);
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.frente;
        fila34.frente = '4';
        boolean boolean38 = fila34.vazia();
        java.lang.Object[] objArray39 = fila34.item;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.frente;
        fila40.frente = '4';
        boolean boolean44 = fila40.vazia();
        fila40.tras = (short) -1;
        fila40.frente = (short) 10;
        fila40.frente = '4';
        java.lang.Object[] objArray51 = fila40.item;
        fila34.enfileira((java.lang.Object) objArray51);
        fila0.enfileira((java.lang.Object) fila34);
        fila0.tras = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        fila0.enfileira((java.lang.Object) fila8);
        int int25 = fila0.tras;
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        fila0.item = objArray5;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.frente;
        fila36.tras = (byte) 0;
        java.lang.Object[] objArray40 = fila36.item;
        fila0.item = objArray40;
        java.lang.Object[] objArray42 = fila0.item;
        int int43 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = 0;
        int int6 = fila0.tras;
        fila0.tras = 0;
        fila0.imprime();
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila5.item = objArray19;
        fila5.tras = 0;
        fila0.enfileira((java.lang.Object) 0);
        int int24 = fila0.frente;
        int int25 = fila0.tras;
        boolean boolean26 = fila0.vazia();
        java.lang.Object obj27 = fila0.desenfileira();
        java.lang.Object[] objArray28 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.enfileira((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        java.lang.Object[] objArray20 = fila0.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        java.lang.Object[] objArray28 = fila21.item;
        fila0.item = objArray28;
        int int30 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.frente = '4';
        boolean boolean7 = fila3.vazia();
        java.lang.Object[] objArray8 = fila3.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        fila9.frente = '4';
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila3.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        java.lang.Object[] objArray30 = fila23.item;
        fila16.item = objArray30;
        fila3.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        int int19 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        java.lang.Object[] objArray8 = fila0.item;
        boolean boolean9 = fila0.vazia();
        fila0.frente = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.tras = (short) -1;
        int int21 = fila17.tras;
        java.lang.Object obj22 = fila17.desenfileira();
        fila0.enfileira(obj22);
        java.lang.Object[] objArray24 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        fila0.tras = (short) -1;
        int int5 = fila0.frente;
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        java.lang.Object[] objArray10 = fila8.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.frente;
        int int6 = fila4.tras;
        fila4.tras = 'a';
        fila4.frente = 'a';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 10;
        fila11.frente = (short) -1;
        java.lang.Object obj17 = null;
        fila11.enfileira(obj17);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        fila19.tras = (short) -1;
        fila19.frente = (short) 10;
        fila19.frente = '4';
        java.lang.Object[] objArray30 = fila19.item;
        fila11.item = objArray30;
        fila4.enfileira((java.lang.Object) objArray30);
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Object obj34 = fila4.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (short) 0;
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        int int10 = fila8.tras;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 10;
        fila11.frente = (short) -1;
        boolean boolean17 = fila11.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        java.lang.Object[] objArray25 = fila18.item;
        fila11.item = objArray25;
        fila8.item = objArray25;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.frente;
        int int8 = fila0.tras;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        java.lang.Object[] objArray12 = fila0.item;
        java.lang.Object[] objArray13 = fila0.item;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.frente;
        int int16 = fila14.tras;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.frente = (short) 10;
        fila17.frente = (short) -1;
        boolean boolean23 = fila17.vazia();
        int int24 = fila17.frente;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.frente;
        fila31.frente = '4';
        boolean boolean35 = fila31.vazia();
        java.lang.Object[] objArray36 = fila31.item;
        fila25.item = objArray36;
        fila17.item = objArray36;
        fila14.enfileira((java.lang.Object) objArray36);
        java.lang.Object[] objArray40 = fila14.item;
        fila0.item = objArray40;
        int int42 = fila0.tras;
        boolean boolean43 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        fila25.tras = (short) -1;
        fila25.frente = (short) 10;
        fila25.frente = '4';
        java.lang.Object[] objArray36 = fila25.item;
        fila0.enfileira((java.lang.Object) objArray36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila0.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.frente;
        fila43.tras = (byte) 0;
        java.lang.Object[] objArray47 = fila43.item;
        fila41.item = objArray47;
        fila25.item = objArray47;
        fila0.item = objArray47;
        boolean boolean51 = fila0.vazia();
        ds.Fila fila52 = new ds.Fila();
        int int53 = fila52.frente;
        fila52.tras = (byte) 0;
        fila52.frente = (byte) 10;
        boolean boolean58 = fila52.vazia();
        fila52.frente = 100;
        fila52.tras = (short) 0;
        fila0.enfileira((java.lang.Object) fila52);
        ds.Fila fila64 = new ds.Fila();
        int int65 = fila64.tras;
        fila64.frente = (short) 10;
        fila64.frente = (short) -1;
        boolean boolean70 = fila64.vazia();
        int int71 = fila64.frente;
        int int72 = fila64.tras;
        fila52.enfileira((java.lang.Object) int72);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        java.lang.Object obj29 = fila0.desenfileira();
        boolean boolean30 = fila0.vazia();
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.frente;
        fila33.tras = (byte) 0;
        java.lang.Object[] objArray37 = fila33.item;
        fila31.item = objArray37;
        fila0.enfileira((java.lang.Object) objArray37);
        fila0.tras = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.imprime();
        boolean boolean6 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.tras = (short) 10;
        java.lang.Class<?> wildcardClass11 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        int int29 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        fila0.frente = 35;
        int int20 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        java.lang.Object[] objArray10 = fila6.item;
        fila4.item = objArray10;
        int int12 = fila4.tras;
        fila4.tras = (short) 100;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        fila15.tras = (byte) 0;
        boolean boolean19 = fila15.vazia();
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.frente;
        fila20.frente = '4';
        fila15.enfileira((java.lang.Object) fila20);
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila15.item = objArray30;
        fila4.item = objArray30;
        java.lang.Object obj33 = fila4.desenfileira();
        fila4.tras = 'a';
        int int36 = fila4.frente;
        java.lang.Object[] objArray37 = fila4.item;
        fila0.item = objArray37;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.frente;
        fila41.tras = (byte) 0;
        java.lang.Object[] objArray45 = fila41.item;
        fila39.item = objArray45;
        int int47 = fila39.tras;
        fila39.tras = (short) 100;
        ds.Fila fila50 = new ds.Fila();
        int int51 = fila50.frente;
        fila50.tras = (byte) 0;
        boolean boolean54 = fila50.vazia();
        ds.Fila fila55 = new ds.Fila();
        int int56 = fila55.frente;
        fila55.frente = '4';
        fila50.enfileira((java.lang.Object) fila55);
        ds.Fila fila60 = new ds.Fila();
        int int61 = fila60.frente;
        fila60.frente = '4';
        boolean boolean64 = fila60.vazia();
        java.lang.Object[] objArray65 = fila60.item;
        fila50.item = objArray65;
        fila39.item = objArray65;
        fila0.enfileira((java.lang.Object) fila39);
        boolean boolean69 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        int int9 = fila0.tras;
        int int10 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.frente;
        fila4.frente = '4';
        int int8 = fila4.tras;
        int int9 = fila4.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray15 = null;
        fila11.item = objArray15;
        java.lang.Object[] objArray17 = new java.lang.Object[] { int9, '4', objArray15 };
        fila0.item = objArray15;
        java.lang.Object[] objArray19 = fila0.item;
        java.lang.Class<?> wildcardClass20 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[52, 4, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[52, 4, null]");
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        fila6.tras = (short) -1;
        fila6.frente = (short) 10;
        fila6.frente = '4';
        java.lang.Object[] objArray17 = fila6.item;
        fila0.enfileira((java.lang.Object) objArray17);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila19.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 10;
        fila39.frente = (short) -1;
        boolean boolean45 = fila39.vazia();
        java.lang.Object[] objArray46 = fila39.item;
        fila32.item = objArray46;
        fila19.enfileira((java.lang.Object) objArray46);
        fila0.enfileira((java.lang.Object) fila19);
        java.lang.Class<?> wildcardClass50 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        fila0.frente = 52;
        java.lang.Object obj15 = fila0.desenfileira();
        int int16 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        fila0.tras = 0;
        fila0.imprime();
        int int7 = fila0.tras;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        int int14 = fila12.tras;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        int int22 = fila15.frente;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.frente;
        fila23.frente = '4';
        boolean boolean27 = fila23.vazia();
        java.lang.Object[] objArray28 = fila23.item;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.frente = '4';
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila23.item = objArray34;
        fila15.item = objArray34;
        fila12.enfileira((java.lang.Object) objArray34);
        fila0.item = objArray34;
        int int39 = fila0.tras;
        boolean boolean40 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        fila0.frente = '#';
        java.lang.Object obj20 = fila0.desenfileira();
        boolean boolean21 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.tras = (byte) 0;
        fila5.frente = (byte) 10;
        boolean boolean11 = fila5.vazia();
        fila5.frente = 100;
        fila5.tras = (short) 0;
        int int16 = fila5.tras;
        java.lang.Object[] objArray17 = fila5.item;
        fila0.enfileira((java.lang.Object) objArray17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        java.lang.Object obj18 = fila0.desenfileira();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = obj18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.tras = 53;
        java.lang.Object[] objArray8 = fila0.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        java.lang.Object obj15 = null;
        fila9.enfileira(obj15);
        int int17 = fila9.tras;
        java.lang.Object[] objArray18 = fila9.item;
        fila0.item = objArray18;
        java.lang.Object obj20 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 100;
        fila0.tras = (short) 0;
        fila0.tras = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.frente = 1;
        boolean boolean14 = fila0.vazia();
        int int15 = fila0.frente;
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 100;
        fila0.tras = (short) 0;
        int int11 = fila0.tras;
        java.lang.Object[] objArray12 = fila0.item;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.frente = '4';
        boolean boolean17 = fila13.vazia();
        java.lang.Object[] objArray18 = fila13.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        fila13.item = objArray24;
        int int26 = fila13.frente;
        fila0.enfileira((java.lang.Object) int26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.frente = '4';
        boolean boolean7 = fila3.vazia();
        java.lang.Object[] objArray8 = fila3.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        fila9.frente = '4';
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila3.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        java.lang.Object[] objArray30 = fila23.item;
        fila16.item = objArray30;
        fila3.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        int int34 = fila0.tras;
        int int35 = fila0.tras;
        fila0.frente = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.tras = (byte) 0;
        java.lang.Object[] objArray9 = fila5.item;
        fila3.item = objArray9;
        int int11 = fila3.tras;
        fila3.tras = (short) 100;
        java.lang.Object obj14 = fila3.desenfileira();
        boolean boolean15 = fila3.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        java.lang.Object[] objArray17 = fila0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        boolean boolean12 = fila0.vazia();
        int int13 = fila0.tras;
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        boolean boolean15 = fila9.vazia();
        int int16 = fila9.frente;
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        int int20 = fila18.tras;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (byte) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila18.enfileira((java.lang.Object) objArray25);
        fila9.enfileira((java.lang.Object) objArray25);
        fila0.item = objArray25;
        boolean boolean29 = fila0.vazia();
        java.lang.Object[] objArray30 = fila0.item;
        java.lang.Object[] objArray31 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        java.lang.Object obj29 = fila0.desenfileira();
        fila0.tras = 'a';
        int int32 = fila0.frente;
        boolean boolean33 = fila0.vazia();
        java.lang.Object[] objArray34 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila0.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.frente;
        fila43.tras = (byte) 0;
        java.lang.Object[] objArray47 = fila43.item;
        fila41.item = objArray47;
        fila25.item = objArray47;
        fila0.item = objArray47;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.tras = (byte) 0;
        java.lang.Object[] objArray22 = fila18.item;
        fila16.item = objArray22;
        fila0.item = objArray22;
        fila0.tras = '#';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        fila0.tras = 0;
        fila0.imprime();
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        fila8.tras = (short) -1;
        int int12 = fila8.tras;
        int int13 = fila8.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 10;
        fila14.frente = (short) -1;
        boolean boolean20 = fila14.vazia();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        java.lang.Object[] objArray28 = fila21.item;
        fila14.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.frente;
        fila32.tras = (byte) 0;
        java.lang.Object[] objArray36 = fila32.item;
        fila30.item = objArray36;
        fila14.item = objArray36;
        fila8.item = objArray36;
        fila0.item = objArray36;
        java.lang.Class<?> wildcardClass41 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        fila0.frente = '#';
        java.lang.Object obj20 = fila0.desenfileira();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila21.item = objArray32;
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.frente;
        boolean boolean36 = fila34.vazia();
        fila21.enfileira((java.lang.Object) boolean36);
        fila0.enfileira((java.lang.Object) fila21);
        java.lang.Object obj39 = fila21.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        int int20 = fila0.frente;
        int int21 = fila0.frente;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.frente;
        fila22.frente = '4';
        boolean boolean26 = fila22.vazia();
        fila22.tras = (short) -1;
        fila22.frente = (short) 10;
        fila22.frente = '4';
        java.lang.Object[] objArray33 = fila22.item;
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.frente;
        int int36 = fila34.tras;
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.tras;
        fila37.frente = (short) 10;
        fila37.frente = (short) -1;
        boolean boolean43 = fila37.vazia();
        int int44 = fila37.frente;
        ds.Fila fila45 = new ds.Fila();
        int int46 = fila45.frente;
        fila45.frente = '4';
        boolean boolean49 = fila45.vazia();
        java.lang.Object[] objArray50 = fila45.item;
        ds.Fila fila51 = new ds.Fila();
        int int52 = fila51.frente;
        fila51.frente = '4';
        boolean boolean55 = fila51.vazia();
        java.lang.Object[] objArray56 = fila51.item;
        fila45.item = objArray56;
        fila37.item = objArray56;
        fila34.enfileira((java.lang.Object) objArray56);
        fila22.item = objArray56;
        fila0.item = objArray56;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 100;
        fila0.tras = (short) 0;
        int int11 = fila0.tras;
        java.lang.Class<?> wildcardClass12 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        java.lang.Object[] objArray23 = fila16.item;
        fila0.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.tras;
        ds.Fila fila43 = new ds.Fila();
        int int44 = fila43.frente;
        fila43.tras = (byte) 0;
        java.lang.Object[] objArray47 = fila43.item;
        fila41.item = objArray47;
        fila25.item = objArray47;
        fila0.item = objArray47;
        boolean boolean51 = fila0.vazia();
        ds.Fila fila52 = new ds.Fila();
        int int53 = fila52.frente;
        fila52.tras = (byte) 0;
        fila52.frente = (byte) 10;
        boolean boolean58 = fila52.vazia();
        fila52.frente = 100;
        fila52.tras = (short) 0;
        fila0.enfileira((java.lang.Object) fila52);
        java.lang.Class<?> wildcardClass64 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        fila0.item = objArray10;
        boolean boolean12 = fila0.vazia();
        java.lang.Object[] objArray13 = fila0.item;
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        fila0.tras = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) ' ');
        java.lang.Object[] objArray8 = fila0.item;
        fila0.tras = 0;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        int int12 = fila0.frente;
        boolean boolean13 = fila0.vazia();
        java.lang.Object obj14 = fila0.desenfileira();
        java.lang.Object[] objArray15 = fila0.item;
        int int16 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        fila10.frente = '4';
        boolean boolean14 = fila10.vazia();
        java.lang.Object[] objArray15 = fila10.item;
        fila0.item = objArray15;
        int int17 = fila0.frente;
        fila0.tras = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        int int20 = fila0.frente;
        java.lang.Object[] objArray21 = fila0.item;
        java.lang.Object obj22 = fila0.desenfileira();
        int int23 = fila0.frente;
        fila0.frente = 11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        fila0.frente = (byte) 100;
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.frente = 'a';
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.tras;
        fila9.frente = (short) 10;
        fila9.frente = (short) -1;
        boolean boolean15 = fila9.vazia();
        int int16 = fila9.frente;
        boolean boolean17 = fila9.vazia();
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        int int20 = fila18.tras;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (byte) 0;
        java.lang.Object[] objArray25 = fila21.item;
        fila18.enfileira((java.lang.Object) objArray25);
        fila9.enfileira((java.lang.Object) objArray25);
        fila0.item = objArray25;
        boolean boolean29 = fila0.vazia();
        int int30 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila6.item = objArray17;
        fila0.item = objArray17;
        int int20 = fila0.frente;
        java.lang.Object obj21 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.frente = (short) 10;
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.frente = '4';
        boolean boolean11 = fila7.vazia();
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object obj13 = fila7.desenfileira();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        boolean boolean16 = fila0.vazia();
        fila0.tras = '#';
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.tras;
        fila19.frente = (short) 10;
        fila19.frente = (short) -1;
        boolean boolean25 = fila19.vazia();
        java.lang.Object[] objArray26 = fila19.item;
        fila19.tras = (byte) 10;
        java.lang.Object[] objArray29 = fila19.item;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.frente;
        fila30.frente = '4';
        boolean boolean34 = fila30.vazia();
        java.lang.Class<?> wildcardClass35 = fila30.getClass();
        fila19.enfileira((java.lang.Object) wildcardClass35);
        fila19.frente = '#';
        java.lang.Object[] objArray39 = fila19.item;
        fila0.item = objArray39;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        java.lang.Object[] objArray2 = fila0.item;
        int int3 = fila0.frente;
        int int4 = fila0.tras;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object obj7 = fila0.desenfileira();
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        java.lang.Object[] objArray10 = fila8.item;
        fila0.item = objArray10;
        java.lang.Object obj12 = fila0.desenfileira();
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.frente = (short) 10;
        fila17.frente = (short) -1;
        boolean boolean23 = fila17.vazia();
        java.lang.Object[] objArray24 = fila17.item;
        fila13.item = objArray24;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.frente;
        boolean boolean28 = fila26.vazia();
        fila13.enfileira((java.lang.Object) boolean28);
        int int30 = fila13.tras;
        boolean boolean31 = fila13.vazia();
        boolean boolean32 = fila13.vazia();
        java.lang.Object[] objArray33 = fila13.item;
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.tras;
        fila34.frente = (short) 10;
        fila34.frente = (short) -1;
        boolean boolean40 = fila34.vazia();
        java.lang.Object[] objArray41 = fila34.item;
        fila13.item = objArray41;
        fila0.item = objArray41;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.tras = (byte) 0;
        java.lang.Object[] objArray7 = fila3.item;
        fila0.enfileira((java.lang.Object) objArray7);
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.frente;
        java.lang.Object[] objArray12 = fila10.item;
        fila0.item = objArray12;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Fila fila0 = new ds.Fila();
        ds.Fila fila1 = new ds.Fila();
        int int2 = fila1.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.tras = (byte) 0;
        java.lang.Object[] objArray7 = fila3.item;
        fila1.item = objArray7;
        int int9 = fila1.tras;
        fila1.tras = (short) 100;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        boolean boolean16 = fila12.vazia();
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.frente = '4';
        fila12.enfileira((java.lang.Object) fila17);
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.frente;
        fila22.frente = '4';
        boolean boolean26 = fila22.vazia();
        java.lang.Object[] objArray27 = fila22.item;
        fila12.item = objArray27;
        fila1.item = objArray27;
        java.lang.Object obj30 = fila1.desenfileira();
        fila1.tras = 'a';
        fila0.enfileira((java.lang.Object) 'a');
        fila0.imprime();
        java.lang.Object obj35 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 'a' + "'", obj35, 'a');
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 100;
        fila0.tras = (short) 0;
        int int11 = fila0.tras;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        boolean boolean18 = fila0.vazia();
        boolean boolean19 = fila0.vazia();
        fila0.frente = 0;
        int int22 = fila0.frente;
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        fila0.frente = '4';
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.tras = (short) -1;
        int int17 = fila13.tras;
        boolean boolean18 = fila13.vazia();
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        java.lang.Object[] objArray30 = fila23.item;
        fila19.item = objArray30;
        fila13.item = objArray30;
        int int33 = fila13.frente;
        boolean boolean34 = fila13.vazia();
        fila13.frente = 97;
        ds.Fila fila37 = new ds.Fila();
        fila37.imprime();
        java.lang.Object[] objArray39 = fila37.item;
        fila13.item = objArray39;
        ds.Fila fila41 = new ds.Fila();
        int int42 = fila41.frente;
        fila41.frente = '4';
        int int45 = fila41.tras;
        java.lang.Object[] objArray46 = fila41.item;
        int int47 = fila41.tras;
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.tras;
        ds.Fila fila50 = new ds.Fila();
        int int51 = fila50.frente;
        fila50.tras = (byte) 0;
        java.lang.Object[] objArray54 = fila50.item;
        fila48.item = objArray54;
        int int56 = fila48.tras;
        fila48.tras = (short) 100;
        ds.Fila fila59 = new ds.Fila();
        int int60 = fila59.frente;
        fila59.tras = (byte) 0;
        boolean boolean63 = fila59.vazia();
        ds.Fila fila64 = new ds.Fila();
        int int65 = fila64.frente;
        fila64.frente = '4';
        fila59.enfileira((java.lang.Object) fila64);
        ds.Fila fila69 = new ds.Fila();
        int int70 = fila69.frente;
        fila69.frente = '4';
        boolean boolean73 = fila69.vazia();
        java.lang.Object[] objArray74 = fila69.item;
        fila59.item = objArray74;
        fila48.item = objArray74;
        fila41.item = objArray74;
        fila13.item = objArray74;
        fila0.item = objArray74;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        int int2 = fila0.frente;
        fila0.tras = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        int int3 = fila0.frente;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.tras = (byte) 0;
        java.lang.Object[] objArray11 = fila7.item;
        fila5.item = objArray11;
        int int13 = fila5.tras;
        fila5.tras = (short) 100;
        java.lang.Object obj16 = fila5.desenfileira();
        java.lang.Object[] objArray17 = fila5.item;
        java.lang.Object[] objArray18 = fila5.item;
        java.lang.Object obj19 = fila5.desenfileira();
        fila0.enfileira(obj19);
        java.lang.Object[] objArray21 = null;
        fila0.item = objArray21;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        int int8 = fila0.tras;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        boolean boolean11 = fila9.vazia();
        int int12 = fila9.tras;
        java.lang.Object[] objArray13 = fila9.item;
        fila9.imprime();
        boolean boolean15 = fila9.vazia();
        fila9.tras = (short) -1;
        fila9.tras = (short) 10;
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.frente;
        fila0.frente = (short) 0;
        fila0.tras = (short) 0;
        int int13 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        int int17 = fila0.tras;
        java.lang.Object obj18 = fila0.desenfileira();
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        int int21 = fila19.tras;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.frente;
        fila22.tras = (byte) 0;
        java.lang.Object[] objArray26 = fila22.item;
        fila19.enfileira((java.lang.Object) objArray26);
        fila0.enfileira((java.lang.Object) objArray26);
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        int int31 = fila29.tras;
        fila29.tras = 'a';
        java.lang.Object[] objArray34 = fila29.item;
        fila0.item = objArray34;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        java.lang.Object[] objArray10 = fila6.item;
        fila4.item = objArray10;
        int int12 = fila4.tras;
        fila4.tras = (short) 100;
        java.lang.Object obj15 = fila4.desenfileira();
        java.lang.Object[] objArray16 = fila4.item;
        java.lang.Object[] objArray17 = fila4.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        int int20 = fila18.tras;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.tras;
        fila21.frente = (short) 10;
        fila21.frente = (short) -1;
        boolean boolean27 = fila21.vazia();
        int int28 = fila21.frente;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.frente = '4';
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.frente;
        fila35.frente = '4';
        boolean boolean39 = fila35.vazia();
        java.lang.Object[] objArray40 = fila35.item;
        fila29.item = objArray40;
        fila21.item = objArray40;
        fila18.enfileira((java.lang.Object) objArray40);
        java.lang.Object[] objArray44 = fila18.item;
        fila4.item = objArray44;
        fila0.item = objArray44;
        java.lang.Object[] objArray47 = null;
        fila0.item = objArray47;
        fila0.frente = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.tras = (short) -1;
        int int11 = fila7.tras;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.frente = '4';
        boolean boolean16 = fila12.vazia();
        java.lang.Object[] objArray17 = fila12.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.frente = '4';
        boolean boolean22 = fila18.vazia();
        java.lang.Object[] objArray23 = fila18.item;
        fila12.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        fila12.enfileira((java.lang.Object) objArray39);
        fila7.item = objArray39;
        fila0.enfileira((java.lang.Object) objArray39);
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.frente;
        fila44.tras = (byte) 0;
        fila44.frente = 0;
        java.lang.Object[] objArray50 = fila44.item;
        fila0.enfileira((java.lang.Object) fila44);
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        java.lang.Object[] objArray8 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.frente;
        fila8.tras = (short) -1;
        int int12 = fila8.tras;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.frente = '4';
        boolean boolean17 = fila13.vazia();
        java.lang.Object[] objArray18 = fila13.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        fila13.item = objArray24;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.tras;
        fila26.frente = (short) 10;
        fila26.frente = (short) -1;
        boolean boolean32 = fila26.vazia();
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.tras;
        fila33.frente = (short) 10;
        fila33.frente = (short) -1;
        boolean boolean39 = fila33.vazia();
        java.lang.Object[] objArray40 = fila33.item;
        fila26.item = objArray40;
        fila13.enfileira((java.lang.Object) objArray40);
        fila8.item = objArray40;
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.frente;
        fila44.tras = (byte) 0;
        java.lang.Object[] objArray48 = fila44.item;
        fila8.item = objArray48;
        java.lang.Object[] objArray50 = null;
        fila8.item = objArray50;
        ds.Fila fila52 = new ds.Fila();
        int int53 = fila52.tras;
        fila52.frente = (short) 10;
        fila52.frente = (short) -1;
        boolean boolean58 = fila52.vazia();
        ds.Fila fila59 = new ds.Fila();
        int int60 = fila59.tras;
        fila59.frente = (short) 10;
        fila59.frente = (short) -1;
        boolean boolean65 = fila59.vazia();
        java.lang.Object[] objArray66 = fila59.item;
        fila52.item = objArray66;
        fila52.tras = 0;
        java.lang.Object[] objArray70 = fila52.item;
        fila8.item = objArray70;
        fila0.item = objArray70;
        int int73 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        fila0.frente = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        java.lang.Object[] objArray22 = fila15.item;
        fila8.item = objArray22;
        fila0.enfileira((java.lang.Object) fila8);
        int int25 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        boolean boolean6 = fila0.vazia();
        fila0.frente = 0;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.tras = (byte) 0;
        java.lang.Object[] objArray10 = fila6.item;
        int int11 = fila6.frente;
        java.lang.Object[] objArray12 = fila6.item;
        fila0.item = objArray12;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        java.lang.Object[] objArray11 = fila0.item;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        int int14 = fila12.tras;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.tras;
        fila15.frente = (short) 10;
        fila15.frente = (short) -1;
        boolean boolean21 = fila15.vazia();
        int int22 = fila15.frente;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.frente;
        fila23.frente = '4';
        boolean boolean27 = fila23.vazia();
        java.lang.Object[] objArray28 = fila23.item;
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.frente = '4';
        boolean boolean33 = fila29.vazia();
        java.lang.Object[] objArray34 = fila29.item;
        fila23.item = objArray34;
        fila15.item = objArray34;
        fila12.enfileira((java.lang.Object) objArray34);
        fila0.item = objArray34;
        java.lang.Object obj39 = fila0.desenfileira();
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.frente;
        fila40.tras = (short) -1;
        fila40.tras = 0;
        fila40.imprime();
        int int47 = fila40.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) int47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.frente;
        java.lang.Object[] objArray9 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (short) 0;
        int int7 = fila0.tras;
        fila0.tras = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        java.lang.Object[] objArray11 = fila6.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        ds.Fila fila20 = new ds.Fila();
        int int21 = fila20.tras;
        fila20.frente = (short) 10;
        fila20.frente = (short) -1;
        boolean boolean26 = fila20.vazia();
        java.lang.Object[] objArray27 = fila20.item;
        fila13.item = objArray27;
        fila0.enfileira((java.lang.Object) objArray27);
        java.lang.Object[] objArray30 = fila0.item;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.frente;
        fila31.frente = '4';
        boolean boolean35 = fila31.vazia();
        java.lang.Object[] objArray36 = fila31.item;
        int int37 = fila31.tras;
        fila31.frente = 2;
        fila0.enfileira((java.lang.Object) fila31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        java.lang.Object obj29 = fila0.desenfileira();
        fila0.tras = 11;
        java.lang.Object[] objArray32 = fila0.item;
        ds.Fila fila33 = new ds.Fila();
        int int34 = fila33.frente;
        int int35 = fila33.tras;
        fila33.tras = 'a';
        fila0.enfileira((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        int int10 = fila3.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.frente = '4';
        boolean boolean21 = fila17.vazia();
        java.lang.Object[] objArray22 = fila17.item;
        fila11.item = objArray22;
        fila3.item = objArray22;
        fila0.enfileira((java.lang.Object) objArray22);
        fila0.imprime();
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.tras;
        fila27.frente = (short) 10;
        fila27.frente = (short) -1;
        boolean boolean33 = fila27.vazia();
        java.lang.Object[] objArray34 = fila27.item;
        fila27.tras = (byte) 10;
        ds.Fila fila37 = new ds.Fila();
        fila27.enfileira((java.lang.Object) fila37);
        fila27.frente = 1;
        fila0.enfileira((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.tras = (short) -1;
        int int11 = fila7.tras;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.frente = '4';
        boolean boolean16 = fila12.vazia();
        java.lang.Object[] objArray17 = fila12.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.frente = '4';
        boolean boolean22 = fila18.vazia();
        java.lang.Object[] objArray23 = fila18.item;
        fila12.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        fila12.enfileira((java.lang.Object) objArray39);
        fila7.item = objArray39;
        fila0.enfileira((java.lang.Object) objArray39);
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.frente;
        fila44.tras = (byte) 0;
        fila44.frente = 0;
        java.lang.Object[] objArray50 = fila44.item;
        fila0.enfileira((java.lang.Object) fila44);
        int int52 = fila0.tras;
        ds.Fila fila53 = new ds.Fila();
        int int54 = fila53.frente;
        int int55 = fila53.tras;
        fila53.tras = (short) -1;
        fila53.frente = '4';
        fila0.enfileira((java.lang.Object) fila53);
        fila53.frente = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object[] objArray6 = fila0.item;
        java.lang.Object obj7 = fila0.desenfileira();
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) ' ');
        boolean boolean8 = fila0.vazia();
        fila0.tras = 53;
        java.lang.Object[] objArray11 = null;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.tras;
        fila17.frente = (short) 10;
        fila17.frente = (short) -1;
        boolean boolean23 = fila17.vazia();
        java.lang.Object[] objArray24 = fila17.item;
        fila13.item = objArray24;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.frente;
        boolean boolean28 = fila26.vazia();
        fila13.enfileira((java.lang.Object) boolean28);
        int int30 = fila13.tras;
        java.lang.Object obj31 = fila13.desenfileira();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.frente;
        int int34 = fila32.tras;
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.frente;
        fila35.tras = (byte) 0;
        java.lang.Object[] objArray39 = fila35.item;
        fila32.enfileira((java.lang.Object) objArray39);
        fila13.enfileira((java.lang.Object) objArray39);
        fila0.item = objArray39;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.tras;
        fila6.frente = (short) 10;
        fila6.frente = (short) -1;
        boolean boolean12 = fila6.vazia();
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        fila13.frente = (short) 10;
        fila13.frente = (short) -1;
        boolean boolean19 = fila13.vazia();
        java.lang.Object[] objArray20 = fila13.item;
        fila6.item = objArray20;
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.tras = (byte) 0;
        java.lang.Object[] objArray28 = fila24.item;
        fila22.item = objArray28;
        fila6.item = objArray28;
        fila0.item = objArray28;
        fila0.frente = (short) 100;
        fila0.frente = 97;
        int int36 = fila0.frente;
        fila0.frente = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.tras;
        fila7.frente = (short) 10;
        fila7.frente = (short) -1;
        boolean boolean13 = fila7.vazia();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        fila0.tras = 0;
        java.lang.Object[] objArray18 = fila0.item;
        fila0.tras = 'a';
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        fila3.item = objArray17;
        fila0.item = objArray17;
        int int20 = fila0.frente;
        int int21 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        fila12.frente = 0;
        java.lang.Object[] objArray18 = fila12.item;
        fila10.item = objArray18;
        java.lang.Class<?> wildcardClass20 = objArray18.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        java.lang.Object[] objArray10 = fila0.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Class<?> wildcardClass16 = fila11.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.frente = '4';
        boolean boolean22 = fila18.vazia();
        java.lang.Object[] objArray23 = fila18.item;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.frente = '4';
        boolean boolean28 = fila24.vazia();
        java.lang.Object[] objArray29 = fila24.item;
        fila18.item = objArray29;
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        fila31.frente = (short) 10;
        fila31.frente = (short) -1;
        boolean boolean37 = fila31.vazia();
        ds.Fila fila38 = new ds.Fila();
        int int39 = fila38.tras;
        fila38.frente = (short) 10;
        fila38.frente = (short) -1;
        boolean boolean44 = fila38.vazia();
        java.lang.Object[] objArray45 = fila38.item;
        fila31.item = objArray45;
        fila18.enfileira((java.lang.Object) objArray45);
        fila0.item = objArray45;
        fila0.frente = (byte) -1;
        fila0.tras = 10;
        int int53 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        java.lang.Object obj11 = fila0.desenfileira();
        boolean boolean12 = fila0.vazia();
        int int13 = fila0.tras;
        ds.Fila fila14 = new ds.Fila();
        int int15 = fila14.tras;
        fila14.frente = (short) 10;
        fila14.frente = (short) -1;
        boolean boolean20 = fila14.vazia();
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.tras = (short) -1;
        int int25 = fila21.tras;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.frente;
        fila26.frente = '4';
        boolean boolean30 = fila26.vazia();
        java.lang.Object[] objArray31 = fila26.item;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.frente;
        fila32.frente = '4';
        boolean boolean36 = fila32.vazia();
        java.lang.Object[] objArray37 = fila32.item;
        fila26.item = objArray37;
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 10;
        fila39.frente = (short) -1;
        boolean boolean45 = fila39.vazia();
        ds.Fila fila46 = new ds.Fila();
        int int47 = fila46.tras;
        fila46.frente = (short) 10;
        fila46.frente = (short) -1;
        boolean boolean52 = fila46.vazia();
        java.lang.Object[] objArray53 = fila46.item;
        fila39.item = objArray53;
        fila26.enfileira((java.lang.Object) objArray53);
        fila21.item = objArray53;
        fila14.enfileira((java.lang.Object) objArray53);
        ds.Fila fila58 = new ds.Fila();
        int int59 = fila58.frente;
        fila58.tras = (byte) 0;
        fila58.frente = 0;
        java.lang.Object[] objArray64 = fila58.item;
        fila14.enfileira((java.lang.Object) fila58);
        fila14.frente = 53;
        fila0.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray7 = null;
        fila3.item = objArray7;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        fila9.tras = (byte) 0;
        java.lang.Object[] objArray13 = fila9.item;
        int int14 = fila9.frente;
        java.lang.Object[] objArray15 = fila9.item;
        fila3.item = objArray15;
        fila0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.enfileira((java.lang.Object) "hi!");
        int int4 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.frente;
        fila3.frente = '4';
        boolean boolean7 = fila3.vazia();
        java.lang.Object[] objArray8 = fila3.item;
        ds.Fila fila9 = new ds.Fila();
        int int10 = fila9.frente;
        fila9.frente = '4';
        boolean boolean13 = fila9.vazia();
        java.lang.Object[] objArray14 = fila9.item;
        fila3.item = objArray14;
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.tras;
        fila16.frente = (short) 10;
        fila16.frente = (short) -1;
        boolean boolean22 = fila16.vazia();
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.tras;
        fila23.frente = (short) 10;
        fila23.frente = (short) -1;
        boolean boolean29 = fila23.vazia();
        java.lang.Object[] objArray30 = fila23.item;
        fila16.item = objArray30;
        fila3.enfileira((java.lang.Object) objArray30);
        fila0.item = objArray30;
        fila0.tras = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object[] objArray4 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        fila0.frente = 1;
        int int14 = fila0.tras;
        java.lang.Object obj15 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (byte) 0;
        fila12.frente = 0;
        java.lang.Object[] objArray18 = fila12.item;
        fila10.item = objArray18;
        java.lang.Object[] objArray20 = fila10.item;
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        java.lang.Object[] objArray23 = fila21.item;
        fila21.tras = (byte) 1;
        fila10.enfileira((java.lang.Object) (byte) 1);
        ds.Fila fila27 = new ds.Fila();
        int int28 = fila27.frente;
        fila27.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila31 = new ds.Fila();
        int int32 = fila31.tras;
        fila31.frente = (short) 10;
        fila31.frente = (short) -1;
        boolean boolean37 = fila31.vazia();
        java.lang.Object[] objArray38 = fila31.item;
        fila27.item = objArray38;
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.frente;
        boolean boolean42 = fila40.vazia();
        fila27.enfileira((java.lang.Object) boolean42);
        int int44 = fila27.tras;
        boolean boolean45 = fila27.vazia();
        boolean boolean46 = fila27.vazia();
        java.lang.Object[] objArray47 = fila27.item;
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.tras;
        fila48.frente = (short) 10;
        fila48.frente = (short) -1;
        boolean boolean54 = fila48.vazia();
        java.lang.Object[] objArray55 = fila48.item;
        fila27.item = objArray55;
        fila10.item = objArray55;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray7 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.tras;
        fila0.frente = 2;
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        java.lang.Object obj29 = fila0.desenfileira();
        fila0.tras = 'a';
        java.lang.Class<?> wildcardClass32 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        ds.Fila fila6 = new ds.Fila();
        int int7 = fila6.frente;
        fila6.frente = '4';
        boolean boolean10 = fila6.vazia();
        fila6.tras = (short) -1;
        fila6.frente = (short) 10;
        fila6.frente = '4';
        java.lang.Object[] objArray17 = fila6.item;
        fila0.enfileira((java.lang.Object) objArray17);
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila19.item = objArray30;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        ds.Fila fila39 = new ds.Fila();
        int int40 = fila39.tras;
        fila39.frente = (short) 10;
        fila39.frente = (short) -1;
        boolean boolean45 = fila39.vazia();
        java.lang.Object[] objArray46 = fila39.item;
        fila32.item = objArray46;
        fila19.enfileira((java.lang.Object) objArray46);
        fila0.enfileira((java.lang.Object) fila19);
        fila19.tras = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        java.lang.Object[] objArray4 = fila0.item;
        fila0.imprime();
        fila0.enfileira((java.lang.Object) ' ');
        boolean boolean8 = fila0.vazia();
        fila0.tras = 53;
        java.lang.Object[] objArray11 = null;
        fila0.item = objArray11;
        fila0.frente = (byte) -1;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        int int17 = fila15.tras;
        fila15.tras = 'a';
        fila15.frente = 'a';
        ds.Fila fila22 = new ds.Fila();
        int int23 = fila22.tras;
        fila22.frente = (short) 10;
        fila22.frente = (short) -1;
        java.lang.Object obj28 = null;
        fila22.enfileira(obj28);
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.frente;
        fila30.frente = '4';
        boolean boolean34 = fila30.vazia();
        fila30.tras = (short) -1;
        fila30.frente = (short) 10;
        fila30.frente = '4';
        java.lang.Object[] objArray41 = fila30.item;
        fila22.item = objArray41;
        fila15.enfileira((java.lang.Object) objArray41);
        java.lang.Class<?> wildcardClass44 = fila15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        fila0.frente = '4';
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.tras;
        fila11.frente = (short) 10;
        fila11.frente = (short) -1;
        boolean boolean17 = fila11.vazia();
        int int18 = fila11.frente;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        fila25.frente = '4';
        boolean boolean29 = fila25.vazia();
        java.lang.Object[] objArray30 = fila25.item;
        fila19.item = objArray30;
        fila11.item = objArray30;
        fila0.item = objArray30;
        boolean boolean34 = fila0.vazia();
        java.lang.Object[] objArray35 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        java.lang.Object[] objArray7 = fila0.item;
        fila0.tras = (byte) 10;
        ds.Fila fila10 = new ds.Fila();
        fila0.enfileira((java.lang.Object) fila10);
        ds.Fila fila12 = new ds.Fila();
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.tras;
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        fila15.tras = (byte) 0;
        java.lang.Object[] objArray19 = fila15.item;
        fila13.item = objArray19;
        int int21 = fila13.tras;
        fila13.tras = (short) 100;
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.tras = (byte) 0;
        boolean boolean28 = fila24.vazia();
        ds.Fila fila29 = new ds.Fila();
        int int30 = fila29.frente;
        fila29.frente = '4';
        fila24.enfileira((java.lang.Object) fila29);
        ds.Fila fila34 = new ds.Fila();
        int int35 = fila34.frente;
        fila34.frente = '4';
        boolean boolean38 = fila34.vazia();
        java.lang.Object[] objArray39 = fila34.item;
        fila24.item = objArray39;
        fila13.item = objArray39;
        java.lang.Object obj42 = fila13.desenfileira();
        fila13.tras = 'a';
        fila12.enfileira((java.lang.Object) 'a');
        fila12.frente = 97;
        fila12.tras = '4';
        boolean boolean50 = fila12.vazia();
        fila0.enfileira((java.lang.Object) boolean50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        fila0.enfileira((java.lang.Object) fila5);
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        int int17 = fila10.frente;
        int int18 = fila10.frente;
        fila0.enfileira((java.lang.Object) fila10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fila10.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.tras = (byte) 0;
        fila7.frente = (byte) 10;
        boolean boolean13 = fila7.vazia();
        fila7.frente = 100;
        fila7.tras = (short) 0;
        int int18 = fila7.tras;
        java.lang.Object[] objArray19 = fila7.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.frente = '4';
        boolean boolean9 = fila5.vazia();
        java.lang.Object[] objArray10 = fila5.item;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        fila5.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila5.enfileira((java.lang.Object) objArray32);
        fila0.item = objArray32;
        int int36 = fila0.tras;
        java.lang.Object[] objArray37 = null;
        fila0.item = objArray37;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.tras = (short) -1;
        int int11 = fila7.tras;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.frente = '4';
        boolean boolean16 = fila12.vazia();
        java.lang.Object[] objArray17 = fila12.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.frente;
        fila18.frente = '4';
        boolean boolean22 = fila18.vazia();
        java.lang.Object[] objArray23 = fila18.item;
        fila12.item = objArray23;
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.tras;
        fila32.frente = (short) 10;
        fila32.frente = (short) -1;
        boolean boolean38 = fila32.vazia();
        java.lang.Object[] objArray39 = fila32.item;
        fila25.item = objArray39;
        fila12.enfileira((java.lang.Object) objArray39);
        fila7.item = objArray39;
        fila0.enfileira((java.lang.Object) objArray39);
        ds.Fila fila44 = new ds.Fila();
        int int45 = fila44.frente;
        fila44.tras = (byte) 0;
        fila44.frente = 0;
        java.lang.Object[] objArray50 = fila44.item;
        fila0.enfileira((java.lang.Object) fila44);
        fila0.frente = 53;
        java.lang.Object[] objArray54 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Fila fila0 = new ds.Fila();
        fila0.imprime();
        java.lang.Object[] objArray2 = fila0.item;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.frente;
        fila5.tras = (byte) 0;
        java.lang.Object[] objArray9 = fila5.item;
        fila3.item = objArray9;
        int int11 = fila3.tras;
        fila3.tras = (short) 100;
        java.lang.Object obj14 = fila3.desenfileira();
        boolean boolean15 = fila3.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.tras = (short) -1;
        java.lang.Object obj21 = fila17.desenfileira();
        fila17.tras = (byte) -1;
        java.lang.Object obj24 = fila17.desenfileira();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.frente;
        java.lang.Object[] objArray27 = fila25.item;
        fila17.item = objArray27;
        fila0.enfileira((java.lang.Object) objArray27);
        fila0.frente = (short) 10;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        fila0.tras = (byte) -1;
        java.lang.Object[] objArray7 = fila0.item;
        int int8 = fila0.frente;
        fila0.frente = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        java.lang.Object[] objArray13 = fila0.item;
        fila0.tras = 97;
        java.lang.Object obj16 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (byte) 0;
        fila0.frente = (byte) 10;
        boolean boolean6 = fila0.vazia();
        fila0.frente = 100;
        fila0.tras = (short) 0;
        int int11 = fila0.tras;
        int int12 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        fila0.frente = (short) 10;
        fila0.frente = (short) -1;
        boolean boolean6 = fila0.vazia();
        int int7 = fila0.frente;
        fila0.frente = (short) 10;
        ds.Fila fila10 = new ds.Fila();
        int int11 = fila10.tras;
        fila10.frente = (short) 10;
        fila10.frente = (short) -1;
        boolean boolean16 = fila10.vazia();
        java.lang.Object[] objArray17 = fila10.item;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        ds.Fila fila25 = new ds.Fila();
        int int26 = fila25.tras;
        fila25.frente = (short) 10;
        fila25.frente = (short) -1;
        boolean boolean31 = fila25.vazia();
        java.lang.Object[] objArray32 = fila25.item;
        fila18.item = objArray32;
        fila10.enfileira((java.lang.Object) fila18);
        ds.Fila fila35 = new ds.Fila();
        int int36 = fila35.tras;
        fila35.frente = (short) 10;
        fila35.frente = (short) -1;
        boolean boolean41 = fila35.vazia();
        java.lang.Object[] objArray42 = fila35.item;
        fila35.tras = (byte) 10;
        ds.Fila fila45 = new ds.Fila();
        fila35.enfileira((java.lang.Object) fila45);
        fila35.frente = 1;
        boolean boolean49 = fila35.vazia();
        java.lang.Object[] objArray50 = fila35.item;
        fila10.item = objArray50;
        fila0.item = objArray50;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        int int9 = fila0.tras;
        int int10 = fila0.frente;
        int int11 = fila0.tras;
        java.lang.Object obj12 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        ds.Fila fila3 = new ds.Fila();
        int int4 = fila3.tras;
        fila3.frente = (short) 10;
        fila3.frente = (short) -1;
        boolean boolean9 = fila3.vazia();
        int int10 = fila3.frente;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.frente = '4';
        boolean boolean15 = fila11.vazia();
        java.lang.Object[] objArray16 = fila11.item;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.frente = '4';
        boolean boolean21 = fila17.vazia();
        java.lang.Object[] objArray22 = fila17.item;
        fila11.item = objArray22;
        fila3.item = objArray22;
        fila0.enfileira((java.lang.Object) objArray22);
        java.lang.Object[] objArray26 = fila0.item;
        boolean boolean27 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila4 = new ds.Fila();
        int int5 = fila4.tras;
        fila4.frente = (short) 10;
        fila4.frente = (short) -1;
        boolean boolean10 = fila4.vazia();
        java.lang.Object[] objArray11 = fila4.item;
        fila0.item = objArray11;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        boolean boolean15 = fila13.vazia();
        fila0.enfileira((java.lang.Object) boolean15);
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.tras = (short) -1;
        int int21 = fila17.tras;
        java.lang.Object obj22 = fila17.desenfileira();
        fila0.enfileira(obj22);
        java.lang.Object obj24 = fila0.desenfileira();
        int int25 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        fila0.tras = 0;
        fila0.imprime();
        int int7 = fila0.tras;
        ds.Fila fila8 = new ds.Fila();
        int int9 = fila8.tras;
        fila8.frente = (short) 10;
        fila8.frente = (short) -1;
        boolean boolean14 = fila8.vazia();
        ds.Fila fila15 = new ds.Fila();
        int int16 = fila15.frente;
        int int17 = fila15.tras;
        ds.Fila fila18 = new ds.Fila();
        int int19 = fila18.tras;
        fila18.frente = (short) 10;
        fila18.frente = (short) -1;
        boolean boolean24 = fila18.vazia();
        int int25 = fila18.frente;
        ds.Fila fila26 = new ds.Fila();
        int int27 = fila26.frente;
        fila26.frente = '4';
        boolean boolean30 = fila26.vazia();
        java.lang.Object[] objArray31 = fila26.item;
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.frente;
        fila32.frente = '4';
        boolean boolean36 = fila32.vazia();
        java.lang.Object[] objArray37 = fila32.item;
        fila26.item = objArray37;
        fila18.item = objArray37;
        fila15.enfileira((java.lang.Object) objArray37);
        java.lang.Object[] objArray41 = fila15.item;
        fila8.item = objArray41;
        fila0.item = objArray41;
        fila0.tras = (short) 1;
        boolean boolean46 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.tras;
        ds.Fila fila2 = new ds.Fila();
        int int3 = fila2.frente;
        fila2.tras = (byte) 0;
        java.lang.Object[] objArray6 = fila2.item;
        fila0.item = objArray6;
        int int8 = fila0.tras;
        fila0.tras = (short) 100;
        ds.Fila fila11 = new ds.Fila();
        int int12 = fila11.frente;
        fila11.tras = (byte) 0;
        boolean boolean15 = fila11.vazia();
        ds.Fila fila16 = new ds.Fila();
        int int17 = fila16.frente;
        fila16.frente = '4';
        fila11.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        int int22 = fila21.frente;
        fila21.frente = '4';
        boolean boolean25 = fila21.vazia();
        java.lang.Object[] objArray26 = fila21.item;
        fila11.item = objArray26;
        fila0.item = objArray26;
        java.lang.Object obj29 = fila0.desenfileira();
        fila0.tras = 'a';
        ds.Fila fila32 = new ds.Fila();
        int int33 = fila32.frente;
        fila32.tras = (byte) 0;
        fila32.frente = (byte) 10;
        boolean boolean38 = fila32.vazia();
        fila32.frente = 100;
        fila32.tras = (short) 0;
        fila0.enfileira((java.lang.Object) (short) 0);
        boolean boolean44 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        java.lang.Object obj6 = fila0.desenfileira();
        int int7 = fila0.tras;
        boolean boolean8 = fila0.vazia();
        java.lang.Object[] objArray9 = fila0.item;
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 10;
        java.lang.Object obj9 = fila0.desenfileira();
        fila0.frente = 0;
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.frente;
        fila12.tras = (short) -1;
        int int16 = fila12.tras;
        ds.Fila fila17 = new ds.Fila();
        int int18 = fila17.frente;
        fila17.frente = '4';
        boolean boolean21 = fila17.vazia();
        java.lang.Object[] objArray22 = fila17.item;
        ds.Fila fila23 = new ds.Fila();
        int int24 = fila23.frente;
        fila23.frente = '4';
        boolean boolean27 = fila23.vazia();
        java.lang.Object[] objArray28 = fila23.item;
        fila17.item = objArray28;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.tras;
        fila30.frente = (short) 10;
        fila30.frente = (short) -1;
        boolean boolean36 = fila30.vazia();
        ds.Fila fila37 = new ds.Fila();
        int int38 = fila37.tras;
        fila37.frente = (short) 10;
        fila37.frente = (short) -1;
        boolean boolean43 = fila37.vazia();
        java.lang.Object[] objArray44 = fila37.item;
        fila30.item = objArray44;
        fila17.enfileira((java.lang.Object) objArray44);
        fila12.item = objArray44;
        ds.Fila fila48 = new ds.Fila();
        int int49 = fila48.frente;
        fila48.tras = (byte) 0;
        java.lang.Object[] objArray52 = fila48.item;
        fila12.item = objArray52;
        java.lang.Object[] objArray54 = null;
        fila12.item = objArray54;
        ds.Fila fila56 = new ds.Fila();
        int int57 = fila56.tras;
        fila56.frente = (short) 10;
        fila56.frente = (short) -1;
        boolean boolean62 = fila56.vazia();
        ds.Fila fila63 = new ds.Fila();
        int int64 = fila63.tras;
        fila63.frente = (short) 10;
        fila63.frente = (short) -1;
        boolean boolean69 = fila63.vazia();
        java.lang.Object[] objArray70 = fila63.item;
        fila56.item = objArray70;
        fila56.tras = 0;
        java.lang.Object[] objArray74 = fila56.item;
        fila12.item = objArray74;
        fila0.item = objArray74;
        ds.Fila fila77 = new ds.Fila();
        int int78 = fila77.frente;
        fila77.frente = '4';
        int int81 = fila77.tras;
        int int82 = fila77.frente;
        java.lang.Object[] objArray83 = fila77.item;
        fila0.item = objArray83;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 52 + "'", int82 == 52);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        java.lang.Object obj4 = fila0.desenfileira();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        int int12 = fila5.frente;
        ds.Fila fila13 = new ds.Fila();
        int int14 = fila13.frente;
        fila13.frente = '4';
        boolean boolean17 = fila13.vazia();
        java.lang.Object[] objArray18 = fila13.item;
        ds.Fila fila19 = new ds.Fila();
        int int20 = fila19.frente;
        fila19.frente = '4';
        boolean boolean23 = fila19.vazia();
        java.lang.Object[] objArray24 = fila19.item;
        fila13.item = objArray24;
        fila5.item = objArray24;
        fila0.item = objArray24;
        ds.Fila fila28 = new ds.Fila();
        int int29 = fila28.frente;
        fila28.frente = '4';
        boolean boolean32 = fila28.vazia();
        fila28.tras = (short) -1;
        java.lang.Object obj35 = fila28.desenfileira();
        ds.Fila fila36 = new ds.Fila();
        int int37 = fila36.frente;
        fila36.enfileira((java.lang.Object) (byte) 0);
        ds.Fila fila40 = new ds.Fila();
        int int41 = fila40.tras;
        fila40.frente = (short) 10;
        fila40.frente = (short) -1;
        boolean boolean46 = fila40.vazia();
        java.lang.Object[] objArray47 = fila40.item;
        fila36.item = objArray47;
        fila28.item = objArray47;
        java.lang.Object[] objArray50 = fila28.item;
        fila0.item = objArray50;
        int int52 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.tras = (short) -1;
        int int4 = fila0.tras;
        boolean boolean5 = fila0.vazia();
        fila0.frente = '4';
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        int int2 = fila0.tras;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        java.lang.Object obj6 = fila0.desenfileira();
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.frente = '4';
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        int int6 = fila5.tras;
        fila5.frente = (short) 10;
        fila5.frente = (short) -1;
        boolean boolean11 = fila5.vazia();
        ds.Fila fila12 = new ds.Fila();
        int int13 = fila12.tras;
        fila12.frente = (short) 10;
        fila12.frente = (short) -1;
        boolean boolean18 = fila12.vazia();
        java.lang.Object[] objArray19 = fila12.item;
        fila5.item = objArray19;
        fila5.tras = 0;
        fila0.enfileira((java.lang.Object) 0);
        ds.Fila fila24 = new ds.Fila();
        int int25 = fila24.frente;
        fila24.tras = (byte) 0;
        boolean boolean28 = fila24.vazia();
        java.lang.Object[] objArray29 = fila24.item;
        ds.Fila fila30 = new ds.Fila();
        int int31 = fila30.frente;
        fila30.tras = (byte) 0;
        java.lang.Object[] objArray34 = fila30.item;
        int int35 = fila30.frente;
        java.lang.Object[] objArray36 = fila30.item;
        fila24.item = objArray36;
        fila0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        java.lang.Object obj2 = null;
        fila0.enfileira(obj2);
        java.lang.Object[] objArray4 = fila0.item;
        boolean boolean5 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Fila fila0 = new ds.Fila();
        int int1 = fila0.frente;
        fila0.enfileira((java.lang.Object) (byte) 0);
        fila0.frente = (short) 10;
        java.lang.Object obj6 = fila0.desenfileira();
        ds.Fila fila7 = new ds.Fila();
        int int8 = fila7.frente;
        fila7.frente = '4';
        boolean boolean11 = fila7.vazia();
        java.lang.Object[] objArray12 = fila7.item;
        java.lang.Object obj13 = fila7.desenfileira();
        java.lang.Object[] objArray14 = fila7.item;
        fila0.item = objArray14;
        java.lang.Object[] objArray16 = fila0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
    }
}

