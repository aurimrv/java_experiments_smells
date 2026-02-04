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
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Pilha pilha0 = new ds.Pilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha0.item = objArray14;
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = objArray9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Class<?> wildcardClass2 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        int int3 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        java.lang.Object[] objArray10 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.topo = 'a';
        boolean boolean11 = pilha7.vazia();
        java.lang.Object[] objArray12 = pilha7.item;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha17.item = objArray22;
        pilha13.item = objArray22;
        java.lang.Object[] objArray26 = pilha13.item;
        pilha7.item = objArray26;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha11.item = objArray14;
        pilha11.topo = (byte) -1;
        java.lang.Object[] objArray18 = null;
        pilha11.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.topo = 'a';
        boolean boolean24 = pilha20.vazia();
        java.lang.Object[] objArray25 = pilha20.item;
        pilha11.item = objArray25;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Class<?> wildcardClass3 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Class<?> wildcardClass3 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        java.lang.Class<?> wildcardClass20 = objArray18.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        boolean boolean9 = pilha5.vazia();
        java.lang.Object[] objArray10 = pilha5.item;
        pilha0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = objArray10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objArray10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        int int7 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha2.item = objArray5;
        pilha0.item = objArray5;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha0.item = objArray9;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        pilha12.item = objArray17;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha12.empilha((java.lang.Object) int21);
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 'a';
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        int int13 = pilha11.tamanho();
        boolean boolean14 = pilha11.vazia();
        java.lang.Object[] objArray15 = pilha11.item;
        pilha11.topo = (byte) 100;
        java.lang.Object[] objArray18 = pilha11.item;
        pilha0.item = objArray18;
        java.lang.Class<?> wildcardClass20 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Class<?> wildcardClass26 = objArray23.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        int int11 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) pilha7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha7.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.topo = 'a';
        java.lang.Object obj7 = pilha3.desempilha();
        pilha0.empilha(obj7);
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        java.lang.Object[] objArray11 = pilha9.item;
        pilha0.item = objArray11;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass18 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        int int14 = pilha12.tamanho();
        boolean boolean15 = pilha12.vazia();
        int int16 = pilha12.topo;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        int int20 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean4 = pilha0.vazia();
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        boolean boolean4 = pilha0.vazia();
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        java.lang.Object obj29 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass30 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        int int11 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) pilha7);
        java.lang.Class<?> wildcardClass13 = pilha7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        int int2 = pilha1.tamanho();
        pilha1.topo = 'a';
        boolean boolean5 = pilha1.vazia();
        java.lang.Object[] objArray6 = pilha1.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        pilha7.topo = 0;
        pilha7.topo = 100;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        java.lang.Object[] objArray21 = pilha17.item;
        pilha17.topo = 0;
        java.lang.Object[] objArray24 = pilha17.item;
        pilha7.item = objArray24;
        pilha1.item = objArray24;
        pilha0.item = objArray24;
        java.lang.Class<?> wildcardClass28 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray21 = pilha20.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray10 = pilha8.item;
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Class<?> wildcardClass12 = pilha8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        java.lang.Object[] objArray19 = pilha0.item;
        java.lang.Class<?> wildcardClass20 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Class<?> wildcardClass26 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.topo = 'a';
        boolean boolean16 = pilha12.vazia();
        java.lang.Object[] objArray17 = pilha12.item;
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha18.item = objArray21;
        pilha12.item = objArray21;
        java.lang.Class<?> wildcardClass24 = pilha12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        int int6 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Class<?> wildcardClass15 = objArray13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        pilha11.topo = 'a';
        boolean boolean15 = pilha11.vazia();
        java.lang.Object[] objArray16 = pilha11.item;
        int int17 = pilha11.tamanho();
        java.lang.Object obj18 = pilha11.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        int int6 = pilha4.tamanho();
        boolean boolean7 = pilha4.vazia();
        java.lang.Object[] objArray8 = pilha4.item;
        pilha4.topo = 0;
        int int11 = pilha4.topo;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        int int29 = pilha12.tamanho();
        pilha6.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        pilha31.empilha((java.lang.Object) true);
        int int35 = pilha31.tamanho();
        pilha31.topo = (byte) 1;
        pilha6.empilha((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = pilha19.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        int int15 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = pilha0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        int int14 = pilha0.tamanho();
        int int15 = pilha0.tamanho();
        int int16 = pilha0.tamanho();
        int int17 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        java.lang.Object[] objArray3 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        boolean boolean18 = pilha0.vazia();
        java.lang.Class<?> wildcardClass19 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 97;
        java.lang.Class<?> wildcardClass31 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        boolean boolean9 = pilha5.vazia();
        java.lang.Object[] objArray10 = pilha5.item;
        pilha0.item = objArray10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        boolean boolean7 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        int int18 = pilha14.tamanho();
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        java.lang.Object obj24 = pilha20.desempilha();
        java.lang.Object[] objArray25 = pilha20.item;
        pilha20.topo = 1;
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        int int30 = pilha28.tamanho();
        boolean boolean31 = pilha28.vazia();
        java.lang.Object[] objArray32 = pilha28.item;
        pilha20.item = objArray32;
        pilha14.item = objArray32;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        pilha0.topo = 96;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha13.item = objArray18;
        pilha9.item = objArray18;
        int int22 = pilha9.tamanho();
        int int23 = pilha9.tamanho();
        java.lang.Object[] objArray24 = pilha9.item;
        pilha0.item = objArray24;
        java.lang.Class<?> wildcardClass26 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray19 = pilha0.item;
        int int20 = pilha0.tamanho();
        boolean boolean21 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        int int23 = pilha19.tamanho();
        boolean boolean24 = pilha19.vazia();
        int int25 = pilha19.tamanho();
        int int26 = pilha19.topo;
        java.lang.Object[] objArray27 = pilha19.item;
        pilha0.empilha((java.lang.Object) pilha19);
        boolean boolean29 = pilha19.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray10 = pilha9.item;
        pilha9.topo = 0;
        int int13 = pilha9.tamanho();
        pilha9.topo = (byte) -1;
        pilha9.topo = 96;
        pilha0.empilha((java.lang.Object) 96);
        java.lang.Class<?> wildcardClass19 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.topo = 'a';
        java.lang.Object obj16 = pilha12.desempilha();
        pilha12.topo = (-1);
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha12.item = objArray22;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        java.lang.Class<?> wildcardClass19 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        int int14 = pilha0.tamanho();
        int int15 = pilha0.topo;
        java.lang.Object obj16 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 1 + "'", obj16, (short) 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        pilha0.item = objArray28;
        pilha0.topo = 10;
        boolean boolean32 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        int int14 = pilha0.tamanho();
        int int15 = pilha0.tamanho();
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) true);
        int int22 = pilha18.tamanho();
        boolean boolean23 = pilha18.vazia();
        pilha18.topo = 0;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        java.lang.Object[] objArray28 = pilha26.item;
        pilha18.empilha((java.lang.Object) pilha26);
        pilha18.topo = 1;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha13.item = objArray16;
        pilha11.item = objArray16;
        pilha7.item = objArray16;
        java.lang.Object obj20 = pilha7.desempilha();
        int int21 = pilha7.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        pilha22.topo = 0;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray32 = pilha30.item;
        pilha22.empilha((java.lang.Object) pilha30);
        pilha7.empilha((java.lang.Object) pilha22);
        pilha0.empilha((java.lang.Object) pilha22);
        boolean boolean36 = pilha22.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 1 + "'", obj20, (short) 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        pilha0.topo = 35;
        java.lang.Class<?> wildcardClass18 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha13.item = objArray18;
        pilha9.item = objArray18;
        int int22 = pilha9.tamanho();
        int int23 = pilha9.tamanho();
        int int24 = pilha9.tamanho();
        java.lang.Object[] objArray25 = pilha9.item;
        pilha0.item = objArray25;
        java.lang.Class<?> wildcardClass27 = objArray25.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha6.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        boolean boolean16 = pilha0.vazia();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha23.item = objArray26;
        pilha21.item = objArray26;
        pilha17.item = objArray26;
        pilha0.item = objArray26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        java.lang.Object[] objArray21 = pilha17.item;
        pilha17.topo = 0;
        int int24 = pilha17.topo;
        java.lang.Object[] objArray25 = pilha17.item;
        pilha0.item = objArray25;
        pilha0.topo = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.topo = 'a';
        java.lang.Object obj7 = pilha3.desempilha();
        pilha0.empilha(obj7);
        pilha0.topo = (-1);
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        java.lang.Class<?> wildcardClass13 = pilha11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        int int7 = pilha5.tamanho();
        boolean boolean8 = pilha5.vazia();
        java.lang.Object[] objArray9 = pilha5.item;
        pilha0.item = objArray9;
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        boolean boolean21 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        int int30 = pilha26.tamanho();
        boolean boolean31 = pilha26.vazia();
        pilha26.topo = 0;
        pilha26.topo = 100;
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        int int38 = pilha36.tamanho();
        boolean boolean39 = pilha36.vazia();
        java.lang.Object[] objArray40 = pilha36.item;
        pilha36.topo = 0;
        java.lang.Object[] objArray43 = pilha36.item;
        pilha26.item = objArray43;
        pilha0.item = objArray43;
        java.lang.Class<?> wildcardClass46 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        java.lang.Class<?> wildcardClass3 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        java.lang.Object[] objArray16 = pilha14.item;
        pilha14.topo = 'a';
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        java.lang.Object[] objArray26 = pilha24.item;
        pilha20.item = objArray26;
        pilha14.empilha((java.lang.Object) objArray26);
        pilha0.item = objArray26;
        java.lang.Object obj30 = pilha0.desempilha();
        pilha0.topo = (byte) -1;
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        pilha33.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha39.item = objArray42;
        pilha37.item = objArray42;
        pilha33.item = objArray42;
        java.lang.Object[] objArray46 = pilha33.item;
        int int47 = pilha33.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        pilha0.topo = 96;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha13.item = objArray18;
        pilha9.item = objArray18;
        int int22 = pilha9.tamanho();
        int int23 = pilha9.tamanho();
        java.lang.Object[] objArray24 = pilha9.item;
        pilha0.item = objArray24;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 100;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.topo = 'a';
        boolean boolean11 = pilha7.vazia();
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        java.lang.Object obj14 = pilha7.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        pilha19.item = objArray24;
        pilha15.item = objArray24;
        java.lang.Object[] objArray28 = pilha15.item;
        int int29 = pilha15.tamanho();
        pilha7.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        boolean boolean37 = pilha32.vazia();
        int int38 = pilha32.tamanho();
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        pilha39.topo = 'a';
        boolean boolean43 = pilha39.vazia();
        java.lang.Object[] objArray44 = pilha39.item;
        ds.Pilha pilha45 = new ds.Pilha();
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha45.item = objArray48;
        pilha39.item = objArray48;
        pilha32.empilha((java.lang.Object) objArray48);
        pilha0.empilha((java.lang.Object) pilha32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1, 100.0]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        int int14 = pilha8.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.tamanho();
        pilha8.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        int int28 = pilha22.tamanho();
        int int29 = pilha22.topo;
        java.lang.Object[] objArray30 = pilha22.item;
        pilha22.topo = 'a';
        pilha15.empilha((java.lang.Object) pilha22);
        java.lang.Object obj34 = pilha22.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        java.lang.Object[] objArray13 = pilha0.item;
        boolean boolean14 = pilha0.vazia();
        java.lang.Object[] objArray15 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objArray15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        pilha11.empilha((java.lang.Object) true);
        int int15 = pilha11.tamanho();
        boolean boolean16 = pilha11.vazia();
        int int17 = pilha11.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.topo = 'a';
        boolean boolean22 = pilha18.vazia();
        java.lang.Object[] objArray23 = pilha18.item;
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha24.item = objArray27;
        pilha18.item = objArray27;
        pilha11.empilha((java.lang.Object) objArray27);
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = (byte) -1;
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        pilha0.topo = (byte) -1;
        boolean boolean22 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.tamanho();
        int int13 = pilha0.topo;
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray19 = pilha0.item;
        pilha0.topo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        int int3 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha7.item = objArray10;
        pilha0.item = objArray10;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        int int17 = pilha13.tamanho();
        boolean boolean18 = pilha13.vazia();
        int int19 = pilha13.tamanho();
        int int20 = pilha13.topo;
        java.lang.Object[] objArray21 = pilha13.item;
        pilha13.topo = 'a';
        java.lang.Class<?> wildcardClass24 = pilha13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        java.lang.Object[] objArray16 = pilha14.item;
        pilha14.topo = 'a';
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        java.lang.Object[] objArray26 = pilha24.item;
        pilha20.item = objArray26;
        pilha14.empilha((java.lang.Object) objArray26);
        pilha0.item = objArray26;
        int int30 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha9.topo = (byte) -1;
        java.lang.Object[] objArray16 = null;
        pilha9.item = objArray16;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.topo = 'a';
        boolean boolean22 = pilha18.vazia();
        java.lang.Object[] objArray23 = pilha18.item;
        pilha9.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Class<?> wildcardClass26 = objArray23.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        pilha0.empilha((java.lang.Object) (byte) 10);
        int int10 = pilha0.topo;
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        int int6 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        java.lang.Object[] objArray8 = pilha0.item;
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        pilha0.topo = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        int int14 = pilha0.tamanho();
        boolean boolean15 = pilha0.vazia();
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        pilha0.topo = 2;
        java.lang.Object obj10 = pilha0.desempilha();
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        int int5 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        java.lang.Object[] objArray20 = pilha0.item;
        boolean boolean21 = pilha0.vazia();
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        java.lang.Object[] objArray16 = pilha14.item;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.topo = 'a';
        java.lang.Object obj21 = pilha17.desempilha();
        pilha14.empilha(obj21);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        java.lang.Object[] objArray25 = pilha23.item;
        pilha23.topo = 'a';
        java.lang.Object[] objArray28 = pilha23.item;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) true);
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        java.lang.Object[] objArray35 = pilha33.item;
        pilha29.item = objArray35;
        pilha23.empilha((java.lang.Object) objArray35);
        pilha14.item = objArray35;
        boolean boolean39 = pilha14.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) boolean39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        boolean boolean9 = pilha6.vazia();
        java.lang.Object[] objArray10 = pilha6.item;
        pilha6.topo = (byte) 100;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object[] objArray15 = pilha6.item;
        java.lang.Class<?> wildcardClass16 = pilha6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        pilha0.topo = 0;
        int int17 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.topo;
        pilha0.topo = (byte) -1;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.topo = 'a';
        boolean boolean11 = pilha7.vazia();
        java.lang.Object[] objArray12 = pilha7.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        int int17 = pilha13.tamanho();
        boolean boolean18 = pilha13.vazia();
        pilha13.topo = 0;
        pilha13.topo = 100;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        int int25 = pilha23.tamanho();
        boolean boolean26 = pilha23.vazia();
        java.lang.Object[] objArray27 = pilha23.item;
        pilha23.topo = 0;
        java.lang.Object[] objArray30 = pilha23.item;
        pilha13.item = objArray30;
        pilha7.item = objArray30;
        java.lang.Object[] objArray33 = pilha7.item;
        java.lang.Object[] objArray34 = pilha7.item;
        pilha0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha0.item = objArray14;
        ds.Pilha pilha16 = new ds.Pilha();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha16.item = objArray19;
        pilha16.topo = (byte) -1;
        java.lang.Object[] objArray23 = null;
        pilha16.item = objArray23;
        boolean boolean25 = pilha16.vazia();
        boolean boolean26 = pilha16.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 'a';
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        int int13 = pilha11.tamanho();
        boolean boolean14 = pilha11.vazia();
        java.lang.Object[] objArray15 = pilha11.item;
        pilha11.topo = (byte) 100;
        java.lang.Object[] objArray18 = pilha11.item;
        pilha0.item = objArray18;
        java.lang.Object[] objArray20 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        int int29 = pilha12.tamanho();
        pilha6.empilha((java.lang.Object) pilha12);
        boolean boolean31 = pilha6.vazia();
        java.lang.Class<?> wildcardClass32 = pilha6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha7.item = objArray10;
        pilha0.item = objArray10;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray14 = pilha13.item;
        int int15 = pilha13.topo;
        java.lang.Object[] objArray16 = pilha13.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        int int30 = pilha26.tamanho();
        boolean boolean31 = pilha26.vazia();
        pilha26.topo = 0;
        pilha26.topo = 100;
        ds.Pilha pilha36 = new ds.Pilha();
        boolean boolean37 = pilha36.vazia();
        int int38 = pilha36.tamanho();
        boolean boolean39 = pilha36.vazia();
        java.lang.Object[] objArray40 = pilha36.item;
        pilha36.topo = 0;
        java.lang.Object[] objArray43 = pilha36.item;
        pilha26.item = objArray43;
        pilha0.item = objArray43;
        boolean boolean46 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        pilha0.topo = 2;
        int int15 = pilha0.topo;
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        pilha0.topo = (byte) 10;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.empilha((java.lang.Object) true);
        int int14 = pilha10.tamanho();
        boolean boolean15 = pilha10.vazia();
        int int16 = pilha10.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) true);
        int int21 = pilha17.tamanho();
        boolean boolean22 = pilha17.vazia();
        int int23 = pilha17.tamanho();
        int int24 = pilha17.topo;
        java.lang.Object[] objArray25 = pilha17.item;
        pilha10.item = objArray25;
        pilha0.item = objArray25;
        int int28 = pilha0.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) true);
        int int33 = pilha29.tamanho();
        boolean boolean34 = pilha29.vazia();
        pilha29.topo = 0;
        pilha29.topo = 100;
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        int int41 = pilha39.tamanho();
        boolean boolean42 = pilha39.vazia();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha39.topo = 0;
        java.lang.Object[] objArray46 = pilha39.item;
        pilha29.item = objArray46;
        java.lang.Object[] objArray48 = pilha29.item;
        pilha0.item = objArray48;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.empilha((java.lang.Object) true);
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1), objArray12, (short) 100, (short) 100, 0.0d };
        pilha4.item = objArray17;
        java.lang.Object obj19 = pilha4.desempilha();
        pilha0.empilha(obj19);
        int int21 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass22 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1) + "'", obj19, (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object obj2 = null;
        pilha0.empilha(obj2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        boolean boolean7 = pilha0.vazia();
        int int8 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        pilha15.topo = 100;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        int int27 = pilha25.tamanho();
        boolean boolean28 = pilha25.vazia();
        java.lang.Object[] objArray29 = pilha25.item;
        pilha25.topo = 0;
        java.lang.Object[] objArray32 = pilha25.item;
        pilha15.item = objArray32;
        pilha9.item = objArray32;
        pilha8.item = objArray32;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha36.topo = (byte) -1;
        java.lang.Object[] objArray43 = null;
        pilha36.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        boolean boolean49 = pilha45.vazia();
        java.lang.Object[] objArray50 = pilha45.item;
        pilha36.item = objArray50;
        pilha8.item = objArray50;
        pilha0.item = objArray50;
        java.lang.Class<?> wildcardClass54 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        pilha0.topo = 1;
        pilha0.topo = 1;
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object obj10 = pilha0.desempilha();
        int int11 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        java.lang.Object[] objArray20 = pilha0.item;
        boolean boolean21 = pilha0.vazia();
        int int22 = pilha0.tamanho();
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        int int8 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.topo = 'a';
        java.lang.Object obj10 = pilha6.desempilha();
        int int11 = pilha6.topo;
        int int12 = pilha6.topo;
        boolean boolean13 = pilha6.vazia();
        pilha0.empilha((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 96 + "'", int11 == 96);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 96 + "'", int12 == 96);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.topo = 'a';
        boolean boolean16 = pilha12.vazia();
        java.lang.Object[] objArray17 = pilha12.item;
        int int18 = pilha12.topo;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        int int4 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        int int29 = pilha12.tamanho();
        pilha6.empilha((java.lang.Object) pilha12);
        int int31 = pilha6.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        int int4 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        pilha15.topo = 'a';
        java.lang.Object[] objArray20 = pilha15.item;
        pilha0.empilha((java.lang.Object) objArray20);
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) true);
        java.lang.Object obj29 = pilha25.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.topo = 'a';
        boolean boolean34 = pilha30.vazia();
        java.lang.Object[] objArray35 = pilha30.item;
        pilha25.item = objArray35;
        pilha22.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.empilha((java.lang.Object) true);
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha43.item = objArray46;
        java.lang.Object[] objArray51 = new java.lang.Object[] { (-1), objArray46, (short) 100, (short) 100, 0.0d };
        pilha38.item = objArray51;
        pilha22.item = objArray51;
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.tamanho();
        pilha54.empilha((java.lang.Object) true);
        ds.Pilha pilha59 = new ds.Pilha();
        java.lang.Object[] objArray62 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha59.item = objArray62;
        java.lang.Object[] objArray67 = new java.lang.Object[] { (-1), objArray62, (short) 100, (short) 100, 0.0d };
        pilha54.item = objArray67;
        pilha22.item = objArray67;
        pilha0.empilha((java.lang.Object) pilha22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        boolean boolean17 = pilha0.vazia();
        java.lang.Class<?> wildcardClass18 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 0;
        int int20 = pilha0.tamanho();
        pilha0.topo = 100;
        boolean boolean23 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.topo;
        int int18 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha4.item = objArray7;
        pilha0.item = objArray7;
        int int10 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.topo = (short) -1;
        boolean boolean7 = pilha3.vazia();
        java.lang.Object[] objArray8 = pilha3.item;
        java.lang.Object[] objArray9 = pilha3.item;
        pilha0.item = objArray9;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        java.lang.Object[] objArray13 = pilha0.item;
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNull(objArray13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray10 = pilha8.item;
        pilha0.empilha((java.lang.Object) pilha8);
        pilha0.topo = 1;
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        int int15 = pilha0.tamanho();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha18.item = objArray21;
        pilha16.item = objArray21;
        pilha0.item = objArray21;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha8.item = objArray11;
        pilha8.topo = (byte) -1;
        java.lang.Object[] objArray15 = null;
        pilha8.item = objArray15;
        java.lang.Object[] objArray17 = pilha8.item;
        pilha8.topo = 100;
        int int20 = pilha8.topo;
        pilha8.topo = 2;
        int int23 = pilha8.topo;
        pilha0.empilha((java.lang.Object) int23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        pilha0.topo = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        java.lang.Object[] objArray29 = pilha19.item;
        int int30 = pilha19.topo;
        java.lang.Class<?> wildcardClass31 = pilha19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj3 = pilha0.desempilha();
        pilha0.empilha((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0f) + "'", obj3, (-1.0f));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        int int2 = pilha0.topo;
        int int3 = pilha0.topo;
        pilha0.topo = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj3 = pilha0.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0f) + "'", obj3, (-1.0f));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) true);
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) 1;
        java.lang.Object[] objArray28 = pilha21.item;
        pilha0.item = objArray28;
        int int30 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        pilha0.topo = '4';
        pilha0.topo = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        pilha15.topo = 100;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        int int27 = pilha25.tamanho();
        boolean boolean28 = pilha25.vazia();
        java.lang.Object[] objArray29 = pilha25.item;
        pilha25.topo = 0;
        java.lang.Object[] objArray32 = pilha25.item;
        pilha15.item = objArray32;
        pilha9.item = objArray32;
        pilha8.item = objArray32;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha36.topo = (byte) -1;
        java.lang.Object[] objArray43 = null;
        pilha36.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        boolean boolean49 = pilha45.vazia();
        java.lang.Object[] objArray50 = pilha45.item;
        pilha36.item = objArray50;
        pilha8.item = objArray50;
        pilha0.item = objArray50;
        int int54 = pilha0.topo;
        ds.Pilha pilha55 = new ds.Pilha();
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha55.item = objArray58;
        pilha55.topo = (byte) -1;
        java.lang.Object[] objArray62 = null;
        pilha55.item = objArray62;
        int int64 = pilha55.tamanho();
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.tamanho();
        pilha65.empilha((java.lang.Object) true);
        ds.Pilha pilha69 = new ds.Pilha();
        int int70 = pilha69.tamanho();
        java.lang.Object[] objArray71 = pilha69.item;
        pilha65.item = objArray71;
        ds.Pilha pilha73 = new ds.Pilha();
        int int74 = pilha73.tamanho();
        pilha73.topo = 'a';
        int int77 = pilha73.tamanho();
        java.lang.Object[] objArray78 = pilha73.item;
        pilha65.item = objArray78;
        pilha55.item = objArray78;
        pilha0.item = objArray78;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) boolean11);
        boolean boolean13 = pilha0.vazia();
        boolean boolean14 = pilha0.vazia();
        java.lang.Object obj15 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        java.lang.Object[] objArray12 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objArray12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        java.lang.Object[] objArray8 = pilha0.item;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) true);
        java.lang.Object obj13 = pilha9.desempilha();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha0.item = objArray14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 97;
        java.lang.Object[] objArray31 = pilha0.item;
        boolean boolean32 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        int int5 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        java.lang.Class<?> wildcardClass21 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        int int21 = pilha0.tamanho();
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        int int25 = pilha23.tamanho();
        boolean boolean26 = pilha23.vazia();
        java.lang.Object[] objArray27 = pilha23.item;
        pilha23.topo = (byte) 100;
        java.lang.Object[] objArray30 = pilha23.item;
        java.lang.Object obj31 = pilha23.desempilha();
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        boolean boolean37 = pilha32.vazia();
        int int38 = pilha32.tamanho();
        int int39 = pilha32.topo;
        java.lang.Object[] objArray40 = pilha32.item;
        pilha23.empilha((java.lang.Object) objArray40);
        pilha0.empilha((java.lang.Object) pilha23);
        java.lang.Class<?> wildcardClass43 = pilha23.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        boolean boolean9 = pilha6.vazia();
        java.lang.Object[] objArray10 = pilha6.item;
        pilha6.topo = (byte) 100;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        java.lang.Object obj15 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.empilha((java.lang.Object) true);
        int int8 = pilha4.tamanho();
        java.lang.Object[] objArray9 = pilha4.item;
        pilha0.item = objArray9;
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object[] objArray12 = pilha0.item;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha13.item = objArray16;
        pilha13.topo = (byte) -1;
        java.lang.Object[] objArray20 = null;
        pilha13.item = objArray20;
        int int22 = pilha13.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Object[] objArray29 = pilha27.item;
        pilha23.item = objArray29;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        pilha31.topo = 'a';
        int int35 = pilha31.tamanho();
        java.lang.Object[] objArray36 = pilha31.item;
        pilha23.item = objArray36;
        pilha13.item = objArray36;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        pilha0.topo = 96;
        int int9 = pilha0.topo;
        java.lang.Class<?> wildcardClass10 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        pilha0.topo = 0;
        pilha0.topo = (byte) 0;
        pilha0.topo = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pilha6.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        boolean boolean19 = pilha0.vazia();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.topo = 'a';
        boolean boolean24 = pilha20.vazia();
        java.lang.Object[] objArray25 = pilha20.item;
        int int26 = pilha20.tamanho();
        java.lang.Object obj27 = pilha20.desempilha();
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha34.item = objArray37;
        pilha32.item = objArray37;
        pilha28.item = objArray37;
        java.lang.Object[] objArray41 = pilha28.item;
        int int42 = pilha28.tamanho();
        pilha20.empilha((java.lang.Object) pilha28);
        int int44 = pilha20.tamanho();
        pilha0.empilha((java.lang.Object) int44);
        java.lang.Object obj46 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[97, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 97 + "'", obj46, 97);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        boolean boolean15 = pilha0.vazia();
        java.lang.Class<?> wildcardClass16 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        int int7 = pilha5.tamanho();
        boolean boolean8 = pilha5.vazia();
        java.lang.Object[] objArray9 = pilha5.item;
        pilha0.item = objArray9;
        int int11 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        java.lang.Object obj7 = null;
        pilha0.empilha(obj7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.topo;
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.topo;
        pilha20.empilha((java.lang.Object) (-1));
        boolean boolean24 = pilha20.vazia();
        int int25 = pilha20.tamanho();
        int int26 = pilha20.tamanho();
        int int27 = pilha20.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        pilha28.topo = 'a';
        int int32 = pilha28.tamanho();
        java.lang.Object[] objArray33 = pilha28.item;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.empilha((java.lang.Object) true);
        int int38 = pilha34.tamanho();
        java.lang.Object[] objArray39 = pilha34.item;
        java.lang.Object obj40 = pilha34.desempilha();
        java.lang.Object[] objArray41 = pilha34.item;
        pilha28.empilha((java.lang.Object) pilha34);
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.tamanho();
        pilha43.empilha((java.lang.Object) true);
        int int47 = pilha43.tamanho();
        java.lang.Object[] objArray48 = pilha43.item;
        pilha43.topo = 1;
        int int51 = pilha43.tamanho();
        java.lang.Object[] objArray52 = pilha43.item;
        pilha34.item = objArray52;
        boolean boolean54 = pilha34.vazia();
        pilha20.empilha((java.lang.Object) pilha34);
        pilha20.topo = (short) -1;
        pilha0.empilha((java.lang.Object) (short) -1);
        pilha0.topo = (short) -1;
        java.lang.Class<?> wildcardClass61 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + true + "'", obj40, true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        pilha0.topo = 2;
        pilha0.topo = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha7.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object[] objArray13 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.tamanho();
        int int13 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        pilha19.topo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray28 = pilha15.item;
        java.lang.Object obj29 = pilha15.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.empilha((java.lang.Object) true);
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha35.item = objArray38;
        java.lang.Object[] objArray43 = new java.lang.Object[] { (-1), objArray38, (short) 100, (short) 100, 0.0d };
        pilha30.item = objArray43;
        java.lang.Object obj45 = pilha30.desempilha();
        java.lang.Object[] objArray46 = pilha30.item;
        pilha15.item = objArray46;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1) + "'", obj45, (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        java.lang.Object obj9 = pilha5.desempilha();
        int int10 = pilha5.topo;
        pilha5.topo = 0;
        int int13 = pilha5.tamanho();
        pilha0.empilha((java.lang.Object) pilha5);
        java.lang.Object[] objArray15 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        pilha0.topo = 0;
        int int22 = pilha0.topo;
        int int23 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        int int16 = pilha0.tamanho();
        boolean boolean17 = pilha0.vazia();
        java.lang.Class<?> wildcardClass18 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        pilha15.topo = 100;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        int int27 = pilha25.tamanho();
        boolean boolean28 = pilha25.vazia();
        java.lang.Object[] objArray29 = pilha25.item;
        pilha25.topo = 0;
        java.lang.Object[] objArray32 = pilha25.item;
        pilha15.item = objArray32;
        pilha9.item = objArray32;
        pilha8.item = objArray32;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha36.topo = (byte) -1;
        java.lang.Object[] objArray43 = null;
        pilha36.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        boolean boolean49 = pilha45.vazia();
        java.lang.Object[] objArray50 = pilha45.item;
        pilha36.item = objArray50;
        pilha8.item = objArray50;
        pilha0.item = objArray50;
        boolean boolean54 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = 96;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.empilha((java.lang.Object) true);
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) 1;
        java.lang.Object[] objArray28 = pilha21.item;
        pilha0.item = objArray28;
        int int30 = pilha0.tamanho();
        int int31 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        boolean boolean4 = pilha0.vazia();
        boolean boolean5 = pilha0.vazia();
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        pilha7.topo = (short) 10;
        int int25 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) int25);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        int int31 = pilha27.tamanho();
        ds.Pilha pilha32 = new ds.Pilha();
        boolean boolean33 = pilha32.vazia();
        int int34 = pilha32.tamanho();
        boolean boolean35 = pilha32.vazia();
        java.lang.Object[] objArray36 = pilha32.item;
        pilha27.item = objArray36;
        pilha0.item = objArray36;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        pilha39.empilha((java.lang.Object) true);
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha44.item = objArray47;
        java.lang.Object[] objArray52 = new java.lang.Object[] { (-1), objArray47, (short) 100, (short) 100, 0.0d };
        pilha39.item = objArray52;
        int int54 = pilha39.tamanho();
        java.lang.Object obj55 = pilha39.desempilha();
        int int56 = pilha39.topo;
        boolean boolean57 = pilha39.vazia();
        boolean boolean58 = pilha39.vazia();
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.tamanho();
        pilha59.topo = 'a';
        boolean boolean63 = pilha59.vazia();
        java.lang.Object[] objArray64 = pilha59.item;
        int int65 = pilha59.tamanho();
        java.lang.Object obj66 = pilha59.desempilha();
        ds.Pilha pilha67 = new ds.Pilha();
        boolean boolean68 = pilha67.vazia();
        pilha67.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha71 = new ds.Pilha();
        int int72 = pilha71.tamanho();
        ds.Pilha pilha73 = new ds.Pilha();
        java.lang.Object[] objArray76 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha73.item = objArray76;
        pilha71.item = objArray76;
        pilha67.item = objArray76;
        java.lang.Object[] objArray80 = pilha67.item;
        int int81 = pilha67.tamanho();
        pilha59.empilha((java.lang.Object) pilha67);
        int int83 = pilha59.tamanho();
        pilha39.empilha((java.lang.Object) int83);
        pilha0.empilha((java.lang.Object) pilha39);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[97, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (-1) + "'", obj55, (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 97 + "'", int83 == 97);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha21.topo = 0;
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) -1;
        pilha21.topo = 96;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha34.item = objArray39;
        pilha30.item = objArray39;
        int int43 = pilha30.tamanho();
        int int44 = pilha30.tamanho();
        java.lang.Object[] objArray45 = pilha30.item;
        pilha21.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        pilha47.empilha((java.lang.Object) (-1));
        boolean boolean51 = pilha47.vazia();
        pilha47.topo = (short) 100;
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        int int56 = pilha54.tamanho();
        boolean boolean57 = pilha54.vazia();
        java.lang.Object[] objArray58 = pilha54.item;
        pilha54.topo = 0;
        java.lang.Object[] objArray61 = pilha54.item;
        pilha47.item = objArray61;
        pilha21.item = objArray61;
        pilha0.item = objArray61;
        java.lang.Class<?> wildcardClass65 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Class<?> wildcardClass11 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        pilha15.topo = 100;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        int int27 = pilha25.tamanho();
        boolean boolean28 = pilha25.vazia();
        java.lang.Object[] objArray29 = pilha25.item;
        pilha25.topo = 0;
        java.lang.Object[] objArray32 = pilha25.item;
        pilha15.item = objArray32;
        pilha9.item = objArray32;
        pilha8.item = objArray32;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha36.topo = (byte) -1;
        java.lang.Object[] objArray43 = null;
        pilha36.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        boolean boolean49 = pilha45.vazia();
        java.lang.Object[] objArray50 = pilha45.item;
        pilha36.item = objArray50;
        pilha8.item = objArray50;
        pilha0.item = objArray50;
        int int54 = pilha0.topo;
        int int55 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 'a';
        int int11 = pilha0.topo;
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        pilha12.item = objArray17;
        pilha8.item = objArray17;
        java.lang.Object[] objArray21 = pilha8.item;
        int int22 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        int int24 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass25 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        java.lang.Object obj15 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        int int18 = pilha14.tamanho();
        java.lang.Object[] objArray19 = pilha14.item;
        java.lang.Object obj20 = pilha14.desempilha();
        java.lang.Object[] objArray21 = pilha14.item;
        pilha8.empilha((java.lang.Object) pilha14);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        java.lang.Object[] objArray28 = pilha23.item;
        pilha23.topo = 1;
        int int31 = pilha23.tamanho();
        java.lang.Object[] objArray32 = pilha23.item;
        pilha14.item = objArray32;
        boolean boolean34 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        java.lang.Object[] objArray36 = null;
        pilha0.item = objArray36;
        int int38 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        int int16 = pilha0.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        pilha17.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha23.item = objArray26;
        pilha21.item = objArray26;
        pilha17.item = objArray26;
        java.lang.Object[] objArray30 = pilha17.item;
        pilha0.item = objArray30;
        int int32 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        int int30 = pilha16.tamanho();
        pilha16.topo = 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        java.lang.Object[] objArray38 = pilha33.item;
        pilha33.topo = 1;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        pilha42.empilha((java.lang.Object) true);
        int int46 = pilha42.tamanho();
        boolean boolean47 = pilha42.vazia();
        int int48 = pilha42.tamanho();
        int int49 = pilha42.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha42.item = objArray51;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        java.lang.Object[] objArray55 = pilha53.item;
        int int56 = pilha53.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha63.item = objArray66;
        pilha61.item = objArray66;
        pilha57.item = objArray66;
        java.lang.Object[] objArray70 = pilha57.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { pilha16, pilha33, "", objArray51, int56, objArray70 };
        pilha0.item = objArray71;
        int int73 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        int int23 = pilha19.tamanho();
        boolean boolean24 = pilha19.vazia();
        int int25 = pilha19.tamanho();
        int int26 = pilha19.topo;
        java.lang.Object[] objArray27 = pilha19.item;
        pilha0.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        pilha29.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        ds.Pilha pilha35 = new ds.Pilha();
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha35.item = objArray38;
        pilha33.item = objArray38;
        pilha29.item = objArray38;
        pilha19.item = objArray38;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, 100.0]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        int int11 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha18.item = objArray21;
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1), objArray21, (short) 100, (short) 100, 0.0d };
        pilha13.item = objArray26;
        java.lang.Object obj28 = pilha13.desempilha();
        java.lang.Object[] objArray29 = pilha13.item;
        int int30 = pilha13.topo;
        pilha0.empilha((java.lang.Object) pilha13);
        java.lang.Class<?> wildcardClass32 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1) + "'", obj28, (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        boolean boolean5 = pilha4.vazia();
        java.lang.Object[] objArray6 = pilha4.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.topo = 'a';
        java.lang.Object obj11 = pilha7.desempilha();
        pilha4.empilha(obj11);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        java.lang.Object[] objArray15 = pilha13.item;
        pilha13.topo = 'a';
        java.lang.Object[] objArray18 = pilha13.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        java.lang.Object[] objArray25 = pilha23.item;
        pilha19.item = objArray25;
        pilha13.empilha((java.lang.Object) objArray25);
        pilha4.item = objArray25;
        ds.Pilha pilha29 = new ds.Pilha();
        boolean boolean30 = pilha29.vazia();
        int int31 = pilha29.tamanho();
        boolean boolean32 = pilha29.vazia();
        int int33 = pilha29.topo;
        pilha4.empilha((java.lang.Object) pilha29);
        ds.Pilha pilha35 = new ds.Pilha();
        boolean boolean36 = pilha35.vazia();
        pilha35.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha41.item = objArray44;
        pilha39.item = objArray44;
        pilha35.item = objArray44;
        pilha4.item = objArray44;
        pilha0.item = objArray44;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha21.topo = 0;
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) -1;
        pilha21.topo = 96;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha34.item = objArray39;
        pilha30.item = objArray39;
        int int43 = pilha30.tamanho();
        int int44 = pilha30.tamanho();
        java.lang.Object[] objArray45 = pilha30.item;
        pilha21.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        pilha47.empilha((java.lang.Object) (-1));
        boolean boolean51 = pilha47.vazia();
        pilha47.topo = (short) 100;
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        int int56 = pilha54.tamanho();
        boolean boolean57 = pilha54.vazia();
        java.lang.Object[] objArray58 = pilha54.item;
        pilha54.topo = 0;
        java.lang.Object[] objArray61 = pilha54.item;
        pilha47.item = objArray61;
        pilha21.item = objArray61;
        pilha0.item = objArray61;
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.tamanho();
        pilha65.empilha((java.lang.Object) true);
        int int69 = pilha65.tamanho();
        boolean boolean70 = pilha65.vazia();
        pilha65.topo = 0;
        pilha65.topo = 100;
        ds.Pilha pilha75 = new ds.Pilha();
        boolean boolean76 = pilha75.vazia();
        int int77 = pilha75.tamanho();
        boolean boolean78 = pilha75.vazia();
        java.lang.Object[] objArray79 = pilha75.item;
        pilha75.topo = 0;
        java.lang.Object[] objArray82 = pilha75.item;
        pilha65.item = objArray82;
        java.lang.Object[] objArray84 = pilha65.item;
        pilha0.empilha((java.lang.Object) pilha65);
        int int86 = pilha65.topo;
        int int87 = pilha65.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 100 + "'", int87 == 100);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = null;
        pilha0.empilha(obj6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        boolean boolean9 = pilha6.vazia();
        java.lang.Object[] objArray10 = pilha6.item;
        pilha6.topo = (byte) 100;
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        int int15 = pilha6.tamanho();
        pilha6.topo = 96;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        ds.Pilha pilha5 = new ds.Pilha();
        boolean boolean6 = pilha5.vazia();
        pilha5.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha11.item = objArray14;
        pilha9.item = objArray14;
        pilha5.item = objArray14;
        int int18 = pilha5.tamanho();
        int int19 = pilha5.tamanho();
        java.lang.Object[] objArray20 = pilha5.item;
        pilha0.item = objArray20;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = 97;
        ds.Pilha pilha13 = new ds.Pilha();
        boolean boolean14 = pilha13.vazia();
        pilha13.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha17.item = objArray22;
        pilha13.item = objArray22;
        int int26 = pilha13.tamanho();
        int int27 = pilha13.tamanho();
        java.lang.Object[] objArray28 = pilha13.item;
        boolean boolean29 = pilha13.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        pilha0.topo = (byte) 10;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        java.lang.Object[] objArray21 = pilha20.item;
        pilha18.item = objArray21;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.topo = 'a';
        java.lang.Object obj27 = pilha23.desempilha();
        int int28 = pilha23.topo;
        pilha23.topo = 0;
        int int31 = pilha23.tamanho();
        pilha18.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray34 = pilha33.item;
        pilha33.topo = 0;
        int int37 = pilha33.tamanho();
        pilha33.topo = (byte) -1;
        pilha33.topo = 96;
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        pilha42.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha46 = new ds.Pilha();
        int int47 = pilha46.tamanho();
        ds.Pilha pilha48 = new ds.Pilha();
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha48.item = objArray51;
        pilha46.item = objArray51;
        pilha42.item = objArray51;
        int int55 = pilha42.tamanho();
        int int56 = pilha42.tamanho();
        java.lang.Object[] objArray57 = pilha42.item;
        pilha33.item = objArray57;
        ds.Pilha pilha59 = new ds.Pilha();
        int int60 = pilha59.topo;
        pilha59.empilha((java.lang.Object) (-1));
        boolean boolean63 = pilha59.vazia();
        pilha59.topo = (short) 100;
        ds.Pilha pilha66 = new ds.Pilha();
        boolean boolean67 = pilha66.vazia();
        int int68 = pilha66.tamanho();
        boolean boolean69 = pilha66.vazia();
        java.lang.Object[] objArray70 = pilha66.item;
        pilha66.topo = 0;
        java.lang.Object[] objArray73 = pilha66.item;
        pilha59.item = objArray73;
        pilha33.item = objArray73;
        pilha23.item = objArray73;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 96 + "'", int28 == 96);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray12 = pilha0.item;
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        java.lang.Object[] objArray28 = pilha15.item;
        ds.Pilha pilha29 = new ds.Pilha();
        pilha29.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        java.lang.Object obj36 = pilha32.desempilha();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.topo = 'a';
        boolean boolean41 = pilha37.vazia();
        java.lang.Object[] objArray42 = pilha37.item;
        pilha32.item = objArray42;
        pilha29.item = objArray42;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.empilha((java.lang.Object) true);
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha50.item = objArray53;
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1), objArray53, (short) 100, (short) 100, 0.0d };
        pilha45.item = objArray58;
        pilha29.item = objArray58;
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        pilha61.empilha((java.lang.Object) true);
        ds.Pilha pilha66 = new ds.Pilha();
        java.lang.Object[] objArray69 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha66.item = objArray69;
        java.lang.Object[] objArray74 = new java.lang.Object[] { (-1), objArray69, (short) 100, (short) 100, 0.0d };
        pilha61.item = objArray74;
        pilha29.item = objArray74;
        pilha15.item = objArray74;
        int int78 = pilha15.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + true + "'", obj36, true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 97;
        int int31 = pilha0.tamanho();
        pilha0.topo = 96;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        int int8 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha0.item = objArray9;
        int int12 = pilha0.tamanho();
        int int13 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        int int29 = pilha12.tamanho();
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        int int32 = pilha30.tamanho();
        boolean boolean33 = pilha30.vazia();
        int int34 = pilha30.topo;
        pilha12.empilha((java.lang.Object) pilha30);
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        java.lang.Class<?> wildcardClass13 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        pilha0.topo = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.topo;
        pilha0.topo = (byte) -1;
        pilha0.topo = 1;
        java.lang.Object[] objArray9 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        pilha16.topo = 2;
        java.lang.Object[] objArray23 = pilha16.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 0;
        pilha0.topo = ' ';
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha22.topo = (byte) -1;
        java.lang.Object[] objArray29 = null;
        pilha22.item = objArray29;
        java.lang.Object[] objArray31 = pilha22.item;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.topo = 'a';
        boolean boolean36 = pilha32.vazia();
        java.lang.Object[] objArray37 = pilha32.item;
        ds.Pilha pilha38 = new ds.Pilha();
        boolean boolean39 = pilha38.vazia();
        pilha38.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha44.item = objArray47;
        pilha42.item = objArray47;
        pilha38.item = objArray47;
        java.lang.Object[] objArray51 = pilha38.item;
        pilha32.item = objArray51;
        pilha22.item = objArray51;
        pilha22.topo = 1;
        boolean boolean56 = pilha22.vazia();
        ds.Pilha pilha57 = new ds.Pilha();
        int int58 = pilha57.tamanho();
        java.lang.Object[] objArray59 = pilha57.item;
        pilha22.item = objArray59;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int18 = pilha0.tamanho();
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = 97;
        pilha0.topo = 0;
        int int24 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.topo;
        java.lang.Object obj12 = pilha0.desempilha();
        pilha0.topo = (short) -1;
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = (-1);
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.topo = 'a';
        boolean boolean10 = pilha6.vazia();
        java.lang.Object[] objArray11 = pilha6.item;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        pilha12.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        ds.Pilha pilha18 = new ds.Pilha();
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha18.item = objArray21;
        pilha16.item = objArray21;
        pilha12.item = objArray21;
        java.lang.Object[] objArray25 = pilha12.item;
        pilha6.item = objArray25;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        int int31 = pilha27.tamanho();
        pilha27.topo = (byte) 1;
        java.lang.Object[] objArray34 = pilha27.item;
        pilha6.item = objArray34;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray9 = pilha8.item;
        pilha0.item = objArray9;
        int int11 = pilha0.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        pilha0.item = objArray28;
        pilha0.topo = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = (short) -1;
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        java.lang.Object obj10 = pilha6.desempilha();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + true + "'", obj10, true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        int int21 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.tamanho();
        boolean boolean13 = pilha0.vazia();
        java.lang.Object[] objArray14 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objArray14);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray3 = pilha2.item;
        pilha0.item = objArray3;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        java.lang.Object obj9 = pilha5.desempilha();
        int int10 = pilha5.topo;
        pilha5.topo = 0;
        int int13 = pilha5.tamanho();
        pilha0.empilha((java.lang.Object) pilha5);
        int int15 = pilha0.tamanho();
        pilha0.topo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha7.item = objArray10;
        pilha0.item = objArray10;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1), objArray22, (short) 100, (short) 100, 0.0d };
        pilha14.item = objArray27;
        java.lang.Object obj29 = pilha14.desempilha();
        java.lang.Object[] objArray30 = pilha14.item;
        pilha14.topo = (byte) 0;
        java.lang.Object[] objArray33 = pilha14.item;
        int int34 = pilha14.tamanho();
        java.lang.Object[] objArray35 = pilha14.item;
        pilha0.item = objArray35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1) + "'", obj29, (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        java.lang.Object[] objArray16 = pilha14.item;
        pilha14.topo = 'a';
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        java.lang.Object[] objArray26 = pilha24.item;
        pilha20.item = objArray26;
        pilha14.empilha((java.lang.Object) objArray26);
        pilha0.item = objArray26;
        java.lang.Object obj30 = pilha0.desempilha();
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray33 = null;
        pilha0.item = objArray33;
        java.lang.Object[] objArray35 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(objArray35);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        int int23 = pilha19.tamanho();
        boolean boolean24 = pilha19.vazia();
        int int25 = pilha19.tamanho();
        int int26 = pilha19.topo;
        java.lang.Object[] objArray27 = pilha19.item;
        pilha0.empilha((java.lang.Object) pilha19);
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha29.item = objArray32;
        pilha29.topo = (byte) -1;
        java.lang.Object[] objArray36 = null;
        pilha29.item = objArray36;
        int int38 = pilha29.tamanho();
        int int39 = pilha29.tamanho();
        pilha19.empilha((java.lang.Object) pilha29);
        java.lang.Object obj41 = null;
        // The following exception was thrown during execution in test generation
        try {
            pilha29.empilha(obj41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        pilha0.topo = 1;
        java.lang.Object obj6 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1) + "'", obj6, (-1));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.topo = 'a';
        boolean boolean14 = pilha10.vazia();
        java.lang.Object[] objArray15 = pilha10.item;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        pilha10.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 1;
        boolean boolean34 = pilha0.vazia();
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        java.lang.Object[] objArray37 = pilha35.item;
        pilha0.item = objArray37;
        int int39 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha2.item = objArray5;
        pilha0.item = objArray5;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) int9);
        int int11 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        int int30 = pilha26.tamanho();
        boolean boolean31 = pilha26.vazia();
        int int32 = pilha26.tamanho();
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        boolean boolean38 = pilha33.vazia();
        int int39 = pilha33.tamanho();
        int int40 = pilha33.topo;
        java.lang.Object[] objArray41 = pilha33.item;
        pilha26.item = objArray41;
        pilha0.item = objArray41;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        int int7 = pilha0.topo;
        java.lang.Object obj8 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.topo = 'a';
        boolean boolean11 = pilha7.vazia();
        java.lang.Object[] objArray12 = pilha7.item;
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha13.item = objArray16;
        pilha7.item = objArray16;
        pilha0.empilha((java.lang.Object) objArray16);
        java.lang.Class<?> wildcardClass20 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        pilha0.topo = 0;
        boolean boolean17 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        int int11 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        int int17 = pilha13.tamanho();
        boolean boolean18 = pilha13.vazia();
        pilha13.topo = 0;
        pilha13.topo = 100;
        java.lang.Class<?> wildcardClass23 = pilha13.getClass();
        pilha0.empilha((java.lang.Object) pilha13);
        pilha0.topo = 32;
        java.lang.Object obj27 = pilha0.desempilha();
        int int28 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 31 + "'", int28 == 31);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        boolean boolean18 = pilha0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        boolean boolean11 = pilha0.vazia();
        java.lang.Object obj12 = pilha0.desempilha();
        java.lang.Object[] objArray13 = null;
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 96 + "'", int15 == 96);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        int int12 = pilha0.topo;
        pilha0.topo = 2;
        int int15 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        pilha15.empilha((java.lang.Object) (-1));
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha15.item = objArray22;
        pilha0.item = objArray22;
        int int26 = pilha0.topo;
        java.lang.Object[] objArray27 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object[] objArray12 = pilha0.item;
        pilha0.topo = 35;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        java.lang.Object[] objArray20 = pilha15.item;
        java.lang.Object obj21 = pilha15.desempilha();
        java.lang.Object[] objArray22 = pilha15.item;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.empilha((java.lang.Object) true);
        int int27 = pilha23.tamanho();
        boolean boolean28 = pilha23.vazia();
        pilha23.topo = 0;
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.topo;
        java.lang.Object[] objArray33 = pilha31.item;
        pilha23.empilha((java.lang.Object) pilha31);
        pilha15.empilha((java.lang.Object) pilha31);
        boolean boolean36 = pilha15.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) boolean36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        pilha15.empilha((java.lang.Object) (-1));
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha15.item = objArray22;
        pilha0.item = objArray22;
        int int26 = pilha0.tamanho();
        int int27 = pilha0.topo;
        int int28 = pilha0.topo;
        int int29 = pilha0.tamanho();
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha34.item = objArray39;
        pilha30.item = objArray39;
        java.lang.Object[] objArray43 = pilha30.item;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.tamanho();
        java.lang.Object[] objArray46 = pilha44.item;
        pilha44.topo = 'a';
        java.lang.Object[] objArray49 = pilha44.item;
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.tamanho();
        pilha50.empilha((java.lang.Object) true);
        ds.Pilha pilha54 = new ds.Pilha();
        int int55 = pilha54.tamanho();
        java.lang.Object[] objArray56 = pilha54.item;
        pilha50.item = objArray56;
        pilha44.empilha((java.lang.Object) objArray56);
        pilha30.item = objArray56;
        pilha0.empilha((java.lang.Object) objArray56);
        pilha0.topo = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        int int3 = pilha0.topo;
        int int4 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.topo;
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha13.item = objArray16;
        pilha11.item = objArray16;
        pilha7.item = objArray16;
        java.lang.Object obj20 = pilha7.desempilha();
        int int21 = pilha7.topo;
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        pilha22.topo = 0;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.topo;
        java.lang.Object[] objArray32 = pilha30.item;
        pilha22.empilha((java.lang.Object) pilha30);
        pilha7.empilha((java.lang.Object) pilha22);
        pilha0.empilha((java.lang.Object) pilha22);
        int int36 = pilha22.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 1 + "'", obj20, (short) 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        pilha0.topo = 'a';
        int int11 = pilha0.topo;
        ds.Pilha pilha12 = new ds.Pilha();
        boolean boolean13 = pilha12.vazia();
        int int14 = pilha12.tamanho();
        boolean boolean15 = pilha12.vazia();
        java.lang.Object[] objArray16 = pilha12.item;
        pilha12.topo = (byte) 100;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        boolean boolean23 = pilha19.vazia();
        java.lang.Object[] objArray24 = pilha19.item;
        int int25 = pilha19.tamanho();
        java.lang.Object obj26 = pilha19.desempilha();
        ds.Pilha pilha27 = new ds.Pilha();
        boolean boolean28 = pilha27.vazia();
        pilha27.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        ds.Pilha pilha33 = new ds.Pilha();
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha33.item = objArray36;
        pilha31.item = objArray36;
        pilha27.item = objArray36;
        java.lang.Object[] objArray40 = pilha27.item;
        int int41 = pilha27.tamanho();
        pilha19.empilha((java.lang.Object) pilha27);
        pilha12.empilha((java.lang.Object) pilha27);
        int int44 = pilha12.topo;
        pilha0.empilha((java.lang.Object) pilha12);
        int int46 = pilha0.topo;
        java.lang.Class<?> wildcardClass47 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 98 + "'", int46 == 98);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        boolean boolean18 = pilha0.vazia();
        pilha0.topo = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.topo;
        boolean boolean18 = pilha0.vazia();
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        pilha19.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        ds.Pilha pilha25 = new ds.Pilha();
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha25.item = objArray28;
        pilha23.item = objArray28;
        pilha19.item = objArray28;
        java.lang.Object obj32 = pilha19.desempilha();
        boolean boolean33 = pilha19.vazia();
        pilha19.topo = 96;
        pilha0.empilha((java.lang.Object) 96);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[96, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 1 + "'", obj32, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        java.lang.Object[] objArray9 = pilha7.item;
        pilha7.topo = 'a';
        java.lang.Object[] objArray12 = pilha7.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        java.lang.Object[] objArray19 = pilha17.item;
        pilha13.item = objArray19;
        pilha7.empilha((java.lang.Object) objArray19);
        int int22 = pilha7.tamanho();
        java.lang.Object obj23 = pilha7.desempilha();
        pilha0.empilha(obj23);
        boolean boolean25 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 98 + "'", int22 == 98);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha9.topo = (byte) -1;
        java.lang.Object[] objArray16 = null;
        pilha9.item = objArray16;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.topo = 'a';
        boolean boolean22 = pilha18.vazia();
        java.lang.Object[] objArray23 = pilha18.item;
        pilha9.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object obj26 = pilha0.desempilha();
        boolean boolean27 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.topo;
        java.lang.Object[] objArray10 = pilha8.item;
        pilha0.empilha((java.lang.Object) pilha8);
        pilha0.topo = 1;
        int int14 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray22 = pilha21.item;
        pilha21.topo = 0;
        int int25 = pilha21.tamanho();
        pilha21.topo = (byte) -1;
        pilha21.topo = 96;
        ds.Pilha pilha30 = new ds.Pilha();
        boolean boolean31 = pilha30.vazia();
        pilha30.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha34.item = objArray39;
        pilha30.item = objArray39;
        int int43 = pilha30.tamanho();
        int int44 = pilha30.tamanho();
        java.lang.Object[] objArray45 = pilha30.item;
        pilha21.item = objArray45;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.topo;
        pilha47.empilha((java.lang.Object) (-1));
        boolean boolean51 = pilha47.vazia();
        pilha47.topo = (short) 100;
        ds.Pilha pilha54 = new ds.Pilha();
        boolean boolean55 = pilha54.vazia();
        int int56 = pilha54.tamanho();
        boolean boolean57 = pilha54.vazia();
        java.lang.Object[] objArray58 = pilha54.item;
        pilha54.topo = 0;
        java.lang.Object[] objArray61 = pilha54.item;
        pilha47.item = objArray61;
        pilha21.item = objArray61;
        pilha0.item = objArray61;
        ds.Pilha pilha65 = new ds.Pilha();
        int int66 = pilha65.tamanho();
        pilha65.empilha((java.lang.Object) true);
        int int69 = pilha65.tamanho();
        boolean boolean70 = pilha65.vazia();
        pilha65.topo = 0;
        pilha65.topo = 100;
        ds.Pilha pilha75 = new ds.Pilha();
        boolean boolean76 = pilha75.vazia();
        int int77 = pilha75.tamanho();
        boolean boolean78 = pilha75.vazia();
        java.lang.Object[] objArray79 = pilha75.item;
        pilha75.topo = 0;
        java.lang.Object[] objArray82 = pilha75.item;
        pilha65.item = objArray82;
        java.lang.Object[] objArray84 = pilha65.item;
        pilha0.empilha((java.lang.Object) pilha65);
        java.lang.Object[] objArray86 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        pilha0.topo = 0;
        boolean boolean9 = pilha0.vazia();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        pilha0.topo = (short) 1;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.empilha((java.lang.Object) true);
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1), objArray22, (short) 100, (short) 100, 0.0d };
        pilha14.item = objArray27;
        java.lang.Object obj29 = pilha14.desempilha();
        pilha14.topo = (short) 10;
        int int32 = pilha14.tamanho();
        int int33 = pilha14.topo;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1) + "'", obj29, (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha8.topo = 1;
        int int16 = pilha8.tamanho();
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        pilha17.topo = (byte) -1;
        java.lang.Object[] objArray24 = null;
        pilha17.item = objArray24;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.topo = 'a';
        boolean boolean30 = pilha26.vazia();
        java.lang.Object[] objArray31 = pilha26.item;
        pilha17.item = objArray31;
        pilha8.item = objArray31;
        java.lang.Object obj34 = pilha8.desempilha();
        java.lang.Object[] objArray35 = pilha8.item;
        pilha0.item = objArray35;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.empilha((java.lang.Object) true);
        boolean boolean41 = pilha37.vazia();
        boolean boolean42 = pilha37.vazia();
        int int43 = pilha37.topo;
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        pilha44.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha48 = new ds.Pilha();
        int int49 = pilha48.tamanho();
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha50.item = objArray53;
        pilha48.item = objArray53;
        pilha44.item = objArray53;
        java.lang.Object[] objArray57 = pilha44.item;
        ds.Pilha pilha58 = new ds.Pilha();
        int int59 = pilha58.tamanho();
        java.lang.Object[] objArray60 = pilha58.item;
        pilha58.topo = 'a';
        java.lang.Object[] objArray63 = pilha58.item;
        ds.Pilha pilha64 = new ds.Pilha();
        int int65 = pilha64.tamanho();
        pilha64.empilha((java.lang.Object) true);
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.tamanho();
        java.lang.Object[] objArray70 = pilha68.item;
        pilha64.item = objArray70;
        pilha58.empilha((java.lang.Object) objArray70);
        pilha44.item = objArray70;
        pilha37.item = objArray70;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        int int12 = pilha6.tamanho();
        int int13 = pilha6.topo;
        java.lang.Object[] objArray14 = pilha6.item;
        pilha6.topo = 'a';
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        java.lang.Object[] objArray21 = pilha17.item;
        pilha17.topo = (byte) 100;
        java.lang.Object[] objArray24 = pilha17.item;
        pilha6.item = objArray24;
        pilha0.item = objArray24;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        int int13 = pilha7.tamanho();
        int int14 = pilha7.topo;
        java.lang.Object[] objArray15 = pilha7.item;
        pilha0.item = objArray15;
        int int17 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        pilha0.topo = (byte) 10;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) true);
        int int13 = pilha9.tamanho();
        pilha9.topo = (byte) 1;
        java.lang.Object[] objArray16 = pilha9.item;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        pilha9.empilha((java.lang.Object) boolean20);
        boolean boolean22 = pilha9.vazia();
        java.lang.Object[] objArray23 = pilha9.item;
        pilha0.empilha((java.lang.Object) objArray23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        pilha0.topo = 35;
        java.lang.Object[] objArray18 = pilha0.item;
        java.lang.Class<?> wildcardClass19 = objArray18.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Object[] objArray11 = null;
        pilha0.item = objArray11;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) boolean11);
        boolean boolean13 = pilha0.vazia();
        boolean boolean14 = pilha0.vazia();
        java.lang.Object[] objArray15 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 100;
        boolean boolean7 = pilha0.vazia();
        pilha0.topo = 32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        ds.Pilha pilha4 = new ds.Pilha();
        pilha4.empilha((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = pilha4.desempilha();
        boolean boolean8 = pilha4.vazia();
        pilha0.empilha((java.lang.Object) boolean8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        int int14 = pilha8.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.tamanho();
        pilha8.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        int int28 = pilha22.tamanho();
        int int29 = pilha22.topo;
        java.lang.Object[] objArray30 = pilha22.item;
        pilha22.topo = 'a';
        pilha15.empilha((java.lang.Object) pilha22);
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha34.item = objArray37;
        pilha34.topo = (byte) -1;
        java.lang.Object[] objArray41 = null;
        pilha34.item = objArray41;
        boolean boolean43 = pilha34.vazia();
        java.lang.Object[] objArray44 = pilha34.item;
        pilha34.topo = '#';
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.tamanho();
        pilha47.topo = 'a';
        java.lang.Object obj51 = pilha47.desempilha();
        java.lang.Object[] objArray52 = pilha47.item;
        pilha34.item = objArray52;
        pilha34.topo = 0;
        pilha22.empilha((java.lang.Object) pilha34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(objArray44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        java.lang.Object[] objArray31 = pilha27.item;
        pilha0.empilha((java.lang.Object) objArray31);
        ds.Pilha pilha33 = new ds.Pilha();
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.topo = 'a';
        boolean boolean38 = pilha34.vazia();
        java.lang.Object[] objArray39 = pilha34.item;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        pilha40.empilha((java.lang.Object) true);
        int int44 = pilha40.tamanho();
        boolean boolean45 = pilha40.vazia();
        pilha40.topo = 0;
        pilha40.topo = 100;
        ds.Pilha pilha50 = new ds.Pilha();
        boolean boolean51 = pilha50.vazia();
        int int52 = pilha50.tamanho();
        boolean boolean53 = pilha50.vazia();
        java.lang.Object[] objArray54 = pilha50.item;
        pilha50.topo = 0;
        java.lang.Object[] objArray57 = pilha50.item;
        pilha40.item = objArray57;
        pilha34.item = objArray57;
        pilha33.item = objArray57;
        ds.Pilha pilha61 = new ds.Pilha();
        java.lang.Object[] objArray64 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha61.item = objArray64;
        pilha61.topo = (byte) -1;
        java.lang.Object[] objArray68 = null;
        pilha61.item = objArray68;
        ds.Pilha pilha70 = new ds.Pilha();
        int int71 = pilha70.tamanho();
        pilha70.topo = 'a';
        boolean boolean74 = pilha70.vazia();
        java.lang.Object[] objArray75 = pilha70.item;
        pilha61.item = objArray75;
        pilha33.item = objArray75;
        pilha0.empilha((java.lang.Object) objArray75);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        ds.Pilha pilha2 = new ds.Pilha();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha2.item = objArray5;
        pilha0.item = objArray5;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) int9);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        pilha11.topo = 'a';
        boolean boolean15 = pilha11.vazia();
        java.lang.Object obj16 = pilha11.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) true);
        int int21 = pilha17.tamanho();
        boolean boolean22 = pilha17.vazia();
        int int23 = pilha17.tamanho();
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray25 = pilha24.item;
        pilha24.topo = 0;
        int int28 = pilha24.tamanho();
        pilha17.empilha((java.lang.Object) pilha24);
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.empilha((java.lang.Object) true);
        int int34 = pilha30.tamanho();
        boolean boolean35 = pilha30.vazia();
        pilha30.topo = 0;
        pilha30.topo = 100;
        java.lang.Class<?> wildcardClass40 = pilha30.getClass();
        pilha17.empilha((java.lang.Object) pilha30);
        pilha17.topo = 32;
        java.lang.Object[] objArray44 = pilha17.item;
        pilha11.item = objArray44;
        pilha0.item = objArray44;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        boolean boolean11 = pilha0.vazia();
        java.lang.Object obj12 = pilha0.desempilha();
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        pilha0.topo = (byte) -1;
        int int11 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        pilha6.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        pilha10.item = objArray15;
        pilha6.item = objArray15;
        java.lang.Object[] objArray19 = pilha6.item;
        pilha0.item = objArray19;
        pilha0.topo = (short) 1;
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha23.item = objArray26;
        pilha23.topo = (byte) -1;
        java.lang.Object[] objArray30 = null;
        pilha23.item = objArray30;
        java.lang.Object[] objArray32 = pilha23.item;
        pilha23.topo = 100;
        pilha23.topo = 1;
        pilha23.topo = 1;
        int int39 = pilha23.topo;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        pilha40.empilha((java.lang.Object) true);
        int int44 = pilha40.tamanho();
        java.lang.Object[] objArray45 = pilha40.item;
        pilha40.topo = 1;
        java.lang.Object[] objArray48 = pilha40.item;
        pilha23.item = objArray48;
        int int50 = pilha23.topo;
        java.lang.Class<?> wildcardClass51 = pilha23.getClass();
        pilha0.empilha((java.lang.Object) pilha23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        int int21 = pilha0.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        java.lang.Object[] objArray28 = pilha26.item;
        pilha22.item = objArray28;
        ds.Pilha pilha30 = new ds.Pilha();
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        pilha31.topo = 'a';
        boolean boolean35 = pilha31.vazia();
        java.lang.Object[] objArray36 = pilha31.item;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.empilha((java.lang.Object) true);
        int int41 = pilha37.tamanho();
        boolean boolean42 = pilha37.vazia();
        pilha37.topo = 0;
        pilha37.topo = 100;
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        int int49 = pilha47.tamanho();
        boolean boolean50 = pilha47.vazia();
        java.lang.Object[] objArray51 = pilha47.item;
        pilha47.topo = 0;
        java.lang.Object[] objArray54 = pilha47.item;
        pilha37.item = objArray54;
        pilha31.item = objArray54;
        pilha30.item = objArray54;
        ds.Pilha pilha58 = new ds.Pilha();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha58.item = objArray61;
        pilha58.topo = (byte) -1;
        java.lang.Object[] objArray65 = null;
        pilha58.item = objArray65;
        ds.Pilha pilha67 = new ds.Pilha();
        int int68 = pilha67.tamanho();
        pilha67.topo = 'a';
        boolean boolean71 = pilha67.vazia();
        java.lang.Object[] objArray72 = pilha67.item;
        pilha58.item = objArray72;
        pilha30.item = objArray72;
        pilha22.item = objArray72;
        pilha0.empilha((java.lang.Object) pilha22);
        pilha0.topo = (byte) -1;
        boolean boolean79 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        java.lang.Class<?> wildcardClass5 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        pilha0.topo = 100;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 97;
        java.lang.Object[] objArray31 = pilha0.item;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.topo = 'a';
        java.lang.Object obj36 = pilha32.desempilha();
        int int37 = pilha32.topo;
        int int38 = pilha32.topo;
        boolean boolean39 = pilha32.vazia();
        ds.Pilha pilha40 = new ds.Pilha();
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.tamanho();
        pilha41.topo = 'a';
        boolean boolean45 = pilha41.vazia();
        java.lang.Object[] objArray46 = pilha41.item;
        ds.Pilha pilha47 = new ds.Pilha();
        int int48 = pilha47.tamanho();
        pilha47.empilha((java.lang.Object) true);
        int int51 = pilha47.tamanho();
        boolean boolean52 = pilha47.vazia();
        pilha47.topo = 0;
        pilha47.topo = 100;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        int int59 = pilha57.tamanho();
        boolean boolean60 = pilha57.vazia();
        java.lang.Object[] objArray61 = pilha57.item;
        pilha57.topo = 0;
        java.lang.Object[] objArray64 = pilha57.item;
        pilha47.item = objArray64;
        pilha41.item = objArray64;
        pilha40.item = objArray64;
        pilha32.item = objArray64;
        int int69 = pilha32.topo;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 96 + "'", int37 == 96);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 96 + "'", int38 == 96);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 96 + "'", int69 == 96);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1), objArray24, (short) 100, (short) 100, 0.0d };
        pilha16.item = objArray29;
        pilha0.item = objArray29;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha37.item = objArray40;
        java.lang.Object[] objArray45 = new java.lang.Object[] { (-1), objArray40, (short) 100, (short) 100, 0.0d };
        pilha32.item = objArray45;
        pilha0.item = objArray45;
        pilha0.topo = (byte) 10;
        pilha0.topo = '#';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        java.lang.Object[] objArray16 = pilha14.item;
        pilha14.topo = 'a';
        java.lang.Object[] objArray19 = pilha14.item;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        java.lang.Object[] objArray26 = pilha24.item;
        pilha20.item = objArray26;
        pilha14.empilha((java.lang.Object) objArray26);
        pilha0.item = objArray26;
        java.lang.Object obj30 = pilha0.desempilha();
        java.lang.Object[] objArray31 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 0;
        pilha0.topo = ' ';
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        ds.Pilha pilha27 = new ds.Pilha();
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha27.item = objArray30;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1), objArray30, (short) 100, (short) 100, 0.0d };
        pilha22.item = objArray35;
        java.lang.Object obj37 = pilha22.desempilha();
        java.lang.Object[] objArray38 = pilha22.item;
        pilha22.topo = (byte) 0;
        java.lang.Object[] objArray41 = pilha22.item;
        int int42 = pilha22.tamanho();
        java.lang.Object[] objArray43 = pilha22.item;
        pilha0.item = objArray43;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1) + "'", obj37, (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha0.tamanho();
        java.lang.Object[] objArray12 = pilha0.item;
        boolean boolean13 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.topo;
        java.lang.Object[] objArray25 = pilha23.item;
        pilha15.empilha((java.lang.Object) pilha23);
        pilha0.empilha((java.lang.Object) pilha15);
        int int28 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 96;
        java.lang.Class<?> wildcardClass17 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        java.lang.Class<?> wildcardClass4 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object[] objArray4 = pilha0.item;
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.empilha((java.lang.Object) true);
        int int9 = pilha5.tamanho();
        java.lang.Object[] objArray10 = pilha5.item;
        pilha0.item = objArray10;
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        pilha0.topo = 1;
        pilha0.topo = 1;
        int int16 = pilha0.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.topo;
        pilha17.empilha((java.lang.Object) (-1));
        java.lang.Object[] objArray21 = pilha17.item;
        pilha17.empilha((java.lang.Object) true);
        java.lang.Object obj24 = pilha17.desempilha();
        int int25 = pilha17.topo;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        boolean boolean21 = pilha16.vazia();
        pilha16.topo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        ds.Pilha pilha12 = new ds.Pilha();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha12.item = objArray15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1), objArray15, (short) 100, (short) 100, 0.0d };
        pilha7.item = objArray20;
        java.lang.Object obj22 = pilha7.desempilha();
        pilha7.topo = (short) 10;
        int int25 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) int25);
        java.lang.Object[] objArray27 = null;
        pilha0.item = objArray27;
        int int29 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1) + "'", obj22, (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        int int14 = pilha0.tamanho();
        int int15 = pilha0.tamanho();
        int int16 = pilha0.tamanho();
        java.lang.Object[] objArray17 = pilha0.item;
        java.lang.Class<?> wildcardClass18 = objArray17.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        int int14 = pilha0.tamanho();
        int int15 = pilha0.tamanho();
        java.lang.Object[] objArray16 = pilha0.item;
        java.lang.Object[] objArray17 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = null;
        pilha0.item = objArray6;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 100;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        java.lang.Object[] objArray11 = pilha9.item;
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.topo = 'a';
        java.lang.Object obj16 = pilha12.desempilha();
        pilha9.empilha(obj16);
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        java.lang.Object[] objArray20 = pilha18.item;
        pilha18.topo = 'a';
        java.lang.Object[] objArray23 = pilha18.item;
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.empilha((java.lang.Object) true);
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        java.lang.Object[] objArray30 = pilha28.item;
        pilha24.item = objArray30;
        pilha18.empilha((java.lang.Object) objArray30);
        pilha9.item = objArray30;
        pilha0.empilha((java.lang.Object) pilha9);
        pilha9.topo = 35;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        int int10 = pilha8.tamanho();
        boolean boolean11 = pilha8.vazia();
        pilha0.empilha((java.lang.Object) boolean11);
        boolean boolean13 = pilha0.vazia();
        java.lang.Class<?> wildcardClass14 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        pilha6.topo = (byte) 1;
        java.lang.Object[] objArray13 = pilha6.item;
        ds.Pilha pilha14 = new ds.Pilha();
        boolean boolean15 = pilha14.vazia();
        int int16 = pilha14.tamanho();
        boolean boolean17 = pilha14.vazia();
        pilha6.empilha((java.lang.Object) boolean17);
        boolean boolean19 = pilha6.vazia();
        boolean boolean20 = pilha6.vazia();
        pilha0.empilha((java.lang.Object) pilha6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        pilha0.topo = 2;
        pilha0.topo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.tamanho();
        int int12 = pilha6.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        pilha13.topo = (-1);
        java.lang.Object[] objArray18 = pilha13.item;
        pilha6.item = objArray18;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        java.lang.Object obj9 = pilha5.desempilha();
        int int10 = pilha5.topo;
        pilha5.topo = 0;
        pilha5.topo = (byte) 10;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        int int21 = pilha15.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        int int28 = pilha22.tamanho();
        int int29 = pilha22.topo;
        java.lang.Object[] objArray30 = pilha22.item;
        pilha15.item = objArray30;
        pilha5.item = objArray30;
        pilha0.item = objArray30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.topo = 'a';
        java.lang.Object obj8 = pilha4.desempilha();
        pilha4.topo = (-1);
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha11.item = objArray14;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        int int3 = pilha0.topo;
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        int int21 = pilha0.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        java.lang.Object[] objArray28 = pilha26.item;
        pilha22.item = objArray28;
        ds.Pilha pilha30 = new ds.Pilha();
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        pilha31.topo = 'a';
        boolean boolean35 = pilha31.vazia();
        java.lang.Object[] objArray36 = pilha31.item;
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.empilha((java.lang.Object) true);
        int int41 = pilha37.tamanho();
        boolean boolean42 = pilha37.vazia();
        pilha37.topo = 0;
        pilha37.topo = 100;
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        int int49 = pilha47.tamanho();
        boolean boolean50 = pilha47.vazia();
        java.lang.Object[] objArray51 = pilha47.item;
        pilha47.topo = 0;
        java.lang.Object[] objArray54 = pilha47.item;
        pilha37.item = objArray54;
        pilha31.item = objArray54;
        pilha30.item = objArray54;
        ds.Pilha pilha58 = new ds.Pilha();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha58.item = objArray61;
        pilha58.topo = (byte) -1;
        java.lang.Object[] objArray65 = null;
        pilha58.item = objArray65;
        ds.Pilha pilha67 = new ds.Pilha();
        int int68 = pilha67.tamanho();
        pilha67.topo = 'a';
        boolean boolean71 = pilha67.vazia();
        java.lang.Object[] objArray72 = pilha67.item;
        pilha58.item = objArray72;
        pilha30.item = objArray72;
        pilha22.item = objArray72;
        pilha0.empilha((java.lang.Object) pilha22);
        pilha0.topo = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object[] objArray12 = pilha0.item;
        pilha0.topo = 35;
        boolean boolean15 = pilha0.vazia();
        int int16 = pilha0.topo;
        java.lang.Object[] objArray17 = pilha0.item;
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNull(objArray17);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object[] objArray26 = pilha0.item;
        java.lang.Object[] objArray27 = pilha0.item;
        ds.Pilha pilha28 = new ds.Pilha();
        boolean boolean29 = pilha28.vazia();
        pilha28.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        ds.Pilha pilha34 = new ds.Pilha();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha34.item = objArray37;
        pilha32.item = objArray37;
        pilha28.item = objArray37;
        java.lang.Object obj41 = pilha28.desempilha();
        int int42 = pilha28.topo;
        boolean boolean43 = pilha28.vazia();
        boolean boolean44 = pilha28.vazia();
        ds.Pilha pilha45 = new ds.Pilha();
        boolean boolean46 = pilha45.vazia();
        pilha45.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.tamanho();
        ds.Pilha pilha51 = new ds.Pilha();
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha51.item = objArray54;
        pilha49.item = objArray54;
        pilha45.item = objArray54;
        pilha28.item = objArray54;
        pilha0.item = objArray54;
        java.lang.Object[] objArray60 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) 1 + "'", obj41, (short) 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[1, 100.0]");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        int int3 = pilha0.topo;
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.topo = 'a';
        java.lang.Object obj8 = pilha4.desempilha();
        pilha4.topo = (-1);
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha11.item = objArray14;
        pilha4.item = objArray14;
        pilha0.item = objArray14;
        boolean boolean18 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        boolean boolean17 = pilha0.vazia();
        int int18 = pilha0.tamanho();
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        java.lang.Object[] objArray25 = pilha23.item;
        pilha19.item = objArray25;
        ds.Pilha pilha27 = new ds.Pilha();
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        pilha28.topo = 'a';
        boolean boolean32 = pilha28.vazia();
        java.lang.Object[] objArray33 = pilha28.item;
        ds.Pilha pilha34 = new ds.Pilha();
        int int35 = pilha34.tamanho();
        pilha34.empilha((java.lang.Object) true);
        int int38 = pilha34.tamanho();
        boolean boolean39 = pilha34.vazia();
        pilha34.topo = 0;
        pilha34.topo = 100;
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        int int46 = pilha44.tamanho();
        boolean boolean47 = pilha44.vazia();
        java.lang.Object[] objArray48 = pilha44.item;
        pilha44.topo = 0;
        java.lang.Object[] objArray51 = pilha44.item;
        pilha34.item = objArray51;
        pilha28.item = objArray51;
        pilha27.item = objArray51;
        ds.Pilha pilha55 = new ds.Pilha();
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha55.item = objArray58;
        pilha55.topo = (byte) -1;
        java.lang.Object[] objArray62 = null;
        pilha55.item = objArray62;
        ds.Pilha pilha64 = new ds.Pilha();
        int int65 = pilha64.tamanho();
        pilha64.topo = 'a';
        boolean boolean68 = pilha64.vazia();
        java.lang.Object[] objArray69 = pilha64.item;
        pilha55.item = objArray69;
        pilha27.item = objArray69;
        pilha19.item = objArray69;
        int int73 = pilha19.topo;
        java.lang.Object[] objArray74 = pilha19.item;
        pilha0.empilha((java.lang.Object) pilha19);
        java.lang.Object obj76 = pilha19.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        pilha0.topo = 99;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        int int6 = pilha0.topo;
        int int7 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 96 + "'", int7 == 96);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.topo = 'a';
        boolean boolean10 = pilha6.vazia();
        java.lang.Object[] objArray11 = pilha6.item;
        int int12 = pilha6.tamanho();
        java.lang.Object obj13 = pilha6.desempilha();
        java.lang.Object[] objArray14 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        int int16 = pilha6.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 96 + "'", int16 == 96);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 97;
        int int31 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass32 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        int int15 = pilha0.tamanho();
        int int16 = pilha0.topo;
        int int17 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 98 + "'", int16 == 98);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 0;
        int int31 = pilha0.tamanho();
        boolean boolean32 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        pilha0.topo = (byte) 10;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        pilha0.empilha((java.lang.Object) pilha19);
        java.lang.Object[] objArray29 = pilha19.item;
        int int30 = pilha19.topo;
        boolean boolean31 = pilha19.vazia();
        int int32 = pilha19.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        pilha0.topo = 1;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        java.lang.Object obj10 = pilha6.desempilha();
        java.lang.Object[] objArray11 = pilha6.item;
        pilha0.item = objArray11;
        java.lang.Object obj13 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + true + "'", obj10, true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        pilha15.topo = 100;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        int int27 = pilha25.tamanho();
        boolean boolean28 = pilha25.vazia();
        java.lang.Object[] objArray29 = pilha25.item;
        pilha25.topo = 0;
        java.lang.Object[] objArray32 = pilha25.item;
        pilha15.item = objArray32;
        pilha9.item = objArray32;
        pilha8.item = objArray32;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha36.topo = (byte) -1;
        java.lang.Object[] objArray43 = null;
        pilha36.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        boolean boolean49 = pilha45.vazia();
        java.lang.Object[] objArray50 = pilha45.item;
        pilha36.item = objArray50;
        pilha8.item = objArray50;
        pilha0.item = objArray50;
        int int54 = pilha0.topo;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.tamanho();
        pilha55.empilha((java.lang.Object) true);
        int int59 = pilha55.tamanho();
        java.lang.Object[] objArray60 = pilha55.item;
        pilha55.topo = 1;
        int int63 = pilha55.tamanho();
        pilha0.empilha((java.lang.Object) int63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        int int14 = pilha0.tamanho();
        int int15 = pilha0.tamanho();
        java.lang.Object[] objArray16 = pilha0.item;
        int int17 = pilha0.topo;
        ds.Pilha pilha18 = new ds.Pilha();
        boolean boolean19 = pilha18.vazia();
        java.lang.Object[] objArray20 = pilha18.item;
        ds.Pilha pilha21 = new ds.Pilha();
        int int22 = pilha21.tamanho();
        pilha21.topo = 'a';
        java.lang.Object obj25 = pilha21.desempilha();
        pilha18.empilha(obj25);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        java.lang.Object[] objArray29 = pilha27.item;
        pilha27.topo = 'a';
        java.lang.Object[] objArray32 = pilha27.item;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        java.lang.Object[] objArray39 = pilha37.item;
        pilha33.item = objArray39;
        pilha27.empilha((java.lang.Object) objArray39);
        pilha18.item = objArray39;
        ds.Pilha pilha43 = new ds.Pilha();
        boolean boolean44 = pilha43.vazia();
        int int45 = pilha43.tamanho();
        boolean boolean46 = pilha43.vazia();
        int int47 = pilha43.topo;
        pilha18.empilha((java.lang.Object) pilha43);
        java.lang.Object[] objArray49 = pilha43.item;
        pilha0.item = objArray49;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        boolean boolean6 = pilha0.vazia();
        java.lang.Object[] objArray7 = pilha0.item;
        pilha0.topo = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Pilha pilha0 = new ds.Pilha();
        ds.Pilha pilha1 = new ds.Pilha();
        int int2 = pilha1.tamanho();
        pilha1.topo = 'a';
        boolean boolean5 = pilha1.vazia();
        java.lang.Object[] objArray6 = pilha1.item;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.empilha((java.lang.Object) true);
        int int11 = pilha7.tamanho();
        boolean boolean12 = pilha7.vazia();
        pilha7.topo = 0;
        pilha7.topo = 100;
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        java.lang.Object[] objArray21 = pilha17.item;
        pilha17.topo = 0;
        java.lang.Object[] objArray24 = pilha17.item;
        pilha7.item = objArray24;
        pilha1.item = objArray24;
        pilha0.item = objArray24;
        boolean boolean28 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        pilha16.topo = 2;
        boolean boolean23 = pilha16.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        pilha15.empilha((java.lang.Object) (-1));
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha15.item = objArray22;
        pilha0.item = objArray22;
        int int26 = pilha0.topo;
        int int27 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        int int5 = pilha0.topo;
        java.lang.Class<?> wildcardClass6 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.topo = 'a';
        boolean boolean14 = pilha10.vazia();
        java.lang.Object[] objArray15 = pilha10.item;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        pilha10.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 1;
        boolean boolean34 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        pilha0.topo = 0;
        java.lang.Object[] objArray22 = pilha0.item;
        java.lang.Object[] objArray23 = pilha0.item;
        pilha0.topo = '4';
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object[] objArray13 = pilha0.item;
        int int14 = pilha0.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        pilha15.empilha((java.lang.Object) (-1));
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha15.item = objArray22;
        pilha0.item = objArray22;
        int int26 = pilha0.tamanho();
        java.lang.Object[] objArray27 = pilha0.item;
        int int28 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        int int16 = pilha0.topo;
        pilha0.topo = '#';
        boolean boolean19 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        int int12 = pilha0.tamanho();
        boolean boolean13 = pilha0.vazia();
        int int14 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        pilha0.topo = (byte) 100;
        boolean boolean18 = pilha0.vazia();
        int int19 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        pilha4.empilha((java.lang.Object) true);
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1), objArray12, (short) 100, (short) 100, 0.0d };
        pilha4.item = objArray17;
        java.lang.Object obj19 = pilha4.desempilha();
        pilha0.empilha(obj19);
        java.lang.Object obj21 = pilha0.desempilha();
        pilha0.topo = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1) + "'", obj19, (-1));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1) + "'", obj21, (-1));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) true);
        int int13 = pilha9.tamanho();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha9.topo = 1;
        java.lang.Object[] objArray17 = pilha9.item;
        pilha0.empilha((java.lang.Object) pilha9);
        int int19 = pilha9.tamanho();
        int int20 = pilha9.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        boolean boolean11 = pilha6.vazia();
        pilha6.topo = 0;
        pilha6.topo = 100;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        int int18 = pilha16.tamanho();
        boolean boolean19 = pilha16.vazia();
        java.lang.Object[] objArray20 = pilha16.item;
        pilha16.topo = 0;
        java.lang.Object[] objArray23 = pilha16.item;
        pilha6.item = objArray23;
        pilha0.item = objArray23;
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha26.item = objArray29;
        pilha26.topo = (byte) -1;
        java.lang.Object[] objArray33 = null;
        pilha26.item = objArray33;
        boolean boolean35 = pilha26.vazia();
        java.lang.Object[] objArray36 = pilha26.item;
        pilha0.empilha((java.lang.Object) objArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = objArray36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(objArray36);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha0.item = objArray9;
        int int12 = pilha0.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        java.lang.Object[] objArray15 = pilha13.item;
        pilha13.topo = 'a';
        java.lang.Object[] objArray18 = pilha13.item;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        java.lang.Object[] objArray25 = pilha23.item;
        pilha19.item = objArray25;
        pilha13.empilha((java.lang.Object) objArray25);
        int int28 = pilha13.tamanho();
        java.lang.Object obj29 = pilha13.desempilha();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 98 + "'", int28 == 98);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object obj12 = pilha6.desempilha();
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        java.lang.Object[] objArray20 = pilha15.item;
        pilha15.topo = 1;
        int int23 = pilha15.tamanho();
        java.lang.Object[] objArray24 = pilha15.item;
        pilha6.item = objArray24;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        java.lang.Object obj30 = pilha26.desempilha();
        java.lang.Object[] objArray31 = pilha26.item;
        pilha26.topo = 1;
        int int34 = pilha26.topo;
        pilha6.empilha((java.lang.Object) pilha26);
        int int36 = pilha26.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + true + "'", obj30, true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.topo = 'a';
        boolean boolean14 = pilha10.vazia();
        java.lang.Object[] objArray15 = pilha10.item;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        pilha10.item = objArray29;
        pilha0.item = objArray29;
        pilha0.topo = 1;
        java.lang.Class<?> wildcardClass34 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        java.lang.Object[] objArray12 = pilha10.item;
        java.lang.Object obj13 = null;
        pilha10.empilha(obj13);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        java.lang.Object[] objArray17 = pilha15.item;
        pilha10.item = objArray17;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        java.lang.Object[] objArray11 = pilha9.item;
        pilha9.topo = 'a';
        java.lang.Object[] objArray14 = pilha9.item;
        boolean boolean15 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean15);
        pilha0.empilha((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        java.lang.Object[] objArray10 = pilha8.item;
        java.lang.Object obj11 = null;
        pilha8.empilha(obj11);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.topo;
        java.lang.Object[] objArray15 = pilha13.item;
        pilha8.item = objArray15;
        java.lang.Object[] objArray17 = pilha8.item;
        pilha0.item = objArray17;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1), objArray24, (short) 100, (short) 100, 0.0d };
        pilha16.item = objArray29;
        pilha0.item = objArray29;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha37.item = objArray40;
        java.lang.Object[] objArray45 = new java.lang.Object[] { (-1), objArray40, (short) 100, (short) 100, 0.0d };
        pilha32.item = objArray45;
        pilha0.item = objArray45;
        pilha0.topo = (byte) 10;
        boolean boolean50 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        boolean boolean9 = pilha8.vazia();
        pilha8.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        ds.Pilha pilha14 = new ds.Pilha();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha14.item = objArray17;
        pilha12.item = objArray17;
        pilha8.item = objArray17;
        java.lang.Object[] objArray21 = pilha8.item;
        int int22 = pilha8.tamanho();
        pilha0.empilha((java.lang.Object) pilha8);
        java.lang.Object obj24 = pilha0.desempilha();
        int int25 = pilha0.tamanho();
        java.lang.Object obj26 = pilha0.desempilha();
        int int27 = pilha0.topo;
        ds.Pilha pilha28 = new ds.Pilha();
        pilha28.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        pilha31.empilha((java.lang.Object) true);
        java.lang.Object obj35 = pilha31.desempilha();
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.topo = 'a';
        boolean boolean40 = pilha36.vazia();
        java.lang.Object[] objArray41 = pilha36.item;
        pilha31.item = objArray41;
        pilha28.item = objArray41;
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.tamanho();
        pilha44.empilha((java.lang.Object) true);
        ds.Pilha pilha49 = new ds.Pilha();
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha49.item = objArray52;
        java.lang.Object[] objArray57 = new java.lang.Object[] { (-1), objArray52, (short) 100, (short) 100, 0.0d };
        pilha44.item = objArray57;
        pilha28.item = objArray57;
        ds.Pilha pilha60 = new ds.Pilha();
        int int61 = pilha60.tamanho();
        pilha60.empilha((java.lang.Object) true);
        ds.Pilha pilha65 = new ds.Pilha();
        java.lang.Object[] objArray68 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha65.item = objArray68;
        java.lang.Object[] objArray73 = new java.lang.Object[] { (-1), objArray68, (short) 100, (short) 100, 0.0d };
        pilha60.item = objArray73;
        pilha28.item = objArray73;
        pilha0.item = objArray73;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 96 + "'", int25 == 96);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + true + "'", obj35, true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        pilha0.topo = 2;
        java.lang.Object obj10 = pilha0.desempilha();
        boolean boolean11 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        java.lang.Object[] objArray20 = pilha0.item;
        boolean boolean21 = pilha0.vazia();
        int int22 = pilha0.tamanho();
        int int23 = pilha0.topo;
        boolean boolean24 = pilha0.vazia();
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        pilha25.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha31.item = objArray34;
        pilha29.item = objArray34;
        pilha25.item = objArray34;
        int int38 = pilha25.tamanho();
        int int39 = pilha25.tamanho();
        int int40 = pilha25.tamanho();
        java.lang.Object[] objArray41 = pilha25.item;
        int int42 = pilha25.topo;
        int int43 = pilha25.tamanho();
        ds.Pilha pilha44 = new ds.Pilha();
        boolean boolean45 = pilha44.vazia();
        pilha44.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha48 = new ds.Pilha();
        int int49 = pilha48.tamanho();
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha50.item = objArray53;
        pilha48.item = objArray53;
        pilha44.item = objArray53;
        int int57 = pilha44.tamanho();
        int int58 = pilha44.tamanho();
        int int59 = pilha44.tamanho();
        int int60 = pilha44.tamanho();
        pilha25.empilha((java.lang.Object) int60);
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) int60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        java.lang.Object[] objArray18 = pilha16.item;
        int int19 = pilha16.topo;
        int int20 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) pilha16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pilha16.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        int int11 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) pilha7);
        boolean boolean13 = pilha7.vazia();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pilha7.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        ds.Pilha pilha8 = new ds.Pilha();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha8.item = objArray11;
        pilha8.topo = (byte) -1;
        java.lang.Object[] objArray15 = null;
        pilha8.item = objArray15;
        int int17 = pilha8.tamanho();
        int int18 = pilha8.topo;
        ds.Pilha pilha19 = new ds.Pilha();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha19.item = objArray22;
        pilha19.topo = (byte) -1;
        java.lang.Object[] objArray26 = null;
        pilha19.item = objArray26;
        boolean boolean28 = pilha19.vazia();
        java.lang.Object[] objArray29 = pilha19.item;
        pilha19.topo = '#';
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.topo = 'a';
        java.lang.Object obj36 = pilha32.desempilha();
        java.lang.Object[] objArray37 = pilha32.item;
        pilha19.item = objArray37;
        pilha8.item = objArray37;
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        pilha40.topo = (short) 1;
        java.lang.Object obj44 = pilha40.desempilha();
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        java.lang.Object obj49 = pilha45.desempilha();
        int int50 = pilha45.topo;
        pilha45.topo = 0;
        pilha45.topo = (byte) 10;
        ds.Pilha pilha55 = new ds.Pilha();
        int int56 = pilha55.tamanho();
        pilha55.empilha((java.lang.Object) true);
        int int59 = pilha55.tamanho();
        boolean boolean60 = pilha55.vazia();
        int int61 = pilha55.tamanho();
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.tamanho();
        pilha62.empilha((java.lang.Object) true);
        int int66 = pilha62.tamanho();
        boolean boolean67 = pilha62.vazia();
        int int68 = pilha62.tamanho();
        int int69 = pilha62.topo;
        java.lang.Object[] objArray70 = pilha62.item;
        pilha55.item = objArray70;
        pilha45.item = objArray70;
        pilha40.item = objArray70;
        pilha8.item = objArray70;
        pilha0.item = objArray70;
        boolean boolean76 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 96 + "'", int50 == 96);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        int int4 = pilha0.topo;
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.topo = 'a';
        boolean boolean11 = pilha7.vazia();
        java.lang.Object[] objArray12 = pilha7.item;
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        int int17 = pilha13.tamanho();
        boolean boolean18 = pilha13.vazia();
        pilha13.topo = 0;
        pilha13.topo = 100;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        int int25 = pilha23.tamanho();
        boolean boolean26 = pilha23.vazia();
        java.lang.Object[] objArray27 = pilha23.item;
        pilha23.topo = 0;
        java.lang.Object[] objArray30 = pilha23.item;
        pilha13.item = objArray30;
        pilha7.item = objArray30;
        java.lang.Object[] objArray33 = pilha7.item;
        java.lang.Object[] objArray34 = pilha7.item;
        ds.Pilha pilha35 = new ds.Pilha();
        boolean boolean36 = pilha35.vazia();
        pilha35.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        ds.Pilha pilha41 = new ds.Pilha();
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha41.item = objArray44;
        pilha39.item = objArray44;
        pilha35.item = objArray44;
        java.lang.Object obj48 = pilha35.desempilha();
        int int49 = pilha35.topo;
        boolean boolean50 = pilha35.vazia();
        boolean boolean51 = pilha35.vazia();
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha58.item = objArray61;
        pilha56.item = objArray61;
        pilha52.item = objArray61;
        pilha35.item = objArray61;
        pilha7.item = objArray61;
        pilha0.empilha((java.lang.Object) objArray61);
        int int68 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 1 + "'", obj48, (short) 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int18 = pilha0.tamanho();
        int int19 = pilha0.topo;
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        pilha20.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        ds.Pilha pilha26 = new ds.Pilha();
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha26.item = objArray29;
        pilha24.item = objArray29;
        pilha20.item = objArray29;
        java.lang.Object obj33 = pilha20.desempilha();
        int int34 = pilha20.topo;
        boolean boolean35 = pilha20.vazia();
        boolean boolean36 = pilha20.vazia();
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) boolean36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 1 + "'", obj33, (short) 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.topo;
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        int int16 = pilha12.tamanho();
        pilha12.topo = (byte) 1;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        ds.Pilha pilha24 = new ds.Pilha();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha24.item = objArray27;
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1), objArray27, (short) 100, (short) 100, 0.0d };
        pilha19.item = objArray32;
        java.lang.Object obj34 = pilha19.desempilha();
        java.lang.Object[] objArray35 = pilha19.item;
        pilha12.item = objArray35;
        java.lang.Object[] objArray37 = pilha12.item;
        int int38 = pilha12.topo;
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        int int41 = pilha39.tamanho();
        boolean boolean42 = pilha39.vazia();
        pilha12.empilha((java.lang.Object) pilha39);
        ds.Pilha pilha44 = new ds.Pilha();
        int int45 = pilha44.tamanho();
        pilha44.empilha((java.lang.Object) true);
        ds.Pilha pilha49 = new ds.Pilha();
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha49.item = objArray52;
        java.lang.Object[] objArray57 = new java.lang.Object[] { (-1), objArray52, (short) 100, (short) 100, 0.0d };
        pilha44.item = objArray57;
        java.lang.Object obj59 = pilha44.desempilha();
        java.lang.Object[] objArray60 = pilha44.item;
        pilha44.topo = (byte) 0;
        pilha12.empilha((java.lang.Object) pilha44);
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) pilha12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1) + "'", obj34, (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1) + "'", obj59, (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        boolean boolean11 = pilha0.vazia();
        pilha0.topo = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A pilha esta vazia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        pilha0.topo = (short) 10;
        int int18 = pilha0.tamanho();
        boolean boolean19 = pilha0.vazia();
        pilha0.topo = 98;
        ds.Pilha pilha22 = new ds.Pilha();
        pilha22.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha25 = new ds.Pilha();
        int int26 = pilha25.tamanho();
        pilha25.empilha((java.lang.Object) true);
        java.lang.Object obj29 = pilha25.desempilha();
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.topo = 'a';
        boolean boolean34 = pilha30.vazia();
        java.lang.Object[] objArray35 = pilha30.item;
        pilha25.item = objArray35;
        pilha22.item = objArray35;
        ds.Pilha pilha38 = new ds.Pilha();
        int int39 = pilha38.tamanho();
        pilha38.empilha((java.lang.Object) true);
        ds.Pilha pilha43 = new ds.Pilha();
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha43.item = objArray46;
        java.lang.Object[] objArray51 = new java.lang.Object[] { (-1), objArray46, (short) 100, (short) 100, 0.0d };
        pilha38.item = objArray51;
        pilha22.item = objArray51;
        pilha0.item = objArray51;
        boolean boolean55 = pilha0.vazia();
        int int56 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 98 + "'", int56 == 98);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.tamanho();
        int int9 = pilha0.tamanho();
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha0.empilha((java.lang.Object) objArray12);
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.topo = 'a';
        boolean boolean18 = pilha14.vazia();
        java.lang.Object[] objArray19 = pilha14.item;
        int int20 = pilha14.tamanho();
        java.lang.Object obj21 = pilha14.desempilha();
        ds.Pilha pilha22 = new ds.Pilha();
        boolean boolean23 = pilha22.vazia();
        pilha22.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        ds.Pilha pilha28 = new ds.Pilha();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha28.item = objArray31;
        pilha26.item = objArray31;
        pilha22.item = objArray31;
        java.lang.Object[] objArray35 = pilha22.item;
        int int36 = pilha22.tamanho();
        pilha14.empilha((java.lang.Object) pilha22);
        java.lang.Object obj38 = pilha14.desempilha();
        int int39 = pilha14.tamanho();
        java.lang.Object obj40 = pilha14.desempilha();
        ds.Pilha pilha41 = new ds.Pilha();
        int int42 = pilha41.tamanho();
        pilha41.topo = 'a';
        boolean boolean45 = pilha41.vazia();
        java.lang.Object[] objArray46 = pilha41.item;
        ds.Pilha pilha47 = new ds.Pilha();
        boolean boolean48 = pilha47.vazia();
        pilha47.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha51 = new ds.Pilha();
        int int52 = pilha51.tamanho();
        ds.Pilha pilha53 = new ds.Pilha();
        java.lang.Object[] objArray56 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha53.item = objArray56;
        pilha51.item = objArray56;
        pilha47.item = objArray56;
        java.lang.Object[] objArray60 = pilha47.item;
        pilha41.item = objArray60;
        pilha14.empilha((java.lang.Object) objArray60);
        boolean boolean63 = pilha14.vazia();
        pilha0.empilha((java.lang.Object) pilha14);
        int int65 = pilha14.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 96 + "'", int39 == 96);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 96 + "'", int65 == 96);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        int int15 = pilha0.tamanho();
        pilha0.topo = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        boolean boolean10 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        int int5 = pilha0.topo;
        pilha0.topo = (byte) 10;
        java.lang.Object obj8 = pilha0.desempilha();
        java.lang.Class<?> wildcardClass9 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1), objArray24, (short) 100, (short) 100, 0.0d };
        pilha16.item = objArray29;
        pilha0.item = objArray29;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        ds.Pilha pilha37 = new ds.Pilha();
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha37.item = objArray40;
        java.lang.Object[] objArray45 = new java.lang.Object[] { (-1), objArray40, (short) 100, (short) 100, 0.0d };
        pilha32.item = objArray45;
        pilha0.item = objArray45;
        pilha0.topo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1, [1, 100.0], 100, 100, 0.0]");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        int int30 = pilha16.tamanho();
        pilha16.topo = 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        java.lang.Object[] objArray38 = pilha33.item;
        pilha33.topo = 1;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        pilha42.empilha((java.lang.Object) true);
        int int46 = pilha42.tamanho();
        boolean boolean47 = pilha42.vazia();
        int int48 = pilha42.tamanho();
        int int49 = pilha42.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha42.item = objArray51;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        java.lang.Object[] objArray55 = pilha53.item;
        int int56 = pilha53.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha63.item = objArray66;
        pilha61.item = objArray66;
        pilha57.item = objArray66;
        java.lang.Object[] objArray70 = pilha57.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { pilha16, pilha33, "", objArray51, int56, objArray70 };
        pilha0.item = objArray71;
        java.lang.Object[] objArray73 = pilha0.item;
        ds.Pilha pilha74 = new ds.Pilha();
        int int75 = pilha74.tamanho();
        pilha74.topo = 'a';
        int int78 = pilha74.tamanho();
        java.lang.Object[] objArray79 = pilha74.item;
        ds.Pilha pilha80 = new ds.Pilha();
        int int81 = pilha80.tamanho();
        pilha80.empilha((java.lang.Object) true);
        int int84 = pilha80.tamanho();
        java.lang.Object[] objArray85 = pilha80.item;
        java.lang.Object obj86 = pilha80.desempilha();
        java.lang.Object[] objArray87 = pilha80.item;
        pilha74.empilha((java.lang.Object) pilha80);
        boolean boolean89 = pilha80.vazia();
        int int90 = pilha80.tamanho();
        pilha0.empilha((java.lang.Object) int90);
        boolean boolean92 = pilha0.vazia();
        int int93 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + true + "'", obj86, true);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 3 + "'", int93 == 3);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        pilha10.topo = (short) -1;
        boolean boolean14 = pilha10.vazia();
        java.lang.Object[] objArray15 = pilha10.item;
        java.lang.Object[] objArray16 = pilha10.item;
        pilha0.item = objArray16;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        int int14 = pilha0.topo;
        boolean boolean15 = pilha0.vazia();
        pilha0.topo = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        boolean boolean15 = pilha0.vazia();
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 98 + "'", int16 == 98);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        ds.Pilha pilha4 = new ds.Pilha();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha4.item = objArray7;
        pilha0.item = objArray7;
        boolean boolean10 = pilha0.vazia();
        int int11 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        boolean boolean9 = pilha5.vazia();
        java.lang.Object[] objArray10 = pilha5.item;
        pilha0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        int int12 = pilha8.tamanho();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha0.item = objArray13;
        java.lang.Object[] objArray15 = null;
        pilha0.item = objArray15;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        int int21 = pilha17.topo;
        int int22 = pilha17.tamanho();
        boolean boolean23 = pilha17.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.empilha((java.lang.Object) true);
        int int28 = pilha24.tamanho();
        java.lang.Object[] objArray29 = pilha24.item;
        java.lang.Object obj30 = pilha24.desempilha();
        ds.Pilha pilha31 = new ds.Pilha();
        int int32 = pilha31.tamanho();
        java.lang.Object[] objArray33 = pilha31.item;
        pilha31.topo = 'a';
        ds.Pilha pilha36 = new ds.Pilha();
        ds.Pilha pilha37 = new ds.Pilha();
        int int38 = pilha37.tamanho();
        pilha37.topo = 'a';
        boolean boolean41 = pilha37.vazia();
        java.lang.Object[] objArray42 = pilha37.item;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.tamanho();
        pilha43.empilha((java.lang.Object) true);
        int int47 = pilha43.tamanho();
        boolean boolean48 = pilha43.vazia();
        pilha43.topo = 0;
        pilha43.topo = 100;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        int int55 = pilha53.tamanho();
        boolean boolean56 = pilha53.vazia();
        java.lang.Object[] objArray57 = pilha53.item;
        pilha53.topo = 0;
        java.lang.Object[] objArray60 = pilha53.item;
        pilha43.item = objArray60;
        pilha37.item = objArray60;
        pilha36.item = objArray60;
        pilha31.empilha((java.lang.Object) objArray60);
        pilha24.item = objArray60;
        pilha17.item = objArray60;
        pilha0.item = objArray60;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + true + "'", obj30, true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        int int15 = pilha0.topo;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.topo = 'a';
        java.lang.Object obj20 = pilha16.desempilha();
        pilha16.topo = (-1);
        ds.Pilha pilha23 = new ds.Pilha();
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha23.item = objArray26;
        pilha16.item = objArray26;
        java.lang.Class<?> wildcardClass29 = objArray26.getClass();
        pilha0.empilha((java.lang.Object) objArray26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[1, 100.0], 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        java.lang.Object[] objArray18 = pilha16.item;
        int int19 = pilha16.topo;
        int int20 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) pilha16);
        pilha0.topo = 'a';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        boolean boolean6 = pilha0.vazia();
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        pilha0.topo = (byte) 100;
        ds.Pilha pilha10 = new ds.Pilha();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha10.item = objArray13;
        pilha10.topo = (byte) -1;
        java.lang.Object[] objArray17 = null;
        pilha10.item = objArray17;
        boolean boolean19 = pilha10.vazia();
        java.lang.Object[] objArray20 = pilha10.item;
        boolean boolean21 = pilha10.vazia();
        pilha10.topo = 0;
        pilha0.empilha((java.lang.Object) pilha10);
        java.lang.Object[] objArray25 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 100;
        java.lang.Object[] objArray7 = pilha0.item;
        java.lang.Object obj8 = pilha0.desempilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) true);
        int int13 = pilha9.tamanho();
        boolean boolean14 = pilha9.vazia();
        int int15 = pilha9.tamanho();
        int int16 = pilha9.topo;
        java.lang.Object[] objArray17 = pilha9.item;
        pilha0.empilha((java.lang.Object) objArray17);
        java.lang.Object obj19 = pilha0.desempilha();
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        pilha20.empilha((java.lang.Object) true);
        int int24 = pilha20.tamanho();
        java.lang.Object[] objArray25 = pilha20.item;
        pilha20.topo = 1;
        int int28 = pilha20.tamanho();
        java.lang.Object[] objArray29 = pilha20.item;
        java.lang.Object[] objArray30 = pilha20.item;
        pilha0.item = objArray30;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha0.item = objArray14;
        java.lang.Object[] objArray16 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object obj12 = pilha6.desempilha();
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        int int15 = pilha6.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        java.lang.Object[] objArray6 = pilha4.item;
        pilha0.item = objArray6;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) true);
        int int13 = pilha9.tamanho();
        boolean boolean14 = pilha9.vazia();
        pilha9.topo = 0;
        pilha9.topo = 100;
        ds.Pilha pilha19 = new ds.Pilha();
        boolean boolean20 = pilha19.vazia();
        int int21 = pilha19.tamanho();
        boolean boolean22 = pilha19.vazia();
        java.lang.Object[] objArray23 = pilha19.item;
        pilha19.topo = 0;
        java.lang.Object[] objArray26 = pilha19.item;
        pilha9.item = objArray26;
        pilha0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        pilha0.topo = 0;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.empilha((java.lang.Object) true);
        int int13 = pilha9.tamanho();
        java.lang.Object[] objArray14 = pilha9.item;
        pilha9.topo = 1;
        java.lang.Object[] objArray17 = pilha9.item;
        pilha0.empilha((java.lang.Object) pilha9);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.empilha((java.lang.Object) true);
        int int23 = pilha19.tamanho();
        java.lang.Object[] objArray24 = pilha19.item;
        pilha19.topo = 1;
        int int27 = pilha19.tamanho();
        java.lang.Object[] objArray28 = pilha19.item;
        pilha9.empilha((java.lang.Object) pilha19);
        java.lang.Object obj30 = pilha9.desempilha();
        int int31 = pilha9.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        int int3 = pilha0.topo;
        boolean boolean4 = pilha0.vazia();
        int int5 = pilha0.topo;
        boolean boolean6 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        boolean boolean6 = pilha0.vazia();
        ds.Pilha pilha7 = new ds.Pilha();
        boolean boolean8 = pilha7.vazia();
        pilha7.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        ds.Pilha pilha13 = new ds.Pilha();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha13.item = objArray16;
        pilha11.item = objArray16;
        pilha7.item = objArray16;
        int int20 = pilha7.tamanho();
        java.lang.Object obj21 = null;
        pilha7.empilha(obj21);
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        pilha23.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        ds.Pilha pilha29 = new ds.Pilha();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha29.item = objArray32;
        pilha27.item = objArray32;
        pilha23.item = objArray32;
        java.lang.Object[] objArray36 = pilha23.item;
        int int37 = pilha23.tamanho();
        pilha23.topo = 0;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        pilha40.empilha((java.lang.Object) true);
        int int44 = pilha40.tamanho();
        java.lang.Object[] objArray45 = pilha40.item;
        pilha40.topo = 1;
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.tamanho();
        pilha49.empilha((java.lang.Object) true);
        int int53 = pilha49.tamanho();
        boolean boolean54 = pilha49.vazia();
        int int55 = pilha49.tamanho();
        int int56 = pilha49.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        java.lang.Object[] objArray58 = pilha57.item;
        pilha49.item = objArray58;
        ds.Pilha pilha60 = new ds.Pilha();
        boolean boolean61 = pilha60.vazia();
        java.lang.Object[] objArray62 = pilha60.item;
        int int63 = pilha60.topo;
        ds.Pilha pilha64 = new ds.Pilha();
        boolean boolean65 = pilha64.vazia();
        pilha64.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha68 = new ds.Pilha();
        int int69 = pilha68.tamanho();
        ds.Pilha pilha70 = new ds.Pilha();
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha70.item = objArray73;
        pilha68.item = objArray73;
        pilha64.item = objArray73;
        java.lang.Object[] objArray77 = pilha64.item;
        java.lang.Object[] objArray78 = new java.lang.Object[] { pilha23, pilha40, "", objArray58, int63, objArray77 };
        pilha7.item = objArray78;
        java.lang.Object[] objArray80 = pilha7.item;
        java.lang.Object obj81 = pilha7.desempilha();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha83 = new ds.Pilha();
        int int84 = pilha83.tamanho();
        pilha83.empilha((java.lang.Object) true);
        int int87 = pilha83.tamanho();
        boolean boolean88 = pilha83.vazia();
        int int89 = pilha83.tamanho();
        int int90 = pilha83.topo;
        java.lang.Object obj91 = pilha83.desempilha();
        java.lang.Object[] objArray92 = pilha83.item;
        pilha7.item = objArray92;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, null]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + true + "'", obj91, true);
        org.junit.Assert.assertNotNull(objArray92);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = 0;
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        java.lang.Object[] objArray4 = pilha0.item;
        pilha0.topo = (byte) 100;
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        pilha7.topo = 'a';
        boolean boolean11 = pilha7.vazia();
        java.lang.Object[] objArray12 = pilha7.item;
        int int13 = pilha7.tamanho();
        java.lang.Object obj14 = pilha7.desempilha();
        ds.Pilha pilha15 = new ds.Pilha();
        boolean boolean16 = pilha15.vazia();
        pilha15.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        pilha19.item = objArray24;
        pilha15.item = objArray24;
        java.lang.Object[] objArray28 = pilha15.item;
        int int29 = pilha15.tamanho();
        pilha7.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        pilha15.topo = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        pilha0.topo = 96;
        ds.Pilha pilha9 = new ds.Pilha();
        boolean boolean10 = pilha9.vazia();
        pilha9.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha13.item = objArray18;
        pilha9.item = objArray18;
        int int22 = pilha9.tamanho();
        int int23 = pilha9.tamanho();
        java.lang.Object[] objArray24 = pilha9.item;
        pilha0.item = objArray24;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.topo;
        pilha26.empilha((java.lang.Object) (-1));
        boolean boolean30 = pilha26.vazia();
        pilha26.topo = (short) 100;
        ds.Pilha pilha33 = new ds.Pilha();
        boolean boolean34 = pilha33.vazia();
        int int35 = pilha33.tamanho();
        boolean boolean36 = pilha33.vazia();
        java.lang.Object[] objArray37 = pilha33.item;
        pilha33.topo = 0;
        java.lang.Object[] objArray40 = pilha33.item;
        pilha26.item = objArray40;
        pilha0.item = objArray40;
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.tamanho();
        pilha43.topo = 'a';
        boolean boolean47 = pilha43.vazia();
        java.lang.Object obj48 = pilha43.desempilha();
        ds.Pilha pilha49 = new ds.Pilha();
        int int50 = pilha49.tamanho();
        pilha49.empilha((java.lang.Object) true);
        int int53 = pilha49.tamanho();
        boolean boolean54 = pilha49.vazia();
        int int55 = pilha49.tamanho();
        ds.Pilha pilha56 = new ds.Pilha();
        java.lang.Object[] objArray57 = pilha56.item;
        pilha56.topo = 0;
        int int60 = pilha56.tamanho();
        pilha49.empilha((java.lang.Object) pilha56);
        ds.Pilha pilha62 = new ds.Pilha();
        int int63 = pilha62.tamanho();
        pilha62.empilha((java.lang.Object) true);
        int int66 = pilha62.tamanho();
        boolean boolean67 = pilha62.vazia();
        pilha62.topo = 0;
        pilha62.topo = 100;
        java.lang.Class<?> wildcardClass72 = pilha62.getClass();
        pilha49.empilha((java.lang.Object) pilha62);
        pilha49.topo = 32;
        java.lang.Object[] objArray76 = pilha49.item;
        pilha43.item = objArray76;
        pilha0.item = objArray76;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        boolean boolean4 = pilha0.vazia();
        java.lang.Object obj5 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1) + "'", obj5, (-1));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        java.lang.Object[] objArray7 = pilha0.item;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        pilha8.topo = 0;
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.topo;
        java.lang.Object[] objArray18 = pilha16.item;
        pilha8.empilha((java.lang.Object) pilha16);
        pilha0.empilha((java.lang.Object) pilha16);
        int int21 = pilha0.tamanho();
        int int22 = pilha0.topo;
        ds.Pilha pilha23 = new ds.Pilha();
        boolean boolean24 = pilha23.vazia();
        int int25 = pilha23.tamanho();
        boolean boolean26 = pilha23.vazia();
        java.lang.Object[] objArray27 = pilha23.item;
        pilha23.topo = (byte) 100;
        java.lang.Object[] objArray30 = pilha23.item;
        java.lang.Object obj31 = pilha23.desempilha();
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        boolean boolean37 = pilha32.vazia();
        int int38 = pilha32.tamanho();
        int int39 = pilha32.topo;
        java.lang.Object[] objArray40 = pilha32.item;
        pilha23.empilha((java.lang.Object) objArray40);
        pilha0.empilha((java.lang.Object) pilha23);
        ds.Pilha pilha43 = new ds.Pilha();
        int int44 = pilha43.tamanho();
        pilha43.empilha((java.lang.Object) true);
        int int47 = pilha43.tamanho();
        boolean boolean48 = pilha43.vazia();
        pilha43.topo = 0;
        pilha43.topo = 100;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        int int55 = pilha53.tamanho();
        boolean boolean56 = pilha53.vazia();
        java.lang.Object[] objArray57 = pilha53.item;
        pilha53.topo = 0;
        java.lang.Object[] objArray60 = pilha53.item;
        pilha43.item = objArray60;
        java.lang.Object[] objArray62 = pilha43.item;
        ds.Pilha pilha63 = new ds.Pilha();
        int int64 = pilha63.tamanho();
        pilha63.empilha((java.lang.Object) true);
        int int67 = pilha63.tamanho();
        pilha63.topo = (byte) 1;
        ds.Pilha pilha70 = new ds.Pilha();
        int int71 = pilha70.tamanho();
        pilha70.empilha((java.lang.Object) true);
        ds.Pilha pilha75 = new ds.Pilha();
        java.lang.Object[] objArray78 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha75.item = objArray78;
        java.lang.Object[] objArray83 = new java.lang.Object[] { (-1), objArray78, (short) 100, (short) 100, 0.0d };
        pilha70.item = objArray83;
        java.lang.Object obj85 = pilha70.desempilha();
        java.lang.Object[] objArray86 = pilha70.item;
        pilha63.item = objArray86;
        java.lang.Object[] objArray88 = pilha63.item;
        pilha43.item = objArray88;
        int int90 = pilha43.topo;
        pilha43.topo = (byte) 1;
        boolean boolean93 = pilha43.vazia();
        pilha23.empilha((java.lang.Object) boolean93);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + (-1) + "'", obj85, (-1));
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 100 + "'", int90 == 100);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        int int11 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) pilha7);
        boolean boolean13 = pilha7.vazia();
        java.lang.Class<?> wildcardClass14 = pilha7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Class<?> wildcardClass7 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        int int13 = pilha0.tamanho();
        java.lang.Object obj14 = null;
        pilha0.empilha(obj14);
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        pilha16.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        ds.Pilha pilha22 = new ds.Pilha();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha22.item = objArray25;
        pilha20.item = objArray25;
        pilha16.item = objArray25;
        java.lang.Object[] objArray29 = pilha16.item;
        int int30 = pilha16.tamanho();
        pilha16.topo = 0;
        ds.Pilha pilha33 = new ds.Pilha();
        int int34 = pilha33.tamanho();
        pilha33.empilha((java.lang.Object) true);
        int int37 = pilha33.tamanho();
        java.lang.Object[] objArray38 = pilha33.item;
        pilha33.topo = 1;
        ds.Pilha pilha42 = new ds.Pilha();
        int int43 = pilha42.tamanho();
        pilha42.empilha((java.lang.Object) true);
        int int46 = pilha42.tamanho();
        boolean boolean47 = pilha42.vazia();
        int int48 = pilha42.tamanho();
        int int49 = pilha42.topo;
        ds.Pilha pilha50 = new ds.Pilha();
        java.lang.Object[] objArray51 = pilha50.item;
        pilha42.item = objArray51;
        ds.Pilha pilha53 = new ds.Pilha();
        boolean boolean54 = pilha53.vazia();
        java.lang.Object[] objArray55 = pilha53.item;
        int int56 = pilha53.topo;
        ds.Pilha pilha57 = new ds.Pilha();
        boolean boolean58 = pilha57.vazia();
        pilha57.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.tamanho();
        ds.Pilha pilha63 = new ds.Pilha();
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha63.item = objArray66;
        pilha61.item = objArray66;
        pilha57.item = objArray66;
        java.lang.Object[] objArray70 = pilha57.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { pilha16, pilha33, "", objArray51, int56, objArray70 };
        pilha0.item = objArray71;
        java.lang.Object[] objArray73 = pilha0.item;
        int int74 = pilha0.topo;
        int int75 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray12 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray12);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        pilha0.topo = (byte) 1;
        pilha0.topo = (short) 1;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.topo;
        pilha0.topo = (short) -1;
        ds.Pilha pilha8 = new ds.Pilha();
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        pilha9.topo = 'a';
        boolean boolean13 = pilha9.vazia();
        java.lang.Object[] objArray14 = pilha9.item;
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        boolean boolean20 = pilha15.vazia();
        pilha15.topo = 0;
        pilha15.topo = 100;
        ds.Pilha pilha25 = new ds.Pilha();
        boolean boolean26 = pilha25.vazia();
        int int27 = pilha25.tamanho();
        boolean boolean28 = pilha25.vazia();
        java.lang.Object[] objArray29 = pilha25.item;
        pilha25.topo = 0;
        java.lang.Object[] objArray32 = pilha25.item;
        pilha15.item = objArray32;
        pilha9.item = objArray32;
        pilha8.item = objArray32;
        ds.Pilha pilha36 = new ds.Pilha();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha36.item = objArray39;
        pilha36.topo = (byte) -1;
        java.lang.Object[] objArray43 = null;
        pilha36.item = objArray43;
        ds.Pilha pilha45 = new ds.Pilha();
        int int46 = pilha45.tamanho();
        pilha45.topo = 'a';
        boolean boolean49 = pilha45.vazia();
        java.lang.Object[] objArray50 = pilha45.item;
        pilha36.item = objArray50;
        pilha8.item = objArray50;
        pilha0.item = objArray50;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        pilha0.topo = 96;
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        int int11 = pilha0.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.topo = 'a';
        int int16 = pilha12.tamanho();
        java.lang.Object[] objArray17 = pilha12.item;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.empilha((java.lang.Object) true);
        int int22 = pilha18.tamanho();
        java.lang.Object[] objArray23 = pilha18.item;
        java.lang.Object obj24 = pilha18.desempilha();
        java.lang.Object[] objArray25 = pilha18.item;
        pilha12.empilha((java.lang.Object) pilha18);
        ds.Pilha pilha27 = new ds.Pilha();
        int int28 = pilha27.tamanho();
        pilha27.empilha((java.lang.Object) true);
        int int31 = pilha27.tamanho();
        java.lang.Object[] objArray32 = pilha27.item;
        pilha27.topo = 1;
        int int35 = pilha27.tamanho();
        java.lang.Object[] objArray36 = pilha27.item;
        pilha18.item = objArray36;
        int int38 = pilha18.tamanho();
        pilha18.topo = 1;
        java.lang.Object[] objArray41 = pilha18.item;
        pilha18.topo = 1;
        java.lang.Object[] objArray44 = pilha18.item;
        pilha0.item = objArray44;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 96 + "'", int11 == 96);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.topo;
        java.lang.Class<?> wildcardClass8 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        int int6 = pilha0.topo;
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 96 + "'", int6 == 96);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        int int9 = pilha0.tamanho();
        int int10 = pilha0.topo;
        ds.Pilha pilha11 = new ds.Pilha();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha11.item = objArray14;
        pilha11.topo = (byte) -1;
        java.lang.Object[] objArray18 = null;
        pilha11.item = objArray18;
        boolean boolean20 = pilha11.vazia();
        java.lang.Object[] objArray21 = pilha11.item;
        pilha11.topo = '#';
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.topo = 'a';
        java.lang.Object obj28 = pilha24.desempilha();
        java.lang.Object[] objArray29 = pilha24.item;
        pilha11.item = objArray29;
        pilha0.item = objArray29;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object obj10 = pilha0.desempilha();
        ds.Pilha pilha11 = new ds.Pilha();
        boolean boolean12 = pilha11.vazia();
        java.lang.Object[] objArray13 = pilha11.item;
        ds.Pilha pilha14 = new ds.Pilha();
        int int15 = pilha14.tamanho();
        pilha14.topo = 'a';
        java.lang.Object obj18 = pilha14.desempilha();
        pilha11.empilha(obj18);
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        java.lang.Object[] objArray22 = pilha20.item;
        pilha20.topo = 'a';
        java.lang.Object[] objArray25 = pilha20.item;
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.empilha((java.lang.Object) true);
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        java.lang.Object[] objArray32 = pilha30.item;
        pilha26.item = objArray32;
        pilha20.empilha((java.lang.Object) objArray32);
        pilha11.item = objArray32;
        pilha0.item = objArray32;
        java.lang.Object[] objArray37 = pilha0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        ds.Pilha pilha6 = new ds.Pilha();
        boolean boolean7 = pilha6.vazia();
        int int8 = pilha6.tamanho();
        int int9 = pilha6.topo;
        pilha0.empilha((java.lang.Object) pilha6);
        int int11 = pilha6.tamanho();
        ds.Pilha pilha12 = new ds.Pilha();
        int int13 = pilha12.tamanho();
        pilha12.empilha((java.lang.Object) true);
        ds.Pilha pilha17 = new ds.Pilha();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha17.item = objArray20;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (-1), objArray20, (short) 100, (short) 100, 0.0d };
        pilha12.item = objArray25;
        java.lang.Object obj27 = pilha12.desempilha();
        java.lang.Object[] objArray28 = pilha12.item;
        int int29 = pilha12.tamanho();
        pilha6.empilha((java.lang.Object) pilha12);
        ds.Pilha pilha31 = new ds.Pilha();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha31.item = objArray34;
        pilha31.topo = (byte) -1;
        java.lang.Object[] objArray38 = null;
        pilha31.item = objArray38;
        ds.Pilha pilha40 = new ds.Pilha();
        int int41 = pilha40.tamanho();
        pilha40.empilha((java.lang.Object) true);
        java.lang.Object obj44 = pilha40.desempilha();
        java.lang.Object[] objArray45 = pilha40.item;
        pilha31.item = objArray45;
        pilha12.item = objArray45;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1) + "'", obj27, (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + true + "'", obj44, true);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        pilha0.topo = 1;
        pilha0.topo = 1;
        int int16 = pilha0.topo;
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        pilha17.empilha((java.lang.Object) true);
        int int21 = pilha17.tamanho();
        java.lang.Object[] objArray22 = pilha17.item;
        pilha17.topo = 1;
        java.lang.Object[] objArray25 = pilha17.item;
        pilha0.item = objArray25;
        java.lang.Object obj27 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        int int11 = pilha0.tamanho();
        int int12 = pilha0.tamanho();
        int int13 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        boolean boolean21 = pilha0.vazia();
        int int22 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 96 + "'", int22 == 96);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        int int7 = pilha0.tamanho();
        java.lang.Object obj8 = pilha0.desempilha();
        pilha0.topo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 96 + "'", int7 == 96);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.topo = (short) 1;
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        java.lang.Object[] objArray7 = pilha0.item;
        int int8 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        java.lang.Object obj8 = pilha0.desempilha();
        int int9 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + true + "'", obj8, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        java.lang.Object[] objArray17 = pilha15.item;
        pilha15.topo = 'a';
        java.lang.Object[] objArray20 = pilha15.item;
        pilha0.empilha((java.lang.Object) objArray20);
        boolean boolean22 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        ds.Pilha pilha19 = new ds.Pilha();
        int int20 = pilha19.tamanho();
        pilha19.topo = 'a';
        java.lang.Object obj23 = pilha19.desempilha();
        int int24 = pilha19.topo;
        pilha19.topo = 0;
        boolean boolean27 = pilha19.vazia();
        pilha0.empilha((java.lang.Object) boolean27);
        pilha0.topo = 97;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[true, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        boolean boolean2 = pilha0.vazia();
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        int int7 = pilha3.tamanho();
        java.lang.Object[] objArray8 = pilha3.item;
        pilha3.topo = 1;
        pilha3.empilha((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass13 = pilha3.getClass();
        pilha0.empilha((java.lang.Object) wildcardClass13);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.topo = 'a';
        boolean boolean19 = pilha15.vazia();
        java.lang.Object[] objArray20 = pilha15.item;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        pilha15.item = objArray24;
        pilha0.item = objArray24;
        java.lang.Class<?> wildcardClass28 = pilha0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha7.item = objArray12;
        pilha3.item = objArray12;
        int int16 = pilha3.tamanho();
        int int17 = pilha3.tamanho();
        java.lang.Object[] objArray18 = pilha3.item;
        pilha0.item = objArray18;
        boolean boolean20 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        boolean boolean3 = pilha0.vazia();
        pilha0.topo = (short) 10;
        pilha0.topo = 95;
        pilha0.topo = 'a';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        pilha0.topo = 1;
        pilha0.topo = 1;
        int int16 = pilha0.topo;
        java.lang.Object[] objArray17 = pilha0.item;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(objArray17);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        ds.Pilha pilha3 = new ds.Pilha();
        boolean boolean4 = pilha3.vazia();
        pilha3.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha7 = new ds.Pilha();
        int int8 = pilha7.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha7.item = objArray12;
        pilha3.item = objArray12;
        int int16 = pilha3.tamanho();
        int int17 = pilha3.tamanho();
        java.lang.Object[] objArray18 = pilha3.item;
        pilha0.item = objArray18;
        ds.Pilha pilha20 = new ds.Pilha();
        int int21 = pilha20.tamanho();
        java.lang.Object[] objArray22 = pilha20.item;
        pilha20.topo = 'a';
        ds.Pilha pilha25 = new ds.Pilha();
        ds.Pilha pilha26 = new ds.Pilha();
        int int27 = pilha26.tamanho();
        pilha26.topo = 'a';
        boolean boolean30 = pilha26.vazia();
        java.lang.Object[] objArray31 = pilha26.item;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        int int36 = pilha32.tamanho();
        boolean boolean37 = pilha32.vazia();
        pilha32.topo = 0;
        pilha32.topo = 100;
        ds.Pilha pilha42 = new ds.Pilha();
        boolean boolean43 = pilha42.vazia();
        int int44 = pilha42.tamanho();
        boolean boolean45 = pilha42.vazia();
        java.lang.Object[] objArray46 = pilha42.item;
        pilha42.topo = 0;
        java.lang.Object[] objArray49 = pilha42.item;
        pilha32.item = objArray49;
        pilha26.item = objArray49;
        pilha25.item = objArray49;
        pilha20.empilha((java.lang.Object) objArray49);
        pilha0.item = objArray49;
        pilha0.topo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        java.lang.Object obj6 = pilha0.desempilha();
        int int7 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 96 + "'", int7 == 96);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        boolean boolean4 = pilha0.vazia();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        boolean boolean9 = pilha5.vazia();
        java.lang.Object[] objArray10 = pilha5.item;
        ds.Pilha pilha11 = new ds.Pilha();
        int int12 = pilha11.tamanho();
        pilha11.empilha((java.lang.Object) true);
        int int15 = pilha11.tamanho();
        boolean boolean16 = pilha11.vazia();
        pilha11.topo = 0;
        pilha11.topo = 100;
        ds.Pilha pilha21 = new ds.Pilha();
        boolean boolean22 = pilha21.vazia();
        int int23 = pilha21.tamanho();
        boolean boolean24 = pilha21.vazia();
        java.lang.Object[] objArray25 = pilha21.item;
        pilha21.topo = 0;
        java.lang.Object[] objArray28 = pilha21.item;
        pilha11.item = objArray28;
        pilha5.item = objArray28;
        java.lang.Object[] objArray31 = pilha5.item;
        ds.Pilha pilha32 = new ds.Pilha();
        int int33 = pilha32.tamanho();
        pilha32.empilha((java.lang.Object) true);
        java.lang.Object[] objArray36 = pilha32.item;
        pilha5.empilha((java.lang.Object) objArray36);
        pilha0.empilha((java.lang.Object) pilha5);
        pilha5.topo = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        int int10 = pilha6.tamanho();
        java.lang.Object[] objArray11 = pilha6.item;
        java.lang.Object obj12 = pilha6.desempilha();
        java.lang.Object[] objArray13 = pilha6.item;
        pilha0.empilha((java.lang.Object) pilha6);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.tamanho();
        pilha15.empilha((java.lang.Object) true);
        int int19 = pilha15.tamanho();
        java.lang.Object[] objArray20 = pilha15.item;
        pilha15.topo = 1;
        int int23 = pilha15.tamanho();
        java.lang.Object[] objArray24 = pilha15.item;
        pilha6.item = objArray24;
        boolean boolean26 = pilha6.vazia();
        boolean boolean27 = pilha6.vazia();
        int int28 = pilha6.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        java.lang.Object[] objArray5 = pilha0.item;
        ds.Pilha pilha6 = new ds.Pilha();
        int int7 = pilha6.tamanho();
        pilha6.empilha((java.lang.Object) true);
        ds.Pilha pilha10 = new ds.Pilha();
        int int11 = pilha10.tamanho();
        java.lang.Object[] objArray12 = pilha10.item;
        pilha6.item = objArray12;
        pilha0.empilha((java.lang.Object) objArray12);
        boolean boolean15 = pilha0.vazia();
        java.lang.Object obj16 = pilha0.desempilha();
        ds.Pilha pilha17 = new ds.Pilha();
        boolean boolean18 = pilha17.vazia();
        int int19 = pilha17.tamanho();
        boolean boolean20 = pilha17.vazia();
        int int21 = pilha17.topo;
        int int22 = pilha17.tamanho();
        boolean boolean23 = pilha17.vazia();
        ds.Pilha pilha24 = new ds.Pilha();
        int int25 = pilha24.tamanho();
        pilha24.topo = 'a';
        boolean boolean28 = pilha24.vazia();
        java.lang.Object[] objArray29 = pilha24.item;
        ds.Pilha pilha30 = new ds.Pilha();
        int int31 = pilha30.tamanho();
        pilha30.empilha((java.lang.Object) true);
        int int34 = pilha30.tamanho();
        boolean boolean35 = pilha30.vazia();
        pilha30.topo = 0;
        pilha30.topo = 100;
        ds.Pilha pilha40 = new ds.Pilha();
        boolean boolean41 = pilha40.vazia();
        int int42 = pilha40.tamanho();
        boolean boolean43 = pilha40.vazia();
        java.lang.Object[] objArray44 = pilha40.item;
        pilha40.topo = 0;
        java.lang.Object[] objArray47 = pilha40.item;
        pilha30.item = objArray47;
        pilha24.item = objArray47;
        java.lang.Object[] objArray50 = pilha24.item;
        java.lang.Object[] objArray51 = pilha24.item;
        ds.Pilha pilha52 = new ds.Pilha();
        boolean boolean53 = pilha52.vazia();
        pilha52.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.tamanho();
        ds.Pilha pilha58 = new ds.Pilha();
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha58.item = objArray61;
        pilha56.item = objArray61;
        pilha52.item = objArray61;
        java.lang.Object obj65 = pilha52.desempilha();
        int int66 = pilha52.topo;
        boolean boolean67 = pilha52.vazia();
        boolean boolean68 = pilha52.vazia();
        ds.Pilha pilha69 = new ds.Pilha();
        boolean boolean70 = pilha69.vazia();
        pilha69.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha73 = new ds.Pilha();
        int int74 = pilha73.tamanho();
        ds.Pilha pilha75 = new ds.Pilha();
        java.lang.Object[] objArray78 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha75.item = objArray78;
        pilha73.item = objArray78;
        pilha69.item = objArray78;
        pilha52.item = objArray78;
        pilha24.item = objArray78;
        pilha17.empilha((java.lang.Object) objArray78);
        pilha0.item = objArray78;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (short) 1 + "'", obj65, (short) 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[1, 100.0]");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        pilha0.topo = (byte) -1;
        pilha0.topo = 96;
        int int9 = pilha0.topo;
        int int10 = pilha0.tamanho();
        java.lang.Object obj11 = pilha0.desempilha();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        int int8 = pilha0.tamanho();
        ds.Pilha pilha9 = new ds.Pilha();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha9.item = objArray12;
        pilha9.topo = (byte) -1;
        java.lang.Object[] objArray16 = null;
        pilha9.item = objArray16;
        ds.Pilha pilha18 = new ds.Pilha();
        int int19 = pilha18.tamanho();
        pilha18.topo = 'a';
        boolean boolean22 = pilha18.vazia();
        java.lang.Object[] objArray23 = pilha18.item;
        pilha9.item = objArray23;
        pilha0.item = objArray23;
        java.lang.Object obj26 = pilha0.desempilha();
        java.lang.Object[] objArray27 = pilha0.item;
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.topo;
        ds.Pilha pilha30 = new ds.Pilha();
        java.lang.Object[] objArray31 = pilha30.item;
        pilha28.item = objArray31;
        int int33 = pilha28.topo;
        java.lang.Object[] objArray34 = pilha28.item;
        pilha0.item = objArray34;
        ds.Pilha pilha36 = new ds.Pilha();
        int int37 = pilha36.tamanho();
        pilha36.empilha((java.lang.Object) true);
        int int40 = pilha36.tamanho();
        boolean boolean41 = pilha36.vazia();
        pilha36.topo = 0;
        pilha36.topo = 100;
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        int int48 = pilha46.tamanho();
        boolean boolean49 = pilha46.vazia();
        java.lang.Object[] objArray50 = pilha46.item;
        pilha46.topo = 0;
        java.lang.Object[] objArray53 = pilha46.item;
        pilha36.item = objArray53;
        java.lang.Object[] objArray55 = pilha36.item;
        ds.Pilha pilha56 = new ds.Pilha();
        int int57 = pilha56.tamanho();
        pilha56.empilha((java.lang.Object) true);
        int int60 = pilha56.tamanho();
        pilha56.topo = (byte) 1;
        ds.Pilha pilha63 = new ds.Pilha();
        int int64 = pilha63.tamanho();
        pilha63.empilha((java.lang.Object) true);
        ds.Pilha pilha68 = new ds.Pilha();
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha68.item = objArray71;
        java.lang.Object[] objArray76 = new java.lang.Object[] { (-1), objArray71, (short) 100, (short) 100, 0.0d };
        pilha63.item = objArray76;
        java.lang.Object obj78 = pilha63.desempilha();
        java.lang.Object[] objArray79 = pilha63.item;
        pilha56.item = objArray79;
        java.lang.Object[] objArray81 = pilha56.item;
        pilha36.item = objArray81;
        pilha0.empilha((java.lang.Object) objArray81);
        java.lang.Object[] objArray84 = pilha0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (-1) + "'", obj78, (-1));
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray84);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        java.lang.Object[] objArray8 = pilha0.item;
        int int9 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        int int5 = pilha0.topo;
        java.lang.Object[] objArray6 = pilha0.item;
        java.lang.Object obj7 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.topo;
        boolean boolean5 = pilha0.vazia();
        java.lang.Object obj6 = pilha0.desempilha();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + true + "'", obj6, true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        java.lang.Object obj4 = pilha0.desempilha();
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.tamanho();
        pilha5.topo = 'a';
        boolean boolean9 = pilha5.vazia();
        java.lang.Object[] objArray10 = pilha5.item;
        pilha0.item = objArray10;
        int int12 = pilha0.tamanho();
        int int13 = pilha0.topo;
        int int14 = pilha0.topo;
        java.lang.Class<?> wildcardClass15 = pilha0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 0;
        pilha0.topo = ' ';
        int int22 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        pilha0.empilha((java.lang.Object) 97);
        int int6 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        int int20 = pilha0.tamanho();
        java.lang.Object[] objArray21 = pilha0.item;
        int int22 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        int int14 = pilha8.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.tamanho();
        pilha8.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        int int22 = pilha0.topo;
        pilha0.topo = 100;
        pilha0.topo = 31;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        ds.Pilha pilha16 = new ds.Pilha();
        int int17 = pilha16.tamanho();
        pilha16.empilha((java.lang.Object) true);
        int int20 = pilha16.tamanho();
        boolean boolean21 = pilha16.vazia();
        pilha16.topo = 0;
        pilha16.topo = 100;
        ds.Pilha pilha26 = new ds.Pilha();
        boolean boolean27 = pilha26.vazia();
        int int28 = pilha26.tamanho();
        boolean boolean29 = pilha26.vazia();
        java.lang.Object[] objArray30 = pilha26.item;
        pilha26.topo = 0;
        java.lang.Object[] objArray33 = pilha26.item;
        pilha16.item = objArray33;
        java.lang.Object[] objArray35 = pilha16.item;
        pilha0.item = objArray35;
        java.lang.Class<?> wildcardClass37 = objArray35.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        java.lang.Object obj4 = pilha0.desempilha();
        pilha0.topo = (-1);
        int int7 = pilha0.tamanho();
        int int8 = pilha0.topo;
        int int9 = pilha0.topo;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        java.lang.Object[] objArray12 = pilha10.item;
        java.lang.Object obj13 = null;
        pilha10.empilha(obj13);
        ds.Pilha pilha15 = new ds.Pilha();
        int int16 = pilha15.topo;
        java.lang.Object[] objArray17 = pilha15.item;
        pilha10.item = objArray17;
        java.lang.Object[] objArray19 = pilha10.item;
        ds.Pilha pilha20 = new ds.Pilha();
        boolean boolean21 = pilha20.vazia();
        java.lang.Object[] objArray22 = pilha20.item;
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.topo = 'a';
        java.lang.Object obj27 = pilha23.desempilha();
        pilha20.empilha(obj27);
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        java.lang.Object[] objArray31 = pilha29.item;
        pilha29.topo = 'a';
        java.lang.Object[] objArray34 = pilha29.item;
        ds.Pilha pilha35 = new ds.Pilha();
        int int36 = pilha35.tamanho();
        pilha35.empilha((java.lang.Object) true);
        ds.Pilha pilha39 = new ds.Pilha();
        int int40 = pilha39.tamanho();
        java.lang.Object[] objArray41 = pilha39.item;
        pilha35.item = objArray41;
        pilha29.empilha((java.lang.Object) objArray41);
        pilha20.item = objArray41;
        pilha10.item = objArray41;
        ds.Pilha pilha46 = new ds.Pilha();
        boolean boolean47 = pilha46.vazia();
        pilha46.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha50 = new ds.Pilha();
        int int51 = pilha50.tamanho();
        ds.Pilha pilha52 = new ds.Pilha();
        java.lang.Object[] objArray55 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha52.item = objArray55;
        pilha50.item = objArray55;
        pilha46.item = objArray55;
        java.lang.Object[] objArray59 = pilha46.item;
        int int60 = pilha46.tamanho();
        ds.Pilha pilha61 = new ds.Pilha();
        int int62 = pilha61.topo;
        pilha61.empilha((java.lang.Object) (-1));
        ds.Pilha pilha65 = new ds.Pilha();
        java.lang.Object[] objArray68 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha65.item = objArray68;
        pilha61.item = objArray68;
        pilha46.item = objArray68;
        ds.Pilha pilha72 = new ds.Pilha();
        boolean boolean73 = pilha72.vazia();
        int int74 = pilha72.tamanho();
        boolean boolean75 = pilha72.vazia();
        java.lang.Object[] objArray76 = pilha72.item;
        pilha72.topo = 0;
        java.lang.Object[] objArray79 = pilha72.item;
        pilha46.empilha((java.lang.Object) objArray79);
        pilha10.empilha((java.lang.Object) objArray79);
        pilha0.item = objArray79;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray79);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        pilha0.empilha((java.lang.Object) (byte) -1);
        ds.Pilha pilha4 = new ds.Pilha();
        int int5 = pilha4.tamanho();
        ds.Pilha pilha6 = new ds.Pilha();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha6.item = objArray9;
        pilha4.item = objArray9;
        pilha0.item = objArray9;
        java.lang.Object obj13 = pilha0.desempilha();
        pilha0.topo = (byte) 10;
        int int16 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray1 = pilha0.item;
        pilha0.topo = 0;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        pilha0.topo = 96;
        int int8 = pilha0.topo;
        int int9 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        java.lang.Object[] objArray13 = pilha0.item;
        boolean boolean14 = pilha0.vazia();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha15.item = objArray18;
        pilha15.topo = (byte) -1;
        java.lang.Object[] objArray22 = null;
        pilha15.item = objArray22;
        boolean boolean24 = pilha15.vazia();
        java.lang.Object[] objArray25 = pilha15.item;
        pilha15.topo = '#';
        ds.Pilha pilha28 = new ds.Pilha();
        int int29 = pilha28.tamanho();
        pilha28.topo = 'a';
        java.lang.Object obj32 = pilha28.desempilha();
        java.lang.Object[] objArray33 = pilha28.item;
        pilha15.item = objArray33;
        java.lang.Object[] objArray35 = pilha15.item;
        // The following exception was thrown during execution in test generation
        try {
            pilha0.empilha((java.lang.Object) objArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        java.lang.Object[] objArray10 = pilha0.item;
        java.lang.Object[] objArray11 = pilha0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = pilha0.desempilha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNull(objArray11);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        pilha0.empilha((java.lang.Object) (-1));
        pilha0.topo = 1;
        int int6 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.topo;
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = (-1);
        int int5 = pilha0.tamanho();
        boolean boolean6 = pilha0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        boolean boolean9 = pilha0.vazia();
        java.lang.Object[] objArray10 = pilha0.item;
        pilha0.topo = '#';
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.topo = 'a';
        java.lang.Object obj17 = pilha13.desempilha();
        java.lang.Object[] objArray18 = pilha13.item;
        pilha0.item = objArray18;
        pilha0.topo = 0;
        int int22 = pilha0.tamanho();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Pilha pilha0 = new ds.Pilha();
        pilha0.empilha((java.lang.Object) (-1.0f));
        ds.Pilha pilha3 = new ds.Pilha();
        int int4 = pilha3.tamanho();
        pilha3.empilha((java.lang.Object) true);
        java.lang.Object obj7 = pilha3.desempilha();
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.topo = 'a';
        boolean boolean12 = pilha8.vazia();
        java.lang.Object[] objArray13 = pilha8.item;
        pilha3.item = objArray13;
        pilha0.item = objArray13;
        ds.Pilha pilha16 = new ds.Pilha();
        boolean boolean17 = pilha16.vazia();
        java.lang.Object[] objArray18 = pilha16.item;
        int int19 = pilha16.topo;
        int int20 = pilha16.tamanho();
        pilha0.empilha((java.lang.Object) pilha16);
        java.lang.Class<?> wildcardClass22 = pilha16.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        pilha0.topo = 0;
        pilha0.topo = 100;
        ds.Pilha pilha10 = new ds.Pilha();
        boolean boolean11 = pilha10.vazia();
        int int12 = pilha10.tamanho();
        boolean boolean13 = pilha10.vazia();
        java.lang.Object[] objArray14 = pilha10.item;
        pilha10.topo = 0;
        java.lang.Object[] objArray17 = pilha10.item;
        pilha0.item = objArray17;
        pilha0.topo = 96;
        ds.Pilha pilha21 = new ds.Pilha();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha21.item = objArray24;
        pilha21.topo = (byte) -1;
        java.lang.Object[] objArray28 = null;
        pilha21.item = objArray28;
        java.lang.Object[] objArray30 = pilha21.item;
        pilha21.topo = 100;
        pilha21.topo = 1;
        pilha0.empilha((java.lang.Object) 1);
        pilha0.topo = (byte) 10;
        int int38 = pilha0.topo;
        int int39 = pilha0.tamanho();
        int int40 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        java.lang.Object obj15 = pilha0.desempilha();
        java.lang.Object[] objArray16 = pilha0.item;
        pilha0.topo = (byte) 0;
        java.lang.Object[] objArray19 = pilha0.item;
        java.lang.Object[] objArray20 = pilha0.item;
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1) + "'", obj15, (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Pilha pilha0 = new ds.Pilha();
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha0.item = objArray3;
        pilha0.topo = (byte) -1;
        java.lang.Object[] objArray7 = null;
        pilha0.item = objArray7;
        java.lang.Object[] objArray9 = pilha0.item;
        pilha0.topo = 100;
        java.lang.Object[] objArray12 = pilha0.item;
        int int13 = pilha0.topo;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1, 100.0]");
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.tamanho();
        java.lang.Object obj16 = pilha0.desempilha();
        int int17 = pilha0.tamanho();
        pilha0.topo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        int int7 = pilha0.topo;
        ds.Pilha pilha8 = new ds.Pilha();
        int int9 = pilha8.tamanho();
        pilha8.empilha((java.lang.Object) true);
        int int12 = pilha8.tamanho();
        boolean boolean13 = pilha8.vazia();
        int int14 = pilha8.tamanho();
        ds.Pilha pilha15 = new ds.Pilha();
        java.lang.Object[] objArray16 = pilha15.item;
        pilha15.topo = 0;
        int int19 = pilha15.tamanho();
        pilha8.empilha((java.lang.Object) pilha15);
        pilha0.empilha((java.lang.Object) pilha15);
        ds.Pilha pilha22 = new ds.Pilha();
        int int23 = pilha22.tamanho();
        pilha22.empilha((java.lang.Object) true);
        int int26 = pilha22.tamanho();
        boolean boolean27 = pilha22.vazia();
        int int28 = pilha22.tamanho();
        int int29 = pilha22.topo;
        java.lang.Object[] objArray30 = pilha22.item;
        pilha22.topo = 'a';
        pilha15.empilha((java.lang.Object) pilha22);
        int int34 = pilha22.tamanho();
        java.lang.Object[] objArray35 = pilha22.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        java.lang.Object[] objArray2 = pilha0.item;
        pilha0.topo = 'a';
        pilha0.topo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        java.lang.Object[] objArray5 = pilha0.item;
        pilha0.topo = 1;
        pilha0.empilha((java.lang.Object) (byte) 10);
        int int10 = pilha0.tamanho();
        pilha0.topo = 10;
        java.lang.Object obj13 = pilha0.desempilha();
        boolean boolean14 = pilha0.vazia();
        pilha0.topo = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        int int4 = pilha0.tamanho();
        boolean boolean5 = pilha0.vazia();
        int int6 = pilha0.tamanho();
        ds.Pilha pilha7 = new ds.Pilha();
        java.lang.Object[] objArray8 = pilha7.item;
        pilha7.topo = 0;
        int int11 = pilha7.tamanho();
        pilha0.empilha((java.lang.Object) pilha7);
        ds.Pilha pilha13 = new ds.Pilha();
        int int14 = pilha13.tamanho();
        pilha13.empilha((java.lang.Object) true);
        int int17 = pilha13.tamanho();
        boolean boolean18 = pilha13.vazia();
        pilha13.topo = 0;
        pilha13.topo = 100;
        java.lang.Class<?> wildcardClass23 = pilha13.getClass();
        pilha0.empilha((java.lang.Object) pilha13);
        pilha0.topo = 32;
        java.lang.Object obj27 = pilha0.desempilha();
        int int28 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 31 + "'", int28 == 31);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        java.lang.Object[] objArray2 = pilha0.item;
        java.lang.Object obj3 = null;
        pilha0.empilha(obj3);
        ds.Pilha pilha5 = new ds.Pilha();
        int int6 = pilha5.topo;
        java.lang.Object[] objArray7 = pilha5.item;
        pilha0.item = objArray7;
        ds.Pilha pilha9 = new ds.Pilha();
        int int10 = pilha9.tamanho();
        java.lang.Object[] objArray11 = pilha9.item;
        pilha9.topo = 'a';
        java.lang.Object[] objArray14 = pilha9.item;
        boolean boolean15 = pilha9.vazia();
        pilha0.empilha((java.lang.Object) boolean15);
        ds.Pilha pilha17 = new ds.Pilha();
        int int18 = pilha17.tamanho();
        java.lang.Object[] objArray19 = pilha17.item;
        pilha17.topo = 'a';
        ds.Pilha pilha22 = new ds.Pilha();
        ds.Pilha pilha23 = new ds.Pilha();
        int int24 = pilha23.tamanho();
        pilha23.topo = 'a';
        boolean boolean27 = pilha23.vazia();
        java.lang.Object[] objArray28 = pilha23.item;
        ds.Pilha pilha29 = new ds.Pilha();
        int int30 = pilha29.tamanho();
        pilha29.empilha((java.lang.Object) true);
        int int33 = pilha29.tamanho();
        boolean boolean34 = pilha29.vazia();
        pilha29.topo = 0;
        pilha29.topo = 100;
        ds.Pilha pilha39 = new ds.Pilha();
        boolean boolean40 = pilha39.vazia();
        int int41 = pilha39.tamanho();
        boolean boolean42 = pilha39.vazia();
        java.lang.Object[] objArray43 = pilha39.item;
        pilha39.topo = 0;
        java.lang.Object[] objArray46 = pilha39.item;
        pilha29.item = objArray46;
        pilha23.item = objArray46;
        pilha22.item = objArray46;
        pilha17.empilha((java.lang.Object) objArray46);
        pilha0.empilha((java.lang.Object) objArray46);
        java.lang.Object[] objArray52 = pilha0.item;
        int int53 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.empilha((java.lang.Object) true);
        ds.Pilha pilha5 = new ds.Pilha();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0d };
        pilha5.item = objArray8;
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1), objArray8, (short) 100, (short) 100, 0.0d };
        pilha0.item = objArray13;
        int int15 = pilha0.topo;
        java.lang.Object[] objArray16 = null;
        pilha0.item = objArray16;
        pilha0.topo = 97;
        java.lang.Object[] objArray20 = pilha0.item;
        int int21 = pilha0.topo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, [1, 100.0], 100, 100, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Pilha pilha0 = new ds.Pilha();
        int int1 = pilha0.tamanho();
        pilha0.topo = 'a';
        boolean boolean4 = pilha0.vazia();
        java.lang.Object[] objArray5 = pilha0.item;
        int int6 = pilha0.tamanho();
        java.lang.Object obj7 = pilha0.desempilha();
        int int8 = pilha0.topo;
        boolean boolean9 = pilha0.vazia();
        pilha0.topo = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Pilha pilha0 = new ds.Pilha();
        boolean boolean1 = pilha0.vazia();
        int int2 = pilha0.tamanho();
        int int3 = pilha0.topo;
        int int4 = pilha0.tamanho();
        int int5 = pilha0.tamanho();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }
}

