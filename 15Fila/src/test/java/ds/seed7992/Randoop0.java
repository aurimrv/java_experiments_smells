package ds.seed7992;

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
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        int int9 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        boolean boolean3 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        int int4 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        // The following exception was thrown during execution in test generation
        try {
            fila4.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fila4.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.imprime();
        java.lang.Class<?> wildcardClass4 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.enfileira((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass9 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = (byte) 10;
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.tras;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        java.lang.Class<?> wildcardClass15 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        java.lang.Object obj9 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '#' + "'", obj9, '#');
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        fila0.frente = (short) -1;
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.tras = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        java.lang.Class<?> wildcardClass15 = objArray13.getClass();
        fila0.enfileira((java.lang.Object) objArray13);
        java.lang.Object obj17 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        int int8 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        fila0.frente = (short) -1;
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = 1;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila5.tras = '#';
        fila5.enfileira((java.lang.Object) (short) 1);
        fila0.enfileira((java.lang.Object) (short) 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.frente = (short) -1;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila9.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = (short) -1;
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila14.vazia();
        fila14.tras = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila14.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = '#';
        fila7.tras = '#';
        int int12 = fila7.frente;
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        fila13.item = objArray17;
        fila7.item = objArray17;
        fila0.item = objArray17;
        java.lang.Class<?> wildcardClass21 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        fila0.tras = 10;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = (byte) 0;
        int int14 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        fila0.frente = (short) -1;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (short) 100;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        fila0.frente = '#';
        int int38 = fila0.tras;
        java.lang.Class<?> wildcardClass39 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        fila0.imprime();
        int int4 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        fila8.tras = '#';
        int int13 = fila8.frente;
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila14.item = objArray18;
        fila8.item = objArray18;
        fila0.item = objArray18;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        fila0.tras = 10;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = (byte) 0;
        fila0.frente = 'a';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, false, 10]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        java.lang.Object[] objArray19 = fila0.item;
        fila0.frente = 0;
        fila0.imprime();
        boolean boolean23 = fila0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.frente = (short) -1;
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        java.lang.Object[] objArray11 = fila8.item;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        int int15 = fila12.frente;
        int int16 = fila12.frente;
        fila12.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = ' ';
        fila18.frente = 1;
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila12, 1, (byte) -1, '4' };
        fila8.item = objArray25;
        fila0.item = objArray25;
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.imprime();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        fila0.frente = (byte) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Class<?> wildcardClass3 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila9.item;
        int int15 = fila9.frente;
        java.lang.Class<?> wildcardClass16 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        fila8.tras = (byte) 1;
        fila8.tras = 10;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        fila8.frente = 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fila8.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, false, 10]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        java.lang.Object obj4 = null;
        fila0.enfileira(obj4);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        int int3 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        fila0.frente = '#';
        int int38 = fila0.tras;
        int int39 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        boolean boolean4 = fila0.vazia();
        java.lang.Class<?> wildcardClass5 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        java.lang.Object[] objArray13 = fila0.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.frente = '#';
        fila14.tras = '#';
        int int19 = fila14.frente;
        java.lang.Object obj20 = null;
        fila14.enfileira(obj20);
        ds.Fila fila22 = new ds.Fila();
        fila22.frente = '#';
        fila22.tras = '#';
        int int27 = fila22.frente;
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.frente = (-1);
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        fila28.item = objArray32;
        fila22.item = objArray32;
        fila14.item = objArray32;
        fila0.item = objArray32;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.tras;
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = '#';
        fila7.tras = '#';
        int int12 = fila7.frente;
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = (-1);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        fila13.item = objArray17;
        fila7.item = objArray17;
        fila0.item = objArray17;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        java.lang.Class<?> wildcardClass6 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila9.item;
        int int15 = fila9.frente;
        java.lang.Object obj16 = fila9.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        int int4 = fila0.tras;
        int int5 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 10;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        java.lang.Object[] objArray8 = fila4.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        fila4.enfileira((java.lang.Object) '#');
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = (-1);
        int int17 = fila13.frente;
        fila4.enfileira((java.lang.Object) fila13);
        int int19 = fila13.frente;
        java.lang.Object[] objArray20 = fila13.item;
        fila0.item = objArray20;
        fila0.frente = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = null;
        fila9.item = objArray16;
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        int int20 = fila18.frente;
        int int21 = fila18.frente;
        ds.Fila fila22 = new ds.Fila();
        boolean boolean23 = fila22.vazia();
        fila22.frente = (-1);
        fila18.enfileira((java.lang.Object) fila22);
        ds.Fila fila27 = new ds.Fila();
        fila27.frente = '#';
        java.lang.Object[] objArray30 = fila27.item;
        fila18.enfileira((java.lang.Object) fila27);
        java.lang.Object[] objArray32 = fila27.item;
        int int33 = fila27.frente;
        // The following exception was thrown during execution in test generation
        try {
            fila9.enfileira((java.lang.Object) int33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.frente = 0;
        fila0.tras = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Class<?> wildcardClass17 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.frente = (-1);
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = '#';
        java.lang.Object[] objArray19 = fila16.item;
        fila7.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        int int22 = fila16.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila0.desenfileira();
        fila0.imprime();
        java.lang.Object[] objArray17 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.frente = (short) -1;
        boolean boolean8 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        fila0.tras = 10;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = (byte) 0;
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        fila0.frente = '#';
        int int38 = fila0.tras;
        int int39 = fila0.frente;
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        fila40.tras = 10;
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        int int46 = fila44.frente;
        int int47 = fila44.frente;
        java.lang.Object[] objArray48 = fila44.item;
        ds.Fila fila49 = new ds.Fila();
        fila49.frente = '#';
        fila44.enfileira((java.lang.Object) '#');
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        fila53.frente = (-1);
        int int57 = fila53.frente;
        fila44.enfileira((java.lang.Object) fila53);
        int int59 = fila53.frente;
        java.lang.Object[] objArray60 = fila53.item;
        fila40.item = objArray60;
        fila0.item = objArray60;
        java.lang.Class<?> wildcardClass63 = objArray60.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        fila0.frente = '#';
        int int38 = fila0.tras;
        int int39 = fila0.frente;
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        fila40.tras = 10;
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        int int46 = fila44.frente;
        int int47 = fila44.frente;
        java.lang.Object[] objArray48 = fila44.item;
        ds.Fila fila49 = new ds.Fila();
        fila49.frente = '#';
        fila44.enfileira((java.lang.Object) '#');
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        fila53.frente = (-1);
        int int57 = fila53.frente;
        fila44.enfileira((java.lang.Object) fila53);
        int int59 = fila53.frente;
        java.lang.Object[] objArray60 = fila53.item;
        fila40.item = objArray60;
        fila0.item = objArray60;
        fila0.frente = (byte) 100;
        boolean boolean65 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        ds.Fila fila3 = new ds.Fila();
        fila3.frente = '#';
        java.lang.Object[] objArray6 = fila3.item;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        int int11 = fila7.frente;
        fila7.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = ' ';
        fila13.frente = 1;
        java.lang.Object[] objArray20 = new java.lang.Object[] { fila7, 1, (byte) -1, '4' };
        fila3.item = objArray20;
        fila0.item = objArray20;
        ds.Fila fila23 = new ds.Fila();
        fila23.tras = ' ';
        ds.Fila fila26 = new ds.Fila();
        fila26.frente = '#';
        java.lang.Object[] objArray29 = fila26.item;
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        int int32 = fila30.frente;
        int int33 = fila30.frente;
        int int34 = fila30.frente;
        fila30.imprime();
        ds.Fila fila36 = new ds.Fila();
        fila36.tras = ' ';
        fila36.frente = 1;
        java.lang.Object[] objArray43 = new java.lang.Object[] { fila30, 1, (byte) -1, '4' };
        fila26.item = objArray43;
        fila23.item = objArray43;
        fila0.item = objArray43;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        ds.Fila fila3 = new ds.Fila();
        fila3.frente = '#';
        java.lang.Object[] objArray6 = fila3.item;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        int int11 = fila7.frente;
        fila7.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = ' ';
        fila13.frente = 1;
        java.lang.Object[] objArray20 = new java.lang.Object[] { fila7, 1, (byte) -1, '4' };
        fila3.item = objArray20;
        fila0.item = objArray20;
        int int23 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.frente = (-1);
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = '#';
        java.lang.Object[] objArray19 = fila16.item;
        fila7.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        int int22 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36 + "'", int22 == 36);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.frente = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        int int4 = fila0.tras;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila5.tras = '#';
        int int10 = fila5.frente;
        int int11 = fila5.tras;
        fila5.tras = (byte) 0;
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = 1;
        fila5.enfileira((java.lang.Object) 1);
        ds.Fila fila20 = new ds.Fila();
        java.lang.Object[] objArray21 = fila20.item;
        fila5.item = objArray21;
        fila0.item = objArray21;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.tras = 35;
        fila4.tras = (short) 0;
        fila4.frente = (short) -1;
        ds.Fila fila12 = new ds.Fila();
        fila12.frente = '#';
        java.lang.Object[] objArray15 = fila12.item;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        int int18 = fila16.frente;
        int int19 = fila16.frente;
        int int20 = fila16.frente;
        fila16.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.tras = ' ';
        fila22.frente = 1;
        java.lang.Object[] objArray29 = new java.lang.Object[] { fila16, 1, (byte) -1, '4' };
        fila12.item = objArray29;
        fila4.item = objArray29;
        int int32 = fila4.tras;
        fila0.enfileira((java.lang.Object) fila4);
        java.lang.Class<?> wildcardClass34 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        fila0.imprime();
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.frente = 0;
        java.lang.Class<?> wildcardClass8 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = 1;
        java.lang.Object obj5 = fila0.desenfileira();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        int int9 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        fila0.enfileira((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.enfileira((java.lang.Object) 1.0f);
        boolean boolean9 = fila0.vazia();
        fila0.tras = 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila9.item;
        int int15 = fila9.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        fila0.tras = 10;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = (byte) 0;
        java.lang.Object obj14 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1) + "'", obj14, (-1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.imprime();
        java.lang.Object obj10 = null;
        fila0.enfileira(obj10);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        fila0.frente = '#';
        int int38 = fila0.tras;
        int int39 = fila0.frente;
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        fila40.tras = 10;
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        int int46 = fila44.frente;
        int int47 = fila44.frente;
        java.lang.Object[] objArray48 = fila44.item;
        ds.Fila fila49 = new ds.Fila();
        fila49.frente = '#';
        fila44.enfileira((java.lang.Object) '#');
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        fila53.frente = (-1);
        int int57 = fila53.frente;
        fila44.enfileira((java.lang.Object) fila53);
        int int59 = fila53.frente;
        java.lang.Object[] objArray60 = fila53.item;
        fila40.item = objArray60;
        fila0.item = objArray60;
        int int63 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        int int4 = fila0.frente;
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        fila0.frente = '#';
        int int38 = fila0.tras;
        fila0.tras = 2;
        java.lang.Class<?> wildcardClass41 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        fila8.tras = (byte) 1;
        fila8.tras = 10;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        fila8.frente = 100;
        int int23 = fila8.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila8.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        java.lang.Class<?> wildcardClass15 = objArray13.getClass();
        fila0.enfileira((java.lang.Object) objArray13);
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        int int19 = fila17.frente;
        int int20 = fila17.frente;
        int int21 = fila17.frente;
        fila17.imprime();
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.tras = 35;
        fila23.tras = (short) 0;
        fila23.frente = (short) -1;
        ds.Fila fila31 = new ds.Fila();
        fila31.frente = '#';
        java.lang.Object[] objArray34 = fila31.item;
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        int int37 = fila35.frente;
        int int38 = fila35.frente;
        int int39 = fila35.frente;
        fila35.imprime();
        ds.Fila fila41 = new ds.Fila();
        fila41.tras = ' ';
        fila41.frente = 1;
        java.lang.Object[] objArray48 = new java.lang.Object[] { fila35, 1, (byte) -1, '4' };
        fila31.item = objArray48;
        fila23.item = objArray48;
        fila17.item = objArray48;
        fila0.item = objArray48;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        int int4 = fila0.frente;
        fila0.frente = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.frente = (-1);
        fila7.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { fila11, (-1.0d), (byte) -1, (-1.0f) };
        fila0.item = objArray19;
        java.lang.Class<?> wildcardClass21 = objArray19.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        int int8 = fila6.frente;
        int int9 = fila6.frente;
        int int10 = fila6.frente;
        fila6.imprime();
        int int12 = fila6.tras;
        fila0.enfileira((java.lang.Object) int12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = null;
        fila9.item = objArray16;
        int int18 = fila9.tras;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.frente = (-1);
        fila19.enfileira((java.lang.Object) (byte) 100);
        int int25 = fila19.frente;
        boolean boolean26 = fila19.vazia();
        fila19.tras = '4';
        java.lang.Object[] objArray29 = fila19.item;
        // The following exception was thrown during execution in test generation
        try {
            fila9.enfileira((java.lang.Object) objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        boolean boolean16 = fila9.vazia();
        fila9.frente = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.enfileira((java.lang.Object) 1.0f);
        boolean boolean9 = fila0.vazia();
        fila0.tras = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = (short) -1;
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila14.vazia();
        fila14.tras = (byte) 0;
        fila14.frente = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        java.lang.Object[] objArray8 = fila4.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        fila4.enfileira((java.lang.Object) '#');
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = (-1);
        int int17 = fila13.frente;
        fila4.enfileira((java.lang.Object) fila13);
        int int19 = fila13.frente;
        java.lang.Object[] objArray20 = fila13.item;
        fila0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        fila0.imprime();
        int int7 = fila0.frente;
        fila0.tras = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        fila8.tras = (byte) 1;
        fila8.tras = 10;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        fila8.frente = 100;
        int int23 = fila8.tras;
        int int24 = fila8.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.tras = 35;
        fila7.tras = (short) 0;
        fila7.frente = (short) -1;
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        fila7.item = objArray32;
        fila0.item = objArray32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        java.lang.Object[] objArray24 = fila20.item;
        ds.Fila fila25 = new ds.Fila();
        fila25.frente = '#';
        fila20.enfileira((java.lang.Object) '#');
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.frente = (-1);
        int int33 = fila29.frente;
        fila20.enfileira((java.lang.Object) fila29);
        int int35 = fila29.frente;
        java.lang.Object[] objArray36 = fila29.item;
        fila0.item = objArray36;
        java.lang.Object[] objArray38 = fila0.item;
        java.lang.Class<?> wildcardClass39 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        java.lang.Class<?> wildcardClass15 = objArray13.getClass();
        fila0.enfileira((java.lang.Object) objArray13);
        ds.Fila fila17 = new ds.Fila();
        fila17.frente = '#';
        fila17.tras = '#';
        int int22 = fila17.frente;
        fila17.imprime();
        fila0.enfileira((java.lang.Object) fila17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.tras = 35;
        fila4.tras = (short) 0;
        fila4.frente = (short) -1;
        ds.Fila fila12 = new ds.Fila();
        fila12.frente = '#';
        java.lang.Object[] objArray15 = fila12.item;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        int int18 = fila16.frente;
        int int19 = fila16.frente;
        int int20 = fila16.frente;
        fila16.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.tras = ' ';
        fila22.frente = 1;
        java.lang.Object[] objArray29 = new java.lang.Object[] { fila16, 1, (byte) -1, '4' };
        fila12.item = objArray29;
        fila4.item = objArray29;
        int int32 = fila4.tras;
        fila0.enfileira((java.lang.Object) fila4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = fila4.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.frente = 0;
        fila0.tras = 'a';
        fila0.frente = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Class<?> wildcardClass14 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = (short) -1;
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila14.vazia();
        fila14.tras = (byte) 0;
        fila14.enfileira((java.lang.Object) "hi!");
        java.lang.Object[] objArray25 = fila14.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        fila0.imprime();
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila5.item = objArray10;
        fila0.item = objArray10;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, false, 10]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        fila0.frente = '#';
        fila0.tras = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.frente = (short) -1;
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        java.lang.Object[] objArray11 = fila8.item;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        int int15 = fila12.frente;
        int int16 = fila12.frente;
        fila12.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = ' ';
        fila18.frente = 1;
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila12, 1, (byte) -1, '4' };
        fila8.item = objArray25;
        fila0.item = objArray25;
        boolean boolean28 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        fila0.frente = (short) 10;
        boolean boolean21 = fila0.vazia();
        java.lang.Object[] objArray22 = fila0.item;
        int int23 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.frente = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        java.lang.Object[] objArray8 = fila4.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        fila4.enfileira((java.lang.Object) '#');
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = (-1);
        int int17 = fila13.frente;
        fila4.enfileira((java.lang.Object) fila13);
        int int19 = fila13.frente;
        java.lang.Object[] objArray20 = fila13.item;
        fila0.item = objArray20;
        boolean boolean22 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object[] objArray3 = fila0.item;
        boolean boolean4 = fila0.vazia();
        java.lang.Object[] objArray5 = fila0.item;
        int int6 = fila0.frente;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        fila0.tras = 0;
        java.lang.Class<?> wildcardClass10 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A fila esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = (short) -1;
        fila9.enfileira((java.lang.Object) fila14);
        boolean boolean20 = fila14.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = fila14.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila9.item;
        java.lang.Object obj15 = fila9.desenfileira();
        java.lang.Object obj16 = fila9.desenfileira();
        int int17 = fila9.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila0.desenfileira();
        int int16 = fila0.tras;
        java.lang.Object[] objArray17 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        fila0.tras = 10;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = (byte) 0;
        fila0.frente = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, false, 10]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.tras = (byte) 0;
        ds.Fila fila9 = new ds.Fila();
        fila9.tras = ' ';
        fila9.frente = 1;
        fila0.enfileira((java.lang.Object) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.item = objArray16;
        fila0.frente = (short) -1;
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        fila20.tras = 35;
        fila20.tras = (short) 0;
        fila20.frente = (short) -1;
        ds.Fila fila28 = new ds.Fila();
        fila28.frente = '#';
        java.lang.Object[] objArray31 = fila28.item;
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        int int34 = fila32.frente;
        int int35 = fila32.frente;
        int int36 = fila32.frente;
        fila32.imprime();
        ds.Fila fila38 = new ds.Fila();
        fila38.tras = ' ';
        fila38.frente = 1;
        java.lang.Object[] objArray45 = new java.lang.Object[] { fila32, 1, (byte) -1, '4' };
        fila28.item = objArray45;
        fila20.item = objArray45;
        fila0.enfileira((java.lang.Object) fila20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = fila9.item;
        int int17 = fila9.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        fila0.tras = 52;
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.frente;
        int int16 = fila13.frente;
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.frente = (-1);
        fila13.enfileira((java.lang.Object) fila17);
        ds.Fila fila22 = new ds.Fila();
        fila22.frente = '#';
        java.lang.Object[] objArray25 = fila22.item;
        fila13.enfileira((java.lang.Object) fila22);
        ds.Fila fila27 = new ds.Fila();
        fila27.tras = ' ';
        fila27.frente = (short) -1;
        fila22.enfileira((java.lang.Object) fila27);
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        int int35 = fila33.frente;
        int int36 = fila33.frente;
        java.lang.Object[] objArray37 = fila33.item;
        ds.Fila fila38 = new ds.Fila();
        fila38.frente = '#';
        fila33.enfileira((java.lang.Object) '#');
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        fila42.frente = (-1);
        int int46 = fila42.frente;
        fila33.enfileira((java.lang.Object) fila42);
        int int48 = fila42.frente;
        java.lang.Object[] objArray49 = fila42.item;
        fila27.item = objArray49;
        fila0.enfileira((java.lang.Object) fila27);
        fila0.tras = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        java.lang.Object[] objArray24 = fila20.item;
        ds.Fila fila25 = new ds.Fila();
        fila25.frente = '#';
        fila20.enfileira((java.lang.Object) '#');
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.frente = (-1);
        int int33 = fila29.frente;
        fila20.enfileira((java.lang.Object) fila29);
        int int35 = fila29.frente;
        java.lang.Object[] objArray36 = fila29.item;
        fila0.item = objArray36;
        java.lang.Class<?> wildcardClass38 = fila0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.frente = (short) -1;
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        java.lang.Object[] objArray11 = fila8.item;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        int int15 = fila12.frente;
        int int16 = fila12.frente;
        fila12.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = ' ';
        fila18.frente = 1;
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila12, 1, (byte) -1, '4' };
        fila8.item = objArray25;
        fila0.item = objArray25;
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.tras = 35;
        fila4.tras = (short) 0;
        fila4.frente = (short) -1;
        ds.Fila fila12 = new ds.Fila();
        fila12.frente = '#';
        java.lang.Object[] objArray15 = fila12.item;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        int int18 = fila16.frente;
        int int19 = fila16.frente;
        int int20 = fila16.frente;
        fila16.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.tras = ' ';
        fila22.frente = 1;
        java.lang.Object[] objArray29 = new java.lang.Object[] { fila16, 1, (byte) -1, '4' };
        fila12.item = objArray29;
        fila4.item = objArray29;
        int int32 = fila4.tras;
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila34 = new ds.Fila();
        fila34.frente = '#';
        fila34.tras = '#';
        int int39 = fila34.frente;
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        fila40.frente = (-1);
        java.lang.Object[] objArray44 = new java.lang.Object[] {};
        fila40.item = objArray44;
        fila34.item = objArray44;
        fila34.tras = '4';
        ds.Fila fila49 = new ds.Fila();
        fila49.frente = '#';
        java.lang.Object[] objArray52 = fila49.item;
        ds.Fila fila53 = new ds.Fila();
        boolean boolean54 = fila53.vazia();
        int int55 = fila53.frente;
        int int56 = fila53.frente;
        int int57 = fila53.frente;
        fila53.imprime();
        ds.Fila fila59 = new ds.Fila();
        fila59.tras = ' ';
        fila59.frente = 1;
        java.lang.Object[] objArray66 = new java.lang.Object[] { fila53, 1, (byte) -1, '4' };
        fila49.item = objArray66;
        java.lang.Object[] objArray68 = fila49.item;
        fila34.item = objArray68;
        fila4.item = objArray68;
        java.lang.Object[] objArray71 = fila4.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (short) 100;
        int int10 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = null;
        fila9.item = objArray16;
        int int18 = fila9.tras;
        boolean boolean19 = fila9.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.frente = (short) -1;
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        java.lang.Object[] objArray11 = fila8.item;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        int int15 = fila12.frente;
        int int16 = fila12.frente;
        fila12.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = ' ';
        fila18.frente = 1;
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila12, 1, (byte) -1, '4' };
        fila8.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.tras = 35;
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        int int35 = fila33.frente;
        int int36 = fila33.frente;
        java.lang.Object[] objArray37 = fila33.item;
        ds.Fila fila38 = new ds.Fila();
        fila38.frente = '#';
        fila33.enfileira((java.lang.Object) '#');
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        fila42.frente = (-1);
        int int46 = fila42.frente;
        fila33.enfileira((java.lang.Object) fila42);
        int int48 = fila42.frente;
        java.lang.Object[] objArray49 = fila42.item;
        fila29.item = objArray49;
        fila0.item = objArray49;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (short) 100;
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        int int11 = fila9.frente;
        int int12 = fila9.frente;
        java.lang.Object[] objArray13 = null;
        fila9.item = objArray13;
        java.lang.Class<?> wildcardClass15 = fila9.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        int int8 = fila6.frente;
        int int9 = fila6.frente;
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.frente = (-1);
        fila6.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        fila6.enfileira((java.lang.Object) fila15);
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.frente = (-1);
        fila20.enfileira((java.lang.Object) fila24);
        ds.Fila fila29 = new ds.Fila();
        fila29.frente = '#';
        java.lang.Object[] objArray32 = fila29.item;
        fila20.enfileira((java.lang.Object) fila29);
        java.lang.Object[] objArray34 = fila29.item;
        fila6.item = objArray34;
        boolean boolean36 = fila6.vazia();
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        int int39 = fila37.frente;
        int int40 = fila37.frente;
        ds.Fila fila41 = new ds.Fila();
        boolean boolean42 = fila41.vazia();
        fila41.frente = (-1);
        fila37.enfileira((java.lang.Object) fila41);
        ds.Fila fila46 = new ds.Fila();
        fila46.frente = '#';
        java.lang.Object[] objArray49 = fila46.item;
        fila37.enfileira((java.lang.Object) fila46);
        ds.Fila fila51 = new ds.Fila();
        boolean boolean52 = fila51.vazia();
        int int53 = fila51.frente;
        int int54 = fila51.frente;
        ds.Fila fila55 = new ds.Fila();
        boolean boolean56 = fila55.vazia();
        fila55.frente = (-1);
        fila51.enfileira((java.lang.Object) fila55);
        ds.Fila fila60 = new ds.Fila();
        fila60.frente = '#';
        java.lang.Object[] objArray63 = fila60.item;
        fila51.enfileira((java.lang.Object) fila60);
        java.lang.Object[] objArray65 = fila60.item;
        fila37.item = objArray65;
        fila6.item = objArray65;
        boolean boolean68 = fila6.vazia();
        fila0.enfileira((java.lang.Object) boolean68);
        fila0.tras = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        int int6 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = fila9.item;
        fila9.tras = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        ds.Fila fila3 = new ds.Fila();
        fila3.frente = '#';
        java.lang.Object[] objArray6 = fila3.item;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        int int11 = fila7.frente;
        fila7.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = ' ';
        fila13.frente = 1;
        java.lang.Object[] objArray20 = new java.lang.Object[] { fila7, 1, (byte) -1, '4' };
        fila3.item = objArray20;
        fila0.item = objArray20;
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.frente = (-1);
        fila23.enfileira((java.lang.Object) (byte) 100);
        int int29 = fila23.tras;
        fila23.frente = 35;
        java.lang.Object[] objArray32 = fila23.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) objArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.frente = (short) -1;
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        java.lang.Object[] objArray11 = fila8.item;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        int int15 = fila12.frente;
        int int16 = fila12.frente;
        fila12.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = ' ';
        fila18.frente = 1;
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila12, 1, (byte) -1, '4' };
        fila8.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        int int4 = fila0.tras;
        java.lang.Object obj5 = fila0.desenfileira();
        java.lang.Object obj6 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        java.lang.Object[] objArray8 = fila4.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        fila4.enfileira((java.lang.Object) '#');
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = (-1);
        int int17 = fila13.frente;
        fila4.enfileira((java.lang.Object) fila13);
        int int19 = fila13.frente;
        java.lang.Object[] objArray20 = fila13.item;
        fila0.item = objArray20;
        java.lang.Object[] objArray22 = fila0.item;
        fila0.frente = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.tras = 35;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.tras = 35;
        fila8.tras = (short) 0;
        fila8.frente = (short) -1;
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = '#';
        java.lang.Object[] objArray19 = fila16.item;
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        int int24 = fila20.frente;
        fila20.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.tras = ' ';
        fila26.frente = 1;
        java.lang.Object[] objArray33 = new java.lang.Object[] { fila20, 1, (byte) -1, '4' };
        fila16.item = objArray33;
        fila8.item = objArray33;
        int int36 = fila8.tras;
        fila4.enfileira((java.lang.Object) fila8);
        ds.Fila fila38 = new ds.Fila();
        fila38.frente = '#';
        fila38.tras = '#';
        int int43 = fila38.frente;
        ds.Fila fila44 = new ds.Fila();
        boolean boolean45 = fila44.vazia();
        fila44.frente = (-1);
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        fila44.item = objArray48;
        fila38.item = objArray48;
        fila38.tras = '4';
        ds.Fila fila53 = new ds.Fila();
        fila53.frente = '#';
        java.lang.Object[] objArray56 = fila53.item;
        ds.Fila fila57 = new ds.Fila();
        boolean boolean58 = fila57.vazia();
        int int59 = fila57.frente;
        int int60 = fila57.frente;
        int int61 = fila57.frente;
        fila57.imprime();
        ds.Fila fila63 = new ds.Fila();
        fila63.tras = ' ';
        fila63.frente = 1;
        java.lang.Object[] objArray70 = new java.lang.Object[] { fila57, 1, (byte) -1, '4' };
        fila53.item = objArray70;
        java.lang.Object[] objArray72 = fila53.item;
        fila38.item = objArray72;
        fila8.item = objArray72;
        fila0.item = objArray72;
        boolean boolean76 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 10;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        java.lang.Object[] objArray8 = fila4.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        fila4.enfileira((java.lang.Object) '#');
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = (-1);
        int int17 = fila13.frente;
        fila4.enfileira((java.lang.Object) fila13);
        int int19 = fila13.frente;
        java.lang.Object[] objArray20 = fila13.item;
        fila0.item = objArray20;
        java.lang.Object obj22 = null;
        fila0.enfileira(obj22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        java.lang.Object[] objArray24 = fila20.item;
        ds.Fila fila25 = new ds.Fila();
        fila25.frente = '#';
        fila20.enfileira((java.lang.Object) '#');
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.frente = (-1);
        int int33 = fila29.frente;
        fila20.enfileira((java.lang.Object) fila29);
        int int35 = fila29.frente;
        java.lang.Object[] objArray36 = fila29.item;
        fila0.item = objArray36;
        java.lang.Object[] objArray38 = fila0.item;
        fila0.frente = (byte) 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        fila0.frente = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object[] objArray3 = fila0.item;
        boolean boolean4 = fila0.vazia();
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        fila5.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.frente = '#';
        java.lang.Object[] objArray17 = fila14.item;
        fila5.enfileira((java.lang.Object) fila14);
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        fila23.frente = (-1);
        fila19.enfileira((java.lang.Object) fila23);
        ds.Fila fila28 = new ds.Fila();
        fila28.frente = '#';
        java.lang.Object[] objArray31 = fila28.item;
        fila19.enfileira((java.lang.Object) fila28);
        java.lang.Object[] objArray33 = fila28.item;
        fila5.item = objArray33;
        boolean boolean35 = fila5.vazia();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        int int38 = fila36.frente;
        int int39 = fila36.frente;
        ds.Fila fila40 = new ds.Fila();
        boolean boolean41 = fila40.vazia();
        fila40.frente = (-1);
        fila36.enfileira((java.lang.Object) fila40);
        ds.Fila fila45 = new ds.Fila();
        fila45.frente = '#';
        java.lang.Object[] objArray48 = fila45.item;
        fila36.enfileira((java.lang.Object) fila45);
        ds.Fila fila50 = new ds.Fila();
        boolean boolean51 = fila50.vazia();
        int int52 = fila50.frente;
        int int53 = fila50.frente;
        ds.Fila fila54 = new ds.Fila();
        boolean boolean55 = fila54.vazia();
        fila54.frente = (-1);
        fila50.enfileira((java.lang.Object) fila54);
        ds.Fila fila59 = new ds.Fila();
        fila59.frente = '#';
        java.lang.Object[] objArray62 = fila59.item;
        fila50.enfileira((java.lang.Object) fila59);
        java.lang.Object[] objArray64 = fila59.item;
        fila36.item = objArray64;
        fila5.item = objArray64;
        fila0.item = objArray64;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        java.lang.Class<?> wildcardClass15 = objArray13.getClass();
        fila0.enfileira((java.lang.Object) objArray13);
        int int17 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        fila0.frente = '#';
        fila0.tras = 100;
        fila0.frente = ' ';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = null;
        fila9.item = objArray16;
        int int18 = fila9.tras;
        java.lang.Class<?> wildcardClass19 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.tras = 35;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        int int10 = fila8.frente;
        int int11 = fila8.frente;
        java.lang.Object[] objArray12 = fila8.item;
        ds.Fila fila13 = new ds.Fila();
        fila13.frente = '#';
        fila8.enfileira((java.lang.Object) '#');
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.frente = (-1);
        int int21 = fila17.frente;
        fila8.enfileira((java.lang.Object) fila17);
        int int23 = fila17.frente;
        java.lang.Object[] objArray24 = fila17.item;
        fila4.item = objArray24;
        fila0.item = objArray24;
        boolean boolean27 = fila0.vazia();
        int int28 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj15 = fila0.desenfileira();
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        fila0.frente = '#';
        boolean boolean38 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.frente = (short) -1;
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        java.lang.Object[] objArray11 = fila8.item;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        int int14 = fila12.frente;
        int int15 = fila12.frente;
        int int16 = fila12.frente;
        fila12.imprime();
        ds.Fila fila18 = new ds.Fila();
        fila18.tras = ' ';
        fila18.frente = 1;
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila12, 1, (byte) -1, '4' };
        fila8.item = objArray25;
        fila0.item = objArray25;
        fila0.frente = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (short) 100;
        boolean boolean10 = fila0.vazia();
        int int11 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        fila0.imprime();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.tras = 35;
        fila6.tras = (short) 0;
        fila6.frente = (short) -1;
        ds.Fila fila14 = new ds.Fila();
        fila14.frente = '#';
        java.lang.Object[] objArray17 = fila14.item;
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        int int20 = fila18.frente;
        int int21 = fila18.frente;
        int int22 = fila18.frente;
        fila18.imprime();
        ds.Fila fila24 = new ds.Fila();
        fila24.tras = ' ';
        fila24.frente = 1;
        java.lang.Object[] objArray31 = new java.lang.Object[] { fila18, 1, (byte) -1, '4' };
        fila14.item = objArray31;
        fila6.item = objArray31;
        fila0.item = objArray31;
        fila0.tras = 2;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila9.item;
        java.lang.Object obj15 = fila9.desenfileira();
        java.lang.Object obj16 = fila9.desenfileira();
        java.lang.Object[] objArray17 = fila9.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        boolean boolean6 = fila0.vazia();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.frente = (-1);
        java.lang.Object[] objArray11 = fila7.item;
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) fila7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.frente = (-1);
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = '#';
        java.lang.Object[] objArray19 = fila16.item;
        fila7.enfileira((java.lang.Object) fila16);
        fila0.enfileira((java.lang.Object) fila16);
        fila0.imprime();
        int int23 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.tras = (byte) 0;
        ds.Fila fila9 = new ds.Fila();
        fila9.tras = ' ';
        fila9.frente = 1;
        fila0.enfileira((java.lang.Object) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.item = objArray16;
        fila0.frente = (short) -1;
        int int20 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = (short) -1;
        fila9.enfileira((java.lang.Object) fila14);
        int int20 = fila14.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        fila0.tras = 10;
        java.lang.Object[] objArray11 = fila0.item;
        fila0.frente = (byte) 0;
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1, false, 10]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = '#';
        fila10.tras = '#';
        int int15 = fila10.frente;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.frente = (-1);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila16.item = objArray20;
        fila10.item = objArray20;
        java.lang.Object[] objArray23 = fila10.item;
        ds.Fila fila24 = new ds.Fila();
        fila24.frente = '#';
        fila24.tras = '#';
        int int29 = fila24.frente;
        java.lang.Object obj30 = null;
        fila24.enfileira(obj30);
        ds.Fila fila32 = new ds.Fila();
        fila32.frente = '#';
        fila32.tras = '#';
        int int37 = fila32.frente;
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        fila38.frente = (-1);
        java.lang.Object[] objArray42 = new java.lang.Object[] {};
        fila38.item = objArray42;
        fila32.item = objArray42;
        fila24.item = objArray42;
        fila10.item = objArray42;
        fila0.item = objArray42;
        java.lang.Object[] objArray48 = fila0.item;
        ds.Fila fila49 = new ds.Fila();
        boolean boolean50 = fila49.vazia();
        int int51 = fila49.frente;
        int int52 = fila49.frente;
        java.lang.Object[] objArray53 = fila49.item;
        ds.Fila fila54 = new ds.Fila();
        fila54.frente = '#';
        fila49.enfileira((java.lang.Object) '#');
        ds.Fila fila58 = new ds.Fila();
        boolean boolean59 = fila58.vazia();
        int int60 = fila58.frente;
        int int61 = fila58.frente;
        int int62 = fila58.frente;
        fila58.imprime();
        ds.Fila fila64 = new ds.Fila();
        boolean boolean65 = fila64.vazia();
        fila64.tras = 35;
        fila64.tras = (short) 0;
        fila64.frente = (short) -1;
        ds.Fila fila72 = new ds.Fila();
        fila72.frente = '#';
        java.lang.Object[] objArray75 = fila72.item;
        ds.Fila fila76 = new ds.Fila();
        boolean boolean77 = fila76.vazia();
        int int78 = fila76.frente;
        int int79 = fila76.frente;
        int int80 = fila76.frente;
        fila76.imprime();
        ds.Fila fila82 = new ds.Fila();
        fila82.tras = ' ';
        fila82.frente = 1;
        java.lang.Object[] objArray89 = new java.lang.Object[] { fila76, 1, (byte) -1, '4' };
        fila72.item = objArray89;
        fila64.item = objArray89;
        fila58.item = objArray89;
        fila49.item = objArray89;
        fila0.item = objArray89;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        int int14 = fila0.frente;
        fila0.frente = (short) -1;
        fila0.frente = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        fila0.tras = (short) 0;
        fila0.imprime();
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.frente = (-1);
        fila7.enfileira((java.lang.Object) fila11);
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = '#';
        java.lang.Object[] objArray19 = fila16.item;
        fila7.enfileira((java.lang.Object) fila16);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        int int23 = fila21.frente;
        int int24 = fila21.frente;
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        fila25.frente = (-1);
        fila21.enfileira((java.lang.Object) fila25);
        ds.Fila fila30 = new ds.Fila();
        fila30.frente = '#';
        java.lang.Object[] objArray33 = fila30.item;
        fila21.enfileira((java.lang.Object) fila30);
        java.lang.Object[] objArray35 = fila30.item;
        fila7.item = objArray35;
        boolean boolean37 = fila7.vazia();
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        int int40 = fila38.frente;
        int int41 = fila38.frente;
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        fila42.frente = (-1);
        fila38.enfileira((java.lang.Object) fila42);
        ds.Fila fila47 = new ds.Fila();
        fila47.frente = '#';
        java.lang.Object[] objArray50 = fila47.item;
        fila38.enfileira((java.lang.Object) fila47);
        ds.Fila fila52 = new ds.Fila();
        boolean boolean53 = fila52.vazia();
        int int54 = fila52.frente;
        int int55 = fila52.frente;
        ds.Fila fila56 = new ds.Fila();
        boolean boolean57 = fila56.vazia();
        fila56.frente = (-1);
        fila52.enfileira((java.lang.Object) fila56);
        ds.Fila fila61 = new ds.Fila();
        fila61.frente = '#';
        java.lang.Object[] objArray64 = fila61.item;
        fila52.enfileira((java.lang.Object) fila61);
        java.lang.Object[] objArray66 = fila61.item;
        fila38.item = objArray66;
        fila7.item = objArray66;
        boolean boolean69 = fila7.vazia();
        fila0.enfileira((java.lang.Object) boolean69);
        ds.Fila fila71 = new ds.Fila();
        fila71.tras = ' ';
        fila71.frente = (short) -1;
        ds.Fila fila76 = new ds.Fila();
        fila76.frente = '#';
        fila76.tras = '#';
        int int81 = fila76.frente;
        int int82 = fila76.tras;
        java.lang.Class<?> wildcardClass83 = fila76.getClass();
        fila71.enfileira((java.lang.Object) wildcardClass83);
        fila0.enfileira((java.lang.Object) fila71);
        fila0.tras = 'a';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 35 + "'", int81 == 35);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 35 + "'", int82 == 35);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.frente = 0;
        int int8 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = null;
        fila9.item = objArray16;
        int int18 = fila9.tras;
        // The following exception was thrown during execution in test generation
        try {
            fila9.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.tras = 35;
        fila7.tras = (short) 0;
        fila7.frente = (short) -1;
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        fila7.item = objArray32;
        fila0.enfileira((java.lang.Object) fila7);
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        fila7.tras = 35;
        fila7.tras = (short) 0;
        fila7.frente = (short) -1;
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        fila7.item = objArray32;
        fila0.enfileira((java.lang.Object) fila7);
        boolean boolean36 = fila0.vazia();
        boolean boolean37 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        int int8 = fila6.frente;
        int int9 = fila6.frente;
        java.lang.Object[] objArray10 = fila6.item;
        fila6.frente = (byte) 1;
        fila0.enfileira((java.lang.Object) (byte) 1);
        boolean boolean14 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = null;
        fila9.item = objArray16;
        int int18 = fila9.tras;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.frente = (-1);
        fila19.enfileira((java.lang.Object) (byte) 100);
        int int25 = fila19.tras;
        fila19.frente = 35;
        java.lang.Object[] objArray28 = fila19.item;
        // The following exception was thrown during execution in test generation
        try {
            fila9.enfileira((java.lang.Object) objArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.frente = (short) 0;
        int int11 = fila0.tras;
        fila0.imprime();
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.frente;
        int int16 = fila13.frente;
        java.lang.Object[] objArray17 = fila13.item;
        java.lang.Object[] objArray18 = fila13.item;
        fila0.item = objArray18;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (short) 100;
        fila0.frente = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.frente = '#';
        fila10.tras = '#';
        int int15 = fila10.frente;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        fila16.frente = (-1);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        fila16.item = objArray20;
        fila10.item = objArray20;
        java.lang.Object[] objArray23 = fila10.item;
        ds.Fila fila24 = new ds.Fila();
        fila24.frente = '#';
        fila24.tras = '#';
        int int29 = fila24.frente;
        java.lang.Object obj30 = null;
        fila24.enfileira(obj30);
        ds.Fila fila32 = new ds.Fila();
        fila32.frente = '#';
        fila32.tras = '#';
        int int37 = fila32.frente;
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        fila38.frente = (-1);
        java.lang.Object[] objArray42 = new java.lang.Object[] {};
        fila38.item = objArray42;
        fila32.item = objArray42;
        fila24.item = objArray42;
        fila10.item = objArray42;
        fila0.item = objArray42;
        java.lang.Object[] objArray48 = fila0.item;
        boolean boolean49 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.frente = (-1);
        fila7.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { fila11, (-1.0d), (byte) -1, (-1.0f) };
        fila0.item = objArray19;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.frente = (-1);
        fila7.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { fila11, (-1.0d), (byte) -1, (-1.0f) };
        fila0.item = objArray19;
        fila0.frente = 35;
        int int23 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        boolean boolean8 = fila0.vazia();
        boolean boolean9 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        fila0.enfileira((java.lang.Object) (short) 1);
        java.lang.Object obj7 = fila0.desenfileira();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 1 + "'", obj7, (short) 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        // The following exception was thrown during execution in test generation
        try {
            fila0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.tras = 35;
        fila4.tras = (short) 0;
        fila4.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        int int13 = fila11.frente;
        int int14 = fila11.frente;
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        fila15.frente = (-1);
        fila11.enfileira((java.lang.Object) fila15);
        ds.Fila fila20 = new ds.Fila();
        fila20.frente = '#';
        java.lang.Object[] objArray23 = fila20.item;
        fila11.enfileira((java.lang.Object) fila20);
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        int int27 = fila25.frente;
        int int28 = fila25.frente;
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        fila29.frente = (-1);
        fila25.enfileira((java.lang.Object) fila29);
        ds.Fila fila34 = new ds.Fila();
        fila34.frente = '#';
        java.lang.Object[] objArray37 = fila34.item;
        fila25.enfileira((java.lang.Object) fila34);
        java.lang.Object[] objArray39 = fila34.item;
        fila11.item = objArray39;
        boolean boolean41 = fila11.vazia();
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        int int44 = fila42.frente;
        int int45 = fila42.frente;
        ds.Fila fila46 = new ds.Fila();
        boolean boolean47 = fila46.vazia();
        fila46.frente = (-1);
        fila42.enfileira((java.lang.Object) fila46);
        ds.Fila fila51 = new ds.Fila();
        fila51.frente = '#';
        java.lang.Object[] objArray54 = fila51.item;
        fila42.enfileira((java.lang.Object) fila51);
        ds.Fila fila56 = new ds.Fila();
        boolean boolean57 = fila56.vazia();
        int int58 = fila56.frente;
        int int59 = fila56.frente;
        ds.Fila fila60 = new ds.Fila();
        boolean boolean61 = fila60.vazia();
        fila60.frente = (-1);
        fila56.enfileira((java.lang.Object) fila60);
        ds.Fila fila65 = new ds.Fila();
        fila65.frente = '#';
        java.lang.Object[] objArray68 = fila65.item;
        fila56.enfileira((java.lang.Object) fila65);
        java.lang.Object[] objArray70 = fila65.item;
        fila42.item = objArray70;
        fila11.item = objArray70;
        boolean boolean73 = fila11.vazia();
        fila4.enfileira((java.lang.Object) boolean73);
        java.lang.Object obj75 = fila4.desenfileira();
        ds.Fila fila76 = new ds.Fila();
        boolean boolean77 = fila76.vazia();
        fila76.frente = (-1);
        java.lang.Object[] objArray80 = new java.lang.Object[] {};
        fila76.item = objArray80;
        fila4.enfileira((java.lang.Object) objArray80);
        fila0.enfileira((java.lang.Object) fila4);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + false + "'", obj75, false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.tras;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila5.tras = '#';
        int int10 = fila5.frente;
        int int11 = fila5.tras;
        java.lang.Class<?> wildcardClass12 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass12);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        ds.Fila fila17 = new ds.Fila();
        fila17.frente = '#';
        java.lang.Object[] objArray20 = fila17.item;
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        int int23 = fila21.frente;
        int int24 = fila21.frente;
        int int25 = fila21.frente;
        fila21.imprime();
        ds.Fila fila27 = new ds.Fila();
        fila27.tras = ' ';
        fila27.frente = 1;
        java.lang.Object[] objArray34 = new java.lang.Object[] { fila21, 1, (byte) -1, '4' };
        fila17.item = objArray34;
        fila14.item = objArray34;
        int int37 = fila14.tras;
        fila0.enfileira((java.lang.Object) fila14);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.tras;
        fila0.frente = 35;
        fila0.tras = 2;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        fila0.tras = 100;
        int int7 = fila0.tras;
        java.lang.Object[] objArray8 = fila0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = (short) -1;
        fila9.enfileira((java.lang.Object) fila14);
        java.lang.Class<?> wildcardClass20 = fila14.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        fila0.tras = (short) -1;
        fila0.frente = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        fila8.tras = '#';
        int int13 = fila8.frente;
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila14.item = objArray18;
        fila8.item = objArray18;
        fila0.item = objArray18;
        int int22 = fila0.frente;
        fila0.tras = (short) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = (short) -1;
        fila9.enfileira((java.lang.Object) fila14);
        // The following exception was thrown during execution in test generation
        try {
            fila14.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (byte) -1;
        java.lang.Object[] objArray5 = fila0.item;
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        ds.Fila fila3 = new ds.Fila();
        fila3.frente = '#';
        java.lang.Object[] objArray6 = fila3.item;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        int int11 = fila7.frente;
        fila7.imprime();
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = ' ';
        fila13.frente = 1;
        java.lang.Object[] objArray20 = new java.lang.Object[] { fila7, 1, (byte) -1, '4' };
        fila3.item = objArray20;
        fila0.item = objArray20;
        java.lang.Object[] objArray23 = fila0.item;
        fila0.frente = 52;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        boolean boolean9 = fila0.vazia();
        fila0.frente = 35;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        fila0.frente = (-1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila9.item;
        int int15 = fila9.frente;
        boolean boolean16 = fila9.vazia();
        fila9.tras = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        boolean boolean9 = fila0.vazia();
        fila0.frente = 100;
        int int12 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.tras = 35;
        fila4.tras = (short) 0;
        fila4.frente = (short) -1;
        ds.Fila fila12 = new ds.Fila();
        fila12.frente = '#';
        java.lang.Object[] objArray15 = fila12.item;
        ds.Fila fila16 = new ds.Fila();
        boolean boolean17 = fila16.vazia();
        int int18 = fila16.frente;
        int int19 = fila16.frente;
        int int20 = fila16.frente;
        fila16.imprime();
        ds.Fila fila22 = new ds.Fila();
        fila22.tras = ' ';
        fila22.frente = 1;
        java.lang.Object[] objArray29 = new java.lang.Object[] { fila16, 1, (byte) -1, '4' };
        fila12.item = objArray29;
        fila4.item = objArray29;
        int int32 = fila4.tras;
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila34 = new ds.Fila();
        boolean boolean35 = fila34.vazia();
        fila34.frente = (-1);
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        fila34.item = objArray38;
        fila4.item = objArray38;
        java.lang.Object[] objArray41 = fila4.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        fila0.imprime();
        int int6 = fila0.tras;
        java.lang.Class<?> wildcardClass7 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.enfileira((java.lang.Object) 1.0f);
        boolean boolean9 = fila0.vazia();
        fila0.imprime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        fila0.tras = (byte) 1;
        fila0.tras = 10;
        int int11 = fila0.tras;
        int int12 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila5.tras = '#';
        int int10 = fila5.frente;
        int int11 = fila5.tras;
        int int12 = fila5.frente;
        fila5.frente = (short) -1;
        fila0.enfileira((java.lang.Object) fila5);
        java.lang.Class<?> wildcardClass16 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        boolean boolean36 = fila0.vazia();
        fila0.tras = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        java.lang.Object[] objArray19 = fila0.item;
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        java.lang.Object[] objArray24 = fila20.item;
        fila0.enfileira((java.lang.Object) fila20);
        boolean boolean26 = fila0.vazia();
        fila0.tras = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        java.lang.Object obj3 = null;
        fila0.enfileira(obj3);
        java.lang.Object obj5 = fila0.desenfileira();
        ds.Fila fila6 = new ds.Fila();
        fila6.frente = '#';
        fila6.tras = '#';
        int int11 = fila6.frente;
        ds.Fila fila12 = new ds.Fila();
        boolean boolean13 = fila12.vazia();
        fila12.frente = (-1);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        fila12.item = objArray16;
        fila6.item = objArray16;
        fila6.tras = '4';
        ds.Fila fila21 = new ds.Fila();
        fila21.frente = '#';
        java.lang.Object[] objArray24 = fila21.item;
        ds.Fila fila25 = new ds.Fila();
        boolean boolean26 = fila25.vazia();
        int int27 = fila25.frente;
        int int28 = fila25.frente;
        int int29 = fila25.frente;
        fila25.imprime();
        ds.Fila fila31 = new ds.Fila();
        fila31.tras = ' ';
        fila31.frente = 1;
        java.lang.Object[] objArray38 = new java.lang.Object[] { fila25, 1, (byte) -1, '4' };
        fila21.item = objArray38;
        java.lang.Object[] objArray40 = fila21.item;
        fila6.item = objArray40;
        fila6.frente = '#';
        fila6.tras = 100;
        ds.Fila fila46 = new ds.Fila();
        boolean boolean47 = fila46.vazia();
        int int48 = fila46.frente;
        int int49 = fila46.frente;
        ds.Fila fila50 = new ds.Fila();
        boolean boolean51 = fila50.vazia();
        fila50.frente = (-1);
        fila46.enfileira((java.lang.Object) fila50);
        ds.Fila fila55 = new ds.Fila();
        fila55.frente = '#';
        java.lang.Object[] objArray58 = fila55.item;
        fila46.enfileira((java.lang.Object) fila55);
        java.lang.Object[] objArray60 = fila55.item;
        ds.Fila fila61 = new ds.Fila();
        fila61.frente = '#';
        fila61.tras = '#';
        int int66 = fila61.frente;
        int int67 = fila61.tras;
        fila61.tras = (byte) 0;
        ds.Fila fila70 = new ds.Fila();
        fila70.tras = ' ';
        fila70.frente = 1;
        fila61.enfileira((java.lang.Object) 1);
        ds.Fila fila76 = new ds.Fila();
        java.lang.Object[] objArray77 = fila76.item;
        fila61.item = objArray77;
        fila55.item = objArray77;
        fila6.item = objArray77;
        fila0.item = objArray77;
        java.lang.Object[] objArray82 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 35 + "'", int67 == 35);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray82);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray14 = fila9.item;
        java.lang.Object obj15 = fila9.desenfileira();
        fila9.tras = 32;
        java.lang.Object obj18 = fila9.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        ds.Fila fila7 = new ds.Fila();
        fila7.frente = '#';
        fila7.tras = '#';
        int int12 = fila7.frente;
        int int13 = fila7.tras;
        fila7.tras = (byte) 0;
        ds.Fila fila16 = new ds.Fila();
        fila16.tras = ' ';
        fila16.frente = 1;
        fila7.enfileira((java.lang.Object) 1);
        ds.Fila fila22 = new ds.Fila();
        java.lang.Object[] objArray23 = fila22.item;
        fila7.item = objArray23;
        fila0.item = objArray23;
        java.lang.Class<?> wildcardClass26 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        int int5 = fila0.tras;
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.tras;
        int int16 = fila9.tras;
        java.lang.Class<?> wildcardClass17 = fila9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        int int16 = fila14.frente;
        int int17 = fila14.frente;
        ds.Fila fila18 = new ds.Fila();
        boolean boolean19 = fila18.vazia();
        fila18.frente = (-1);
        fila14.enfileira((java.lang.Object) fila18);
        ds.Fila fila23 = new ds.Fila();
        fila23.frente = '#';
        java.lang.Object[] objArray26 = fila23.item;
        fila14.enfileira((java.lang.Object) fila23);
        java.lang.Object[] objArray28 = fila23.item;
        fila0.item = objArray28;
        boolean boolean30 = fila0.vazia();
        ds.Fila fila31 = new ds.Fila();
        boolean boolean32 = fila31.vazia();
        int int33 = fila31.frente;
        int int34 = fila31.frente;
        ds.Fila fila35 = new ds.Fila();
        boolean boolean36 = fila35.vazia();
        fila35.frente = (-1);
        fila31.enfileira((java.lang.Object) fila35);
        ds.Fila fila40 = new ds.Fila();
        fila40.frente = '#';
        java.lang.Object[] objArray43 = fila40.item;
        fila31.enfileira((java.lang.Object) fila40);
        ds.Fila fila45 = new ds.Fila();
        boolean boolean46 = fila45.vazia();
        int int47 = fila45.frente;
        int int48 = fila45.frente;
        ds.Fila fila49 = new ds.Fila();
        boolean boolean50 = fila49.vazia();
        fila49.frente = (-1);
        fila45.enfileira((java.lang.Object) fila49);
        ds.Fila fila54 = new ds.Fila();
        fila54.frente = '#';
        java.lang.Object[] objArray57 = fila54.item;
        fila45.enfileira((java.lang.Object) fila54);
        java.lang.Object[] objArray59 = fila54.item;
        fila31.item = objArray59;
        fila0.item = objArray59;
        boolean boolean62 = fila0.vazia();
        java.lang.Object obj63 = fila0.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        fila9.frente = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        fila0.frente = 0;
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        fila8.tras = '#';
        int int13 = fila8.frente;
        java.lang.Class<?> wildcardClass14 = fila8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fila0.enfileira((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        fila8.tras = (byte) 1;
        fila8.tras = 10;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        int int21 = fila8.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        int int5 = fila0.frente;
        fila0.frente = (short) 10;
        fila0.frente = (short) 100;
        java.lang.Object[] objArray10 = fila0.item;
        fila0.frente = 32;
        fila0.frente = (short) 0;
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        int int17 = fila15.frente;
        int int18 = fila15.frente;
        java.lang.Object[] objArray19 = fila15.item;
        fila0.item = objArray19;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        fila6.item = objArray10;
        fila0.item = objArray10;
        fila0.tras = '4';
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        int int21 = fila19.frente;
        int int22 = fila19.frente;
        int int23 = fila19.frente;
        fila19.imprime();
        ds.Fila fila25 = new ds.Fila();
        fila25.tras = ' ';
        fila25.frente = 1;
        java.lang.Object[] objArray32 = new java.lang.Object[] { fila19, 1, (byte) -1, '4' };
        fila15.item = objArray32;
        java.lang.Object[] objArray34 = fila15.item;
        fila0.item = objArray34;
        fila0.frente = '#';
        int int38 = fila0.tras;
        fila0.tras = 2;
        fila0.tras = '4';
        boolean boolean43 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila0.item = objArray5;
        boolean boolean7 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        int int8 = fila6.frente;
        int int9 = fila6.frente;
        java.lang.Object[] objArray10 = fila6.item;
        fila6.frente = (byte) 1;
        fila0.enfileira((java.lang.Object) (byte) 1);
        int int14 = fila0.tras;
        int int15 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        fila0.frente = (short) 10;
        boolean boolean21 = fila0.vazia();
        java.lang.Object[] objArray22 = fila0.item;
        java.lang.Object[] objArray23 = fila0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object[] objArray15 = fila9.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = fila9.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.tras;
        fila0.frente = (short) 100;
        ds.Fila fila9 = new ds.Fila();
        fila9.tras = ' ';
        int int12 = fila9.frente;
        ds.Fila fila13 = new ds.Fila();
        fila13.tras = ' ';
        ds.Fila fila16 = new ds.Fila();
        fila16.frente = '#';
        java.lang.Object[] objArray19 = fila16.item;
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        int int22 = fila20.frente;
        int int23 = fila20.frente;
        int int24 = fila20.frente;
        fila20.imprime();
        ds.Fila fila26 = new ds.Fila();
        fila26.tras = ' ';
        fila26.frente = 1;
        java.lang.Object[] objArray33 = new java.lang.Object[] { fila20, 1, (byte) -1, '4' };
        fila16.item = objArray33;
        fila13.item = objArray33;
        fila9.item = objArray33;
        fila0.enfileira((java.lang.Object) objArray33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        fila6.enfileira((java.lang.Object) (byte) 100);
        int int12 = fila6.frente;
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.frente;
        int int16 = fila13.frente;
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.frente = (-1);
        fila13.enfileira((java.lang.Object) fila17);
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila17, (-1.0d), (byte) -1, (-1.0f) };
        fila6.item = objArray25;
        fila0.item = objArray25;
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.tras = 10;
        ds.Fila fila32 = new ds.Fila();
        boolean boolean33 = fila32.vazia();
        int int34 = fila32.frente;
        int int35 = fila32.frente;
        java.lang.Object[] objArray36 = fila32.item;
        ds.Fila fila37 = new ds.Fila();
        fila37.frente = '#';
        fila32.enfileira((java.lang.Object) '#');
        ds.Fila fila41 = new ds.Fila();
        boolean boolean42 = fila41.vazia();
        fila41.frente = (-1);
        int int45 = fila41.frente;
        fila32.enfileira((java.lang.Object) fila41);
        int int47 = fila41.frente;
        java.lang.Object[] objArray48 = fila41.item;
        fila28.item = objArray48;
        fila0.item = objArray48;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        boolean boolean9 = fila0.vazia();
        int int10 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        int int7 = fila5.frente;
        int int8 = fila5.frente;
        int int9 = fila5.frente;
        fila5.imprime();
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.tras = 35;
        fila11.tras = (short) 0;
        fila11.frente = (short) -1;
        ds.Fila fila19 = new ds.Fila();
        fila19.frente = '#';
        java.lang.Object[] objArray22 = fila19.item;
        ds.Fila fila23 = new ds.Fila();
        boolean boolean24 = fila23.vazia();
        int int25 = fila23.frente;
        int int26 = fila23.frente;
        int int27 = fila23.frente;
        fila23.imprime();
        ds.Fila fila29 = new ds.Fila();
        fila29.tras = ' ';
        fila29.frente = 1;
        java.lang.Object[] objArray36 = new java.lang.Object[] { fila23, 1, (byte) -1, '4' };
        fila19.item = objArray36;
        fila11.item = objArray36;
        fila5.item = objArray36;
        fila0.item = objArray36;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila15 = new ds.Fila();
        fila15.tras = ' ';
        int int18 = fila15.frente;
        ds.Fila fila19 = new ds.Fila();
        fila19.tras = ' ';
        ds.Fila fila22 = new ds.Fila();
        fila22.frente = '#';
        java.lang.Object[] objArray25 = fila22.item;
        ds.Fila fila26 = new ds.Fila();
        boolean boolean27 = fila26.vazia();
        int int28 = fila26.frente;
        int int29 = fila26.frente;
        int int30 = fila26.frente;
        fila26.imprime();
        ds.Fila fila32 = new ds.Fila();
        fila32.tras = ' ';
        fila32.frente = 1;
        java.lang.Object[] objArray39 = new java.lang.Object[] { fila26, 1, (byte) -1, '4' };
        fila22.item = objArray39;
        fila19.item = objArray39;
        fila15.item = objArray39;
        fila0.item = objArray39;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.tras = (byte) 0;
        ds.Fila fila9 = new ds.Fila();
        fila9.tras = ' ';
        fila9.frente = 1;
        fila0.enfileira((java.lang.Object) 1);
        ds.Fila fila15 = new ds.Fila();
        java.lang.Object[] objArray16 = fila15.item;
        fila0.item = objArray16;
        boolean boolean18 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.enfileira((java.lang.Object) 1.0f);
        fila0.tras = 36;
        int int11 = fila0.frente;
        java.lang.Object[] objArray12 = fila0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        fila0.frente = (short) 10;
        boolean boolean21 = fila0.vazia();
        java.lang.Object[] objArray22 = fila0.item;
        java.lang.Object[] objArray23 = fila0.item;
        int int24 = fila0.tras;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        java.lang.Object[] objArray16 = null;
        fila9.item = objArray16;
        java.lang.Object[] objArray18 = fila9.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(objArray18);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        ds.Fila fila7 = new ds.Fila();
        boolean boolean8 = fila7.vazia();
        int int9 = fila7.frente;
        int int10 = fila7.frente;
        ds.Fila fila11 = new ds.Fila();
        boolean boolean12 = fila11.vazia();
        fila11.frente = (-1);
        fila7.enfileira((java.lang.Object) fila11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { fila11, (-1.0d), (byte) -1, (-1.0f) };
        fila0.item = objArray19;
        java.lang.Object[] objArray21 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        java.lang.Object obj14 = fila9.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = null;
        fila0.item = objArray4;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        int int8 = fila6.frente;
        int int9 = fila6.frente;
        ds.Fila fila10 = new ds.Fila();
        boolean boolean11 = fila10.vazia();
        fila10.frente = (-1);
        fila6.enfileira((java.lang.Object) fila10);
        ds.Fila fila15 = new ds.Fila();
        fila15.frente = '#';
        java.lang.Object[] objArray18 = fila15.item;
        fila6.enfileira((java.lang.Object) fila15);
        ds.Fila fila20 = new ds.Fila();
        fila20.tras = ' ';
        fila20.frente = (short) -1;
        fila15.enfileira((java.lang.Object) fila20);
        java.lang.Object[] objArray26 = fila15.item;
        fila0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        fila8.tras = '#';
        int int13 = fila8.frente;
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila14.item = objArray18;
        fila8.item = objArray18;
        fila0.item = objArray18;
        boolean boolean22 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        boolean boolean19 = fila0.vazia();
        ds.Fila fila20 = new ds.Fila();
        boolean boolean21 = fila20.vazia();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila20.item = objArray25;
        java.lang.Class<?> wildcardClass27 = fila20.getClass();
        fila0.enfileira((java.lang.Object) fila20);
        ds.Fila fila29 = new ds.Fila();
        fila29.tras = ' ';
        ds.Fila fila32 = new ds.Fila();
        fila32.frente = '#';
        java.lang.Object[] objArray35 = fila32.item;
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        int int38 = fila36.frente;
        int int39 = fila36.frente;
        int int40 = fila36.frente;
        fila36.imprime();
        ds.Fila fila42 = new ds.Fila();
        fila42.tras = ' ';
        fila42.frente = 1;
        java.lang.Object[] objArray49 = new java.lang.Object[] { fila36, 1, (byte) -1, '4' };
        fila32.item = objArray49;
        fila29.item = objArray49;
        java.lang.Object[] objArray52 = fila29.item;
        java.lang.Object[] objArray53 = fila29.item;
        fila20.item = objArray53;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        int int14 = fila0.frente;
        fila0.frente = (short) -1;
        int int17 = fila0.frente;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        java.lang.Object[] objArray8 = fila4.item;
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        fila4.enfileira((java.lang.Object) '#');
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        fila13.frente = (-1);
        int int17 = fila13.frente;
        fila4.enfileira((java.lang.Object) fila13);
        int int19 = fila13.frente;
        java.lang.Object[] objArray20 = fila13.item;
        fila0.item = objArray20;
        java.lang.Object[] objArray22 = fila0.item;
        java.lang.Class<?> wildcardClass23 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        int int8 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        boolean boolean6 = fila5.vazia();
        fila5.frente = (-1);
        fila5.enfileira((java.lang.Object) (byte) 100);
        int int11 = fila5.frente;
        boolean boolean12 = fila5.vazia();
        fila5.tras = '4';
        java.lang.Object[] objArray15 = fila5.item;
        java.lang.Class<?> wildcardClass16 = fila5.getClass();
        fila0.enfileira((java.lang.Object) wildcardClass16);
        java.lang.Object[] objArray18 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        java.lang.Object[] objArray3 = fila0.item;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        int int6 = fila4.frente;
        int int7 = fila4.frente;
        int int8 = fila4.frente;
        fila4.imprime();
        ds.Fila fila10 = new ds.Fila();
        fila10.tras = ' ';
        fila10.frente = 1;
        java.lang.Object[] objArray17 = new java.lang.Object[] { fila4, 1, (byte) -1, '4' };
        fila0.item = objArray17;
        java.lang.Object[] objArray19 = fila0.item;
        java.lang.Object[] objArray20 = fila0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        fila8.tras = (byte) 1;
        fila8.tras = 10;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        ds.Fila fila21 = new ds.Fila();
        boolean boolean22 = fila21.vazia();
        int int23 = fila21.frente;
        int int24 = fila21.frente;
        java.lang.Object[] objArray25 = fila21.item;
        ds.Fila fila26 = new ds.Fila();
        fila26.frente = '#';
        fila21.enfileira((java.lang.Object) '#');
        ds.Fila fila30 = new ds.Fila();
        boolean boolean31 = fila30.vazia();
        int int32 = fila30.frente;
        int int33 = fila30.frente;
        int int34 = fila30.frente;
        fila30.imprime();
        ds.Fila fila36 = new ds.Fila();
        boolean boolean37 = fila36.vazia();
        fila36.tras = 35;
        fila36.tras = (short) 0;
        fila36.frente = (short) -1;
        ds.Fila fila44 = new ds.Fila();
        fila44.frente = '#';
        java.lang.Object[] objArray47 = fila44.item;
        ds.Fila fila48 = new ds.Fila();
        boolean boolean49 = fila48.vazia();
        int int50 = fila48.frente;
        int int51 = fila48.frente;
        int int52 = fila48.frente;
        fila48.imprime();
        ds.Fila fila54 = new ds.Fila();
        fila54.tras = ' ';
        fila54.frente = 1;
        java.lang.Object[] objArray61 = new java.lang.Object[] { fila48, 1, (byte) -1, '4' };
        fila44.item = objArray61;
        fila36.item = objArray61;
        fila30.item = objArray61;
        fila21.item = objArray61;
        // The following exception was thrown during execution in test generation
        try {
            fila8.enfileira((java.lang.Object) objArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        fila0.frente = '#';
        fila0.frente = ' ';
        java.lang.Object[] objArray10 = fila0.item;
        fila0.tras = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        boolean boolean5 = fila0.vazia();
        java.lang.Object[] objArray6 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        fila0.tras = (byte) 10;
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        int int11 = fila9.frente;
        int int12 = fila9.frente;
        java.lang.Object[] objArray13 = fila9.item;
        ds.Fila fila14 = new ds.Fila();
        fila14.frente = '#';
        fila9.enfileira((java.lang.Object) '#');
        ds.Fila fila18 = new ds.Fila();
        fila18.frente = '#';
        fila18.tras = '#';
        int int23 = fila18.frente;
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        fila24.frente = (-1);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        fila24.item = objArray28;
        fila18.item = objArray28;
        fila18.tras = '4';
        ds.Fila fila33 = new ds.Fila();
        fila33.frente = '#';
        java.lang.Object[] objArray36 = fila33.item;
        ds.Fila fila37 = new ds.Fila();
        boolean boolean38 = fila37.vazia();
        int int39 = fila37.frente;
        int int40 = fila37.frente;
        int int41 = fila37.frente;
        fila37.imprime();
        ds.Fila fila43 = new ds.Fila();
        fila43.tras = ' ';
        fila43.frente = 1;
        java.lang.Object[] objArray50 = new java.lang.Object[] { fila37, 1, (byte) -1, '4' };
        fila33.item = objArray50;
        java.lang.Object[] objArray52 = fila33.item;
        fila18.item = objArray52;
        fila18.frente = '#';
        fila18.tras = 100;
        ds.Fila fila58 = new ds.Fila();
        boolean boolean59 = fila58.vazia();
        int int60 = fila58.frente;
        int int61 = fila58.frente;
        ds.Fila fila62 = new ds.Fila();
        boolean boolean63 = fila62.vazia();
        fila62.frente = (-1);
        fila58.enfileira((java.lang.Object) fila62);
        ds.Fila fila67 = new ds.Fila();
        fila67.frente = '#';
        java.lang.Object[] objArray70 = fila67.item;
        fila58.enfileira((java.lang.Object) fila67);
        java.lang.Object[] objArray72 = fila67.item;
        ds.Fila fila73 = new ds.Fila();
        fila73.frente = '#';
        fila73.tras = '#';
        int int78 = fila73.frente;
        int int79 = fila73.tras;
        fila73.tras = (byte) 0;
        ds.Fila fila82 = new ds.Fila();
        fila82.tras = ' ';
        fila82.frente = 1;
        fila73.enfileira((java.lang.Object) 1);
        ds.Fila fila88 = new ds.Fila();
        java.lang.Object[] objArray89 = fila88.item;
        fila73.item = objArray89;
        fila67.item = objArray89;
        fila18.item = objArray89;
        fila9.item = objArray89;
        fila0.enfileira((java.lang.Object) fila9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 35 + "'", int78 == 35);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 35 + "'", int79 == 35);
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        fila0.imprime();
        boolean boolean10 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Fila fila0 = new ds.Fila();
        fila0.tras = ' ';
        fila0.frente = (short) -1;
        boolean boolean5 = fila0.vazia();
        int int6 = fila0.tras;
        fila0.tras = '#';
        fila0.frente = 52;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        int int8 = fila6.frente;
        int int9 = fila6.frente;
        java.lang.Object[] objArray10 = fila6.item;
        fila6.frente = (byte) 1;
        fila0.enfileira((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray14 = fila0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        fila6.enfileira((java.lang.Object) (byte) 100);
        int int12 = fila6.frente;
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.frente;
        int int16 = fila13.frente;
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.frente = (-1);
        fila13.enfileira((java.lang.Object) fila17);
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila17, (-1.0d), (byte) -1, (-1.0f) };
        fila6.item = objArray25;
        fila0.item = objArray25;
        int int28 = fila0.tras;
        fila0.frente = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 10;
        fila0.frente = (short) 0;
        int int6 = fila0.frente;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        boolean boolean5 = fila0.vazia();
        fila0.frente = '#';
        fila0.frente = ' ';
        java.lang.Object[] objArray10 = fila0.item;
        int int11 = fila0.tras;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.tras = 35;
        boolean boolean4 = fila0.vazia();
        int int5 = fila0.tras;
        ds.Fila fila6 = new ds.Fila();
        boolean boolean7 = fila6.vazia();
        fila6.frente = (-1);
        fila6.enfileira((java.lang.Object) (byte) 100);
        int int12 = fila6.frente;
        ds.Fila fila13 = new ds.Fila();
        boolean boolean14 = fila13.vazia();
        int int15 = fila13.frente;
        int int16 = fila13.frente;
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.frente = (-1);
        fila13.enfileira((java.lang.Object) fila17);
        java.lang.Object[] objArray25 = new java.lang.Object[] { fila17, (-1.0d), (byte) -1, (-1.0f) };
        fila6.item = objArray25;
        fila0.item = objArray25;
        java.lang.Class<?> wildcardClass28 = fila0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        fila0.tras = (byte) 1;
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        int int6 = fila0.tras;
        fila0.frente = 52;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = fila0.item;
        fila0.frente = (short) 0;
        fila0.imprime();
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), false, (short) 10 };
        fila8.item = objArray13;
        fila8.tras = (byte) 1;
        fila8.tras = 10;
        java.lang.Object[] objArray19 = fila8.item;
        fila0.enfileira((java.lang.Object) fila8);
        java.lang.Object obj21 = fila8.desenfileira();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, false, 10]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, false, 10]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1) + "'", obj21, (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        java.lang.Object[] objArray4 = fila0.item;
        ds.Fila fila5 = new ds.Fila();
        fila5.frente = '#';
        fila0.enfileira((java.lang.Object) '#');
        ds.Fila fila9 = new ds.Fila();
        boolean boolean10 = fila9.vazia();
        fila9.frente = (-1);
        int int13 = fila9.frente;
        fila0.enfileira((java.lang.Object) fila9);
        int int15 = fila9.frente;
        boolean boolean16 = fila9.vazia();
        ds.Fila fila17 = new ds.Fila();
        boolean boolean18 = fila17.vazia();
        fila17.tras = 35;
        fila17.tras = (short) 0;
        fila17.imprime();
        ds.Fila fila24 = new ds.Fila();
        boolean boolean25 = fila24.vazia();
        int int26 = fila24.frente;
        int int27 = fila24.frente;
        ds.Fila fila28 = new ds.Fila();
        boolean boolean29 = fila28.vazia();
        fila28.frente = (-1);
        fila24.enfileira((java.lang.Object) fila28);
        ds.Fila fila33 = new ds.Fila();
        fila33.frente = '#';
        java.lang.Object[] objArray36 = fila33.item;
        fila24.enfileira((java.lang.Object) fila33);
        ds.Fila fila38 = new ds.Fila();
        boolean boolean39 = fila38.vazia();
        int int40 = fila38.frente;
        int int41 = fila38.frente;
        ds.Fila fila42 = new ds.Fila();
        boolean boolean43 = fila42.vazia();
        fila42.frente = (-1);
        fila38.enfileira((java.lang.Object) fila42);
        ds.Fila fila47 = new ds.Fila();
        fila47.frente = '#';
        java.lang.Object[] objArray50 = fila47.item;
        fila38.enfileira((java.lang.Object) fila47);
        java.lang.Object[] objArray52 = fila47.item;
        fila24.item = objArray52;
        boolean boolean54 = fila24.vazia();
        ds.Fila fila55 = new ds.Fila();
        boolean boolean56 = fila55.vazia();
        int int57 = fila55.frente;
        int int58 = fila55.frente;
        ds.Fila fila59 = new ds.Fila();
        boolean boolean60 = fila59.vazia();
        fila59.frente = (-1);
        fila55.enfileira((java.lang.Object) fila59);
        ds.Fila fila64 = new ds.Fila();
        fila64.frente = '#';
        java.lang.Object[] objArray67 = fila64.item;
        fila55.enfileira((java.lang.Object) fila64);
        ds.Fila fila69 = new ds.Fila();
        boolean boolean70 = fila69.vazia();
        int int71 = fila69.frente;
        int int72 = fila69.frente;
        ds.Fila fila73 = new ds.Fila();
        boolean boolean74 = fila73.vazia();
        fila73.frente = (-1);
        fila69.enfileira((java.lang.Object) fila73);
        ds.Fila fila78 = new ds.Fila();
        fila78.frente = '#';
        java.lang.Object[] objArray81 = fila78.item;
        fila69.enfileira((java.lang.Object) fila78);
        java.lang.Object[] objArray83 = fila78.item;
        fila55.item = objArray83;
        fila24.item = objArray83;
        boolean boolean86 = fila24.vazia();
        fila17.enfileira((java.lang.Object) boolean86);
        java.lang.Object obj88 = fila17.desenfileira();
        ds.Fila fila89 = new ds.Fila();
        boolean boolean90 = fila89.vazia();
        fila89.frente = (-1);
        java.lang.Object[] objArray93 = new java.lang.Object[] {};
        fila89.item = objArray93;
        fila17.enfileira((java.lang.Object) objArray93);
        fila9.enfileira((java.lang.Object) objArray93);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + false + "'", obj88, false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        int int4 = fila0.frente;
        fila0.imprime();
        int int6 = fila0.tras;
        int int7 = fila0.frente;
        ds.Fila fila8 = new ds.Fila();
        boolean boolean9 = fila8.vazia();
        fila8.tras = 35;
        fila8.tras = (short) 0;
        fila8.imprime();
        ds.Fila fila15 = new ds.Fila();
        boolean boolean16 = fila15.vazia();
        int int17 = fila15.frente;
        int int18 = fila15.frente;
        ds.Fila fila19 = new ds.Fila();
        boolean boolean20 = fila19.vazia();
        fila19.frente = (-1);
        fila15.enfileira((java.lang.Object) fila19);
        ds.Fila fila24 = new ds.Fila();
        fila24.frente = '#';
        java.lang.Object[] objArray27 = fila24.item;
        fila15.enfileira((java.lang.Object) fila24);
        ds.Fila fila29 = new ds.Fila();
        boolean boolean30 = fila29.vazia();
        int int31 = fila29.frente;
        int int32 = fila29.frente;
        ds.Fila fila33 = new ds.Fila();
        boolean boolean34 = fila33.vazia();
        fila33.frente = (-1);
        fila29.enfileira((java.lang.Object) fila33);
        ds.Fila fila38 = new ds.Fila();
        fila38.frente = '#';
        java.lang.Object[] objArray41 = fila38.item;
        fila29.enfileira((java.lang.Object) fila38);
        java.lang.Object[] objArray43 = fila38.item;
        fila15.item = objArray43;
        boolean boolean45 = fila15.vazia();
        ds.Fila fila46 = new ds.Fila();
        boolean boolean47 = fila46.vazia();
        int int48 = fila46.frente;
        int int49 = fila46.frente;
        ds.Fila fila50 = new ds.Fila();
        boolean boolean51 = fila50.vazia();
        fila50.frente = (-1);
        fila46.enfileira((java.lang.Object) fila50);
        ds.Fila fila55 = new ds.Fila();
        fila55.frente = '#';
        java.lang.Object[] objArray58 = fila55.item;
        fila46.enfileira((java.lang.Object) fila55);
        ds.Fila fila60 = new ds.Fila();
        boolean boolean61 = fila60.vazia();
        int int62 = fila60.frente;
        int int63 = fila60.frente;
        ds.Fila fila64 = new ds.Fila();
        boolean boolean65 = fila64.vazia();
        fila64.frente = (-1);
        fila60.enfileira((java.lang.Object) fila64);
        ds.Fila fila69 = new ds.Fila();
        fila69.frente = '#';
        java.lang.Object[] objArray72 = fila69.item;
        fila60.enfileira((java.lang.Object) fila69);
        java.lang.Object[] objArray74 = fila69.item;
        fila46.item = objArray74;
        fila15.item = objArray74;
        boolean boolean77 = fila15.vazia();
        fila8.enfileira((java.lang.Object) boolean77);
        ds.Fila fila79 = new ds.Fila();
        fila79.tras = ' ';
        fila79.frente = (short) -1;
        ds.Fila fila84 = new ds.Fila();
        fila84.frente = '#';
        fila84.tras = '#';
        int int89 = fila84.frente;
        int int90 = fila84.tras;
        java.lang.Class<?> wildcardClass91 = fila84.getClass();
        fila79.enfileira((java.lang.Object) wildcardClass91);
        fila8.enfileira((java.lang.Object) fila79);
        java.lang.Object[] objArray94 = fila8.item;
        fila0.enfileira((java.lang.Object) objArray94);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 35 + "'", int89 == 35);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 35 + "'", int90 == 35);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(objArray94);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        int int2 = fila0.frente;
        int int3 = fila0.frente;
        ds.Fila fila4 = new ds.Fila();
        boolean boolean5 = fila4.vazia();
        fila4.frente = (-1);
        fila0.enfileira((java.lang.Object) fila4);
        ds.Fila fila9 = new ds.Fila();
        fila9.frente = '#';
        java.lang.Object[] objArray12 = fila9.item;
        fila0.enfileira((java.lang.Object) fila9);
        ds.Fila fila14 = new ds.Fila();
        fila14.tras = ' ';
        fila14.frente = (short) -1;
        fila9.enfileira((java.lang.Object) fila14);
        java.lang.Object[] objArray20 = fila9.item;
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        fila0.item = objArray4;
        boolean boolean6 = fila0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = fila0.desenfileira();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        fila0.tras = 100;
        java.lang.Object[] objArray8 = fila0.item;
        fila0.tras = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Fila fila0 = new ds.Fila();
        java.lang.Object[] objArray1 = fila0.item;
        boolean boolean2 = fila0.vazia();
        java.lang.Object[] objArray3 = fila0.item;
        boolean boolean4 = fila0.vazia();
        fila0.frente = (short) 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        fila0.imprime();
        int int7 = fila0.frente;
        fila0.tras = (short) 0;
        fila0.tras = (byte) 10;
        boolean boolean12 = fila0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Fila fila0 = new ds.Fila();
        fila0.frente = '#';
        fila0.tras = '#';
        int int5 = fila0.frente;
        java.lang.Object obj6 = null;
        fila0.enfileira(obj6);
        ds.Fila fila8 = new ds.Fila();
        fila8.frente = '#';
        fila8.tras = '#';
        int int13 = fila8.frente;
        ds.Fila fila14 = new ds.Fila();
        boolean boolean15 = fila14.vazia();
        fila14.frente = (-1);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        fila14.item = objArray18;
        fila8.item = objArray18;
        fila0.item = objArray18;
        int int22 = fila0.frente;
        fila0.frente = (byte) 0;
        int int25 = fila0.frente;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Fila fila0 = new ds.Fila();
        boolean boolean1 = fila0.vazia();
        fila0.frente = (-1);
        fila0.enfileira((java.lang.Object) (byte) 100);
        int int6 = fila0.frente;
        boolean boolean7 = fila0.vazia();
        fila0.tras = '4';
        boolean boolean10 = fila0.vazia();
        fila0.tras = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}

